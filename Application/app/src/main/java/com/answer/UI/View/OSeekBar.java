package com.answer.UI.View;
import android.view.View;
import android.graphics.Paint;
import android.content.Context;
import android.annotation.Nullable;
import android.util.AttributeSet;
import android.graphics.Color;
import android.graphics.Canvas;
import android.os.Build;
import android.view.MotionEvent;
import android.graphics.RectF;
import android.view.ViewOutlineProvider;
import android.graphics.Outline;
import android.support.annotation.RequiresApi;

public class OSeekBar extends View {

    private String TAG = "OSeekBar";
    private int maxProgress = 100;
    private int currentProgress = 50;
    private float radius = 10;

    private Paint bgPaint;
    private Paint barPaint;

    public void setBgColor(int bgColor) {
        bgPaint.setColor(bgColor);
    }

    public void setBarColor(int barColor) {
        barPaint.setColor(barColor);
    }

    public int getMaxProgress() {
        return maxProgress;
    }

    public void setMaxProgress(int maxProgress) {
        this.maxProgress = maxProgress;
    }

    public int getCurrentProgress() {
        return currentProgress;
    }

    public void setCurrentProgress(int currentProgress) {
        this.currentProgress = currentProgress;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public OSeekBar(Context context) {
        super(context);
        init();
    }

    public OSeekBar(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public OSeekBar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public void init() {
        bgPaint = new Paint();
        barPaint = new Paint();
        bgPaint.setAntiAlias(true);
        barPaint.setAntiAlias(true);
        bgPaint.setColor(Color.parseColor(AppConfig.theme[3]));
        barPaint.setColor(Color.parseColor(AppConfig.theme[5]));
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        canvas.drawRoundRect(0f,0f,width,height,radius,radius,bgPaint);
        float barWidth = width*1.0f/ maxProgress * currentProgress;
        canvas.drawRoundRect(0,0,barWidth,height,radius,0,barPaint);
        
        setOutlineProvider(new ViewOutlineProvider() {
                @Override
                public void getOutline(View view, Outline outline) {
                    outline.setRoundRect(0, 0, view.getWidth(),   view.getHeight(), radius);
                }
            });
        setClipToOutline(true);

    }

    private float downX;
    private int currentCountTemp;
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                downX = event.getX();
                currentCountTemp = currentProgress;
                
                return true;
            case MotionEvent.ACTION_MOVE:
                float downXTemp = event.getX();
                float x = downXTemp - downX;
                currentProgress = currentCountTemp + (int) (x/getWidth() * maxProgress);
                if(currentProgress < 0){
                    currentProgress = 0;
                }else if(currentProgress > maxProgress){
                    currentProgress = maxProgress;
                }
                invalidate();
                if(onDragListener != null){
                    onDragListener.onProgressChange(currentProgress);
                }
                return true;
            default:
                break;
        }
        return super.onTouchEvent(event);
    }
    

    public interface OnDragListener {
        void onProgressChange(int progress);
    }
    private OnDragListener onDragListener;
    public void setOnDragListener(OnDragListener onDragListener) {
        this.onDragListener = onDragListener;
    }
}
