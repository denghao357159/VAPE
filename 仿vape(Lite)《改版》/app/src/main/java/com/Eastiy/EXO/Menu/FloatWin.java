package com.Eastiy.EXO.Menu;
import android.content.Context;
import android.graphics.*;
import android.widget.*;
import com.Eastiy.EXO.View.*;
import android.view.View;
import android.text.TextPaint;
import android.view.*;
import com.Eastiy.EXO.Load;
import android.app.*;

public class FloatWin {
	private float X;
	private float Y;
	private boolean canmovePop = false;
	private LinearLayout line;
    private Context context;
	public PopupWindow fwcdv;

    private NewView fwl;

    private NewText fwlt;
	public FloatWin(Context ct){
		context = ct;

        fwl = new NewView(ct,(int)(H()*0.1),(int)(H()*0.1),"CC",1,1,"#FFC0CB",360,null);

	    fwlt=new NewText(ct, "", "CC", 25, "#FFC0CB");
        int mViewWidth = fwlt.getMeasuredWidth();
        TextPaint mPaint = fwlt.getPaint();
        LinearGradient mLinearGradient = new LinearGradient(0,0, mViewWidth, 0,new int[] {  Color.parseColor("#ffffff"), Color.parseColor("#FFC0CB")},null, Shader.TileMode.CLAMP);
        mPaint.setShader(mLinearGradient);


        fwl.addView(fwlt);

		fwcdv = new NewCDV(fwl,(int)(H()*0.1),(int)(H()*0.1),false,true,true,"LT",null,(int)(W()*0.02),(int)(H()*0.02));

        fwl.setOnLongClickListener(new View.OnLongClickListener() {

                @Override
                public boolean onLongClick(View view) {
                    canmovePop = true;
                    return false;
                }
            });
        fwl.setOnTouchListener(new View.OnTouchListener(){
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
                        //松开  
                        if (!canmovePop){
                            Onclick();

                        }
                        canmovePop = false;
                    } else if (action == MotionEvent.ACTION_MOVE && canmovePop) {
                        //移动
                        nowX = event.getRawX();
                        nowY = event.getRawY();
                        // 计算XY坐标偏移量
                        tranX = nowX - lastX;
                        tranY = nowY - lastY;
                        X += tranX;
                        Y += tranY;
                        fwcdv.update(Math.round(X),Math.round(Y),-1,-1);
                        lastX = nowX;
                        lastY = nowY;
                    }
                    return false;
                }
            });
    }
    void Onclick(){
Load.GUIMain.show(context);
        dis();
	}
	public void show(){
		fwcdv.showAtLocation(fwl,Gravity.CENTER,Math.round(X),Math.round(Y));
	}
	public void dis(){
		fwcdv.dismiss();
	}
	void show(String str){
		Toast.makeText(context,str,Toast.LENGTH_LONG).show();
	}
    private int W(){
        return (int) (context.getResources().getDisplayMetrics().widthPixels);
    }
    private int H(){
        return (int) (context.getResources().getDisplayMetrics().heightPixels);
    }
}

