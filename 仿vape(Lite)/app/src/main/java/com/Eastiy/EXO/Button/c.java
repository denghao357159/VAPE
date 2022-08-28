package com.Eastiy.EXO.Button;
import android.content.Context;
import com.Eastiy.EXO.View.*;
    import android.view.View;
    import android.widget.PopupWindow;
    import android.widget.Toast;
import com.Eastiy.EXO.Load;
import com.Eastiy.EXO.*;
public class c {
    
    public static Context context;

    public static PopupWindow ccdv;
    
    public static boolean cb=false;
    
    public static void show(Context ct){
        context=ct;
        
        ccdv=new NewMoveCB().NewMoveCB(ct,"穿",cb,new Object[]{new View.OnClickListener() {

                                    @Override
                                    public void onClick(View view) {
                                        if(cb==false){
                                            cb=true;
                                            
                                            ASUI.hint(context, "已开启穿墙");
                                        }else{
                                            cb=false;
                                            
                                            ASUI.hint(context, "已关闭穿墙");
                                        }
                                    }
                                },false},0,0/*(int)(W()*0.2),(int)(W()*0.4)*/);
    }
    public static void dis(){
        ccdv.dismiss();
    }
    private static int W(){
        return (int) (context.getResources().getDisplayMetrics().widthPixels);
    }
    private static int H(){
        return (int) (context.getResources().getDisplayMetrics().heightPixels);
    }
}
