package com.Eastiy.EXO.View;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.ScrollView;
import android.annotation.Nullable;

/*
 * ClassName: AnswerLibrary_AViewSV 
 * Chinese: 滑动控件
 * Based: AnswerLibrary 3.1
 * © AnswerTame 2022
 * Time: 2022/08/05/00:14
 * By Answer.Dev
 * QQ 2903536884
 */
 
public class AViewSV  extends android.widget.ScrollView {

    private View inner;
    
    public AViewSV(Context context) {
        this(context, null);
    }

    public AViewSV(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs,0);
    }

    public AViewSV(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr, 0);
    }

    public AViewSV(Context context, @Nullable AttributeSet attrs,
                                  int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onFinishInflate() {
        if (getChildCount() > 0) {
            inner = getChildAt(0);
        }
    }

    public AViewSV(Activity context, View view, Object sizeW, Object sizeH, Object cm, Object color, Object cr) {
        super(context);
        setSizeWH(sizeW, sizeH, this);
        setBackgroundcolors(cm, color, cr, this);
        addView(view);
        inner = view;
    }

    public AViewSV(Activity context, View view, Object sizeW, Object sizeH, Object cm, Object color) {
        super(context);
        setSizeWH(sizeW, sizeH, this);
        setBackgroundcolors(cm, color, 0, this);
        addView(view);
        inner = view;
    }

    public AViewSV(Activity context, View view, Object sizeW, Object sizeH) {
        super(context);
        setSizeWH(sizeW, sizeH, this);
        addView(view);
        inner = view;
    }

    public AViewSV(Activity context, View view, Object sizeW) {
        super(context);
        setSizeWH(sizeW, 0, this);
        addView(view);
        inner = view;
    }

    public AViewSV(Activity context, View view) {
        super(context);
        addView(view);
        inner = view;
    }

    public AViewSV(Activity context) {
        super(context);
    }

    private static void setSizeWH(Object sizeW, Object sizeH, ScrollView v) {
        if (sizeW != null && sizeH != null) {
            v.setLayoutParams(new android.widget.LinearLayout.LayoutParams((int)(sizeW), (int)(sizeH)));
        }
    }

    private static void setBackgroundcolors(int cm, Object color, Object cr, ScrollView v) {
        if (cm == 0) {
            v.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(android.graphics.Color.parseColor((String)color)));
        } else if (cm == 1) {
            v.setBackgroundDrawable(ColorLibrary.roundBG(color, cr, null, null));
        } else if (cm == 2) {
        }
    }

    private float b = 0.0f;
    private float c = 0.0f;
    private float d = 0.0f;
    private float e = 0.0f;
    private float f = 0.0f;
    private boolean g = false;
    private boolean h = false;
    private Rect i = new Rect();

    private void a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int i2 = 0;
        if (action == 1) {
            this.h = false;
            if (isNeedAnimation()) {
                animation();
            }
            b();
        } else if (action == 2) {
            float f2 = this.f;
            float y = motionEvent.getY();
            int i3 = (int) (y - f2);
            this.f = y;
            if (this.h) {
                i2 = i3;
            }
            this.h = true;
            if (a()) {
                if (this.i.isEmpty()) {
                    this.i.set(this.inner.getLeft(), this.inner.getTop(), this.inner.getRight(), this.inner.getBottom());
                }
                View view = this.inner;
                int i4 = i2 / 4;
                view.layout(view.getLeft(), this.inner.getTop() + i4, this.inner.getRight(), this.inner.getBottom() + i4);
            }
        }
    }

    private boolean a() {
        int measuredHeight = this.inner.getMeasuredHeight() - getHeight();
        int scrollY = getScrollY();
        return scrollY == measuredHeight || scrollY == 0;
    }

    private void b() {
        this.d = 0.0f;
        this.e = 0.0f;
        this.g = false;
    }

    public void animation() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) this.inner.getTop(), (float) this.i.top);
        translateAnimation.setDuration(200);
        this.inner.startAnimation(translateAnimation);
        this.inner.layout(this.i.left, this.i.top, this.i.right, this.i.bottom);
        this.i.setEmpty();
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.b = motionEvent.getX();
        this.c = motionEvent.getY();
        if (motionEvent.getAction() == 2) {
            float f2 = this.b - this.d;
            float f3 = this.c - this.e;
            if (Math.abs(f2) < Math.abs(f3) && Math.abs(f3) > 20.0f) {
                this.g = true;
            }
        }
        this.d = this.b;
        this.e = this.c;
        if (this.g && this.inner != null) {
            a(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean isNeedAnimation() {
        return !this.i.isEmpty();
    }
    
}
