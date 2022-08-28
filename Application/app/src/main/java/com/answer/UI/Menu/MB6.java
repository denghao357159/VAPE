package com.answer.UI.Menu;
import android.content.Context;
import com.answer.UI.View.*;
import android.view.View;
import android.widget.Toast;
import com.answer.UI.Load;
import android.view.Gravity;
import android.widget.EditText;
import android.widget.PopupWindow;
import javax.sql.PooledConnection;
import com.answer.UI.Click.aimbot;

public class MB6 {

    public static Context context;

    private static NewView pul;

    

    private static PopupWindow mbcdv;
	
	private static boolean aim=false;

	
	
	
	
    
	

    public static void show(final Context ct){
        context=ct;


        mbcdv = new NewMoveCB().NewMoveCB(ct, "跳", aim, new Object[]{new View.OnClickListener() {
												 @Override
												 public void onClick(View view) {
													 
														
														 
												 }
											 }, 
											 aim=(false)}, 0, 0);
		

    
		
		

       

        
		
    }

    public static void dis(){
        if(mbcdv!=null){
            mbcdv.dismiss();
            mbcdv=null;
        }
    }
    
    public static int W(){
        return (int) (context.getResources().getDisplayMetrics().widthPixels);
    }
    public static int H(){
        return (int) (context.getResources().getDisplayMetrics().heightPixels);
    }


}
