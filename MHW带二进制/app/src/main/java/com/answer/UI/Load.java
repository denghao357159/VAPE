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




public class Load {
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
	
		
    public Load(Activity at){
		this.activity = at;
		
            new Handler().postDelayed(new Runnable(){

            @Override
            public void run() {
                fw = new FloatWin(activity);
                if(W()<H()){
                FBL.show(activity);
                }else{
                agreement.show(activity);
				}
            }
        }, 1000);
}		
	


 public static void Load(Activity activity) {
		Load = new Load(activity);
		
    }
    private static int W(){
        return (int) (activity.getResources().getDisplayMetrics().widthPixels);
    }
    private static int H(){
        return (int) (activity.getResources().getDisplayMetrics().heightPixels);
    }
}
