package com.Eastiy.EXO.View;
import android.widget.TextView;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Canvas;
import android.view.Gravity;
import android.graphics.Matrix;
import android.text.TextPaint;
import android.text.Layout;
import android.graphics.Shader;
import android.text.StaticLayout;
import android.graphics.Color;

public class LTextView extends TextView{
    
    private int mViewWidth;
    private int mTranslate = 0;
    private Matrix mLinearMatrix;
    private LinearGradient mLinearGradient;
    private TextPaint mPaint;
    
    public LTextView(Context context) {
        super(context);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        if (mViewWidth == 0) {
            mViewWidth = getMeasuredWidth();
            mLinearMatrix = new Matrix();
            mLinearGradient = new LinearGradient(0, 0, mViewWidth, 0,new int[]{0xFFD70F00, 0xFFD53A02, 0xFFDB9501, 0xFF3C9B03, 0xFF04C0AF, 0xFF020098, 0xFF4C0177}, null,Shader.TileMode.REPEAT);
            mPaint = getPaint();
            mPaint.setShader(mLinearGradient);
        }
    }
    
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (mLinearMatrix != null) {
            mTranslate += mViewWidth / 5;
            if (mTranslate > 2* mViewWidth) {
                mTranslate = -mViewWidth;
            }
            mLinearMatrix.setTranslate(mTranslate, 0);
            mLinearGradient.setLocalMatrix(mLinearMatrix);
            canvas.translate(10, 300);
            postInvalidateDelayed(60);
    }
  }
}
