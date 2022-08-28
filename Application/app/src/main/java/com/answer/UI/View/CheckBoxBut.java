package com.answer.UI.View;
import android.content.Context;
import android.widget.*;
import android.graphics.Color;
import android.view.ViewGroup;
import android.view.Gravity;

public class CheckBoxBut{
    
    private static Context context;
   
    public CheckBoxBut(Context ct,LinearLayout v,boolean b,String title,String detailed,ACheckBox.OnCheckedChangeListener on){
        context=ct;
        NewView sbl=new NewView(context, (int)(W()*0.615), (int)(H() * 0.13), "LC", 0, 1, "#FFFFFF", 20, null);
        sbl.setElevation(4);
        NewView sbl2=new NewView(context, (int)(W() * 0.02), (int)(H() * 0.13), "CC", 0, 2, null, null, null);
        NewView sbl2s=new NewView(context, (int)(W() * 0.08), (int)(H() * 0.13), "CC", 0, 2, null, null, null);
        NewText sbt=new NewText(context,ASUI.FontColor("§l"+title),"CC",13,"#383838");
        NewView sbl3=new NewView(context, (int)(W() * 0.08), (int)(H() * 0.13), "CC", 0, 2, null, null, null);
        NewView sbl3s=new NewView(context, (int)(W() * 0.1), (int)(H() * 0.13), "CC", 0, 2, null, null, null);
        NewText sbt2=new NewText(context,ASUI.FontColor("§l"+detailed),"CC",10,"#383838");
        NewView sbl4=new NewView(context, (int)(W() * 0.26), (int)(H() * 0.13), "CC", 0, 2, null, null, null);
        
        ACheckBox sw=new ACheckBox(ct);
		
        sw.setChecked(b);
        sw.setOnCheckedChangeListener(on);
		
        
        NewView sbkg=new NewView(context, (int)(W() * 0.45), (int)(H() * 0.02), "CC", 0, 2,null,null, null);
        
   
        sw.setLayoutParams(new ViewGroup.LayoutParams((int)(W() * 0.04), (int)(W() * 0.04)));
        
		
        
        v.addView(sbl);
        sbl.addView(sbl2);
        sbl.addView(sbl2s);
        sbl2s.addView(sbt);
        sbl.addView(sbl3);
        sbl.addView(sbl3s);
        sbl3s.addView(sbt2);       
        sbl.addView(sbl4);
        sbl.addView(sw);
        v.addView(sbkg);
		
		
		
    }
    private static int W(){
        return (int) (context.getResources().getDisplayMetrics().widthPixels);
    }

    private static int H(){
        return (int) (context.getResources().getDisplayMetrics().heightPixels);
    }
}
