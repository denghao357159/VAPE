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
import com.answer.UI.View.ASUI;
import android.graphics.Bitmap;
import com.answer.UI.View.ASUI2;
import android.widget.TextView;
import android.widget.Button;
import android.widget.TextClock;

public class Background {
    private static NewCDV pop;
	private static NewView line;
    private static Context context;
    private static NewView line2;

	private static NewView ButtomBar;

	private static TextView Buttomt1;

	private static TextView Buttomt2;

	private static TextClock TC;
    public static void show(Context ct){
		context=ct;
		
        ASUI.hint(context,"GUI");
        line=new NewView(context,(int)(W()),(int)(H()),"CC",1,0,"#5FFFFFFF",null,null);
        line2=new NewView(context,(int)(W()),(int)(H()),"CB",1,0,"#5FFFFFFF",null,null);
		ButtomBar=new NewView(context,(int)(W()),(int)(H()*0.15),"BB",1,0,"#8b000000",null,null);
		Buttomt1=ASUI2.NewText(context,"Online","RT",20,null);
		Buttomt1.setX(-40);
        Buttomt2=ASUI2.NewText(context,"Version：2.0.0","RB",15,null);
		Buttomt2.setX(-40);
		TC =new TextClock(context);
		TC.setGravity(Gravity.LEFT|Gravity.BOTTOM);
		TC.setFormat24Hour("EEEE, MMMM dd, yyyy h:mmaa");
		line2.setOnLongClickListener(new View.OnLongClickListener() {

				@Override
				public boolean onLongClick(View view) {
                    dis();
                    Load.World.dis();
					Load.GUIPVP.dis();
					Load.fw.show();
					return false;
				}
			});
        
        line.addView(line2);
		line2.addView(ButtomBar);
		ButtomBar.addView(Buttomt1);
		ButtomBar.addView(Buttomt2);
		ButtomBar.addView(TC);
		pop=new NewCDV(line,(int)(W()),(int)(H()),false,true,true,"CC",null,0,0);
		Load.World.show(ct);
		Load.GUIPVP.show(ct);
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
