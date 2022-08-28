package com.answer.UI.Menu;
import android.content.Context;
import com.answer.UI.View.*;
import android.view.View;
import android.widget.Toast;
import com.answer.UI.Load;
import android.view.Gravity;

public class Other {

    public static Context context;

    private static NewView pul;

    private static NewView but;

    private static NewWindow Othercdv;

    private static boolean aim=false;

    private static boolean aim1=false;

    public static void show(Context ct,boolean bl){
        context=ct;

        pul=new NewView(ct,null,null,"CT",1,2,null,null,null);
        but=new NewView(ct,-2,-2,"LC",1,2,null,null,null);
        new Tostbut(ct,but,1,"测试","</b><b>测试2",aim,new View.OnClickListener(){
            @Override public void onClick(View view){
                if(aim==false){
                    ASUI.hint(context, "test");
                    Toast.makeText(context,"开启状态", Toast.LENGTH_SHORT).show();
					Miscellaneous.RunShell("data/data/com.nidong.cmswat.m4399/lib/libxun1.so");

                    aim=true;
                 }
                 else if(aim==true){
                     ASUI.hint(context,"test");
                     Toast.makeText(context,"关闭状态", Toast.LENGTH_SHORT).show();
					 Miscellaneous.RunShell("data/data/com.nidong.cmswat.m4399/lib/libxun1.so");
                      aim=false;}
					  }
					  },null);              
        new Tostbut(ct,but,1,"测试","</b><b>测试2",aim1,new View.OnClickListener(){
			@Override public void onClick(View view) {
				if(aim1==false){
					Toast.makeText(context,"开启", Toast.LENGTH_SHORT).show();
					Miscellaneous.RunShell("data/data/com.nidong.cmswat.m4399/lib/libxun1.so");
					aim1=true;
					}
			    else if(aim1==true){
					Toast.makeText(context,"关闭", Toast.LENGTH_SHORT).show();
					Miscellaneous.RunShell("data/data/com.nidong.cmswat.m4399/lib/libxun1.so");
					aim1=false;}}},null);
        


        pul.addView(but);

        Othercdv=new NewWindow(ct,pul,"FPP",bl);
    }

    public static void dis(){
        if(Othercdv!=null){
            Othercdv.dis();
            Othercdv=null;
        }
    }
    public void show(){
        // aim=
        Othercdv.showAtLocation(pul,Gravity.CENTER,(int)(W()*0.05),0);
    }
    public static int W(){
        return (int) (context.getResources().getDisplayMetrics().widthPixels);
    }
    public static int H(){
        return (int) (context.getResources().getDisplayMetrics().heightPixels);
    }


}
