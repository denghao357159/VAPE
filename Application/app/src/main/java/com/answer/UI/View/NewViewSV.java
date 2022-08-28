package com.answer.UI.View;
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
    
    private static final long RESTORE_TIME = 300;//回弹的时间
    public static final int DRAG_RATE=2;//mChildView移动的距离=手指移动的的距离/DRAG_RATE
    private View mChildView;
    private float mDownY;
    private Rect mRect=new Rect();//用于保存子View的位置
    private boolean isRestoring=false;//是否正在回弹
    
    
    public NewViewSV(Context ctx,Object sizeW,Object sizeH,Object cm,Object color,Object cr){
        super(ctx);
        setVerticalScrollBarEnabled(false);
        if(sizeW!=null&&sizeH!=null){
            setLayoutParams(new android.widget.LinearLayout.LayoutParams((int)(sizeW),(int)(sizeH)));
        }
        if(cm==0){
            setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(android.graphics.Color.parseColor((String)color)));
        }else if(cm==1){
            setBackgroundDrawable(ASUI.roundBG(color,cr,null,null));
        }else if(cm==2){
        }
    }
    

}
