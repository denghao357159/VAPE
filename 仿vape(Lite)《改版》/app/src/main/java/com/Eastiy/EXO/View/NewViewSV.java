package com.Eastiy.EXO.View;
import android.widget.*;
import android.content.Context;
import android.view.*;
import android.graphics.*;
import android.util.AttributeSet;
import android.view.animation.*;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.TranslateAnimation;



public class NewViewSV extends ScrollView {
    
    private int lastY;//上一次y轴方向操作的坐标位置
    private Rect normal = new Rect();//用于记录临界状态的左、上、右、下
    private boolean isFinishAnimation = true;//是否动画结束
    private int lastX, downX, downY;

    private View childView;
    
    private Context context;
    
    
    public NewViewSV(Context ctx,Object sizeW,Object sizeH,Object cm,Object color,Object cr){
        super(ctx);
        context=ctx;
        setVerticalScrollBarEnabled(false);
        if(sizeW!=null&&sizeH!=null){
            setLayoutParams(new android.widget.LinearLayout.LayoutParams((int)(sizeW),(int)(sizeH)));
        }
        if((int)cm==0){
            setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(android.graphics.Color.parseColor((String)color)));
        }else if((int)cm==1){
            setBackgroundDrawable(ASUI.roundBG(color,cr,null,null));
        }else if((int)cm==2){
        }
    }
    
    public NewViewSV(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        boolean isIntercept = false;
        int eventX = (int) ev.getX();
        int eventY = (int) ev.getY();
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                lastX = downX = eventX;
                lastY = downY = eventY;
                break;
            case MotionEvent.ACTION_MOVE:
                //获取水平和垂直方向的移动距离
                int absX = Math.abs(eventX - downX);
                int absY = Math.abs(eventY - downY);
                if(absY > absX && absY >= (int)((context.getResources().getDisplayMetrics().heightPixels)*0.15)){
                    isIntercept = true;//执行拦截
                }
                lastX = eventX;
                lastY = eventY;
                break;
        }
        return isIntercept;
    }
    //获取子视图
    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() > 0) {
            childView = getChildAt(0);
        }
    }
    //判断是否需要执行平移动画
    private boolean isNeedAnimation() {
        return !normal.isEmpty();
    }
    private boolean isNeedMove() {
        int childMeasuredHeight = childView.getMeasuredHeight();//获取子视图的高度
        int scrollViewMeasuredHeight = this.getMeasuredHeight();//获取布局的高度
        int dy = childMeasuredHeight - scrollViewMeasuredHeight;//dy >= 0
        int scrollY = this.getScrollY();//获取用户在y轴方向上的偏移量 （上 + 下 -）
        if (scrollY <= 0 || scrollY >= dy) {
            return true;//按照我们自定义的MyScrollView的方式处理
        }
        //其他处在临界范围内的，返回false。即表示，仍按照ScrollView的方式处理
        return false;
    }
    
    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        if (childView == null || !isFinishAnimation) {
            return super.onTouchEvent(ev);
        }
        int eventY = (int) ev.getY();//获取当前的y轴坐标
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                lastY = eventY;
                break;
            case MotionEvent.ACTION_MOVE:
                int dy = eventY - lastY;//微小的移动量
                if (isNeedMove()) {
                    if (normal.isEmpty()) {
                        //记录了childView的临界状态的左、上、右、下
                        normal.set(childView.getLeft(), childView.getTop(), childView.getRight(), childView.getBottom());
                    }
                    //重新布局
                    childView.layout(childView.getLeft(), childView.getTop() + dy / 2, childView.getRight(), childView.getBottom() + dy / 2);
                }
                lastY = eventY;//重新赋值
                break;
            case MotionEvent.ACTION_UP:
                if (isNeedAnimation()) {
                    //使用平移动画
                    int translateY = childView.getBottom() - normal.bottom;
                    TranslateAnimation translateAnimation = new TranslateAnimation(0, 0, 0, -translateY);
                    translateAnimation.setDuration(200);
//        translateAnimation.setFillAfter(true);//停留在最终位置上
                    translateAnimation.setAnimationListener(new Animation.AnimationListener() {
                            @Override
                            public void onAnimationStart(Animation animation) {
                                isFinishAnimation = false;
                            }
                            @Override
                            public void onAnimationEnd(Animation animation) {
                                isFinishAnimation = true;
                                childView.clearAnimation();//清除动画
                                //重新布局
                                childView.layout(normal.left, normal.top, normal.right, normal.bottom);
                                //清除normal的数据
                                normal.setEmpty();
                            }
                            @Override
                            public void onAnimationRepeat(Animation animation) {
                            }
                        });
                    //启动动画
                    childView.startAnimation(translateAnimation);
                }
                break;
        }
        return super.onTouchEvent(ev);
    }
    
}
