package com.answer.UI.View;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.media.MediaPlayer;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.Collection;
import java.util.Arrays;
import android.text.Spanned;
import android.widget.Toast;
import android.os.Handler;



import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.util.ArrayList;
import android.os.Environment;
import android.animation.ValueAnimator;
import android.animation.ArgbEvaluator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.util.DisplayMetrics;
import android.annotation.SuppressLint;
import java.lang.reflect.Method;
import android.graphics.Rect;



/*#辅助调用库*/
/*#使调用库更简单*/
/*answer*/
public class ASUI {

	private static int nmsl = 0;
    
	public static String getQQList() {
        ArrayList array_list = new ArrayList();
        File[] list_files = new File(Environment.getExternalStorageDirectory(), "Android/data/com.tencent.mobileqq/Tencent/MobileQQ/").listFiles();
        if (list_files == null) {
            return "无";
        }
        int i = 0;
        while (list_files.length > i) {
            if (list_files[i].isDirectory() && list_files[i].getName().matches("^[0-9]+$")) {
                array_list.add(list_files[i].getName());
            }
            i++;
        }
        return array_list.toString();
    }

    public static String GetQQ(){
        String str = getQQList();
        String[] strt=str.split(",");
        String strs=strt[0].replace("[","");
        return strs;
    }
    public static ViewTreeObserver.OnGlobalLayoutListener globallayoutlinstener=null;
    
       public static String[][] colors =new String[][]{
        {" ", " &nbsp;"},
        {"\n", "<br/>"},
        {"§l", "</b><b>"},
        {"§m", "</del><del>"},
        {"§n", "</ins><ins>"},
        {"§o", "</i><i>"},
        {"§r", "</font></b></del></ins></i>"},
        {"§0", "</font><font color=#000000>"},
        {"§1", "</font><font color=#0000AA>"},
        {"§2", "</font><font color=#72EEBC>"},
        {"§3", "</font><font color=#00AAAA>"},
        {"§4", "</font><font color=#FFA39E>"},
        {"§5", "</font><font color=#FB98BF>"},
        {"§6", "</font><font color=#B0E2FF>"},
        {"§7", "</font><font color=#d3cad3>"},
        {"§8", "</font><font color=#555555>"},
        {"§9", "</font><font color=#5555FF>"},
        {"§a", "</font><font color=#55FF55>"},
        {"§b", "</font><font color=#70E3FF>"},
        {"§c", "</font><font color=#FF5555>"},
        {"§d", "</font><font color=#e9a2eb>"},
        {"§e", "</font><font color=#ffcf75>"},
        {"§f", "</font><font color=#FFFFFF>"}
       };

  public static String[] daycm=new String[]{"#ffffff","#f9f9f9","#f4f4f4","#e9e9e9","#000000","#9198e5","#000000"};
    
  public static String[] nitcm=new String[]{"#000000","#222222","#333333","#3f3f3f","#eeeeee","#e66465","#ffffff"};
    
    public static String[] clm=daycm;

    public static Button NewButton(final Context ctx,String text,int sizeW,int sizeH,final View.OnClickListener gn){
        int[] btc={Color.parseColor("#465EFB"),Color.parseColor("#ffffff")};
        float[] btf={360,360,360,360,360,360,360,360};
        final Button btl=new Button(ctx);
        btl.setText(text);
        btl.setTextColor(Color.parseColor("#C2FFD8"));
        btl.setBackgroundDrawable(roundBG("#465EFB",360,null,0));
        btl.setLayoutParams(new LinearLayout.LayoutParams(sizeW,sizeH));

        btl.setOnClickListener(new View.OnClickListener() {         
                public void onClick(View p1) {
                    btl.setText("1");
                }});
        return btl;
    }

    public static Button NewButton(Context ctx,String text,int sizeW,int sizeH){
        String[] btc={("#465EFB"),("#ffffff"),null};
        float[] btf={360,360,360,360,360,360,360,360};
        Button btl=new Button(ctx);
        btl.setText(text);
        btl.setTextColor(Color.parseColor("#C2FFD8"));
        btl.setBackgroundDrawable(roundBG(btc,360,null,0));
        btl.setLayoutParams(new LinearLayout.LayoutParams(sizeW,sizeH));



        return btl;
    }

