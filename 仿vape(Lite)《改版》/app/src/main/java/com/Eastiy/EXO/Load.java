package com.Eastiy.EXO;
import android.app.Activity;
import android.graphics.Color;
import android.os.Handler;
import android.view.Gravity;
import com.Eastiy.EXO.Menu.FloatWin;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.TextView;
import android.os.Message;
import android.content.Context;
import android.widget.Toast;
import com.Eastiy.EXO.Menu.*;
import com.Eastiy.EXO.View.*;
import android.security.KeyStoreParameter;
import android.view.View;
import android.view.Menu;
import android.util.*;
import java.io.*;
import com.Eastiy.EXO.Button.k;
import com.Eastiy.EXO.Button.p;
import com.Eastiy.EXO.Button.c;


public class Load {
	public static Activity activity;
	public Toast toast;
	public static FloatWin fw;
    public static Signin Signin;
    public static Load Load;
    public static GUIMain GUIMain;
	public static k k;
    public static p p;
	public static c c;
    
	
	    public Load(Activity at){
		this.activity = at;
		                
            new Handler().postDelayed(new Runnable(){

            @Override
            public void run() {
                
            
                    
                    
                    try {
					
					((Activity)activity).runOnUiThread(new Runnable() {

							private dialogbox dialogbox;

							@Override
							public void run() {


								Load.fw = new FloatWin(activity);
								

							}});
					
                    } catch (Throwable e) {
					
                       Log.e("错误","2333",e);
					   
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

	
