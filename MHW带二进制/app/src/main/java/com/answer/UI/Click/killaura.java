package com.answer.UI.Click;
import com.answer.UI.LoadUI;
import android.view.View;

public class killaura {
static Thread slaughter =new Thread(new Runnable(){
			@Override
			public void run(){
				try {
					while (true) {
						
						LoadUI.killaura(10,1);
						Thread.sleep(100);
					}

				} catch (Exception e) {}
			}});
	
    
    public static void on(View v){
        slaughter.start();
    }
    
    public static void ffo(View v){
        slaughter.interrupt();
    }
    
}
