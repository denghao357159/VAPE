package com.answer.UI.View;
import android.widget.*;
import android.content.Context;

public class NewViewHS extends HorizontalScrollView {

        public NewViewHS(Context ctx,Object sizeW,Object sizeH,Object cm,Object color,Object cr){
            super(ctx);
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
