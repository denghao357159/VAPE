package com.Eastiy.EXO.Button;
import android.content.Context;
import com.Eastiy.EXO.View.*;
    import android.view.View;
    import android.widget.PopupWindow;
    import android.widget.Toast;
import com.Eastiy.EXO.Load;
import com.Eastiy.EXO.*;

public class p {
    
    public static Context context;

    public static PopupWindow pcdv;
    
    public static boolean pb=false;
    
    public static void show(Context ct){
        context=ct;
        
        pcdv=new NewMoveCB().NewMoveCB(ct,"跳",pb,new Object[]{new View.OnClickListener() {

                                    @Override
                                    public void onClick(View view) {
                                    
                                    }
                                },false},0,0/*(int)(W()*0.2),(int)(W()*0.4)*/);
    }
    public static void dis(){
        pcdv.dismiss();
    }
    private static int W(){
        return (int) (context.getResources().getDisplayMetrics().widthPixels);
    }
    private static int H(){
        return (int) (context.getResources().getDisplayMetrics().heightPixels);
    }
}
