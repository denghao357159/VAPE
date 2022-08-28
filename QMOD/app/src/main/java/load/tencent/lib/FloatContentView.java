package load.tencent.lib;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.io.*;
import android.view.KeyEvent;  
import android.view.inputmethod.EditorInfo; 
import android.widget.EditText;
import android.view.animation.Animation;
import load.tencent.lib.library.ASUI;
import android.text.Layout;
import android.media.Image;
import android.widget.ImageView;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Message;
import android.os.Handler;
import load.tencent.lib.library.Tostbut;
import load.tencent.lib.custom.custom;
import android.graphics.Typeface;

public class FloatContentView extends PopupWindow {

    private Context mContext;

	private ViewPager page;

	private String path;

	private LinearLayout layout;

	private ImageView icon;

	private ImageView icon2;

	private ImageView icon3;

	private ImageView icon4;
	
	private boolean aim;

	private custom T1;

    public FloatContentView(Context context) {
        super(context);
        this.mContext = context;
        initView();
    }
  
    private void initView() {
		GradientDrawable function = new GradientDrawable();
        function.setColor(0x45000000);
        function.setCornerRadius(100);
		
		GradientDrawable Customtrue = new GradientDrawable();
        Customtrue.setColor(0xff00a3e8);
        Customtrue.setCornerRadius(70);
		
		//创建布局
         layout = new LinearLayout(mContext);
        //布局属性
        layout.setOrientation(LinearLayout.VERTICAL);
        //布局大小
        layout.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

        //创建布局
        LinearLayout layout1 = new LinearLayout(mContext);
        //布局大小
        layout1.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
    
        //添加布局
        layout.addView(layout1);

        //创建控件
        TextView title = new TextView(mContext);
        //控件大小
        title.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //控件属性
        title.setGravity(Gravity.CENTER);
        //控件文本内容
        title.setText("FPP");
        //控件文本颜色
        title.setTextColor(0xFF000000);
        //添加控件
        layout1.addView(title);

      


		//创建布局
        LinearLayout layout2 = new LinearLayout(mContext);
        //布局大小
        layout2.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        layout2.setPadding(35, 35, 35, 35);
        //添加布局
        layout.addView(layout2);
   

		LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(320,120);
	
		LinearLayout.LayoutParams aaaa1params = new LinearLayout.LayoutParams(35,0);

		LinearLayout.LayoutParams iconparams = new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT,140);

