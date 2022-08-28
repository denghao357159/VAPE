package com.answer.UI.Menu;
import android.content.Context;
import com.answer.UI.View.NewView;
import com.answer.UI.View.NewCDV;
import com.answer.UI.View.NewViewSV;
import com.answer.UI.View.roundRect;
import android.graphics.Color;
import com.answer.UI.View.NewText;
import android.graphics.Typeface;
import android.view.View;
import com.answer.UI.View.ASUI;
import android.view.animation.Animation;
import com.answer.UI.Load;
import android.content.res.AssetFileDescriptor;
import java.io.IOException;

public class Main {
    private static Context context;

    private static NewView mainll;

    private static NewCDV maincdv;

    private static NewView mainll2;

    private static NewView mainll3;

    private static NewView mainll5;

    private static NewView mainll4;

    private static NewView mainq;

    private static NewView mainq2;

    private static NewText maintv;

    private static NewView mainll3s;

    private static NewView mainll6;

    private static NewText maintv2;

    private static NewView mainll7;

    private static NewView mainll8;

    private static NewText maintv3;
    
    
    public static void show(Context ct){
        context=ct;
        try {
            AssetFileDescriptor fd = ct.getAssets().openFd("music/media/Windows Background.wav");
            ASUI.playmfunction(fd,false);
        } catch (IOException e) {}
        
        mainll=new NewView(ct,(int)(W()*0.3),(int)(H()),"LC",1,1,"#FFFFFF",0,null);
        mainll2=new NewView(ct,(int)(W()*0.3),(int)(H()),"CC",1,1,"#FFFFFF",0,null);
        
        mainll3s=new NewView(ct,(int)(H()*0.4),(int)(H()*0.35),"CC",0,1,"#FFFFFF",0,null);
        
        mainll3=new NewView(ct,(int)(H()*0.4),(int)(H()*0.35),"RT",0,1,"#FFFFFF",0,null);
        
        mainll3s.setPadding((int)(W()*0.02),0,0,0);
        
        mainq=new NewView(ct,(int)(H()*0.1),(int)(H()*0.1),"CC",1,1,"#FFFFFF",0,null);
        
        mainq2=new NewView(ct,(int)(H()*0.06),(int)(H()*0.06),"CC",1,1,"#f89fff",360,null);
        
        
        mainll4=new NewView(ct, (int)(H() * 0.25), (int)(H() * 0.25), "CC", 0, 2,null,null,null);
        
        mainll4.setBackgroundDrawable(new roundRect(new int[]{Color.parseColor("#faffb0"),Color.parseColor("#b0ffc2"),Color.parseColor("#b6ffbf"),Color.parseColor("#bff8ff"),Color.parseColor("#abcaff"),Color.parseColor("#f89fff"),Color.parseColor("#96b5ff")},360,"RT",null));

        mainll5 = new NewView(ct, (int)(H() * 0.18), (int)(H() * 0.18), "CC", 1, 1, "#FFFFFF", 360,null);
        
        mainll6 = new NewView(ct, (int)(W() * 0.2), (int)(H() * 0.12), "CC", 0, 1, "#FFFFFF", 0,null);
        
        maintv=new NewText(ct,"MHW","CC",(int)(W()*0.02),"#000000");
        maintv.setTypeface(Typeface.createFromAsset(ct.getAssets(),"fonts/font1.ttf"));
        maintv2=new NewText(ct," OS","CC",(int)(W()*0.02),"#000000");
        maintv2.setTypeface(Typeface.createFromAsset(ct.getAssets(),"fonts/font1.ttf"));
        
        mainll7=new NewView(ct, (int)(W() * 0.3), (int)(H() * 0.2), "CC", 1, 1, "#FFFFFF", 0,null);
        
        mainll8=new NewView(ct, (int)(W() * 0.2), (int)(H() * 0.1), "CC", 1, 1, "#2196f3", 360,null);
        
        maintv3=new NewText(ct,"火速使用","CC",(int)(H()*0.02),"#000000");
        maintv3.setTypeface(Typeface.createFromAsset(ct.getAssets(),"fonts/font1.ttf"));
        
        mainll8.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    dis();
                }
            });
        
       mainll.addView(mainll2);
       mainll2.addView(mainll3s);
       mainll3s.addView(mainll3);
       mainll3.addView(mainll4);
       mainll4.addView(mainll5);
       mainll3.addView(mainq);
       mainq.addView(mainq2);
       mainll2.addView(mainll6);
       mainll6.addView(maintv);
       mainll6.addView(maintv2);
       mainll2.addView(mainll7);
       mainll2.addView(mainll8);
       mainll8.addView(maintv3);
        
        ASUI.UILevel(mainll,(int)(-100),0,500,null);
        maincdv=new NewCDV(mainll,(int)(W()*0.3),(int)(H()),false,true,false,"LC",null,0,0);
        
    }
    public static void dis(){
        ASUI.UILevel(mainll, 0, -100, 500, null).setAnimationListener(new Animation.AnimationListener(){

                @Override
                public void onAnimationStart(Animation p1) {
                }

                @Override
                public void onAnimationEnd(Animation p1) {
                    if(maincdv!=null){
                        maincdv.dismiss();
                        maincdv=null;
                    }
                    
                }

                @Override
                public void onAnimationRepeat(Animation p1) {
                }
               });
	}
    public static int W(){
        return (int) (context.getResources().getDisplayMetrics().widthPixels);
    }
    public static int H(){
        return (int) (context.getResources().getDisplayMetrics().heightPixels);
    }
}
