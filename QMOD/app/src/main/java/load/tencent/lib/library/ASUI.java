package load.tencent.lib.library;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.media.MediaPlayer;
import android.os.Environment;
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
import android.widget.ScrollView;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;
import java.util.Arrays;
import android.text.Spanned;



/*#辅助调用库*/
/*#使调用库更简单*/
/*answer*/
public class ASUI {
    
    
    
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
    public static android.text.Spanned FontColor(String text){

        for(int e = 0; e < colors.length; e++){
            text=join(text.split(colors[e][0]),colors[e][1]);
        }
        return android.text.Html.fromHtml(text);
    }
    
    public static Button NewButton(final Context ctx,String text,int sizeW,int sizeH,final View.OnClickListener gn){
        int[] btc={Color.parseColor("#465EFB"),Color.parseColor("#ffffff")};
        float[] btf={360,360,360,360,360,360,360,360};
        final Button btl=new Button(ctx);
        btl.setText(text);
        btl.setTextColor(Color.parseColor("#C2FFD8"));
        btl.setBackgroundDrawable(roundBG("#465EFB",360,null,0));
        btl.setLayoutParams(new android.widget.LinearLayout.LayoutParams(sizeW,sizeH));
        
        btl.setOnClickListener(new View.OnClickListener() {         
              public void onClick(View p1) {
                    btl.setText("1");
                    }});
    return btl;
}
    
 

    public static EditText NewET(Context ctx,String hname,String oname,int size,String color,boolean bg){
        EditText _ET1=new android.widget.EditText(ctx);
        _ET1.setHint(hname);
        _ET1.setText(oname);
        _ET1.setTextSize(size);
        _ET1.setTextColor(android.graphics.Color.parseColor(color));
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
        return android.os.Build.VERSION.RELEASE;
    }
    
    public static String Getname(){
        return android.os.Build.MODEL;
    }
    
    public static String GetVersionnumber(){
        return android.os.Build.DISPLAY;
    }
    public static String GETmanufacturer(){
        return android.os.Build.MANUFACTURER;
    }
    
    
    
    
    
    /*颜色库*/
    
     //测试中(暂时有问题)
    public static GradientDrawable Portable(Object[] hex,Object round,String f,Object s){
        Object[] objectArray = null;
        ArrayList hexed=new ArrayList();
        String[] hex2=(String[])hex;
        if(hex.length==2){
            hexed.add(Color.parseColor(hex2[1]));
            hexed.add(Color.parseColor(hex2[1]));
       objectArray  = hexed.toArray();
        }else{
        hexed.add(hex2[0]);
    for(int i=1;i<hex2.length;i++){
        hexed.add(Color.parseColor(hex2[i]));
        //hexed[i-1]=Color.parseColor(hex2[i]);
        }
       objectArray  = hexed.toArray();
       }
   return new roundRect(objectArray,round,hex2[0],s);
    }
    
    
    //正式版
    public static GradientDrawable roundBG(Object hex,Object round,String f,Object s){

        if(isArray(hex)){
            String[] hex2=(String[])hex;
           return new roundRect(new int[]{Color.parseColor(hex2[0]),Color.parseColor(hex2[1])},round,hex2[2],0);
        }else{
           return new roundRect(Color.parseColor((String)(hex)),round,f,s);
        }
    }
    
    public static int hexColor(String c){
        return android.graphics.Color.parseColor(c);
    };
    
    
    public static boolean isArray(Object obj) {
        if(obj == null) {
            return false;
        }
        return obj.getClass().isArray();
    }
    
    
    
    
    
    /*动画库*/
    
