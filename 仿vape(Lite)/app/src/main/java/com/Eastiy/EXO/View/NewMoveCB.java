package com.Eastiy.EXO.View;
import android.widget.*;
import android.content.Context;
import android.view.View;
import android.view.MotionEvent;
import android.view.View.OnClickListener;


public class NewMoveCB{
    
    public static Context context;
    
    public static boolean QH=false;
    
    int X;
    
    int Y;
    
    private static boolean canmovew = false;
    
    public PopupWindow NewMoveCB(Context ct,Object text,final boolean mod,final Object[] runs,int MoveX,int MoveY){
        context=ct;
        
        X=MoveX;
        Y=MoveY;
        NewView _nmcbll=new NewView(ct,(int)(H()*0.1),(int)(H()*0.1),"CC",1,2,null,null,null);
        
        final NewView _nmcbll2=new NewView(ct,(int)(H()*0.1),(int)(H()*0.1),"CC",1,1,"#ffffff",15,null);
        if((boolean)runs[1]==true){
        QH=true;
        _nmcbll2.setBackgroundDrawable(ASUI.roundBG(new String[]{"#DAFFCE","#BBFFEA","LR"},15,null,null));
        }else{
        QH=false;
        _nmcbll2.setBackgroundDrawable(ASUI.roundBG("#ffffff",15,null,null));
        }
    
    
        
	
    
        NewText _nmcbT1=new NewText(ct, text, "CC", 15, "#000000");


        _nmcbll.addView(_nmcbll2);
        _nmcbll2.addView(_nmcbT1);
        
        
        
        final NewCDV NewMoveCBcdv=new NewCDV(_nmcbll,(int)(H()*0.1),(int)(H()*0.1),false,true,true,"CC",null,X,Y);
        _nmcbll2.setOnLongClickListener(new View.OnLongClickListener() {

                @Override
                public boolean onLongClick(View view) {
                    canmovew = true;
                    return false;
                }
            });
        _nmcbll2.setOnTouchListener(new View.OnTouchListener(){
                private float lastX; //上一次位置的X.Y坐标
                private float lastY;
                private float nowX;  //当前移动位置的X.Y坐标
                private float nowY;
                private float tranX; //悬浮窗移动位置的相对值
                private float tranY;

                @Override
                public boolean onTouch(View view, MotionEvent event) {
                    int action = event.getAction();

                    if (action == MotionEvent.ACTION_DOWN) {
                        //点击
                        lastX = event.getRawX();
                        lastY = event.getRawY();
                    } else if (action == MotionEvent.ACTION_UP) {
                        if (!canmovew){
                            ((View.OnClickListener)(runs[0])).onClick(view);
                            if((boolean)(runs[1])==true){
                                if(QH==false){
                                    QH=true;
                                    _nmcbll2.setBackgroundDrawable(ASUI.roundBG(new String[]{"#DAFFCE","#BBFFEA","LR"},15,null,null));
                                }else{
                                    QH=false;
                                    _nmcbll2.setBackgroundDrawable(ASUI.roundBG("#ffffff",15,null,null));
                            }
                           }
                        }
						canmovew = false;
                    } else if (action == MotionEvent.ACTION_MOVE) {
                        //移动
                        nowX = event.getRawX();
                        nowY = event.getRawY();
                        // 计算XY坐标偏移量
                        tranX = Math.round(nowX - lastX);
                        tranY = Math.round(nowY - lastY);
                        X += tranX;
                        Y += tranY;
                        NewMoveCBcdv.update(Math.round(X),Math.round(Y),-1,-1);
                        lastX = nowX;
                        lastY = nowY;
                    }
                    return false;
                }
            });
        ASUI.UIFadein(_nmcbll , 0 , 100, 500);
        
        return NewMoveCBcdv;
    }
    
    
    public static int W(){
        return (int) (context.getResources().getDisplayMetrics().widthPixels);
    }
    public static int H(){
        return (int) (context.getResources().getDisplayMetrics().heightPixels);
    }
    
}
