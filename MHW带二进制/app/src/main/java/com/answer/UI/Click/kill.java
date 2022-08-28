package com.answer.UI.Click;
import com.answer.UI.LoadUI;
import android.view.View;

public class kill {
static Thread slaughter =new Thread(new Runnable(){
			@Override
			public void run(){
				try {
					while (true) {
						
						LoadUI.killaura(10,2);
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