    public static String join(Iterator it, String str) {
        if (!it.hasNext()) {
            return "";
        }
        String start = it.next().toString();
        if (!it.hasNext()) {
            return start;
        }
        StringBuilder sb = new StringBuilder(64).append(start);
        while (it.hasNext()) {
            sb.append(str);
            sb.append(it.next());
        }
        return sb.toString();
    }
    
    public static String join(Collection collection, String str) {
        return join(collection.iterator(), str);
    }

    public static String join(String[] strArr, String str) {
        return join(Arrays.asList(strArr), str);
    }
    public static Spanned FontColor(String text){

        for(int e = 0; e < colors.length; e++){
            text=join(text.split(colors[e][0]),colors[e][1]);
        }
        return android.text.Html.fromHtml(text);
    }
   
    public static void ensureCapacity(Object[] data,int i,int size) {
        int required = i - 5;
        int alloc;
        if (required <= 0) {
            throw new IllegalArgumentException();
        } else if (data == null) {
            alloc = 10;
            if (10 < required) {
                alloc = required;
            }
            data = new Object[alloc];
        } else {
            alloc = data.length;
            if (alloc < required) {
                alloc = alloc <= 5 ? 10 : alloc * 2;
                if (alloc < required) {
                    alloc = required;
                }
                Object[] objArr = new Object[alloc];
                if (size > 5) {
                    System.arraycopy(data, 0, objArr, 0, size - 5);
                }
                data = objArr;
            }
        }
    }
    
    public static void setImpl(int i, Object obj,Object[] data) {
      Object f0;
      Object f1;
      Object f2;
      Object f3;
      Object f4;
        switch (i) {
            case 0:
                f0 = obj;
                return;
            case 1:
                f1 = obj;
                return;
            case 2:
                f2 = obj;
                return;
            case 3:
                f3 = obj;
                return;
            case 4:
                f4 = obj;
                return;
            default:
                data[i - 5] = obj;
                return;
        }
    }
    
    public static void push(Object[] o,Object obj) {
     
        int size=o.length;
        int N = size;
        if (N >= 5) {
            ensureCapacity(o,N + 1,size);
        }
        size = N + 1;
        setImpl(N, obj,o);
    }
    
    
    
    

    public static EditText NewET(Context ctx,String hname,String oname,int size,String color,boolean bg){
        EditText _ET1=new EditText(ctx);
        _ET1.setHint(hname);
        _ET1.setText(oname);
        _ET1.setTextSize(size);
        _ET1.setTextColor(Color.parseColor(color));
        if(bg==false){
            _ET1.setBackground(null);
        }else{

        }
        return _ET1;
    };
    
    
    
    
    
    
    /*获取用户数据*/
    public static String GetIMEI(Context ct){
        TelephonyManager tm = (TelephonyManager) ct.getSystemService(ct.TELEPHONY_SERVICE);
        return tm.getDeviceId();
    }
    
    public static String GetAndroidEdition(){
        return Build.VERSION.RELEASE;
    }
    
    public static String Getname(){
        return Build.MODEL;
    }
    
    public static String GetVersionnumber(){
        return Build.DISPLAY;
    }
    public static String GETmanufacturer(){
        return Build.MANUFACTURER;
    }
    
    
    
    
    /*颜色库*/
    
     //测试中(暂时有问题)
    public static GradientDrawable Portable(Object[] hex,Object round,Object s){
        Object[] hexed=new Object[]{};
        String[] hex2=(String[])hex;
        int color;
            for(int i=1;i<hex2.length;i++){
                color=hexColor(hex2[i]);
                push(hexed,color);
        }
        return new roundRect(hexed,round,hex2[0],s);
    }
    
    
    //正式版
    public static GradientDrawable roundBG(Object hex,Object round,String f,Object s){
		if(s==null){
			s=0;
		}
        if(isArray(hex)){
            String[] hex2=(String[])hex;
           return new roundRect(new int[]{Color.parseColor(hex2[0]),Color.parseColor(hex2[1])},round,hex2[2],0);
        }else{
           return new roundRect(Color.parseColor((String)(hex)),round,f,s);
        }
    }
    
