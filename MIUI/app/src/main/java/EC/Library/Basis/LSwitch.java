package EC.Library.Basis;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;

/**
 * Created by XiaoMeng on 20-6-27.
 */
public class LSwitch extends View implements ValueAnimator.AnimatorUpdateListener,ValueAnimator.AnimatorListener{
    private float mWidthAndHeightPercent ;
    private float mWidth;
    private float mHeight;
    private float mTransitionLength;
    private Path mBackgroundPath;
    private Path mButtonPath;

    //paint
    private int mOffBackgroundColor = Color.parseColor("#f4f4f4");
    private int mOnBackgroundColor = /*Color.parseColor("#FF00B1FF");*/Color.argb(255,46,96,222);
    private int mCurrentColor = mOffBackgroundColor;
    // animation
    private ValueAnimator mValueAnimator;
    private Interpolator mInterpolator = new AccelerateDecelerateInterpolator();
    private float mAnimationFraction = 0.0f;
	
	/***/
	private final static float DEFAULT_WIDTH_HEIGHT_PERCENT = 0.65f;
    private final static float FACE_ANIM_MAX_FRACTION = 1.4f;
    private final static float NORMAL_ANIM_MAX_FRACTION = 1.0f;

    private int mButtonColor = 0xffffffff;
    private Paint mPaint;
    private float mButtonRadius;
    private float mCenterX;
    private float mCenterY;

    private boolean mIsOpen = false;
    private boolean mIsDuringAnimation = false;

	//动画执行时间
    private long mOnAnimationDuration = 250L;//250
    private long mOffAnimationDuration = (long)(mOnAnimationDuration * NORMAL_ANIM_MAX_FRACTION / FACE_ANIM_MAX_FRACTION);

    private OnSwitchChangeListener mOnSwitchChangeListener;
    
    
    public LSwitch(Context context) {
        super(context);
        init(context);
    }

    public LSwitch(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public LSwitch(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }
    private void init(Context context) {
        mWidthAndHeightPercent = DEFAULT_WIDTH_HEIGHT_PERCENT;
        mPaint = new Paint();
        setCheck(false);
        // TODO: View ID 和 setSavedEnable都很重要的。
        setSaveEnabled(true);
    }

	private int DoubleToInt(double mDouble){
		int num = (new Double(mDouble)).intValue();
		return num;
	}
   

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int width = MeasureSpec.getSize(widthMeasureSpec);
        int height = (int) (width * DEFAULT_WIDTH_HEIGHT_PERCENT);
        setMeasuredDimension(width,height);
    }
    
    
    
    public interface OnSwitchChangeListener{
        void OnChange(boolean Check);
        
    }
   
    
    
    
    
    public void setOnSwitchChangeListener(OnSwitchChangeListener listener){
        mOnSwitchChangeListener = listener;
    }
   
    

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        //TODO：还有padding的问题偶！！！
        mWidth = w;
        mHeight = h;
        float top = 0;
        float left = 0;
        float bottom = h*0.8f; //下边预留0.2空间来画阴影
        float right = w;

        RectF backgroundRecf = new RectF(left,top,bottom,bottom);
        mBackgroundPath = new Path();
        //TODO:???????????
        mBackgroundPath.arcTo(backgroundRecf,90,180);

        backgroundRecf.left = right - bottom;
        backgroundRecf.right = right;
        mBackgroundPath.arcTo(backgroundRecf,270,180);
        mBackgroundPath.close();

        float radius = DoubleToInt((bottom / 2.6)) * 0.98f;
        mCenterX =(top+bottom)/2;
        mCenterY = (left+bottom)/2;
        mButtonRadius = radius;
        mTransitionLength = right - bottom;

