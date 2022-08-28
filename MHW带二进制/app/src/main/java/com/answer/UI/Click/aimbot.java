package com.answer.UI.Click;
import com.answer.UI.LoadUI;
import android.view.View;

public class aimbot {
static Thread Rider =new Thread(new Runnable(){
			@Override
			public void run(){
				try {
					while (true) {
						
						LoadUI.aimbot(10,1);
						Thread.sleep(100);
					}

				} catch (Exception e) {}
			}});
	
    
    public static void on(View v){
        Rider.start();
    }
    
    public static void ffo(View v){
        Rider.interrupt();
    }
    
}
