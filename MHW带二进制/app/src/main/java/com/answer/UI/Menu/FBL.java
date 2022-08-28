package com.answer.UI.Menu;
import android.content.Context;
import com.answer.UI.View.*;
import android.view.View;
import com.answer.UI.Load;

public class FBL {

    private static Context context;

    private static NewView fb1;

    private static NewView fb2;

    private static NewView fb3;

    private static NewText fbt1;

    private static NewView fb4;

    private static NewText fbt2;

    private static NewCDV fbcV;
    
    public static void show(Context ct){
        context=ct;
        if(fbcV!=null){
            fbcV.dismiss();
            fbcV=null;
        }
         fb1=new NewView(ct,(int)(H()*0.35),(int)(H()*0.26),"CC",1,1,"#FFFFFF",10,null);
         fb2=new NewView(ct,(int)(H()*0.35),(int)(H()*0.13),"CC",1,1,"#FFFFFF",10,null);
         fb3=new NewView(ct,(int)(H()*0.35),(int)(H()*0.13),"CC",1,1,"#FFFFFF",10,null);
         fbt1=new NewText(ct,"验证中","CC",16,"#000000");
         
        fb4=new NewView(ct,(int)(H()*0.27),(int)(H()*0.06),"CC",1,1,"#E0E0E0",10,null);
        fbt2=new NewText(ct,"完成加载UI","CC",16,"#000000");
        
        fb4.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    fbcV.dismiss();
                    if(W()<H()){
                        Load.FBL.show(context);
                    }else{
                    agreement.show(context);
                   }
                }
            });
        
        fb1.addView(fb2);
        fb2.addView(fbt1);
        fb1.addView(fb3);
        fb3.addView(fb4);
        fb4.addView(fbt2);
        fbcV=new NewCDV(fb1,(int)(H()*0.3),(int)(H()*0.2),false,true,false,"CC",null,0,0);
        
    }
    public static void dis(){
        if(fbcV!=null){
            fbcV.dismiss();
            fbcV=null;
        }
    }
    private static int W(){
        return (int) (context.getResources().getDisplayMetrics().widthPixels);
    }
    private static int H(){
        return (int) (context.getResources().getDisplayMetrics().heightPixels);
    }
}
