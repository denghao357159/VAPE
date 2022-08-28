package com.answer.UI.View;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import com.answer.UI.View.AppConfig;
import java.util.Timer;
import java.util.TimerTask;
import android.widget.SeekBar;

/**
 * 水平渐变色拖动条
 * 
 */
public class ASeekBar extends View {
    /**
     * 进度条填充起始色
     */
    protected int startFillColor;

    /**
     * 进度条填充中间色
     */
    protected int middleFillColor;

    /**
     * 进度条填充结束颜色
     */
    protected int endFillColor;

    /**
     * 指示圆点颜色
     */
    private int progressPointColor=0xa7bfe8;

    /**
     * 进度条未填充颜色
     */
    protected int backgroundColor;

    /**
     * 进度条长度
     */
    protected float progressWidth;

    /**
     * 进度条的高度，包括进度条的高度和上下的间隔
     */
    private float progressHeight;

    /**
     * 进度条的高度，不包括上下的间隔
     */
    private float lineWidth;

    /**
     * 进度条左侧间隔
     */
    private float widthSpace;

    /**
     * 进度条中心与上方的间隔
     */
    private float heightSpace;

    /**
     * 內圆的半径
     */
    private float radius;

    /**
     * 按比例计算各部分的值
     */
    private float unit;

    /**
     * 整个控件宽度
     */
    protected int viewWidth;

    /**
     * 整个控件高度
     */
    protected int viewHeight;

    /**
     * 渐变色数组
     */
    private int colorArray[];

    /**
     * 画笔
     */
    protected Paint paint;

    /**
     * 控件当前的进度
     */
    private float progress = 0;

    /**
     * 处理颜色渐变
     */
    private LinearGradient shader;

    /**
     * 自定义的监听器，负责监听控件的触摸事件
     */
    private ProgressChangedListener listener;

    private float unitHeight;

    private float unitWidth;

    private Paint paint2;

    

    /**
     * @param context
     *            上下文
     */
    /*public ASeekBar(Context context)
     {
     this(context, null);
     }*/

    /**
     * @param context上下文
     * @param attrs
     *            自定义的属性
     */
    /*public ASeekBar(Context context, AttributeSet attrs)
     {
     this(context, attrs, 0);
     }*/

    /**
     * @param context
     *            上下文
     * @param attrs
     *            自定义的属性
     * @param defStyleAttr
     *            自定义的风格
     */
    public ASeekBar(Context context) {
        super(context, null);
        colorArray = new int[3];
        paint = new Paint();
        paint2 = new Paint();

        colorArray[0] = Color.parseColor(AppConfig.theme[5]);
        colorArray[1] = Color.parseColor(AppConfig.theme[5]);
        colorArray[2] = Color.parseColor(AppConfig.theme[5]);
        backgroundColor =  Color.parseColor(AppConfig.theme[3]);
        progressPointColor = Color.parseColor(AppConfig.theme[0]);

        lineWidth = (int)(AppConfig.H() * 0.1);


    }

    
    public void setLineWidth(int w){
        lineWidth=w;
    }
    /**
     * 测量组件高度和宽度
     */
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int width = 0;
        int height = 0;

        // 设置宽度
        // MeasureSpec.getMode()会得到三个int类型的值分别为:MeasureSpec.EXACTLY
        // MeasureSpec.AT_MOST,MeasureSpec.UNSPECIFIED。
        // MeasureSpec.UNSPECIFIED 未指定，所以可以设置任意大小。
        // MeasureSpec.AT_MOST MeasureExampleView可以为任意大小，但是有一个上限。
        int specMode = MeasureSpec.getMode(widthMeasureSpec);
        int specSize = MeasureSpec.getSize(widthMeasureSpec); // 会解析MeasureSpec值得到父容器width或者height。
        switch (specMode) {
            case MeasureSpec.EXACTLY: // 明确指定了
                width = specSize;
                break;
            case MeasureSpec.AT_MOST: // 一般为wrap_content
                width = getPaddingLeft() + getPaddingRight();
                break;
        }

        // 设置高度
        specMode = MeasureSpec.getMode(heightMeasureSpec);
        specSize = MeasureSpec.getSize(heightMeasureSpec);
        switch (specMode) {
            case MeasureSpec.EXACTLY:
                height = specSize;
                break;
            case MeasureSpec.AT_MOST:
                height = width / 10;
                break;
        }
        // Logger.d("onMeasure():width=" + width + ",height=" + height);
        setMeasuredDimension(width, height);

