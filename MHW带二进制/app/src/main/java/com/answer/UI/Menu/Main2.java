package com.answer.UI.Menu;
import android.content.Context;
import android.view.animation.*;
import com.answer.UI.View.*;
import android.widget.*;
import android.graphics.BitmapFactory;
import java.io.IOException;
import android.view.View;
import com.answer.UI.Load;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Message;
import android.os.Handler;
import java.net.URL;
import java.net.HttpURLConnection;
import java.io.InputStream;
import java.io.ByteArrayOutputStream;
import android.support.v7.widget.CardView;
import android.app.Activity;

public class Main2 {

    private static Context context;

    private static boolean inleft=false;

    private static NewCDV main2cdv;

    private static NewView main2ll;

    private static ImageView iv;

    private static NewView main2ll2;

    private static Bitmap bitmap;

    private static NewView main2ll3a;

    private static NewView main2ll3b;

    private static NewView main2ll4a;

    private static NewView main2ll4b;

    private static NewView main2ll5a;

    private static NewView main2ll5b;

    private static NewText main2ll3c;

    private static NewView main2ll6a;

    private static NewView main2ll6b;

    private static NewText main2ll4c;

    private static NewText main2ll5c;

    private static NewText main2ll6c;

    private static NewView main2ll7;

    private static NewText main2ll7a;

    private static NewText main2ll7b;

    private static NewText main2ll7c;

    private static NewView main2ll7d;
    
    public static final int GET_DATA_SUCCESS = 1;
    public static final int NETWORK_ERROR = 2;
    public static final int SERVER_ERROR = 3;
    
    
    private static Handler handle = new Handler() {public void handleMessage(Message msg) {switch (msg.what) {case 0:Bitmap bmp=(Bitmap)msg.obj;iv.setImageBitmap(bmp);break;}};};

    
    
    
    
