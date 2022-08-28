package com.answer.UI;
import android.app.Activity;
import android.graphics.Color;
import android.os.Handler;
import android.view.Gravity;
import com.answer.UI.Menu.FloatWin;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.TextView;
import android.os.Message;
import android.content.Context;
import android.widget.Toast;
import com.answer.UI.Menu.*;





public class LoadUI {
	private static Activity activity;
	public Toast toast;
	public static FloatWin fw;
    public static Background bg;
    public static Main main;
	public static Load Load;
    public static agreement agreement;
    public static FBL FBL;
	public static Main2 Main2;
    public static boolean Isthemenuopen;
    public static PVP PVP;
    public static Other Other;
    public static Player Player;
    public static UI UI;

    private static LoadUI LoadUI;
	
	static {
		System.loadLibrary("NativeFus");
	}
	
		
    public LoadUI(Activity at){
		this.activity = at;
		
            new Handler().postDelayed(new Runnable(){

            @Override
            public void run() {
                fw = new FloatWin(activity);
				
            }
        }, 1000);
}		
	

	//API
    public static native void noclip()//穿墙
	
	public static native void jump(float a,int b)//踏空
	
	public static native void aimbot(float a,int b)//自瞄
	
	public static native void killaura(float a,int b)//杀戮
	
	public static native void teleportToNearestEntity(float a,int b)//锁背

    public static native void teleport(float a,int b)//锁背



 public static void LoadUI(Activity activity) {
		LoadUI = new LoadUI(activity);
		
    }
}
