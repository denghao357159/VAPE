package com.answer.UI.View;
import android.widget.*;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.content.res.Resources;
import android.graphics.*;
import android.view.*;


public class NewView extends LinearLayout{
    
    public NewView(final Context ctx,Object sizeW,Object sizeH,String gravity,Object ori,int cm,Object color,Object cr,final View.OnClickListener set) {
        
        super(ctx);
        if(sizeW!=null&&sizeH!=null){
         
            setLayoutParams(new android.widget.LinearLayout.LayoutParams((int)(sizeW),(int)(sizeH)));
        }
        
        if(gravity=="LT"){
            setGravity(android.view.Gravity.LEFT|android.view.Gravity.TOP);
			
		}else if(gravity=="T"){
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
            setGravity(android.view.Gravity.RIGHT|android.view.Gravity.BOTTOM);
		}else if(gravity=="BB"){
            setGravity(android.view.Gravity.BOTTOM|android.view.Gravity.CENTER);
        }
        if(!(ori==null)){
            setOrientation(ori);
        }
        if(cm==0){
            setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(android.graphics.Color.parseColor((String)color)));
        }else if(cm==1){
            setBackgroundDrawable(ASUI.roundBG(color,cr,null,null));
        }else if(cm==2){
        }
        if(set!=null){
            setOnClickListener(new View.OnClickListener() {
                
                    @Override
                    public void onClick(View view) {
                        set.onClick(view);
                        
                        }
                    
                    
                });
        }
    }
    
    public NewView(Context context, AttributeSet attrs) {  

        super(context, attrs);
        

    }
    
    @Override
    protected void onDraw(Canvas canvas) {
        
        super.onDraw(canvas);
    
    }
    
    
}