        RectF faceRecf = new RectF(mCenterX-mButtonRadius,mCenterY-mButtonRadius,mCenterX+mButtonRadius,mCenterY+mButtonRadius);
        mButtonPath = new Path();
        mButtonPath.arcTo(faceRecf,90,180);
        mButtonPath.arcTo(faceRecf,270,180);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawBackground(canvas);
        drawForeground(canvas);
        
    }

    private void drawBackground(Canvas canvas) {
        mPaint.setColor(mCurrentColor);
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawPath(mBackgroundPath,mPaint);
        mPaint.reset();
        
    }
    private void drawForeground(Canvas canvas) {
        //移动画布
        canvas.save();
        canvas.translate(getForegroundTransitionValue(),0);
        drawButton(canvas, mAnimationFraction);
        canvas.restore();
    }
    
    
    
    
    
    public float dp2pxFloat(float dpValue) {
        float scale = getResources().getDisplayMetrics().density;
        return dpValue * scale + 0.5f;
    }

    public void drawButton(Canvas canvas,float fraction) {
        mPaint.setAntiAlias(true);
        //按钮
        mPaint.setColor(mButtonColor);
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawPath(mButtonPath,mPaint);

	
    }

    private float getForegroundTransitionValue() {
        float result;
        if (mIsOpen) {
            if (mIsDuringAnimation) {
                result = mAnimationFraction > NORMAL_ANIM_MAX_FRACTION ?
					mTransitionLength : mTransitionLength * mAnimationFraction;
            } else {
                result = mTransitionLength;
            }
        } else {
            if (mIsDuringAnimation) {
                result = mTransitionLength * mAnimationFraction;
            } else {
                result = 0;
            }
        }
        return result;
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e("TEST","onTouchEvent");
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                return true;
            case MotionEvent.ACTION_CANCEL:
                break;
            case MotionEvent.ACTION_UP:
                if (mIsDuringAnimation) {
                    return true;
                }
                if (mIsOpen) {
                    startCloseAnimation();
                    mIsOpen = false;
                    mOnSwitchChangeListener.OnChange(mIsOpen);
                } else {
                    startOpenAnimation();
                    mIsOpen = true;
                    mOnSwitchChangeListener.OnChange(mIsOpen);
                }
                return true;
        }
        return super.onTouchEvent(event);
    }
    private void startOpenAnimation() {
        mValueAnimator = ValueAnimator.ofFloat(0.0f, FACE_ANIM_MAX_FRACTION);
        mValueAnimator.setDuration(mOnAnimationDuration);
        mValueAnimator.addUpdateListener(this);
        mValueAnimator.addListener(this);
        mValueAnimator.setInterpolator(mInterpolator);
        mValueAnimator.start();
        startColorAnimation();

    }
    private void startCloseAnimation() {
        mValueAnimator = ValueAnimator.ofFloat(NORMAL_ANIM_MAX_FRACTION,0);
        mValueAnimator.setDuration(mOffAnimationDuration);
        mValueAnimator.addUpdateListener(this);
        mValueAnimator.addListener(this);
        mValueAnimator.setInterpolator(mInterpolator);
        mValueAnimator.start();
        startColorAnimation();
    }
    private void startColorAnimation() {
        int colorFrom = mIsOpen?mOnBackgroundColor:mOffBackgroundColor; //mIsOpen为true则表示要启动关闭的动画
        int colorTo = mIsOpen? mOffBackgroundColor:mOnBackgroundColor;
        long duration = mIsOpen? mOffAnimationDuration:mOnAnimationDuration;
        ValueAnimator colorAnimation = ValueAnimator.ofObject(new ArgbEvaluator(), colorFrom, colorTo);
        colorAnimation.setInterpolator(mInterpolator);
        colorAnimation.setDuration(duration); // milliseconds
        colorAnimation.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
				@Override
				public void onAnimationUpdate(ValueAnimator animator) {
					mCurrentColor = (int)animator.getAnimatedValue();
				}

			});
        colorAnimation.start();

    }
    @Override
    public void onAnimationUpdate(ValueAnimator animation) {
        Log.e("TEST",animation.getAnimatedValue()+" ");
        mAnimationFraction = (float)animation.getAnimatedValue();
        invalidate();

    }

    @Override
    public void onAnimationStart(Animator animation) {
        mIsDuringAnimation = true;
    }

    @Override
    public void onAnimationEnd(Animator animation) {
        mIsDuringAnimation = false;
    }

    @Override
    public void onAnimationCancel(Animator animation) {
        mIsDuringAnimation = false;
    }

    @Override
    public void onAnimationRepeat(Animator animation) {
        mIsDuringAnimation = true;
    }

    public void setCheck(boolean check) {
        mIsOpen = check;
        refreshState();
    }
    
    public boolean isCheck(){
        return mIsOpen;
    }
    
    public void refreshState() {
        mCurrentColor = mIsOpen ? mOnBackgroundColor : mOffBackgroundColor;
        invalidate();
       // mOnSwitchChangeListener.OnChange(mIsOpen);
    }

    @Override
    protected Parcelable onSaveInstanceState() {
        Log.e("Prism","onSave");
        Parcelable superState =  super.onSaveInstanceState();
        SavedState ss = new SavedState(superState);
        ss.isOpen = mIsOpen ? 1:0;
        return ss;
    }

    @Override
    protected void onRestoreInstanceState(Parcelable state) {
        Log.e("Prism","onRestore");
        SavedState ss = (SavedState) state;
        super.onRestoreInstanceState(state);
        boolean result = ss.isOpen == 1;
        setCheck(result);
    }

    static class SavedState extends BaseSavedState {
        int isOpen;

        public SavedState(Parcel source) {
            super(source);
            isOpen = source.readInt();
        }

        public SavedState(Parcelable superState) {
            super(superState);
        }

        @Override
        public void writeToParcel(Parcel out, int flags) {
            super.writeToParcel(out, flags);
            out.writeInt(isOpen);
        }
        public static final Parcelable.Creator<SavedState> CREATOR
		= new Parcelable.Creator<SavedState>() {
            @Override
            public SavedState createFromParcel(Parcel source) {
                return new SavedState(source);
            }

            @Override
            public SavedState[] newArray(int size) {
                return new SavedState[0];
            }
        };
    }
}

