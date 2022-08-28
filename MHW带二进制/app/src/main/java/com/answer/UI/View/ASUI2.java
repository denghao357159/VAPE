package com.answer.UI.View;
import android.widget.*;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.view.View;
import android.view.*;
import android.content.Context;
import java.lang.reflect.Array;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.animation.ObjectAnimator;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class ASUI2 {

    

    public static Button NewButton(Context ctx,String text,int sizeW,int sizeH){
        int[] btc={Color.parseColor("#465EFB"),Color.parseColor("#ffffff")};
        float[] btf={360,360,360,360,360,360,360,360};
        Button btl=new Button(ctx);
        btl.setText(text);
        btl.setTextColor(Color.parseColor("#C2FFD8"));
        btl.setBackgroundDrawable(roundBG(btc,btf,null,0));
        btl.setLayoutParams(new android.widget.LinearLayout.LayoutParams(sizeW,sizeH));



        return btl;
    }
	
   
    public static LinearLayout NewView(Context ctx,int sizeW,int sizeH,String gravity,int ori,int cm,int[] color,float[] cr){
        LinearLayout _L1=new LinearLayout(ctx);
        
        if(!"null".equals(String.valueOf(sizeW))&&!"null".equals(String.valueOf(sizeH))){
            _L1.setLayoutParams(new android.widget.LinearLayout.LayoutParams(sizeW,sizeH));
        }
        
        if(gravity=="LT"){
            _L1.setGravity(android.view.Gravity.LEFT|android.view.Gravity.TOP);
        }else if(gravity=="LC"){
            _L1.setGravity(android.view.Gravity.LEFT|android.view.Gravity.CENTER);
        }else if(gravity=="LB"){
            _L1.setGravity(android.view.Gravity.LEFT|android.view.Gravity.BOTTOM);
        }else if(gravity=="CT"){
            _L1.setGravity(android.view.Gravity.CENTER|android.view.Gravity.TOP);
        }else if(gravity=="CC"){
            _L1.setGravity(android.view.Gravity.CENTER|android.view.Gravity.CENTER);
        }else if(gravity=="CB"){
            _L1.setGravity(android.view.Gravity.CENTER|android.view.Gravity.BOTTOM);
        }else if(gravity=="RT"){
            _L1.setGravity(android.view.Gravity.RIGHT|android.view.Gravity.TOP);
        }else if(gravity=="RC"){
            _L1.setGravity(android.view.Gravity.RIGHT|android.view.Gravity.CENTER);
        }else if(gravity=="RB"){
            _L1.setGravity(android.view.Gravity.RIGHT|android.view.Gravity.BOTTOM);
        }
        if(!"null".equals(String.valueOf(ori))){
            _L1.setOrientation(ori);
        }
        if(cm==0){
            _L1.setBackgroundDrawable(roundBG(color,cr,null,0));
        }else if(cm==1){

        }
        
        return _L1;
    }
    
    public static ScrollView NewViewSV(Context ctx,int sizeW,int sizeH,int cm,int[] color,float[] cr){
        
       ScrollView _L1=new android.widget.ScrollView(ctx);
       
        if(!"null".equals(String.valueOf(sizeW))&&!"null".equals(String.valueOf(sizeH))){
            _L1.setLayoutParams(new android.widget.LinearLayout.LayoutParams(sizeW,sizeH));
        }
        if(cm==0){
            _L1.setBackgroundDrawable(roundBG(color,cr,null,1));
        }else if(cm==1){
            
        }
        return _L1;
    }
    
    public static android.widget.TextView NewText(Context ctx,String text,String gravity,int size,String color){
        android.widget.TextView _T1 = new android.widget.TextView(ctx);
        if(gravity=="LT"){
            _T1.setGravity(android.view.Gravity.LEFT|android.view.Gravity.TOP);
        }else if(gravity=="LC"){
            _T1.setGravity(android.view.Gravity.LEFT|android.view.Gravity.CENTER);
        }else if(gravity=="LB"){
            _T1.setGravity(android.view.Gravity.LEFT|android.view.Gravity.BOTTOM);
        }else if(gravity=="CT"){
            _T1.setGravity(android.view.Gravity.CENTER|android.view.Gravity.TOP);
        }else if(gravity=="CC"){
            _T1.setGravity(android.view.Gravity.CENTER|android.view.Gravity.CENTER);
        }else if(gravity=="CB"){
            _T1.setGravity(android.view.Gravity.CENTER|android.view.Gravity.BOTTOM);
        }else if(gravity=="RT"){
            _T1.setGravity(android.view.Gravity.RIGHT|android.view.Gravity.TOP);
        }else if(gravity=="RC"){
            _T1.setGravity(android.view.Gravity.RIGHT|android.view.Gravity.CENTER);
        }else if(gravity=="RB"){
            _T1.setGravity(Gravity.RIGHT|android.view.Gravity.BOTTOM);
        }
        _T1.setText(text);
        
        if(!"null".equals(String.valueOf(size))){
            _T1.setTextSize(size);
        }
        if(color!=null){
            _T1.setTextColor(android.graphics.Color.parseColor(color));
        }else{
         }
        
        return _T1;
    };

    
    
    
    public static PopupWindow NewPW(View view,int sizeW,int sizeH,boolean fa,boolean ta,boolean ca,String gravity,String Astyle,int pyx,int pyy){
        PopupWindow _Cdkview1 = new PopupWindow();
       
        if(Astyle==null || Astyle=="Di"){
            _Cdkview1.setAnimationStyle(android.R.style.Animation_Dialog);
        }else if(Astyle=="In"){
            _Cdkview1.setAnimationStyle(android.R.style.Animation_InputMethod);
        }else if(Astyle=="To"){
            _Cdkview1.setAnimationStyle(android.R.style.Animation_Toast);
        }else if(Astyle=="Tr"){
            _Cdkview1.setAnimationStyle(android.R.style.Animation_Translucent);
        }else if(Astyle=="Ac"){
            _Cdkview1.setAnimationStyle(android.R.style.Animation_Activity);
        }
        
        
            _Cdkview1.setContentView(view);
        
        if(!"null".equals(String.valueOf(sizeW))){_Cdkview1.setWidth(sizeW);}
        if(!"null".equals(String.valueOf(sizeH))){_Cdkview1.setHeight(sizeH);}
        _Cdkview1.setFocusable(fa);//可返回关闭
        _Cdkview1.setTouchable(ta);//可触摸的
        _Cdkview1.setClippingEnabled(ca);//允许弹出窗口超出屏幕范围
        if(gravity=="LT"){
            _Cdkview1.showAtLocation(view,android.view.Gravity.LEFT|android.view.Gravity.TOP,pyx,pyy);
        }else if(gravity=="LC"){
            _Cdkview1.showAtLocation(view,android.view.Gravity.LEFT|android.view.Gravity.CENTER,pyx,pyy);
        }else if(gravity=="LB"){
            _Cdkview1.showAtLocation(view,android.view.Gravity.LEFT|android.view.Gravity.BOTTOM,pyx,pyy);
        }else if(gravity=="CT"){
            _Cdkview1.showAtLocation(view,android.view.Gravity.CENTER|android.view.Gravity.TOP,pyx,pyy);
        }else if(gravity=="CC"){
            _Cdkview1.showAtLocation(view,android.view.Gravity.CENTER|android.view.Gravity.CENTER,pyx,pyy);
        }else if(gravity=="CB"){
            _Cdkview1.showAtLocation(view,android.view.Gravity.CENTER|android.view.Gravity.BOTTOM,pyx,pyy);
        }else if(gravity=="RT"){
            _Cdkview1.showAtLocation(view,android.view.Gravity.RIGHT|android.view.Gravity.TOP,pyx,pyy);
        }else if(gravity=="RC"){
            _Cdkview1.showAtLocation(view,android.view.Gravity.RIGHT|android.view.Gravity.CENTER,pyx,pyy);
        }else if(gravity=="RB"){
            _Cdkview1.showAtLocation(view,android.view.Gravity.RIGHT|android.view.Gravity.BOTTOM,pyx,pyy);
        }
       
        return _Cdkview1;
    };
    
        
    
    public static GradientDrawable roundBG(int[] color, float[] cr,String f,int s) {
     GradientDrawable.Orientation jb = null;
     int type = 0;
     
        if(f=="TB"||f==null){
            jb=android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM;
        }else if(f=="LR"){
            jb=android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT;
        }else if(f=="RT"){
            jb=android.graphics.drawable.GradientDrawable.Orientation.BL_TR;
        }else if(f=="RB"){
            jb=android.graphics.drawable.GradientDrawable.Orientation.TL_BR;
        }
        if(s==0||"null".equals(String.valueOf(s))){
            type=android.graphics.drawable.GradientDrawable.LINEAR_GRADIENT;
        }else if(s==1){
            type=android.graphics.drawable.GradientDrawable.RADIAL_GRADIENT;
        }else if(s==2){
            type=android.graphics.drawable.GradientDrawable.SWEEP_GRADIENT;
        }
        
        
        
        GradientDrawable bd1=new GradientDrawable();
        bd1.setCornerRadii(cr);
        bd1.setShape(GradientDrawable.RECTANGLE);
        bd1.setColors(color);
        bd1.setGradientType(type);
        bd1.setOrientation(jb);
        
        
        return bd1;
    }
    public static LinearLayout Space(Context ctx,int W,int H){
       LinearLayout spacel=NewView(ctx,W,H,"CC",1,0,null,null);
      
      return spacel;
        
    }
    
    public static EditText NewET(Context ctx,String hname,String oname,int size,String color,boolean bg){
    EditText _ET1=new android.widget.EditText(ctx);
    _ET1.setHint(hname);
    _ET1.setText(oname);
     _ET1.setTextSize(size);
     _ET1.setTextColor(android.graphics.Color.parseColor(color));
     if(bg==false){
     _ET1.setBackground(null);
     }else{
         
     }
     return _ET1;
     };
    
    
    /*
    public static GradientDrawable roundBG(String[] hex,float[] round,int s){
        
        if(hex.length==2){
            int hexed;
            hexed=hexColor(hex[1]);
            int[] hexe=new int[]{hexed};
            return roundRect(hexe,round,hex[0],s);
        }else{
            int[] hexed = null;
            for(int a=1;a<hex.length;a++){
                hexed[a-1]=hexColor(hex[a]);
            }
        }
        
        
        
        
        
    }
    */
    public static void Waterdropanimation(View view,int time){
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(view, "scaleX", 8f,1.3f,9f);
        objectAnimator.setDuration(time);  
        objectAnimator.start();  
        
        ObjectAnimator objectAnimator2 = ObjectAnimator.ofFloat(view, "scaleY", 8f,1.3f,9f);
        objectAnimator2.setDuration(time);  
        objectAnimator2.start();  
        
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
    
    public static int hexColor(String c){
        return android.graphics.Color.parseColor(c);
    };
    
    

 
 
    
    
}