    public static void show(Context ct){
        context=ct;
        main2ll=new NewView(ct,(int)(W()*0.25),(int)(H()),"CC",1,1,"#FFFFFF",0,null);
        
        main2ll2=new NewView(ct,(int)(H()*0.22),(int)(H()*0.22),"CC",1,1,"#e9e9e9",360,null);
        
        CardView cardview=new CardView(ct);
        cardview.setRadius(360);
        iv=new ImageView(ct);
        
        new Thread(new Runnable() {@Override public void run() {Bitmap bmp = getURLimage("https://sukiio.com/i/2022/08/24/sbcz6r.jpeg");Message msg = new Message();msg.what = 0;msg.obj = bmp;handle.sendMessage(msg);}}).start();
     
        
        
        main2ll2.setOnLongClickListener(new View.OnLongClickListener(){

                @Override
                public boolean onLongClick(View view) {
                    if(inleft){
                        inleft=false;
                        dis();
                        Load.Main2.show(context);
                        Load.PVP.dis();
                        Load.Other.dis();
                        Load.Player.dis();
                        Load.UI.dis();
                    }else{
                        inleft=true;
                        dis();
                        Load.Main2.show(context);
                        Load.PVP.dis();
                        Load.Other.dis();
                        Load.Player.dis();
                        Load.UI.dis();
                    };
                    return false;
                }
            });
        main2ll2.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    if(inleft){
                        Load.PVP.dis();
                        Load.Other.dis();
                        Load.Player.dis();
                        Load.UI.dis();
                        ASUI.UILevel(main2ll, 0, -100, 500, null).setAnimationListener(new Animation.AnimationListener(){

                                @Override
                                public void onAnimationStart(Animation p1) {
                                }

                                @Override
                                public void onAnimationEnd(Animation p1) {
                                    if(main2cdv!=null){
                                        main2cdv.dismiss();
                                        main2cdv=null;
                                        Load.fw.show();
                                        
                                    }

                                }

                                @Override
                                public void onAnimationRepeat(Animation p1) {
                                }
                            });
                    }else{
                        Load.PVP.dis();
                        Load.Other.dis();
                        Load.Player.dis();
                        Load.UI.dis();
                        ASUI.UILevel(main2ll, 0, 100, 500, null).setAnimationListener(new Animation.AnimationListener(){

                                @Override
                                public void onAnimationStart(Animation p1) {
                                }

                                @Override
                                public void onAnimationEnd(Animation p1) {
                                    if(main2cdv!=null){
                                        main2cdv.dismiss();
                                        main2cdv=null;
                                        Load.fw.show();
                                        
                                    }

                                }

                                @Override
                                public void onAnimationRepeat(Animation p1) {
                                }
                            });
                    }
                   
                    
                    }});
                    
        main2ll3a=new NewView(ct,(int)(H()*0.3),(int)(H()*0.075),"CC",1,2,null,null,null);
        main2ll3b=new NewView(ct,(int)(H()*0.4),(int)(H()*0.09),"CC",1,1,"#e9e9e9",360,new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    if(inleft){
                        Load.PVP.show(context,true);
                    }else{
                        Load.PVP.show(context,false);
                    }
                }
            });
        main2ll3c=new NewText(ct,"- "+"战斗"+" -","CC",-2,"#74C200FF");
        
        
        
        main2ll4a=new NewView(ct,(int)(H()*0.3),(int)(H()*0.03),"CC",1,2,null,null,null);
        main2ll4b=new NewView(ct,(int)(H()*0.4),(int)(H()*0.09),"CC",0,1,"#e9e9e9",360,new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    if(inleft){
                        Load.Other.show(context,true);
                    }else{
                        Load.Other.show(context,false);
                    }
                }
            });
        main2ll4c=new NewText(ct,"- "+"生存"+" -","CC",-2,"#74C200FF");
        
                        
        
        main2ll5a=new NewView(ct,(int)(H()*0.3),(int)(H()*0.03),"CC",1,2,null,null,null);
        main2ll5b=new NewView(ct,(int)(H()*0.4),(int)(H()*0.09),"CC",1,1,"#e9e9e9",360,new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    if(inleft){
                        Load.Player.show(context,true);
                    }else{
                        Load.Player.show(context,false);
                    }
                }
            });
        main2ll5c=new NewText(ct,"- "+"移动"+" -","CC",-2,"#74C200FF");
        
        main2ll6a=new NewView(ct,(int)(H()*0.3),(int)(H()*0.03),"CC",1,2,null,null,null);
        main2ll6b=new NewView(ct,(int)(H()*0.4),(int)(H()*0.09),"CC",1,1,"#e9e9e9",360,new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    if(inleft){
                        Load.UI.show(context,true);
                    }else{
                        Load.UI.show(context,false);
                    }
                }
            });
        main2ll6c=new NewText(ct,"- "+"UI"+" -","CC",-2,"#74C200FF");
        
        main2ll7=new NewView(ct,(int)(W()*0.25),(int)(H()*0.1),"LB",1,2,null,null,null);
        main2ll7d=new NewView(ct,(int)(W()*0.25),(int)(H()*0.1),"CC",0,2,null,null,null);
        main2ll7a=new NewText(ct,"关于FPP","CC",-2,"#000000");
        main2ll7b=new NewText(ct,"｜","CC",-2,"#000000");
        main2ll7c=new NewText(ct,"版本1.0","CC",-2,"#000000");
        
        
        ASUI.UILevel(main2ll3b,-100,0,500,null);
        ASUI.UILevel(main2ll4b,100,0,500,null);
        ASUI.UILevel(main2ll5b,-100,0,500,null);
        ASUI.UILevel(main2ll6b,100,0,500,null);
     
        main2ll.addView(main2ll2);
        main2ll2.addView(cardview);
        cardview.addView(iv);
                
        main2ll.addView(main2ll3a);
        main2ll.addView(main2ll3b);
        main2ll3b.addView(main2ll3c);
        
        main2ll.addView(main2ll4a);
        main2ll.addView(main2ll4b);
        main2ll4b.addView(main2ll4c);
        
        main2ll.addView(main2ll5a);
        main2ll.addView(main2ll5b);
        main2ll5b.addView(main2ll5c);
        
        main2ll.addView(main2ll6a);
        main2ll.addView(main2ll6b);
        main2ll6b.addView(main2ll6c);
        
        main2ll.addView(main2ll7);
        main2ll.addView(main2ll7d);
        main2ll7d.addView(main2ll7a);
        main2ll7d.addView(main2ll7b);
        main2ll7d.addView(main2ll7c);
        
        if(inleft){
            main2cdv=new NewCDV(main2ll,(int)(W()*0.25),(int)(H()),false,true,false,"LC","In",0,0);
            ASUI.UILevel(main2ll,-100,0,500,null);
        }else{
            main2cdv=new NewCDV(main2ll,(int)(W()*0.25),(int)(H()),false,true,false,"RC","In",0,0);
            ASUI.UILevel(main2ll,100,0,500,null);
        }
       }
    public static void dis(){
        if(main2cdv!=null){
            main2cdv.dismiss();
            main2cdv=null;
        }
        
    }
    private static int W(){
        return (int) (context.getResources().getDisplayMetrics().widthPixels);
    }
    private static int H(){
        return (int) (context.getResources().getDisplayMetrics().heightPixels);
    }
    
    //加载图片

    public static Bitmap getURLimage(String url) {

        Bitmap bmp = null;

        try {

            URL myurl = new URL(url);

            // 获得连接

            HttpURLConnection conn = (HttpURLConnection) myurl.openConnection();

            conn.setConnectTimeout(6000);//设置超时

            conn.setDoInput(true);

            conn.setUseCaches(false);//不缓存

            conn.connect();

            InputStream is = conn.getInputStream();//获得图片的数据流

            bmp = BitmapFactory.decodeStream(is);//读取图像数据

            //读取文本数据

            //byte[] buffer = new byte[100];

            //inputStream.read(buffer);

            //text = new String(buffer);

            is.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

        return bmp;

    }

}
    
    

