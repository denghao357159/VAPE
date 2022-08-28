package com.answer.UI.Click;
import com.answer.UI.LoadUI;
import android.view.View;

public class teleportToNearestEntity {
static Thread slaughter =new Thread(new Runnable(){
			@Override
			public void run(){
				try {
					while (true) {	
						LoadUI.teleportToNearestEntity(10,1);
						Thread.sleep(100);
					}

				} catch (Exception e) {}
			}});
	
    
    public static void on(View v){
        slaughter.start();
    }
    
    public static void off(View v){
        slaughter.interrupt();
    }
    
}
