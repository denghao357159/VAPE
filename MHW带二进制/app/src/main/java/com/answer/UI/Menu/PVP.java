package com.answer.UI.Menu;
import android.content.Context;
import com.answer.UI.View.*;
import android.view.View;
import android.widget.Toast;
import com.answer.UI.Load;
import android.view.Gravity;

public class PVP {
    
    public static Context context;

    private static NewView pul;

    private static NewView but;

    private static NewWindow PVPcdv;

    private static boolean aim=false;

    private static boolean aim1=false;
    
    public static void show(Context ct,boolean bl){
        context=ct;
        
        pul=new NewView(ct,null,null,"CT",1,2,null,null,null);
        but=new NewView(ct,-2,-2,"LC",1,2,null,null,null);
        
        new Tostbut(ct,but,1,"测试","</b><b>测试2",aim,new View.OnClickListener(){@Override public void onClick(View view){if(aim==false){Toast.makeText(context,"eeee", Toast.LENGTH_SHORT).show();aim=true;}else if(aim==true){Toast.makeText(context,"aaaaa", Toast.LENGTH_SHORT).show();aim=false;}}},null);       
        new Tostbut(ct,but,1,"测试","</b><b>测试2",aim1,new View.OnClickListener(){@Override public void onClick(View view) {if(aim1==false){Toast.makeText(context,"eeee1", Toast.LENGTH_SHORT).show();aim1=true;}else{Toast.makeText(context,"aaa1aa", Toast.LENGTH_SHORT).show();aim1=false;}}},null);
        
        
        pul.addView(but);
        
       PVPcdv=new NewWindow(ct,pul,"MHW",bl);
    }
    
    public static void dis(){
        if(PVPcdv!=null){
         PVPcdv.dis();
         PVPcdv=null;
        }
    }
    public void show(){
       // aim=
        PVPcdv.showAtLocation(pul,Gravity.CENTER,(int)(W()*0.05),0);
	}
    public static int W(){
        return (int) (context.getResources().getDisplayMetrics().widthPixels);
    }
    public static int H(){
        return (int) (context.getResources().getDisplayMetrics().heightPixels);
    }
    
    
}