	    LinearLayout.LayoutParams textparams = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT,140);

		
		GradientDrawable menuBackground = new GradientDrawable();
        menuBackground.setCornerRadius(90);
		menuBackground.setColor(0x33000000);
		
		LinearLayout aaaa0 = new LinearLayout(mContext);
		aaaa0.setLayoutParams(aaaa1params);
		layout2.addView(aaaa0);
		
		final LinearLayout menu1 = new LinearLayout(mContext);
		menu1.setLayoutParams(params);
		menu1.setBackground(menuBackground);
		layout2.addView(menu1);
		final LinearLayout iconlayout = new LinearLayout(mContext);
		
		iconlayout.setLayoutParams(iconparams);
		iconlayout.setGravity(Gravity.CENTER);
		menu1.addView(iconlayout);
         icon = new ImageView(mContext);
		 
		try {
            InputStream mInputStream = mContext.getAssets().open("a.png");
            Bitmap bitmap = BitmapFactory.decodeStream(mInputStream);
            icon.setImageBitmap(bitmap);
        } catch (IOException e) {
            e.printStackTrace();
        }
		
        iconlayout.addView(icon, 100, 100);
		final LinearLayout icontextlayout = new LinearLayout(mContext);

		icontextlayout.setLayoutParams(textparams);
		icontextlayout.setGravity(Gravity.CENTER);
		menu1.addView(icontextlayout);
	    TextView menu1text= new TextView(mContext);
		menu1text.setText("自定义区");
		menu1text.setGravity(Gravity.CENTER);
		menu1text.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));//加粗
		icontextlayout.addView(menu1text);
		
		LinearLayout aaaa1 = new LinearLayout(mContext);
		aaaa1.setLayoutParams(aaaa1params);
		layout2.addView(aaaa1);
		
		final LinearLayout menu2 = new LinearLayout(mContext);
		menu2.setLayoutParams(params);
		menu2.setBackground(menuBackground);
		
		layout2.addView(menu2);
		final LinearLayout iconlayout2 = new LinearLayout(mContext);

		iconlayout2.setLayoutParams(iconparams);
		iconlayout2.setGravity(Gravity.CENTER);
		menu2.addView(iconlayout2);
		icon2 = new ImageView(mContext);

		try {
            InputStream mInputStream2 = mContext.getAssets().open("b.png");
            Bitmap bitmap2 = BitmapFactory.decodeStream(mInputStream2);
            icon2.setImageBitmap(bitmap2);
        } catch (IOException e) {
            e.printStackTrace();
        }

        iconlayout2.addView(icon2, 100, 100);
		final LinearLayout icontextlayout2 = new LinearLayout(mContext);

		icontextlayout2.setLayoutParams(textparams);
		icontextlayout2.setGravity(Gravity.CENTER);
		menu2.addView(icontextlayout2);
	    TextView menu2text= new TextView(mContext);
		menu2text.setText("PVP");
		menu2text.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));//加粗
		
		menu2text.setGravity(Gravity.CENTER);
		icontextlayout2.addView(menu2text);
		
		LinearLayout aaaa2 = new LinearLayout(mContext);
		aaaa2.setLayoutParams(aaaa1params);
		layout2.addView(aaaa2);
		
		final LinearLayout menu3 = new LinearLayout(mContext);
		menu3.setLayoutParams(params);
		menu3.setBackground(menuBackground);
		layout2.addView(menu3);
		final LinearLayout iconlayout3 = new LinearLayout(mContext);

		iconlayout3.setLayoutParams(iconparams);
		iconlayout3.setGravity(Gravity.CENTER);
		menu3.addView(iconlayout3);
		icon3 = new ImageView(mContext);

		try {
            InputStream mInputStream3 = mContext.getAssets().open("c.png");
            Bitmap bitmap3 = BitmapFactory.decodeStream(mInputStream3);
            icon3.setImageBitmap(bitmap3);
        } catch (IOException e) {
            e.printStackTrace();
        }

        iconlayout3.addView(icon3, 100, 100);
		final LinearLayout icontextlayout3 = new LinearLayout(mContext);
		icontextlayout3.setLayoutParams(textparams);
		icontextlayout3.setGravity(Gravity.CENTER);
		menu3.addView(icontextlayout3);
	    TextView menu3text= new TextView(mContext);
		menu3text.setText("Move");
		menu3text.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));//加粗
		
		menu3text.setGravity(Gravity.CENTER);
		icontextlayout3.addView(menu3text);

		LinearLayout aaaa3 = new LinearLayout(mContext);
		aaaa3.setLayoutParams(aaaa1params);
		layout2.addView(aaaa3);
		
		final LinearLayout menu4 = new LinearLayout(mContext);
		menu4.setLayoutParams(params);
		menu4.setBackground(menuBackground);
		layout2.addView(menu4);
		final LinearLayout iconlayout4 = new LinearLayout(mContext);

		iconlayout4.setLayoutParams(iconparams);
		iconlayout4.setGravity(Gravity.CENTER);
		menu4.addView(iconlayout4);
		icon4 = new ImageView(mContext);

		try {
            InputStream mInputStream4 = mContext.getAssets().open("a.png");
            Bitmap bitmap4 = BitmapFactory.decodeStream(mInputStream4);
            icon4.setImageBitmap(bitmap4);
        } catch (IOException e) {
            e.printStackTrace();
        }

        iconlayout4.addView(icon4, 100, 100);
		final LinearLayout icontextlayout4 = new LinearLayout(mContext);
		icontextlayout4.setLayoutParams(textparams);
		icontextlayout4.setGravity(Gravity.CENTER);
		menu4.addView(icontextlayout4);
	    TextView menu4text= new TextView(mContext);
		menu4text.setText("User");
		menu4text.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));//加粗
		menu4text.setGravity(Gravity.CENTER);
		icontextlayout4.addView(menu4text);

		LinearLayout aaaa4 = new LinearLayout(mContext);
		aaaa4.setLayoutParams(aaaa1params);
		layout2.addView(aaaa4);
		
		//创建布局
        page = new ViewPager(mContext);
        //控件大小
        page.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //添加布局
        layout.addView(page);
        //创建布局
        LinearLayout alayout = new LinearLayout(mContext);
        //布局属性
        alayout.setOrientation(LinearLayout.VERTICAL);
        //布局大小
        alayout.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

        //创建布局
        LinearLayout alayout1 = new LinearLayout(mContext);
        //布局大小
        alayout1.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //添加布局
        alayout.addView(alayout1);

 
        //创建布局
        ScrollView scroll1 = new ScrollView(mContext);
        //布局大小
        scroll1.setLayoutParams(new ScrollView.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //添加布局
        alayout.addView(scroll1);

        //创建布局
        LinearLayout alayout2 = new LinearLayout(mContext);
        //布局大小
        alayout2.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局属性
        alayout2.setOrientation(LinearLayout.VERTICAL);
        //添加布局
        scroll1.addView(alayout2);
        
        //创建控件
        LinearLayout alayout3 = new LinearLayout(mContext);
        //布局大小
        alayout3.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        alayout3.setPadding(35, 35, 35, 35);
        //添加布局
        alayout2.addView(alayout3);

        LinearLayout PVPcust = new LinearLayout(mContext);
        PVPcust.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, 140));
        PVPcust.setBackground(function);
		PVPcust.setGravity(Gravity.CENTER);
		PVPcust.setOrientation(LinearLayout.HORIZONTAL);
        alayout3.addView(PVPcust);
		LinearLayout PVPTextlayout = new LinearLayout(mContext);
		PVPTextlayout.setGravity(Gravity.CENTER);
		PVPTextlayout.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.MATCH_PARENT));
		PVPcust.addView(PVPTextlayout);
		TextView PVPtext= new TextView(mContext);
		PVPtext.setText("Custom-PVP");
		PVPtext.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));//加粗

		PVPtext.setGravity(Gravity.CENTER);
		PVPTextlayout.addView(PVPtext);
		LinearLayout PVPtrue = new LinearLayout(mContext);
		PVPtrue.setGravity(Gravity.CENTER);
        PVPtrue.setLayoutParams(new LinearLayout.LayoutParams(150, 110));
        PVPtrue.setBackground(Customtrue);
		PVPcust.addView(PVPtrue);
		TextView PVPtruetext= new TextView(mContext);
		PVPtruetext.setText("确定");
		PVPtruetext.setGravity(Gravity.CENTER);
		PVPtrue.addView(PVPtruetext);
		

        LinearLayout alayout15 = new LinearLayout(mContext);
        //布局大小
        alayout15.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        alayout15.setPadding(35, 35, 35, 35);
        //添加布局
        alayout2.addView(alayout15);
        
        LinearLayout alayout16 = new LinearLayout(mContext);
        //布局大小
        alayout16.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        alayout16.setPadding(35, 35, 35, 35);
        //添加布局
        alayout2.addView(alayout16);
        
        LinearLayout alayout17 = new LinearLayout(mContext);
        //布局大小
        alayout17.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        alayout17.setPadding(35, 35, 35, 35);
        //添加布局
        alayout2.addView(alayout17);
        
        LinearLayout alayout18 = new LinearLayout(mContext);
        //布局大小
        alayout18.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        alayout18.setPadding(35, 35, 35, 35);
        //添加布局
        alayout2.addView(alayout18);
        
        LinearLayout alayout19 = new LinearLayout(mContext);
        //布局大小
        alayout19.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        alayout19.setPadding(35, 35, 35, 35);
        //添加布局
        alayout2.addView(alayout19);
        
        LinearLayout alayout20 = new LinearLayout(mContext);
        //布局大小
        alayout20.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        alayout20.setPadding(35, 35, 35, 35);
        //添加布局
        alayout2.addView(alayout20);
        
        LinearLayout alayout21 = new LinearLayout(mContext);
        //布局大小
        alayout21.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        alayout21.setPadding(35, 35, 35, 35);
        //添加布局
        alayout2.addView(alayout21);
        
        LinearLayout alayout22 = new LinearLayout(mContext);
        //布局大小
        alayout22.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        alayout22.setPadding(35, 35, 35, 35);
        //添加布局
        alayout2.addView(alayout22);
        
        
        //创建布局
        LinearLayout blayout = new LinearLayout(mContext);
        //布局属性
        blayout.setOrientation(LinearLayout.VERTICAL);
        //布局大小
        blayout.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

        //创建布局
        LinearLayout blayout1 = new LinearLayout(mContext);
        //布局大小
        blayout1.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //添加布局
        blayout.addView(blayout1);

        //创建布局
        View bline1 = new View(mContext);
        //布局属性
        bline1.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, 5, 1));
        //添加布局
        blayout1.addView(bline1);

        //创建布局
        

        //创建布局
        View bline3 = new View(mContext);
        //布局属性
        bline3.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, 5, 1));
        //添加布局
        blayout1.addView(bline3);

        //创建布局
        ScrollView scroll2 = new ScrollView(mContext);
        //布局大小
        scroll2.setLayoutParams(new ScrollView.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //添加布局
        blayout.addView(scroll2);

        //创建布局
        LinearLayout blayout2 = new LinearLayout(mContext);
        //布局大小
        blayout2.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局属性
        blayout2.setOrientation(LinearLayout.VERTICAL);
        //添加布局
        scroll2.addView(blayout2);
		
		LinearLayout blayout3 = new LinearLayout(mContext);
        //布局大小
        blayout3.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        blayout3.setPadding(35, 35, 35, 35);
        //添加布局
        blayout2.addView(blayout3);
		
        Switch bswitch1 = new Switch(mContext);
        //控件属性
        bswitch1.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //控件文本内容
        bswitch1.setText("杀戮");
        //控件文本颜色
        bswitch1.setTextColor(0xFF000000);
        //添加控件
        blayout3.addView(bswitch1);
        //创建布局
		
        LinearLayout blayout12 = new LinearLayout(mContext);
        //布局大小
        blayout12.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        blayout12.setPadding(35, 35, 35, 35);
        //添加布局
        blayout2.addView(blayout12);
		
		Switch bswitch2 = new Switch(mContext);
        //控件属性
        bswitch2.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //控件文本内容
        bswitch2.setText("骑人");
        //控件文本颜色
        bswitch2.setTextColor(0xFF000000);
        //添加控件
        blayout12.addView(bswitch2);
		
        
        LinearLayout blayout13 = new LinearLayout(mContext);
        //布局大小
        blayout13.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        blayout13.setPadding(35, 35, 35, 35);
        //添加布局
        blayout2.addView(blayout13);
		
		Switch bswitch3 = new Switch(mContext);
        //控件属性
        bswitch3.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //控件文本内容
        bswitch3.setText("飞行");
        //控件文本颜色
        bswitch3.setTextColor(0xFF000000);
        //添加控件
        blayout13.addView(bswitch3);  
		
        LinearLayout blayout14 = new LinearLayout(mContext);
        //布局大小
        blayout14.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        blayout14.setPadding(35, 35, 35, 35);
        //添加布局
        blayout2.addView(blayout14);
		
		Switch bswitch4 = new Switch(mContext);
        //控件属性
        bswitch4.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //控件文本内容
        bswitch4.setText("飞行");
        //控件文本颜色
        bswitch4.setTextColor(0xFF000000);
        //添加控件
        blayout14.addView(bswitch4);   
        LinearLayout blayout15 = new LinearLayout(mContext);
        //布局大小
        blayout15.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        blayout15.setPadding(35, 35, 35, 35);
        //添加布局
        blayout2.addView(blayout15);
        
        LinearLayout blayout16 = new LinearLayout(mContext);
        //布局大小
        blayout16.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        blayout16.setPadding(35, 35, 35, 35);
        //添加布局
        blayout2.addView(blayout16);
        
        LinearLayout blayout17 = new LinearLayout(mContext);
        //布局大小
        blayout17.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        blayout17.setPadding(35, 35, 35, 35);
        //添加布局
        blayout2.addView(blayout17);
        
        LinearLayout blayout18 = new LinearLayout(mContext);
        //布局大小
        blayout18.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        blayout18.setPadding(35, 35, 35, 35);
        //添加布局
        blayout2.addView(blayout18);
        
        LinearLayout blayout19 = new LinearLayout(mContext);
        //布局大小
        blayout19.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        blayout19.setPadding(35, 35, 35, 35);
        //添加布局
        blayout2.addView(blayout19);
        
        LinearLayout blayout20 = new LinearLayout(mContext);
        //布局大小
        blayout20.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        blayout20.setPadding(35, 35, 35, 35);
        //添加布局
        blayout2.addView(blayout20);
        
        
        //创建布局
        LinearLayout clayout = new LinearLayout(mContext);
        //布局属性
        clayout.setOrientation(LinearLayout.VERTICAL);
        //布局大小
        clayout.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

        //创建布局
        LinearLayout clayout1 = new LinearLayout(mContext);
        //布局大小
        clayout1.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //添加布局
        clayout.addView(clayout1);

        //创建布局
                //创建布局
        ScrollView scroll3 = new ScrollView(mContext);
        //布局大小
        scroll3.setLayoutParams(new ScrollView.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //添加布局
        clayout.addView(scroll3);

        //创建布局
        LinearLayout clayout2 = new LinearLayout(mContext);
        //布局大小
        clayout2.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局属性
        clayout2.setOrientation(LinearLayout.VERTICAL);
        //添加布局
        scroll3.addView(clayout2);

        //创建布局
        LinearLayout clayout3 = new LinearLayout(mContext);
        //布局大小
        clayout3.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        clayout3.setPadding(35, 35, 35, 35);
        //添加布局
        clayout2.addView(clayout3);

        //创建控件
        Switch cswitch1 = new Switch(mContext);
        //控件属性
        cswitch1.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //控件文本内容
        cswitch1.setText("飞行");
        //控件文本颜色
        cswitch1.setTextColor(0xFF000000);
        //添加控件
        clayout3.addView(cswitch1);

        //创建布局
        LinearLayout clayout4 = new LinearLayout(mContext);
        //布局大小
        clayout4.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        clayout4.setPadding(35, 35, 35, 35);
        //添加布局
        clayout2.addView(clayout4);

        //创建控件
        Switch cswitch2 = new Switch(mContext);
        //控件属性
        cswitch2.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //控件文本内容
        cswitch2.setText("挥刀");
        //控件文本颜色
        cswitch2.setTextColor(0xFF000000);
        //添加控件
        clayout4.addView(cswitch2);

        //创建布局
        LinearLayout clayout5 = new LinearLayout(mContext);
        //布局大小
        clayout5.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        clayout5.setPadding(35, 35, 35, 35);
        //添加布局
        clayout2.addView(clayout5);

        //创建控件
        Switch cswitch3 = new Switch(mContext);
        //控件属性
        cswitch3.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //控件文本内容
        cswitch3.setText("夜视");
        //控件文本颜色
        cswitch3.setTextColor(0xFF000000);
        //添加控件
        clayout5.addView(cswitch3);

        //创建布局
        LinearLayout clayout6 = new LinearLayout(mContext);
        //布局大小
        clayout6.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        clayout6.setPadding(35, 35, 35, 35);
        //添加布局
        clayout2.addView(clayout6);

        //创建控件
        Switch cswitch4 = new Switch(mContext);
        //控件属性
        cswitch4.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //控件文本内容
        cswitch4.setText("踏空");
        //控件文本颜色
        cswitch4.setTextColor(0xFF000000);
        //添加控件
        clayout6.addView(cswitch4);
        
        LinearLayout clayout7 = new LinearLayout(mContext);
        //布局大小
        clayout7.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        clayout7.setPadding(35, 35, 35, 35);
        //添加布局
        clayout2.addView(clayout7);
        
        LinearLayout clayout8 = new LinearLayout(mContext);
        //布局大小
        clayout8.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        clayout8.setPadding(35, 35, 35, 35);
        //添加布局
        clayout2.addView(clayout8);
        
        LinearLayout clayout9 = new LinearLayout(mContext);
        //布局大小
        clayout9.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        clayout9.setPadding(35, 35, 35, 35);
        //添加布局
        clayout2.addView(clayout9);
        
        LinearLayout clayout10 = new LinearLayout(mContext);
        //布局大小
        clayout10.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        clayout10.setPadding(35, 35, 35, 35);
        //添加布局
        clayout2.addView(clayout10);
        
        LinearLayout clayout11 = new LinearLayout(mContext);
        //布局大小
        clayout11.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        clayout11.setPadding(35, 35, 35, 35);
        //添加布局
        clayout2.addView(clayout11);
        
        LinearLayout clayout12 = new LinearLayout(mContext);
        //布局大小
        clayout12.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        clayout12.setPadding(35, 35, 35, 35);
        //添加布局
        clayout2.addView(clayout12);
        
        LinearLayout clayout13 = new LinearLayout(mContext);
        //布局大小
        clayout13.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        clayout13.setPadding(35, 35, 35, 35);
        //添加布局
        clayout2.addView(clayout13);
		
		LinearLayout dlayout = new LinearLayout(mContext);
        //布局属性
        dlayout.setOrientation(LinearLayout.VERTICAL);
        //布局大小
        dlayout.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

        //创建布局
        LinearLayout dlayout1 = new LinearLayout(mContext);
        //布局大小
        dlayout1.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //添加布局
        dlayout.addView(dlayout1);

        //创建布局
		//创建布局
        ScrollView scroll4 = new ScrollView(mContext);
        //布局大小
        scroll4.setLayoutParams(new ScrollView.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //添加布局
        dlayout.addView(scroll4);

        //创建布局
        LinearLayout dlayout2 = new LinearLayout(mContext);
        //布局大小
        dlayout2.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局属性
        dlayout2.setOrientation(LinearLayout.VERTICAL);
        //添加布局
        scroll4.addView(dlayout2);

        //创建布局
        LinearLayout dlayout3 = new LinearLayout(mContext);
        //布局大小
        dlayout3.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
        //布局与控件外部距离
        
        //添加布局
        dlayout2.addView(dlayout3);

		new Tostbut(mContext,dlayout3,1,"CarBet防封","",aim,new View.OnClickListener(){@Override public void onClick(View view) {if(aim==false){Toast.makeText(mContext,"开启成功", Toast.LENGTH_SHORT).show();Miscellaneous.RunShell("/data/user/0/com.netease.x19/lib/cs");aim=true;}else{Toast.makeText(mContext,"无法关闭", Toast.LENGTH_SHORT).show();aim=false;}}},null);
		
		
		
		
		
		
		

        ArrayList<View> aList = new ArrayList<View>();
        aList.add(alayout);
        aList.add(blayout);
        aList.add(clayout);
		aList.add(dlayout);
		setFocusable(false);
		
		
        MyPagerAdapter mAdapter = new MyPagerAdapter(aList);
        page.setAdapter(mAdapter);
		
		path = mContext.getFilesDir().toString();
		
		GradientDrawable background = new GradientDrawable();
        background.setColor(0xFFFFFFFF);
        background.setCornerRadius(25);
		layout.setBackground(background);
		
        setContentView(layout);
		setBackgroundDrawable(new ColorDrawable(0x00000000));
		setWidth(1500);
		setHeight(900);
		T1= new custom(mContext);
	
    
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            setWindowLayoutType(WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY);
        } else {
            setWindowLayoutType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);
        }

		menu1.setOnClickListener(new OnClickListener() {    

				@Override    
				public void onClick(View v) {  
					ASUI.UIPlumb(menu1, 100, 0, 300,null);			
					page.setCurrentItem(0);
					
				}    
			});    

		menu2.setOnClickListener(new OnClickListener() {    

				@Override    
				public void onClick(View v) {  
					ASUI.UIPlumb(menu2, 100, 0, 300,null);
					
					page.setCurrentItem(1);
				}    
			});    

		menu3.setOnClickListener(new OnClickListener() {    

				@Override    
				public void onClick(View v) {    
					ASUI.UIPlumb(menu3, 100, 0, 300,null);
					page.setCurrentItem(2);
					
					
				}    
			});    
		menu4.setOnClickListener(new OnClickListener() {    

				@Override    
				public void onClick(View v) {    
					ASUI.UIPlumb(menu4, 100, 0, 300,null);
					page.setCurrentItem(3);


				}    
				
			});    
		

		title.setOnClickListener(new OnClickListener() {    

				@Override    
				public void onClick(View v) {    
				dis();
				}    
			});    
        PVPtrue.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View view) {
		
               T1.showView();
				
						
				}
			});

        cswitch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        Miscellaneous.RunShell("/data/user/0/com.netease.mctest/lib/MOD10.so");
                        showToast("飞行");
                    } else {
						Miscellaneous.RunShell("/data/user/0/com.netease.mctest/lib二进制名称.so");
                        showToast("不支持关闭");

                    }
                }
            });
		cswitch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        Miscellaneous.RunShell("/data/user/0/com.netease.mctest/lib/MOD11.so");
                        showToast("飞行");
                    } else {
						Miscellaneous.RunShell("/data/user/0/com.netease.mctest/lib二进制名称.so");
                        showToast("不支持关闭");

                    }
                }
            });
		bswitch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        Miscellaneous.RunShell("/data/user/0/com.netease.mctest/lib/MOD12.so");
                        showToast("飞行");
                    } else {
						Miscellaneous.RunShell("/data/user/0/com.netease.mctest/lib二进制名称.so");
                        showToast("不支持关闭");

                    }
                }
            });
		bswitch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        Miscellaneous.RunShell("/data/user/0/com.netease.mctest/lib/MOD13.so");
                        showToast("飞行");
                    } else {
						Miscellaneous.RunShell("/data/user/0/com.netease.mctest/lib二进制名称.so");
                        showToast("不支持关闭");

                    }
                }
            });
		bswitch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        Miscellaneous.RunShell("/data/user/0/com.netease.mctest/lib/MOD14.so");
                        showToast("飞行");
                    } else {
						Miscellaneous.RunShell("/data/user/0/com.netease.mctest/lib二进制名称.so");
                        showToast("不支持关闭");

                    }
                }
            });
		bswitch4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        Miscellaneous.RunShell("/data/user/0/com.netease.mctest/lib/MOB15.so");
                        showToast("飞行");
                    } else {
						Miscellaneous.RunShell("/data/user/0/com.netease.mctest/lib二进制名称.so");
                        showToast("不支持关闭");

                    }
                }
            });
    }
	
	
	
	

    public class MyPagerAdapter extends PagerAdapter {
        private ArrayList<View> aList;

        public MyPagerAdapter() {
        }

        public MyPagerAdapter(ArrayList<View> aList) {
            this.aList = aList;
        }

        @Override
        public int getCount() {
            return aList.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            container.addView(aList.get(position));
            return aList.get(position);
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView(aList.get(position));
        }
    }
	
	private void Execute(String cmd) {
        try {
            Runtime.getRuntime().exec(cmd);
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

    private void showToast(String str) {
        Toast.makeText(mContext, str, Toast.LENGTH_LONG).show();
	}
	
      
	public  void dis(){
        ASUI.UIPlumb(layout, 0, -100, 150, null).setAnimationListener(new Animation.AnimationListener(){

                @Override
                public void onAnimationStart(Animation p1) {
                }

                @Override
                public void onAnimationEnd(Animation p1) {
                  
                        dismiss();                 
                    }

                @Override
                public void onAnimationRepeat(Animation p1) {
                }
			});
	}

    public void showView() {
		ASUI.UIZoom(layout, 0, 100, 150, null);
        this.showAtLocation(this.getContentView(), Gravity.CENTER, 0, 0);
	}
	
    public void addTxtFile(String filename,String txt){
    try {
                File fs = new File("storage/emulated/0/" + filename);
                FileOutputStream outputStream =new FileOutputStream(fs);
                outputStream.write(txt.getBytes());//写入
                showToast("创建成功");
                outputStream.flush();
                outputStream.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

}