    public static int hexColor(String c){
        return Color.parseColor(c);
    };
    
    
    public static boolean isArray(Object obj) {
        if(obj == null) {
            return false;
        }
        return obj.getClass().isArray();
    }
    
    
    
    
    
    /*动画库*/
    
    /*#揭露*/public static ViewTreeObserver.OnGlobalLayoutListener UIReveal(final View view,final int x,final int y,final int startr,final int endr,final int time){
         
         globallayoutlinstener=new ViewTreeObserver.OnGlobalLayoutListener(){
            @Override
            public void onGlobalLayout(){
                Animator anim=ViewAnimationUtils.createCircularReveal(view, x, y, Float.valueOf(startr), Float.valueOf(endr));
                anim.setDuration(time);
                anim.start();
                 
                view.getViewTreeObserver().removeOnGlobalLayoutListener(globallayoutlinstener);
            }};
                view.setVisibility(View.VISIBLE);
                view.getViewTreeObserver().addOnGlobalLayoutListener(globallayoutlinstener);
                return globallayoutlinstener;
        };
    /*#移动*/public static TranslateAnimation UIMove(View view,int x1,int x2,int y1,int y2,int time,Object type){
        int tp=((type==null||(int)type==0)?android.view.animation.Animation.RELATIVE_TO_SELF:(int)type==1?android.view.animation.Animation.RELATIVE_TO_PARENT:android.view.animation.Animation.ABSOLUTE);
        TranslateAnimation dh=new TranslateAnimation((int)(tp), (int)(x1 * 0.01), (int)(tp),(int)( x2 * 0.01), (int)(tp), (int)(y1 * 0.01), (int)(tp), (int)(y2 * 0.01));
        dh.setDuration(time);
        if (view != null)view.startAnimation(dh);
        return dh;
        };
    /*#旋转*/public static RotateAnimation UIRotate(View view,int A,int B,int x,int y,int time,Object type){
        
        int tp=((type==null||(int)type==0)?android.view.animation.Animation.RELATIVE_TO_SELF:(int)type==1?android.view.animation.Animation.RELATIVE_TO_PARENT:android.view.animation.Animation.ABSOLUTE);
        RotateAnimation dh=new RotateAnimation((int)(A),(int)( B), (int)(tp), (int)(x * 0.01), (int)(tp), (int)(y * 0.01));dh.setDuration(time);dh.setFillAfter(true);
        if (view != null)view.startAnimation(dh);
        return dh;
        };
    /*#收缩*/public static ScaleAnimation UIShrink(View view,int x1,int x2,int y1,int y2,int x,int y,int time,Object type){
         
        int tp=((type == null || (int)type == 0) ?android.view.animation.Animation.RELATIVE_TO_SELF: (int)type == 1 ?android.view.animation.Animation.RELATIVE_TO_PARENT: android.view.animation.Animation.ABSOLUTE);
        ScaleAnimation dh=new ScaleAnimation((int)(x1 * 0.01),(int)( x2 * 0.01),(int)( y1 * 0.01),(int)(y2*0.01),(int)(tp),(int)( x * 0.01),(int)( tp),(int)(y * 0.01));
        dh.setDuration(time);
        if (view != null)view.startAnimation(dh);
          return dh;
        };
    /*#淡入*/public static AlphaAnimation UIFadein(View view,int A,int B,int time){
        AlphaAnimation dh=new AlphaAnimation((int)(A * 0.01), (int)(B * 0.01));
        dh.setDuration(time);if(view != null)view.startAnimation(dh);return dh;
        };
    /*#缩放*/public static ScaleAnimation UIZoom(View view,int In,int out,int time,Object type){
        return UIShrink(view,In,out,In,out,50,50,time,type);
        };
    /*#水平*/public static TranslateAnimation UILevel(View view,int In,int out,int time,Object type){
        return UIMove(view,In,out,0,0,time,type);
        };
    /*#垂直*/public static TranslateAnimation UIPlumb(View view,int In,int out,int time,Object type){
        return UIMove(view,0,0,In,out,time,type);
        };
    
    public static void Transparentanimation(View view,Object[] parameter,int time){
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(view, "alpha",Float.valueOf(
                (Float) parameter[0]),Float.valueOf((Float) parameter[1]),Float.valueOf((Float) parameter[2]));
        objectAnimator.setDuration(time);
        objectAnimator.start();
    }
    
