package com.Eastiy.EXO.Button;
import android.content.Context;
import com.Eastiy.EXO.View.*;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.Toast;
import com.Eastiy.EXO.Load;
import com.Eastiy.EXO.*;

public class k {
    
    public static Context context;

    public static PopupWindow kcdv;
    
    public static boolean kB=false;
    
    public static void show(Context ct){
        context=ct;
        
        kcdv=new NewMoveCB().NewMoveCB(ct,"杀",kB,new Object[]{new View.OnClickListener() {

                                    @Override
                                    public void onClick(View view) {
                                        if(kB==false){
                                            kB=true;
                                              
                                            ASUI.hint(context, "已开启杀戮");
                                        }else{
                                            kB=false;
                                           
                                            ASUI.hint(context, "已关闭杀戮");
                                        }
                                    }
                                },false},0,0/*(int)(W()*0.2),(int)(W()*0.4)*/);
    }
    public static void dis(){
        kcdv.dismiss();
    }
    private static int W(){
        return (int) (context.getResources().getDisplayMetrics().widthPixels);
    }
    private static int H(){
        return (int) (context.getResources().getDisplayMetrics().heightPixels);
    }
}
