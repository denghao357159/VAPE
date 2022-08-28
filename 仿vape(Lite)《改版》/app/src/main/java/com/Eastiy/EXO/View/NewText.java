package com.Eastiy.EXO.View;
import android.widget.*;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.content.res.Resources;
import android.graphics.*;
import android.view.*;


public class NewText extends TextView{
    
    public NewText(Context context,Object text,String gravity,int size,String color) {
        

        super(context);
        if(gravity=="LT"){
            setGravity(android.view.Gravity.LEFT|android.view.Gravity.TOP);
        }else if(gravity=="LC"){
            setGravity(android.view.Gravity.LEFT|android.view.Gravity.CENTER);
        }else if(gravity=="LB"){
            setGravity(android.view.Gravity.LEFT|android.view.Gravity.BOTTOM);
        }else if(gravity=="CT"){
            setGravity(android.view.Gravity.CENTER|android.view.Gravity.TOP);
        }else if(gravity=="CC"){
            setGravity(android.view.Gravity.CENTER|android.view.Gravity.CENTER);
        }else if(gravity=="CB"){
            setGravity(android.view.Gravity.CENTER|android.view.Gravity.BOTTOM);
        }else if(gravity=="RT"){
            setGravity(android.view.Gravity.RIGHT|android.view.Gravity.TOP);
        }else if(gravity=="RC"){
            setGravity(android.view.Gravity.RIGHT|android.view.Gravity.CENTER);
        }else if(gravity=="RB"){
            setGravity(Gravity.RIGHT|android.view.Gravity.BOTTOM);
        }
        if(text instanceof android.text.Spanned){
        setText((android.text.Spanned)(text));
        }else{
        setText((String)(text));
        }
        setTypeface(Typeface.createFromAsset(context.getAssets(),"fonts/mihome_icons.ttf"));
        

        if(!"null".equals(String.valueOf(size))){
            setTextSize(size);
        }
        if(color!=null){
            setTextColor(android.graphics.Color.parseColor(color));
        }else{
            getPaint().setShader(new LinearGradient(0,0,getw(this)+12,0, Color.parseColor("#465EFB"), Color.parseColor("#C2FFD8"),Shader.TileMode.CLAMP));

        }

    }
    
    public NewText(Context context, AttributeSet attrs) {  

        super(context, attrs);
        

    }
    
    @Override
    protected void onDraw(Canvas canvas) {
        
        super.onDraw(canvas);
    
    }
    public static int getw(View b) {
        int w = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
        int h = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
        b.measure(w, h);
        return b.getMeasuredWidth();
    }
    public static int geth(View b) {
        int w = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
        int h = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
        b.measure(w, h);
        return b.getMeasuredHeight();
    }
    
}