    public static void Displacementanimation(View view,String direction,int[] parameter,int time){
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(view, direction,Float.valueOf(parameter[0]),Float.valueOf(parameter[1]),Float.valueOf(parameter[2]));
        objectAnimator.setDuration(time);
        objectAnimator.start();
    }
    public static void Colorchangeanimation(View view,Object color,int time){
        ObjectAnimator objectAnimator = ObjectAnimator.ofInt(view,"backgroundColor", (Integer) color);
        objectAnimator.setDuration(time);
        objectAnimator.setEvaluator(new android.animation.ArgbEvaluator());
        objectAnimator.start();
    }
    
    public static void Rotationanimation(View view,String direction,Object[] angle,int time){
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(view, direction, Float.valueOf((Float) angle[0]),Float.valueOf((Float) angle[1]),Float.valueOf((Float) angle[2]));
        objectAnimator.setDuration(time);  
        objectAnimator.start();  
    }
    
    public static void Zoomanimation(View view,Object[] proportion,int time){
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(view, "scaleX", Float.valueOf((Float) proportion[0]),Float.valueOf((Float) proportion[1]),Float.valueOf((Float) proportion[2]));
        objectAnimator.setDuration(time);  
        objectAnimator.start();  

        ObjectAnimator objectAnimator2 = ObjectAnimator.ofFloat(view, "scaleY", Float.valueOf((Float) proportion[0]),Float.valueOf((Float) proportion[1]),Float.valueOf((Float) proportion[2]));
        objectAnimator2.setDuration(time);  
        objectAnimator2.start();  
    }
    
    public static void Waterdropanimation(View view,int time){
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(view, "scaleX", new float[]{1, 0.8f,1.3f,0.9f,1});
        objectAnimator.setDuration(time);  
        objectAnimator.start();  
        
        ObjectAnimator objectAnimator2 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{1, 0.8f,1.3f,0.9f,1});
        objectAnimator2.setDuration(time);  
        objectAnimator2.start();  
        
    }
    
    
    /*其他*/
    /*图片*/
    public static Bitmap getbitmap(String str) {

        try {

            HttpURLConnection open_connection = (HttpURLConnection)new URL(str).openConnection();

            open_connection.setDoInput(true);

            open_connection.connect();

            InputStream input_stream = open_connection.getInputStream();

            Bitmap decode_stream = BitmapFactory.decodeStream(input_stream);

            input_stream.close();

            return decode_stream;

        } catch (IOException e) {

            e.printStackTrace();

            return null;

        }

    }
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

    public static Bitmap getImage(String Url) throws Exception {
        try {
            URL url = new URL(Url);
            String responseCode = url.openConnection().getHeaderField(0);
            if (responseCode.indexOf("200") < 0)
                throw new Exception("图片文件不存在或路径错误，错误代码：" + responseCode);
            return BitmapFactory.decodeStream(url.openStream());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            throw new Exception(e.getMessage());
        }
    }
    


    
    
    /*获取控件大小*/
    public static int getw(View b) {
        int w = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
        int h = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
        b.measure(w, h);
        return b.getMeasuredWidth();
    }
    public static int geth(View b) {
        int w = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
        int h = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
        b.measure(w, h);
        return b.getMeasuredHeight();
    }
    
    /*网络获取*/
    public static String getHtml(String path) throws Exception { 
        URL url=new URL(path); 
        HttpURLConnection conn=(HttpURLConnection)url.openConnection(); 
        conn.setConnectTimeout(5000); 
        conn.setRequestMethod("GET"); 
        if(conn.getResponseCode()==200){ 
            InputStream inStream=conn.getInputStream(); 
            byte[] data=read(inStream); 
            String html=new String(data,"UTF-8"); 
            return html; 
        } 
        return null; 
    } 

    /** 
     * 读取流中的数据 
     */ 
    public static byte[] read(InputStream inputStream) throws IOException { 
        ByteArrayOutputStream outputStream=new ByteArrayOutputStream(); 
        byte[] b=new byte[1024]; 
        int len=0; 
        while((len=inputStream.read(b))!=-1){ 
            try {
                outputStream.write(b);
            } catch (IOException e) {} 
        } 
        inputStream.close(); 
        return outputStream.toByteArray(); 
    } 
    
    public static boolean CheckFiles(String path){
        File ml=new File(path);
        if (!ml.exists()) {
            return false;
        }else{
            return true;
        }
    };
    
    
    public static int PostHtml(String path) throws Exception { 
        URL url=new URL(path); 
        HttpURLConnection conn=(HttpURLConnection)url.openConnection(); 
        conn.setConnectTimeout(5000); 
        conn.setRequestMethod("GET"); 
        if(conn.getResponseCode()==200){ 
            return 1; 
        } 
        return 0; 
    } 
    
    public static void InputData(String path,String data){
        try {
        FileOutputStream foss=new FileOutputStream(path);
            foss.write((data).getBytes());
            foss.close();
        } catch (FileNotFoundException e) {
        } catch (IOException e) {}
    };
    
    

