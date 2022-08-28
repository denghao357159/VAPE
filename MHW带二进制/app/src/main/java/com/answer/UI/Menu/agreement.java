package com.answer.UI.Menu;
import android.content.Context;
import com.answer.UI.View.*;
import android.view.animation.*;
import android.text.Html;
import android.view.View;
import android.app.Activity;
import com.answer.UI.Load;

public class agreement {
    
    private static Context context;

    private static NewCDV agreementcdv;

    private static NewView agreementll;

    private static NewView agreementll2;

    private static NewText agreementtv;

    private static NewViewSV agreementll3;

    private static NewView agreementll4;

    private static NewText agreementtv2;

    private static NewView agreementll5;

    private static NewView agreementll6;

    private static NewText agreementtv3;

    private static NewView agreementllk;

    private static NewView agreementll7;

    private static NewText agreementtv4;

    private static NewView agreementllk2;
    
    public static void show(Context ct){
        context=ct;
        
        String[] xy=new String[]{
        "BY 疯婆婆",
			"此版本为FPPBox7.0版本",
        };

        String syxy="";
        for(int a=0;a<xy.length;a++){
            syxy=syxy+xy[a]+"<br/>";
        };
        
        
        agreementll=new NewView(ct,(int)(W()*0.3),(int)(H()),"CC",1,1,"#FFFFFF",0,null);
        
        agreementll2=new NewView(ct,(int)(W()*0.3),(int)(H()*0.12),"CC",1,1,"#FFFFFF",0,null);
        
        agreementtv=new NewText(ct,ASUI.FontColor("§l公告"),"CC",(int)(H()*0.025),"#000000");
        
        
        agreementll3=new NewViewSV(ct,(int)(W()*0.3),(int)(H()*0.68),"CC","#FFFFFF",0);
        
        agreementll4=new NewView(ct,(int)(W()*0.3),(int)(H()*0.68),"CC",1,1,"#FFFFFF",0,null);

        agreementtv2=new NewText(ct,null,"LT",(int)(W()*0.008),"#000000");
        agreementtv2.setText(Html.fromHtml(syxy));
        
        agreementllk=new NewView(ct,(int)(W()*0.3),(int)(H()*0.06),"CC",1,1,"#FFFFFF",0,null);
        
        
        agreementll5=new NewView(ct,(int)(W()*0.3),(int)(H()*0.13),"CC",0,1,"#FFFFFF",0,null);

        agreementll6=new NewView(ct,(int)(W()*0.1),(int)(H()*0.12),"CC",1,1,"#ffff2626",10,null);
        
        agreementtv3=new NewText(ct,"退出","CC",(int)(H()*0.02),"#000000");
        
        agreementll6.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    dis();
                    Activity ac=(Activity)(context);
                    ac.finish();
                }
            });
        
        agreementllk2=new NewView(ct,(int)(W()*0.05),(int)(H()*0.12),"CC",1,1,"#FFFFFF",10,null);
        
        
        agreementll7=new NewView(ct,(int)(W()*0.1),(int)(H()*0.12),"CC",1,1,"#ff00ffc6",10,null);

        agreementtv4=new NewText(ct,"同意","CC",(int)(H()*0.02),"#000000");
        
        agreementll7.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Load.main.show(context);
                    dis();
                }
            });
        
        
        
        agreementll.addView(agreementll2);
        agreementll2.addView(agreementtv);
        agreementll.addView(agreementll3);
        agreementll3.addView(agreementll4);
        agreementll4.addView(agreementtv2);
        agreementll.addView(agreementllk);
        agreementll.addView(agreementll5);
        agreementll5.addView(agreementll6);
        agreementll6.addView(agreementtv3);
        agreementll5.addView(agreementllk2);
        agreementll5.addView(agreementll7);
        agreementll7.addView(agreementtv4);
        

        

    
        ASUI.UILevel(agreementll,100,0,500,null);
        agreementcdv=new NewCDV(agreementll,(int)(W()*0.3),(int)(H()),false,true,false,"RC",null,0,0);
        
    }
    public static void dis(){
        ASUI.UILevel(agreementll, 0, 100, 500, null).setAnimationListener(new Animation.AnimationListener(){

                @Override
                public void onAnimationStart(Animation p1) {
                }

                @Override
                public void onAnimationEnd(Animation p1) {
                    if(agreementcdv!=null){
                        agreementcdv.dismiss();
                        agreementcdv=null;
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
