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
import com.answer.UI.View.PromptBox;
import android.view.View;
import com.answer.UI.Login.Demo;




public class Load {
	
	private static Activity activity;
	public Toast toast;
	public static FloatWin fw;
    public static Background bg;
	public static Load Load;
	public static Main2 Main2;
    public static boolean Isthemenuopen;
    public static PVP PVP;
    public static Other Other;
    public static Movement Player;
    public static UI UI;
	public static MB MB;
	public static MB2 MB2;
	public static MB3 MB3;
	public static MB4 MB4;
	public static MB5 MB5;
	public static MB6 MB6;
	public static World World;
	public static Sidebar Sidebar;
	public static GUIPVP GUIPVP;
	public static Demo Demo;

	
    public Load(Activity at){
		this.activity = at;
         
            new Handler().postDelayed(new Runnable(){

            @Override
            public void run() {
	
                fw = new FloatWin(activity);
                fw.show();		
				
		
					
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
