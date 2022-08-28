package com.answer.UI.View;
import android.content.Context;
import android.widget.*;
import android.view.View;
import android.view.ViewGroup;

public class GUIswitch extends LinearLayout{
    
    
    private static Context context;
    public GUIswitch(Context context,LinearLayout view,int number,String title,String subtitle,final boolean kj,final ASwitch.OnASwitchChangeListener run,final String sn) {
        super(context);
        int W=context.getResources().getDisplayMetrics().widthPixels;
        int H = context.getResources().getDisplayMetrics().heightPixels;
        
        NewView _s3 = new NewView(context, (int)(W * 0.22), (int)(H * 0.14), "CC", 0, 2, null, null, null);
        NewView _s4 = new NewView(context, (int)(W * 0.1), (int)(H * 0.14), "CC", 1, 2, null, null, null);
         NewText _st4=new NewText(context, null, "LC", 15, "#000000");
        _st4.setText(android.text.Html.fromHtml(title ));
        				
        ASwitch AS = new ASwitch(context);
		AS.setLayoutParams(new ViewGroup.LayoutParams((int)(W * 0.1), (int)(H * 0.08)));
		AS.setCheck(kj);
		AS.setOnASwitchChangeListener(run);
		
		
        
        view.addView(_s3);
        _s3.addView(_s4);
		_s3.addView(AS);
        _s4.addView(_st4);
      
        ASUI.UIPlumb(view , 100, 0 ,150,null);
        ASUI.UIFadein(_s3 , 0, 100 ,300);
     
		
    }
    
    
    
}
