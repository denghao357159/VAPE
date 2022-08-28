package com.answer.UI.View;
import android.widget.*;
import android.content.Context;
import android.view.View;
import com.answer.UI.Menu.*;

public class NewEditextWindow extends PopupWindow {

    private static NewCDV NewWindowcdv;
    
    private static Context context;

    private NewView nwll;

    private NewView nwll2;

    private NewView nwll3;

    private NewText nwll4;

    private NewView nwll5;

    private ScrollView nwll6;

    private NewView nwll7;

    
    private NewView nwll10;

    private NewView nwll11;
   
    
    public NewEditextWindow(Context ct,View add,Object title,boolean bl){
        context=ct;
        if(NewWindowcdv!=null){NewWindowcdv.dismiss();NewWindowcdv=null;}
        nwll=new NewView(ct,(int)(H()*0.7),(int)(H()*0.7),"CT",1,1,"#f9f9f9",20,null);
        nwll2=new NewView(ct,(int)(W()*0.65),(int)(H()*0.1),"CC",1,1,"#fff5f5f5",new int[]{20,20,0,0},null);
        nwll3=new NewView(ct,(int)(W()*0.63),(int)(H()*0.1),"CC",0,2,null,null,null);
        nwll11=new NewView(ct,(int)(W()*0.1),(int)(H()*0.1),"CC",0,2,null,null,null);
        
        nwll4=new NewText(ct,title,"CC",19,"#000000");
        nwll10=new NewView(ct,(int)(W()*0.63-H()*0.28),(int)(H()*0.1),"LC",0,2,null,null,null);
        
        nwll5=new NewView(ct,(int)(W()*0.63),(int)(H()*0.71),"CT",1,2,null,null,null);
        nwll6=new ScrollView(ct);
        nwll7=new NewView(ct,(int)(-2),(int)(-2),"CT",1,2,null,null,null);
        nwll.addView(nwll2);
        nwll2.addView(nwll3);
        nwll3.addView(nwll11);
        nwll11.addView(nwll4);
        nwll3.addView(nwll10);
        
        nwll.addView(nwll5);
        nwll5.addView(nwll6); 
        nwll6.addView(nwll7);
        nwll7.addView(add);
		if(bl){
			NewWindowcdv=new NewCDV(nwll,(int)(W()*0.65),(int)(H()*0.8),true,true,false,"RC","Tr",(int)(W()*0.05),0);
        }else{
			NewWindowcdv=new NewCDV(nwll,(int)(W()*0.65),(int)(H()*0.8),true,true,false,"LC","Tr",(int)(W()*0.05),0);
        }
        
        
    }
    public static void dis(){
        NewWindowcdv.dismiss();
    }
    public static int W(){
        return (int) (context.getResources().getDisplayMetrics().widthPixels);
    }
    public static int H(){
        return (int) (context.getResources().getDisplayMetrics().heightPixels);
    }
    

    
    
}
