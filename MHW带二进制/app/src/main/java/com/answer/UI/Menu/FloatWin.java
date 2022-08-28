package com.answer.UI.Menu;
import android.content.Context;
import android.widget.PopupWindow;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.widget.ImageView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import java.security.acl.Group;
import android.view.Gravity;
import android.graphics.Matrix;
import android.view.View.OnLongClickListener;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.MotionEvent;
import android.widget.Toast;
import android.app.AlertDialog;
import com.answer.UI.View.NewCDV;
import com.answer.UI.View.NewView;
import com.answer.UI.View.ASUI;
import java.io.InputStream;
import android.content.res.AssetManager;
import java.io.IOException;
import com.answer.UI.Load;

public class FloatWin {
	//public Main mdm;
	private float X;
	private float Y;
	private boolean canmovePop = false;
	private LinearLayout line;
    private Context context;
	public PopupWindow pop;

    private NewView line2;

    private NewView line3;
    public FloatWin(Context ct){
		context = ct;
        
		
		line = new NewView(ct,(int)(H()*0.1),(int)(H()*0.1),"CC",1,1,"#FFFFFFFF",360,null);
        
        line2 = new NewView(ct,(int)(H()*0.08),(int)(H()*0.08),"CC",1,1,new String[]{"#FFFF0000","#FFFF0000","RT"},360,null);
        
        line3 = new NewView(ct,(int)(H()*0.04),(int)(H()*0.04),"CC",1,1,"#FFFFFFFF",360,null);
        
        line.addView(line2);
        line2.addView(line3);
        
        
		pop = new NewCDV(line,(int)(H()*0.1),(int)(H()*0.1),false,true,true,"CC",null,0,0);
                
        
		X = 0.0f;
		pop.update(0,0,-1,-1);
		Y = 0.0f;
		line.setOnLongClickListener(new View.OnLongClickListener() {

				@Override
				public boolean onLongClick(View view) {
					canmovePop = true;
					return false;
				}
		});
		line.setOnTouchListener(new View.OnTouchListener(){
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
                        pop.update(Math.round(X),Math.round(Y),-1,-1);
                        lastX = nowX;
                        lastY = nowY;
					}
					return false;
				}
			});
	}
	void Onclick(){
        Load.Main2.show(context);
        dis();
	}
	public void show(){
		pop.showAtLocation(line,Gravity.CENTER,Math.round(X),Math.round(Y));
	}
	public void dis(){
		pop.dismiss();
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
