package com.answer.UI.Menu;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.answer.UI.View.NewCDV;
import com.answer.UI.View.NewView;
import android.view.View;
import com.answer.UI.Load;

public class Background {
    private static NewCDV pop;
	private static NewView line;
    private static Context context;
    private static NewView line2;
    public static void show(Context ct){
		context=ct;
        line=new NewView(context,(int)(W()),(int)(H()),"CC",1,0,"#00000000",null,null);
        
        line2=new NewView(context,(int)(W()),(int)(H()),"CC",1,0,"#00000000",null,null);
        line2.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    dis();
                    Load.main.dis();

                }
            });
        
        line.addView(line2);
		pop=new NewCDV(line,(int)(W()),(int)(H()),false,true,true,"CC",null,0,0);
		
	}
    public static void dis(){
		pop.dismiss();
	}
    private static int W(){
        return (int) (context.getResources().getDisplayMetrics().widthPixels);
    }
    private static int H(){
        return (int) (context.getResources().getDisplayMetrics().heightPixels);
    }
}
