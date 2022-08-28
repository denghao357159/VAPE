package com.answer.UI.View;
import android.content.Context;
import android.widget.*;
import android.graphics.Color;
import android.view.ViewGroup;
import android.view.Gravity;

public class SwitchBut{
    
    private static Context context;
   
    public SwitchBut(Context ct,LinearLayout v,boolean b,String title,String detailed,ASwitch.OnASwitchChangeListener on){
        context=ct;
        NewView sbl=new NewView(context, (int)(W()*0.615), (int)(H() * 0.14), "CC", 0, 1, "#FFFFFF", 20, null);
        sbl.setElevation(2);
        NewView sbl2=new NewView(context, (int)(W() * 0.02), (int)(H() * 0.14), "CC", 0, 2, null, null, null);
        NewView sbl2s=new NewView(context, (int)(W() * 0.08), (int)(H() * 0.14), "CC", 0, 2, null, null, null);
        NewText sbt=new NewText(context,ASUI.FontColor("§l"+title),"CC",13,"#383838");
        NewView sbl3=new NewView(context, (int)(W() * 0.08), (int)(H() * 0.14), "CC", 0, 2, null, null, null);
        NewView sbl3s=new NewView(context, (int)(W() * 0.1), (int)(H() * 0.14), "CC", 0, 2, null, null, null);
        NewText sbt2=new NewText(context,ASUI.FontColor("§l"+detailed),"CC",10,"#383838");
        NewView sbl4=new NewView(context, (int)(W() * 0.24), (int)(H() * 0.14), "CC", 0, 2, null, null, null);
		NewView sbl51=new NewView(context, (int)(W() * 0.01), (int)(H() * 0.045), "CC", 0, 2, null, null, null);
		
        NewView sbl5=new NewView(context, (int)(W() * 0.08), (int)(H() * 0.14), "CC", 1, 2, null,null, null);
        ASwitch sw=new ASwitch(ct);
        sw.setCheck(b);
        sw.setOnASwitchChangeListener(on);
		sw.setLayoutParams(new ViewGroup.LayoutParams((int)(W()* 0.08), (int)(H() * 0.08)));
	
		sbl5.setElevation(3);
		sbl5.setGravity(Gravity.CENTER|Gravity.CENTER);
        NewView sbkg=new NewView(context, (int)(W() * 0.45), (int)(H() * 0.02), "CC", 0, 2,null,null, null);
        
        
        
        v.addView(sbl);
        sbl.addView(sbl2);
        sbl.addView(sbl2s);
        sbl2s.addView(sbt);
        sbl.addView(sbl3);
        sbl.addView(sbl3s);
        sbl3s.addView(sbt2);
        sbl.addView(sbl4);
		sbl.addView(sbl5);
        sbl5.addView(sbl51);
        sbl5.addView(sw);
        v.addView(sbkg);
    }
    private static int W(){
        return (int) (context.getResources().getDisplayMetrics().widthPixels);
    }

    private static int H(){
        return (int) (context.getResources().getDisplayMetrics().heightPixels);
    }
}
