package com.answer.UI.View;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.graphics.Color;

/**
 * Created by 7heaven on 15/3/14.
 */
public class NewSwitch extends View {

    private static final long commonDuration = 250L;

    private ValueAnimator innerContentAnimator;
    private ValueAnimator knobExpandAnimator;
    private ValueAnimator knobMoveAnimator;

    private GestureDetector gestureDetector;
    private GestureDetector.SimpleOnGestureListener gestureListener = new GestureDetector.SimpleOnGestureListener(){
        @Override
        public boolean onDown(MotionEvent event){

            if(!isEnabled()) return false;

            preIsOn = isOn;

            innerContentAnimator.setFloatValues(innerContentRate, 0.0F);
            innerContentAnimator.start();

            knobExpandAnimator.setFloatValues(knobExpandRate, 1.0F);
            knobExpandAnimator.start();

            return true;
        }

        @Override
        public void onShowPress(MotionEvent event){


        }

        @Override
        public boolean onSingleTapUp(MotionEvent event){



            isOn = knobState;

            if(preIsOn == isOn){
                isOn = !isOn;
                knobState = !knobState;
            }

            if(knobState){

                knobMoveAnimator.setFloatValues(knobMoveRate, 1.0F);
                knobMoveAnimator.start();

                innerContentAnimator.setFloatValues(innerContentRate, 0.0F);
                innerContentAnimator.start();
            }else{

                knobMoveAnimator.setFloatValues(knobMoveRate, 0.0F);
                knobMoveAnimator.start();

                innerContentAnimator.setFloatValues(innerContentRate, 1.0F);
                innerContentAnimator.start();
            }

            knobExpandAnimator.setFloatValues(knobExpandRate, 0.0F);
            knobExpandAnimator.start();

            if(NewSwitch.this.onSwitchStateChangeListener != null && isOn != preIsOn){
                NewSwitch.this.onSwitchStateChangeListener.onSwitchStateChange(isOn);
            }

            return true;
        }

        @Override
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {

            if(e2.getX() > centerX){
                if(!knobState){
                    knobState = !knobState;

                    knobMoveAnimator.setFloatValues(knobMoveRate, 1.0F);
                    knobMoveAnimator.start();

                    innerContentAnimator.setFloatValues(innerContentRate, 0.0F);
                    innerContentAnimator.start();
                }
            }else{
                if(knobState){
                    knobState = !knobState;

                    knobMoveAnimator.setFloatValues(knobMoveRate, 0.0F);
                    knobMoveAnimator.start();


                }
            }

            return true;
        }
    };



    private int width;
    private int height;

    private int centerX;
    private int centerY;

    private float cornerRadius;

    private int shadowSpace;
    private int outerStrokeWidth;

    private RectF knobBound;
    private float knobMaxExpandWidth;
    private float intrinsicKnobWidth;
    private float knobExpandRate;
    private float knobMoveRate;

    private boolean knobState;
    private boolean isOn;
    private boolean preIsOn;

    private RectF innerContentBound;
    private float innerContentRate = 1.0F;
    private float intrinsicInnerWidth;
    private float intrinsicInnerHeight;

    private int tintColor;

    private int tempTintColor;

    private static int backgroundColor = 0xFFFFFFFF;
    private static int colorStep = 0xFFCCCCCC;
    private static int foregroundColor = 0xFFFFFFFF;
    private static int gbolor=0xFFFFFFFF;
    private static int gbolorbk=0xFFFFFFFF;
    
    private Paint paint;

    private RectF ovalForPath;
    private Path roundRectPath;

    private RectF tempForRoundRect;

    private boolean dirtyAnimation = false;
    private boolean isAttachedToWindow = false;

    public interface OnSwitchStateChangeListener{
        void onSwitchStateChange(boolean isOn);
    }

    private OnSwitchStateChangeListener onSwitchStateChangeListener;