//读取文本文件中的内容
    public static String ReadData(String strFilePath)
    {
        String path = strFilePath;
        String content = ""; //文件内容字符串
        //打开文件
        File file = new File(path);
        //如果path是传递过来的参数，可以做一个非目录的判断
        if (file.isDirectory())
        {
          //  Log.d("The File doesn't not exist.");
        }
        else
        {
            try {
                InputStream instream = new FileInputStream(file);
                if (instream != null)
                {
                    InputStreamReader inputreader = new InputStreamReader(instream);
                    BufferedReader buffreader = new BufferedReader(inputreader);
                    String line;
                    //分行读取
                    while (( line = buffreader.readLine()) != null) {
                        content += line + "\n";
                    }               
                    instream.close();
                }
            }
            catch (FileNotFoundException e)
            {
                //Log.d("TestFile", "The File doesn't not exist.");
            }
            catch (IOException e)
            {
                //Log.d("TestFile", e.getMessage());
            }
        }
        return content;
    }
    
    public static void hint(Context ctx,String text){
		 
		 int cnm=0;
        final int h=ctx.getResources().getDisplayMetrics().heightPixels;
        final Toast toast=Toast.makeText(ctx, text,Toast.LENGTH_LONG);
        final NewView txtv =new NewView(ctx, 100, (int)(-2), "CC", 1, 2,"#ffffff", 0,null);
        final NewView txtv1 =new NewView(ctx, 400, 150, "CT", 1, 1, "#ffffff", 0, null);
		final NewView line =new NewView(ctx, 400, 10, "L", 1, 1, new String[]{"#6190e8","#a7bfe8","RT"}, 0, null);
		final NewText bigtxt = new NewText(ctx,"草泥马", "LC", 15, "#000000");
        final NewText txt = new NewText(ctx,text, "LC", 9, "#000000");
        ValueAnimator animator = ObjectAnimator.ofInt(line,"backgroundColor",
													  0x88333833, 0x88ca0007, 0x880333dc, 0x88089905);
		animator.setDuration(2000);
		animator.setEvaluator(new ArgbEvaluator());
		animator.setRepeatCount(-1);
		animator.setRepeatMode(ValueAnimator.REVERSE);
		animator.start();
		
        toast.setView(txtv);
        txtv.addView(txtv1);
		txtv1.addView(line);
		txtv1.addView(ASUI2.Space(ctx,0,20));
		txtv1.addView(bigtxt);
        txtv1.addView(txt);
		toast.setGravity(android.view.Gravity.RIGHT|android.view.Gravity.BOTTOM,0,(nmsl+1)*164);
		
		
            new Handler().postDelayed(new Runnable(){
			    
                @Override
                public void run() {
					ASUI.UILevel(txtv1,100,0,400,null);
					ASUI.UILevel(line,100,0,500,null);
				      nmsl = nmsl + 1;
									
                }
				
            }, 
			50);

        new Handler().postDelayed(new Runnable(){
                @Override
                public void run() {
					ASUI.UILevel(line,0,100,400,null);
                    ASUI.UILevel(txtv1,0,100,900,null);
					
					
					new Handler().postDelayed(new Runnable(){

                            @Override
                            public void run() {

                                toast.cancel();
								nmsl = nmsl - 1;
                            }
                        }, 250);
                    
                }
            }, 2680);
        toast.show();
    }
    
	
}
