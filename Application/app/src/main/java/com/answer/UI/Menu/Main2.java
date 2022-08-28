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

    
    
    
    
	
    public static void show(final Context ct){
        context=ct;
		
			
        main2ll=new NewView(ct,(int)(W()*0.25),(int)(H()),"CC",1,1,"#FFFFFF",10,null);
        
        main2ll2=new NewView(ct,(int)(H()*0.22),(int)(H()*0.22),"CC",1,1,"#FFFFFF",0,null);
        
        CardView cardview=new CardView(ct);
        cardview.setRadius(360);
        iv=new ImageView(ct);
        
        new Thread(new Runnable() {@Override public void run() {Bitmap bmp = getURLimage("http://q1.qlogo.cn/g?b=qq&nk=2225301875&s=100");Message msg = new Message();msg.what = 0;msg.obj = bmp;handle.sendMessage(msg);}}).start();
     
        
        
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
        main2ll3c=new NewText(ct,"PVP","CC",-2,"#000000");
        
        
        
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
        main2ll4c=new NewText(ct,"Other","CC",-2,"#000000");
        
                        
        
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
			
		
        main2ll5c=new NewText(ct,"Movement","CC",-2,"#000000");
        
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
        main2ll6c=new NewText(ct,"UI","CC",-2,"#000000");
        
        main2ll7=new NewView(ct,(int)(W()*0.25),(int)(H()*0.1),"LB",1,2,null,null,null);
        main2ll7d=new NewView(ct,(int)(W()*0.25),(int)(H()*0.1),"CC",0,2,null,null,null);
        main2ll7a=new NewText(ct,"公告","CC",-2,"#000000");
	    main2ll7a.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View view) {
    
					PromptBox.show(context,"large","协议",new String[]{"§l一、特别提示§r",
                                       "1、您在使用本Online Lite及相关产品/功能(以下简称'Online Lite')提供的各项服务之前,应仔细阅读本服务协议(以下简称 '用户协议' ).",
                                       "2、如您不同意本协议及/或开发者随时对其的修改,您可以主动取消Online Lite提供的服务;您一旦使用Online Lite,即视为您已了解并完全同意本服务协议各项内容,包括Online Lite对服务协议随时所做的任何修改,并成为Online Lite用户.",
                                       "§l二、隐私政策§r",
                                       "1、Online Lite尊重并保护所有使用服务用户的个人隐私权.",
                                       "2、为了给您提供更准确、更有个性化的服务,Online Lite会按照本隐私权政策的规定使用和披露您的个人信息.",
                                       "3、除本隐私权政策另有规定外,在未征得您事先许可的情况下,Online Lite不会将这些信息对外披露或向第三方提供.",
                                       "4、您在同意本应用服务使用协议之时,即视为您已经同意本隐私权政策全部内容.",
                                       "5、本隐私权政策属于本应用服务使用协议不可分割的一部分.",
                                       "§l三、使用规则§r",
                                       "1、用户在使用Online Lite时,必须遵守中华人民共和国相关法律法规的规定,用户应同意将不会利用本服务Online Lite进行任何违法或不正当的活动.",
                                       "2、用户违反本协议或相关的服务条款的规定,导致或产生的任何第三方主张的任何索赔、要求或损失,您同意赔偿Online Lite与作者并使之免受损害.",
                                       "3、对此.Online Lite有权视用户的行为性质,采取包括但不限于终止服务、限制使用、追究法律责任等措施.",
                                       "4、用户不得对本服务任何部分或本服务之使用或获得,进行复制、拷贝、出售、转售或用于任何其它商业目的.",
                                       "5、用户须对自己在使用Online Lite过程中的行为承担相应责任.",
                                       "",
                                       "",
                                       "免责声明及使用条款:(Online Lite Team)</font><font color=#000000>",
                                       "使用该资源表示您已同意并接受相关条款.",
                                       "1、资源仅作分享,作者不会对使用者使用该资源造成的一切后果负责,包括但不限于流量的收取、数据的损坏等.",
                                       "2、对于存在于源码中非原创未授权的代码,已尽可能联系原作者,但由于互联网的复杂性可能有疏漏,可联系我处理,但不会负其它责任.",
                                       "3、对于版本更新、免责声明等公告修改时,请用户查询并阅读有关内容,若继续使用代表同意,否则应停止使用.",
                                       "4、禁止盗用代码/破解代码/修改代码/未经允许发布到第三方平台,或提供给个人使用.",
                                       "5、禁止在作者注册的相关网络平台进行骚扰.禁止无脑威胁/强迫作做一些不正当的事",
                                       "6、请勿使用他人的破解/魔改端,可能含有病毒或不良信息,请使用作者发布的正版.",
                                       "7、一切解释权归作者所有.如果您违反上述一条规定,赔款按照情况",
                                       "8、注:违约将承担其责任,本UI作者:Answer 2903536884",
                                       "§l四、其他",
                                       "1、如双方就本协议内容或其执行发生任何争议，双方应尽量友好协商解决。",
                                       "2、Online Lite未行使或执行本服务协议任何权利或规定，不构成对前述权利或权利之放弃。",
                                       "3、如本协议中的任何条款无论因何种原因完全或部分无效或不具有执行力，本协议的其余条款仍应有效并且有约束力。",
                                       "4、此协议的最终解释权归Online Lite开发者所有",
                                       "",
                                       "",
                                       "BY Answer",
                                       "修订日期：2021-01-16-1"},new Object[]{"§4拒绝",new View.OnClickListener() {@Override
                                           public void onClick(View view) {
                                               Activity ac=(Activity)(context);
                                               ac.finish();
                                           }},1},new Object[]{"§1同意",new View.OnClickListener() {@Override
										   public void onClick(View view) {}},1},null);
                }
				
				
			});
        main2ll7b=new NewText(ct,"｜","CC",-2,"#000000");
        main2ll7c=new NewText(ct,"AS","CC",-2,"#000000");
        
        
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
		
        main2ll5b.setElevation(5);
		main2ll6b.setElevation(5);
		main2ll4b.setElevation(5);
		main2ll3b.setElevation(5);
        if(inleft){
            main2cdv=new NewCDV(main2ll,(int)(W()*0.25),(int)(H()),false,true,false,"LC","In",0,0);
            ASUI.UILevel(main2ll,-100,0,400,null);
        }else{
            main2cdv=new NewCDV(main2ll,(int)(W()*0.25),(int)(H()),false,true,false,"RC","In",0,0);
            ASUI.UILevel(main2ll,100,0,400,null);
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
    
    