    public NewSwitch(Context context){
        this(context, null);
		tintColor = 0xFFFFFF;
        tempTintColor = tintColor;

        int defaultOuterStrokeWidth = (int)(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,1, context.getResources().getDisplayMetrics())*10);
        int defaultShadowSpace = (int)(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 1, context.getResources().getDisplayMetrics())*10);




        outerStrokeWidth = defaultOuterStrokeWidth;
        shadowSpace = defaultShadowSpace;

        knobBound = new RectF();
        innerContentBound = new RectF();
        ovalForPath = new RectF();

        tempForRoundRect = new RectF();

        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        roundRectPath = new Path();

        gestureDetector = new GestureDetector(context, gestureListener);
        gestureDetector.setIsLongpressEnabled(false);

        if(Build.VERSION.SDK_INT >= 11){
            setLayerType(View.LAYER_TYPE_SOFTWARE, null);
        }
        initAnimators();
    }

    public NewSwitch(Context context, AttributeSet attrs){
        this(context, attrs, 0);
    }

    public NewSwitch(Context context, AttributeSet attrs, int defStyle){
        super(context, attrs, defStyle);

        
        tintColor = 0xFFFFFF;
        tempTintColor = tintColor;

        int defaultOuterStrokeWidth = (int)(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,1, context.getResources().getDisplayMetrics())*10);
        int defaultShadowSpace = (int)(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 1, context.getResources().getDisplayMetrics())*10);

        
        
        
        outerStrokeWidth = defaultOuterStrokeWidth;
        shadowSpace = defaultShadowSpace;

        knobBound = new RectF();
        innerContentBound = new RectF();
        ovalForPath = new RectF();

        tempForRoundRect = new RectF();

        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        roundRectPath = new Path();

        gestureDetector = new GestureDetector(context, gestureListener);
        gestureDetector.setIsLongpressEnabled(false);

        if(Build.VERSION.SDK_INT >= 11){
            setLayerType(View.LAYER_TYPE_SOFTWARE, null);
        }
        initAnimators();
    }

    private void initAnimators(){
        innerContentAnimator = ValueAnimator.ofFloat(innerContentRate, 1.0F);
        knobExpandAnimator = ValueAnimator.ofFloat(knobExpandRate, 1.0F);
        knobMoveAnimator = ValueAnimator.ofFloat(knobMoveRate, 1.0F);

        innerContentAnimator.setDuration(commonDuration);
        knobExpandAnimator.setDuration(commonDuration);
        knobMoveAnimator.setDuration(commonDuration);

        innerContentAnimator.setInterpolator(new DecelerateInterpolator());
        knobExpandAnimator.setInterpolator(new DecelerateInterpolator());
        knobMoveAnimator.setInterpolator(new DecelerateInterpolator());

        innerContentAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                setInnerContentRate((float) animation.getAnimatedValue());
            }
        });
        knobExpandAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                setKnobExpandRate((float) animation.getAnimatedValue());
            }
        });
        knobMoveAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                setKnobMoveRate((float) animation.getAnimatedValue());
            }
        });

    }

    public void setOnSwitchStateChangeListener(OnSwitchStateChangeListener onSwitchStateChangeListener){
        this.onSwitchStateChangeListener = onSwitchStateChangeListener;
    }

    public OnSwitchStateChangeListener getOnSwitchStateChangeListener(){
        return this.onSwitchStateChangeListener;
    }

    void setInnerContentRate(float rate){
        this.innerContentRate = rate;

        invalidate();
    }

    float getInnerContentRate(){
        return this.innerContentRate;
    }

    void setKnobExpandRate(float rate){
        this.knobExpandRate = rate;

        invalidate();
    }

    float getKnobExpandRate(){
        return this.knobExpandRate;
    }

    void setKnobMoveRate(float rate){
        this.knobMoveRate = rate;

        invalidate();
    }

    float getKnobMoveRate(){
        return knobMoveRate;
    }

    @Override
    protected void onAttachedToWindow(){
        super.onAttachedToWindow();
        isAttachedToWindow = true;

        if(dirtyAnimation){
            knobState = this.isOn;
            if(knobState){

                knobMoveAnimator.setFloatValues(knobMoveRate, 1.0F);
                knobMoveAnimator.start();

                innerContentAnimator.setFloatValues(innerContentRate, 0.0F);
                innerContentAnimator.start();
            }else{

                knobMoveAnimator.setFloatValues(knobMoveRate, 0.0F);
                knobMoveAnimator.start();

                innerContentAnimator.setFloatValues(innerContentRate, 1.0F);
                innerContentAnimator.start();
            }

            knobExpandAnimator.setFloatValues(knobExpandRate, 0.0F);
            knobExpandAnimator.start();

            if(NewSwitch.this.onSwitchStateChangeListener != null && isOn != preIsOn){
                NewSwitch.this.onSwitchStateChangeListener.onSwitchStateChange(isOn);
            }

            dirtyAnimation = false;
        }
    }

    @Override
    protected void onDetachedFromWindow(){
        super.onDetachedFromWindow();
        isAttachedToWindow = false;
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec){
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        width = MeasureSpec.getSize(widthMeasureSpec);
        height = MeasureSpec.getSize(heightMeasureSpec);
        
        if((float) height / (float) width < 0.33333F){
            height = (int) ((float) width * 0.33333F);

            widthMeasureSpec = MeasureSpec.makeMeasureSpec(width, MeasureSpec.getMode(widthMeasureSpec));
            heightMeasureSpec = MeasureSpec.makeMeasureSpec(height, MeasureSpec.getMode(heightMeasureSpec));

            super.setMeasuredDimension(widthMeasureSpec, heightMeasureSpec);
        }
        
        //偏移和圆角
        centerX = width / 2;
        centerY = height / 2;
        //圆角
        cornerRadius = centerY - shadowSpace;

        innerContentBound.left = outerStrokeWidth + shadowSpace;
        innerContentBound.top = outerStrokeWidth + shadowSpace;
        innerContentBound.right = width - outerStrokeWidth - shadowSpace;
        innerContentBound.bottom = height - outerStrokeWidth - shadowSpace;

        intrinsicInnerWidth = innerContentBound.width();
        intrinsicInnerHeight = innerContentBound.height();

        knobBound.left = outerStrokeWidth + shadowSpace;
        knobBound.top = outerStrokeWidth + shadowSpace;
        knobBound.right = height - outerStrokeWidth - shadowSpace;
        knobBound.bottom = height - outerStrokeWidth - shadowSpace;

        intrinsicKnobWidth = knobBound.height();
        //移速和拉长
        knobMaxExpandWidth = (float) width * 0.6F;
        if(knobMaxExpandWidth > knobBound.width() * 1.25F){
            knobMaxExpandWidth = knobBound.width() * 1.25F;
        }
    }

    public boolean isOn(){
        return this.isOn;
    }

    public void setOn(boolean on){
        setOn(on, true);
    }

    public void setOn(boolean on, boolean animated){

        if(this.isOn == on) return;

        if(!isAttachedToWindow && animated){
            dirtyAnimation = true;
            this.isOn = on;

            return;
        }

        this.isOn = on;
        knobState = this.isOn;

        if(!animated){

            if(on){
                setKnobMoveRate(1.0F);
                setInnerContentRate(0.0F);
            }else{
                setKnobMoveRate(0.0F);
                setInnerContentRate(1.0F);
            }

            setKnobExpandRate(0.0F);

        }else{
            if(knobState){
 
                knobMoveAnimator.setFloatValues(knobMoveRate, 1.0F);
                knobMoveAnimator.start();

                innerContentAnimator.setFloatValues(innerContentRate, 0.0F);
                innerContentAnimator.start();
            }else{

                knobMoveAnimator.setFloatValues(knobMoveRate, 0.0F);
                knobMoveAnimator.start();

                innerContentAnimator.setFloatValues(innerContentRate, 1.0F);
                innerContentAnimator.start();
            }

            knobExpandAnimator.setFloatValues(knobExpandRate, 0.0F);
            knobExpandAnimator.start();
        }

        if(NewSwitch.this.onSwitchStateChangeListener != null && isOn != preIsOn){
            NewSwitch.this.onSwitchStateChangeListener.onSwitchStateChange(isOn);
        }
    }
    
    public void setbackgroundColor(int backgroundColor){
        this.backgroundColor=backgroundColor;
    }

    public int getbackgroundColor(){
        return this.backgroundColor;
    }
    
    public void setcolorStep(int colorStep){
        this.colorStep=colorStep;
    }

    public int getcolorStep(){
        return this.colorStep;
    }
    
    public void setforegroundColor(int foregroundColor){
        this.foregroundColor=foregroundColor;
    }
    
    public int getforegroundColor(){
        return this.foregroundColor;
    }
    
    public void setTintColor(int tintColor){
        this.tintColor = tintColor;
        tempTintColor = this.tintColor;
    }

    public int getTintColor(){
        return this.tintColor;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){

        if(!isEnabled()) return false;

        switch(event.getAction()){
            case MotionEvent.ACTION_UP:
            case MotionEvent.ACTION_CANCEL:
                if(!knobState){
                    innerContentAnimator.setFloatValues(innerContentRate, 1.0F);

                    innerContentAnimator.start();
                }

                knobExpandAnimator.setFloatValues(knobExpandRate, 0.0F);

                knobExpandAnimator.start();

                isOn = knobState;

                if(NewSwitch.this.onSwitchStateChangeListener != null && isOn != preIsOn){
                    NewSwitch.this.onSwitchStateChangeListener.onSwitchStateChange(isOn);
                }

                break;
        }

        return gestureDetector.onTouchEvent(event);
    }

    @Override
    public void setEnabled(boolean enabled){
        super.setEnabled(enabled);

        if(enabled){
            this.tintColor = tempTintColor;
        }else{
            this.tintColor = this.RGBColorTransform(0.5F, gbolorbk, gbolor);
        }
    }

    @Override
    public void onDraw(Canvas canvas){
        super.onDraw(canvas);

        //动画缩放
        float w = (float) intrinsicInnerWidth / 2.0F * innerContentRate;
        float h = (float) intrinsicInnerHeight / 2.0F * innerContentRate;

        this.innerContentBound.left = centerX - w;
        this.innerContentBound.top = centerY - h;
        this.innerContentBound.right = centerX + w;
        this.innerContentBound.bottom = centerY + h;
        //innerContentCalculation end

        //knobExpandCalculation begin
        w = intrinsicKnobWidth + (float) (knobMaxExpandWidth - intrinsicKnobWidth) * knobExpandRate;

        boolean left = knobBound.left + knobBound.width() / 2 > centerX;

        if(left){
            knobBound.left = knobBound.right - w;
        }else{
            knobBound.right = knobBound.left + w;
        }
        //knobExpandCalculation end
        
        
        
        
        
        //圆
        float kw = knobBound.width();
        //移动距离
        w = (float) (width - kw - ((shadowSpace + outerStrokeWidth) * 2)) * knobMoveRate;
        //颜色
        this.colorStep = RGBColorTransform(knobMoveRate, backgroundColor, tintColor);


        knobBound.left = shadowSpace + outerStrokeWidth + w;
        knobBound.right = knobBound.left + kw;
        paint.setColor(colorStep);
        paint.setShadowLayer (5, 3, 3, Color.parseColor("#FFFFFF")); 
        paint.setStyle(Paint.Style.FILL);
        
        //背景1
        drawRoundRect(shadowSpace, shadowSpace, width - shadowSpace, height - shadowSpace, cornerRadius, canvas, paint);

        //缩放动画
        paint.setColor(backgroundColor);
        canvas.drawRoundRect(innerContentBound, innerContentBound.height() / 2, innerContentBound.height() / 2, paint);
        paint.setColor(foregroundColor);
        
        paint.setShadowLayer(2, 0, shadowSpace / 10, isEnabled() ? 0x20000000 : 0x10000000);
        //圆角
        canvas.drawRoundRect(knobBound, cornerRadius - outerStrokeWidth, cornerRadius - outerStrokeWidth, paint);
        paint.setShadowLayer(0, 0, 0, 0);
        
        //圆形圈边框
        
        paint.setColor(backgroundColor);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1);
        //圆角
        canvas.drawRoundRect(knobBound, cornerRadius - outerStrokeWidth, cornerRadius - outerStrokeWidth, paint);

    }

    private void drawRoundRect(float left, float top, float right, float bottom, float radius, Canvas canvas, Paint paint){

        tempForRoundRect.left = left;
        tempForRoundRect.top = top;
        tempForRoundRect.right = right;
        tempForRoundRect.bottom = bottom;

        canvas.drawRoundRect(tempForRoundRect, radius, radius, paint);
    }

    //seperate RGB channels and calculate new value for each channel
    //ignore alpha channel
    private int RGBColorTransform(float progress, int fromColor, int toColor) {
        int or = (fromColor >> 16) & 0xFF;
        int og = (fromColor >> 8) & 0xFF;
        int ob = fromColor & 0xFF;

        int nr = (toColor >> 16) & 0xFF;
        int ng = (toColor >> 8) & 0xFF;
        int nb = toColor & 0xFF;

        int rGap = (int) ((float) (nr - or) * progress);
        int gGap = (int) ((float) (ng - og) * progress);
        int bGap = (int) ((float) (nb - ob) * progress);

        return 0xFFFFFF | ((or + rGap) << 16) | ((og + gGap) << 8) | (ob + bGap);

    }
}
