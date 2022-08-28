package com.Eastiy.EXO.View;
import android.widget.*;
import android.view.*;
import android.content.Context;

public class NewCDV extends PopupWindow {
    
    public NewCDV(View view,Object sizeW,Object sizeH,boolean fa,boolean ta,boolean ca,String gravity,Object Astyle,int pyx,int pyy){
        
        
        
        if(Astyle==null || Astyle=="Di"){
            setAnimationStyle(android.R.style.Animation_Dialog);
        }else if(Astyle=="In"){
            setAnimationStyle(android.R.style.Animation_InputMethod);
        }else if(Astyle=="To"){
            setAnimationStyle(android.R.style.Animation_Toast);
        }else if(Astyle=="Tr"){
            setAnimationStyle(android.R.style.Animation_Translucent);
        }else if(Astyle=="Ac"){
            setAnimationStyle(android.R.style.Animation_Activity);
        }
        
        
            setContentView(view);
            if(sizeW!=null){setWidth((Integer) sizeW);}
            if(sizeH!=null){setHeight((Integer) sizeH);}
            
        
    setFocusable(fa);//可返回关闭
    setTouchable(ta);//可触摸的
    setClippingEnabled(ca);//允许弹出窗口超出屏幕范围
        if(gravity=="LT"){
            showAtLocation(view,android.view.Gravity.LEFT|android.view.Gravity.TOP,pyx,pyy);
        }else if(gravity=="LC"){
            showAtLocation(view,android.view.Gravity.LEFT|android.view.Gravity.CENTER,pyx,pyy);
        }else if(gravity=="LB"){
            showAtLocation(view,android.view.Gravity.LEFT|android.view.Gravity.BOTTOM,pyx,pyy);
        }else if(gravity=="CT"){
            showAtLocation(view,android.view.Gravity.CENTER|android.view.Gravity.TOP,pyx,pyy);
        }else if(gravity=="CC"){
            showAtLocation(view,android.view.Gravity.CENTER|android.view.Gravity.CENTER,pyx,pyy);
        }else if(gravity=="CB"){
            showAtLocation(view,android.view.Gravity.CENTER|android.view.Gravity.BOTTOM,pyx,pyy);
        }else if(gravity=="RT"){
            showAtLocation(view,android.view.Gravity.RIGHT|android.view.Gravity.TOP,pyx,pyy);
        }else if(gravity=="RC"){
            showAtLocation(view,android.view.Gravity.RIGHT|android.view.Gravity.CENTER,pyx,pyy);
        }else if(gravity=="RB"){
            showAtLocation(view,android.view.Gravity.RIGHT|android.view.Gravity.BOTTOM,pyx,pyy);
        }
    }
    
}