        viewWidth = getMeasuredWidth(); // 获得视图的宽度
        viewHeight = getMeasuredHeight(); // 获得视图的高度

        unitWidth = (float) viewWidth / 300;

        unitHeight = (float) viewHeight / 30; // 按比例计算各部分的值


        progressWidth = unitWidth * 265 ; // 进度条的长度
        progressHeight = unitHeight * 30; // 进度条的高度，包括上下间隔

        widthSpace = unitWidth * 13; // 进度条左侧间隔
        heightSpace = progressHeight / 2 ; // float heightSpace 进度条中心与上方的间隔

        radius = lineWidth / 100 *30; // 內圆的半径

    }

    @Override
    public void onDraw(Canvas canvas) {
        float percent = ((float) progress) / maxProgress; // 当前进度的百分比

        

        // 画灰色的底线
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setColor(backgroundColor); // 设置颜色为灰色
        paint.setStrokeWidth(lineWidth); // 设置线的宽度
        paint.setStrokeCap(Paint.Cap.ROUND); // 设置线为圆角
        canvas.drawLine(widthSpace, heightSpace, progressWidth + widthSpace  , heightSpace, paint); // 画灰色的底线


        if (percent <= 0) {
            paint.setColor(Color.parseColor(AppConfig.theme[3]));
        } else if (percent > 0) {
            paint.setColor(colorArray[0]);
        }
        canvas.drawLine(widthSpace, heightSpace, widthSpace + percent * progressWidth, heightSpace, paint); // 画渐变色进度线条

        // 画圆
        paint2.setShader(null);
        paint2.setColor(progressPointColor);
        paint2.setStrokeWidth(2);
        paint2.setStyle(Paint.Style.FILL); // 设置绘画方式为填充
        paint2.setShadowLayer(8, 10, 10, Color.parseColor("#66000000"));
        paint2.setAntiAlias(true);
        canvas.drawCircle(percent * progressWidth + widthSpace, heightSpace, radius, paint2); // 绘制圆

    }


    
    private int maxProgress = 100;
    
    private float downX;
    private float currentCountTemp;
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            
            case MotionEvent.ACTION_DOWN:
                downX = event.getX();
                
                currentCountTemp = progress;
                return true;
            case MotionEvent.ACTION_MOVE:
                float downXTemp = event.getX();
                float x = downXTemp - downX;
               // progress += (downX-event.getRawX())*1f/(getWidth())*maxProgress;
                progress = currentCountTemp + (int) (x/getWidth() * maxProgress);
                if(progress < 0){
                    progress = 0;
                }else if(progress > maxProgress){
                    progress = maxProgress;
                }
                invalidate();
                
                if (listener != null) {
                    listener.onProgressChanged(progress); // 在处理触摸事件时传入重新计算过的进度参数，
                    }
                    
                return true;
            case MotionEvent.ACTION_UP:
                
                break;
        }
        return super.onTouchEvent(event);
    }

    public void setOnProgressChangeListener(ProgressChangedListener listener2) {
        this.listener = listener2;
    }
    

    /**
     * 设置进度条的最大进度值
     * 
     * @param pro
     *            传入的进度值
     */
    public void setMaxProgress(int pro) {
        
            this.maxProgress = pro;
        
        invalidate();
    }

    /**
     * 设置进度条的进度值
     * 
     * @param pro
     *            传入的进度值
     */
    public void setProgress(float pro) {
        
            this.progress = pro;
        
        invalidate();
    }

    public void setProgressPointColor(int progressPointColor) {
        this.progressPointColor = progressPointColor;
    }

    public void setSBackgColor(int backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    /**
     * 设置渐变色数组
     * 
     * @param colorArray
     */
    public void setColorArray(int[] colorArray) {
        this.colorArray = colorArray;
    }

    public void setColorArray(int colorArray) {
        this.colorArray[0] = colorArray;
        this.colorArray[1] = colorArray;
        this.colorArray[2] = colorArray;
    }

    public interface ProgressChangedListener {
        public void onProgressChanged(float touchX);
    }
}