    /*#揭露*/public static ViewTreeObserver.OnGlobalLayoutListener UIReveal(final View view,final int x,final int y,final int startr,final int endr,final int time){
         
         globallayoutlinstener=new android.view.ViewTreeObserver.OnGlobalLayoutListener(){
            @Override
            public void onGlobalLayout(){
                Animator anim=ViewAnimationUtils.createCircularReveal(view, x, y, Float.valueOf(startr), Float.valueOf(endr));
                anim.setDuration(time);
                anim.start();
                 
                view.getViewTreeObserver().removeOnGlobalLayoutListener(globallayoutlinstener);
            }};
                view.setVisibility(android.view.View.VISIBLE);
                view.getViewTreeObserver().addOnGlobalLayoutListener(globallayoutlinstener);
                return globallayoutlinstener;
        };
    /*#移动*/public static TranslateAnimation UIMove(View view,int x1,int x2,int y1,int y2,int time,Object type){
        int tp=((type==null||type==0)?android.view.animation.Animation.RELATIVE_TO_SELF:type==1?android.view.animation.Animation.RELATIVE_TO_PARENT:android.view.animation.Animation.ABSOLUTE);
        TranslateAnimation dh=new android.view.animation.TranslateAnimation((int)(tp), (int)(x1 * 0.01), (int)(tp),(int)( x2 * 0.01), (int)(tp), (int)(y1 * 0.01), (int)(tp), (int)(y2 * 0.01));
        dh.setDuration(time);
        if (view != null)view.startAnimation(dh);
        return dh;
    };
    /*#旋转*/public static RotateAnimation UIRotate(View view,int A,int B,int x,int y,int time,Object type){
        
        int tp=((type==null||type==0)?android.view.animation.Animation.RELATIVE_TO_SELF:type==1?android.view.animation.Animation.RELATIVE_TO_PARENT:android.view.animation.Animation.ABSOLUTE);
        RotateAnimation dh=new android.view.animation.RotateAnimation((int)(A),(int)( B), (int)(tp), (int)(x * 0.01), (int)(tp), (int)(y * 0.01));dh.setDuration(time);dh.setFillAfter(true);
        if (view != null)view.startAnimation(dh);
        return dh;
        };
    /*#收缩*/public static ScaleAnimation UIShrink(View view,int x1,int x2,int y1,int y2,int x,int y,int time,Object type){
         
        int tp=((type == null || type == 0) ?android.view.animation.Animation.RELATIVE_TO_SELF: type == 1 ?android.view.animation.Animation.RELATIVE_TO_PARENT: android.view.animation.Animation.ABSOLUTE);
        ScaleAnimation dh=new android.view.animation.ScaleAnimation((int)(x1 * 0.01),(int)( x2 * 0.01),(int)( y1 * 0.01),(int)(y2*0.01),(int)(tp),(int)( x * 0.01),(int)( tp),(int)(y * 0.01));
        dh.setDuration(time);
        if (view != null)view.startAnimation(dh);
          return dh;
          };
    /*#淡入*/public static AlphaAnimation UIFadein(View view,int A,int B,int time){
        AlphaAnimation dh=new android.view.animation.AlphaAnimation((int)(A * 0.01), (int)(B * 0.01));
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
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(view, "alpha",parameter[0],parameter[1],parameter[2]);
        objectAnimator.setDuration(time);
        objectAnimator.start();
    }
    
    public static void Displacementanimation(View view,String direction,Object[] parameter,int time){
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(view, direction,parameter[0],parameter[1],parameter[2]);
        objectAnimator.setDuration(time);
        objectAnimator.start();
    }
    public static void Colorchangeanimation(View view,Object color,int time){
        ObjectAnimator objectAnimator = ObjectAnimator.ofInt(view,"backgroundColor",color);
        objectAnimator.setDuration(time);
        objectAnimator.setEvaluator(new android.animation.ArgbEvaluator());
        objectAnimator.start();
    }
    
    public static void Rotationanimation(View view,String direction,Object[] angle,int time){
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(view, direction, angle[0],angle[1],angle[2]);
        objectAnimator.setDuration(time);  
        objectAnimator.start();  
    }
    
    public static void Zoomanimation(View view,Object[] proportion,int time){
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(view, "scaleX", proportion[0],proportion[1],proportion[2]);
        objectAnimator.setDuration(time);  
        objectAnimator.start();  

        ObjectAnimator objectAnimator2 = ObjectAnimator.ofFloat(view, "scaleY", proportion[0],proportion[1],proportion[2]);
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
    /*音乐播放*/
    public static void playmfunction(AssetFileDescriptor route,Object loop){
        try {
            MediaPlayer player=new android.media.MediaPlayer();
            player.reset();
            player.setDataSource(route);



            if (loop != null) {player.setLooping(loop);}
            player.prepare();player.start();
        } catch (IOException e) {} catch (IllegalStateException e) {} catch (SecurityException e) {} catch (IllegalArgumentException e) {}
    }

    /*QQ号获取*/

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
    
    
    
}
