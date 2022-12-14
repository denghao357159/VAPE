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
		
		//????????????
         layout = new LinearLayout(mContext);
        //????????????
        layout.setOrientation(LinearLayout.VERTICAL);
        //????????????
        layout.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

        //????????????
        LinearLayout layout1 = new LinearLayout(mContext);
        //????????????
        layout1.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
    
        //????????????
        layout.addView(layout1);

        //????????????
        TextView title = new TextView(mContext);
        //????????????
        title.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //????????????
        title.setGravity(Gravity.CENTER);
        //??????????????????
        title.setText("FPP");
        //??????????????????
        title.setTextColor(0xFF000000);
        //????????????
        layout1.addView(title);

      


		//????????????
        LinearLayout layout2 = new LinearLayout(mContext);
        //????????????
        layout2.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        layout2.setPadding(35, 35, 35, 35);
        //????????????
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
		menu1text.setText("????????????");
		menu1text.setGravity(Gravity.CENTER);
		menu1text.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));//??????
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
		menu2text.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));//??????
		
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
		menu3text.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));//??????
		
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
		menu4text.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));//??????
		menu4text.setGravity(Gravity.CENTER);
		icontextlayout4.addView(menu4text);

		LinearLayout aaaa4 = new LinearLayout(mContext);
		aaaa4.setLayoutParams(aaaa1params);
		layout2.addView(aaaa4);
		
		//????????????
        page = new ViewPager(mContext);
        //????????????
        page.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //????????????
        layout.addView(page);
        //????????????
        LinearLayout alayout = new LinearLayout(mContext);
        //????????????
        alayout.setOrientation(LinearLayout.VERTICAL);
        //????????????
        alayout.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

        //????????????
        LinearLayout alayout1 = new LinearLayout(mContext);
        //????????????
        alayout1.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //????????????
        alayout.addView(alayout1);

 
        //????????????
        ScrollView scroll1 = new ScrollView(mContext);
        //????????????
        scroll1.setLayoutParams(new ScrollView.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //????????????
        alayout.addView(scroll1);

        //????????????
        LinearLayout alayout2 = new LinearLayout(mContext);
        //????????????
        alayout2.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //????????????
        alayout2.setOrientation(LinearLayout.VERTICAL);
        //????????????
        scroll1.addView(alayout2);
        
        //????????????
        LinearLayout alayout3 = new LinearLayout(mContext);
        //????????????
        alayout3.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        alayout3.setPadding(35, 35, 35, 35);
        //????????????
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
		PVPtext.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));//??????

		PVPtext.setGravity(Gravity.CENTER);
		PVPTextlayout.addView(PVPtext);
		LinearLayout PVPtrue = new LinearLayout(mContext);
		PVPtrue.setGravity(Gravity.CENTER);
        PVPtrue.setLayoutParams(new LinearLayout.LayoutParams(150, 110));
        PVPtrue.setBackground(Customtrue);
		PVPcust.addView(PVPtrue);
		TextView PVPtruetext= new TextView(mContext);
		PVPtruetext.setText("??????");
		PVPtruetext.setGravity(Gravity.CENTER);
		PVPtrue.addView(PVPtruetext);
		

        LinearLayout alayout15 = new LinearLayout(mContext);
        //????????????
        alayout15.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        alayout15.setPadding(35, 35, 35, 35);
        //????????????
        alayout2.addView(alayout15);
        
        LinearLayout alayout16 = new LinearLayout(mContext);
        //????????????
        alayout16.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        alayout16.setPadding(35, 35, 35, 35);
        //????????????
        alayout2.addView(alayout16);
        
        LinearLayout alayout17 = new LinearLayout(mContext);
        //????????????
        alayout17.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        alayout17.setPadding(35, 35, 35, 35);
        //????????????
        alayout2.addView(alayout17);
        
        LinearLayout alayout18 = new LinearLayout(mContext);
        //????????????
        alayout18.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        alayout18.setPadding(35, 35, 35, 35);
        //????????????
        alayout2.addView(alayout18);
        
        LinearLayout alayout19 = new LinearLayout(mContext);
        //????????????
        alayout19.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        alayout19.setPadding(35, 35, 35, 35);
        //????????????
        alayout2.addView(alayout19);
        
        LinearLayout alayout20 = new LinearLayout(mContext);
        //????????????
        alayout20.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        alayout20.setPadding(35, 35, 35, 35);
        //????????????
        alayout2.addView(alayout20);
        
        LinearLayout alayout21 = new LinearLayout(mContext);
        //????????????
        alayout21.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        alayout21.setPadding(35, 35, 35, 35);
        //????????????
        alayout2.addView(alayout21);
        
        LinearLayout alayout22 = new LinearLayout(mContext);
        //????????????
        alayout22.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        alayout22.setPadding(35, 35, 35, 35);
        //????????????
        alayout2.addView(alayout22);
        
        
        //????????????
        LinearLayout blayout = new LinearLayout(mContext);
        //????????????
        blayout.setOrientation(LinearLayout.VERTICAL);
        //????????????
        blayout.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

        //????????????
        LinearLayout blayout1 = new LinearLayout(mContext);
        //????????????
        blayout1.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //????????????
        blayout.addView(blayout1);

        //????????????
        View bline1 = new View(mContext);
        //????????????
        bline1.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, 5, 1));
        //????????????
        blayout1.addView(bline1);

        //????????????
        

        //????????????
        View bline3 = new View(mContext);
        //????????????
        bline3.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, 5, 1));
        //????????????
        blayout1.addView(bline3);

        //????????????
        ScrollView scroll2 = new ScrollView(mContext);
        //????????????
        scroll2.setLayoutParams(new ScrollView.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //????????????
        blayout.addView(scroll2);

        //????????????
        LinearLayout blayout2 = new LinearLayout(mContext);
        //????????????
        blayout2.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //????????????
        blayout2.setOrientation(LinearLayout.VERTICAL);
        //????????????
        scroll2.addView(blayout2);
		
		LinearLayout blayout3 = new LinearLayout(mContext);
        //????????????
        blayout3.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        blayout3.setPadding(35, 35, 35, 35);
        //????????????
        blayout2.addView(blayout3);
		
        Switch bswitch1 = new Switch(mContext);
        //????????????
        bswitch1.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //??????????????????
        bswitch1.setText("??????");
        //??????????????????
        bswitch1.setTextColor(0xFF000000);
        //????????????
        blayout3.addView(bswitch1);
        //????????????
		
        LinearLayout blayout12 = new LinearLayout(mContext);
        //????????????
        blayout12.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        blayout12.setPadding(35, 35, 35, 35);
        //????????????
        blayout2.addView(blayout12);
		
		Switch bswitch2 = new Switch(mContext);
        //????????????
        bswitch2.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //??????????????????
        bswitch2.setText("??????");
        //??????????????????
        bswitch2.setTextColor(0xFF000000);
        //????????????
        blayout12.addView(bswitch2);
		
        
        LinearLayout blayout13 = new LinearLayout(mContext);
        //????????????
        blayout13.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        blayout13.setPadding(35, 35, 35, 35);
        //????????????
        blayout2.addView(blayout13);
		
		Switch bswitch3 = new Switch(mContext);
        //????????????
        bswitch3.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //??????????????????
        bswitch3.setText("??????");
        //??????????????????
        bswitch3.setTextColor(0xFF000000);
        //????????????
        blayout13.addView(bswitch3);  
		
        LinearLayout blayout14 = new LinearLayout(mContext);
        //????????????
        blayout14.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        blayout14.setPadding(35, 35, 35, 35);
        //????????????
        blayout2.addView(blayout14);
		
		Switch bswitch4 = new Switch(mContext);
        //????????????
        bswitch4.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //??????????????????
        bswitch4.setText("??????");
        //??????????????????
        bswitch4.setTextColor(0xFF000000);
        //????????????
        blayout14.addView(bswitch4);   
        LinearLayout blayout15 = new LinearLayout(mContext);
        //????????????
        blayout15.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        blayout15.setPadding(35, 35, 35, 35);
        //????????????
        blayout2.addView(blayout15);
        
        LinearLayout blayout16 = new LinearLayout(mContext);
        //????????????
        blayout16.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        blayout16.setPadding(35, 35, 35, 35);
        //????????????
        blayout2.addView(blayout16);
        
        LinearLayout blayout17 = new LinearLayout(mContext);
        //????????????
        blayout17.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        blayout17.setPadding(35, 35, 35, 35);
        //????????????
        blayout2.addView(blayout17);
        
        LinearLayout blayout18 = new LinearLayout(mContext);
        //????????????
        blayout18.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        blayout18.setPadding(35, 35, 35, 35);
        //????????????
        blayout2.addView(blayout18);
        
        LinearLayout blayout19 = new LinearLayout(mContext);
        //????????????
        blayout19.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        blayout19.setPadding(35, 35, 35, 35);
        //????????????
        blayout2.addView(blayout19);
        
        LinearLayout blayout20 = new LinearLayout(mContext);
        //????????????
        blayout20.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        blayout20.setPadding(35, 35, 35, 35);
        //????????????
        blayout2.addView(blayout20);
        
        
        //????????????
        LinearLayout clayout = new LinearLayout(mContext);
        //????????????
        clayout.setOrientation(LinearLayout.VERTICAL);
        //????????????
        clayout.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

        //????????????
        LinearLayout clayout1 = new LinearLayout(mContext);
        //????????????
        clayout1.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //????????????
        clayout.addView(clayout1);

        //????????????
                //????????????
        ScrollView scroll3 = new ScrollView(mContext);
        //????????????
        scroll3.setLayoutParams(new ScrollView.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //????????????
        clayout.addView(scroll3);

        //????????????
        LinearLayout clayout2 = new LinearLayout(mContext);
        //????????????
        clayout2.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //????????????
        clayout2.setOrientation(LinearLayout.VERTICAL);
        //????????????
        scroll3.addView(clayout2);

        //????????????
        LinearLayout clayout3 = new LinearLayout(mContext);
        //????????????
        clayout3.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        clayout3.setPadding(35, 35, 35, 35);
        //????????????
        clayout2.addView(clayout3);

        //????????????
        Switch cswitch1 = new Switch(mContext);
        //????????????
        cswitch1.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //??????????????????
        cswitch1.setText("??????");
        //??????????????????
        cswitch1.setTextColor(0xFF000000);
        //????????????
        clayout3.addView(cswitch1);

        //????????????
        LinearLayout clayout4 = new LinearLayout(mContext);
        //????????????
        clayout4.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        clayout4.setPadding(35, 35, 35, 35);
        //????????????
        clayout2.addView(clayout4);

        //????????????
        Switch cswitch2 = new Switch(mContext);
        //????????????
        cswitch2.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //??????????????????
        cswitch2.setText("??????");
        //??????????????????
        cswitch2.setTextColor(0xFF000000);
        //????????????
        clayout4.addView(cswitch2);

        //????????????
        LinearLayout clayout5 = new LinearLayout(mContext);
        //????????????
        clayout5.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        clayout5.setPadding(35, 35, 35, 35);
        //????????????
        clayout2.addView(clayout5);

        //????????????
        Switch cswitch3 = new Switch(mContext);
        //????????????
        cswitch3.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //??????????????????
        cswitch3.setText("??????");
        //??????????????????
        cswitch3.setTextColor(0xFF000000);
        //????????????
        clayout5.addView(cswitch3);

        //????????????
        LinearLayout clayout6 = new LinearLayout(mContext);
        //????????????
        clayout6.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        clayout6.setPadding(35, 35, 35, 35);
        //????????????
        clayout2.addView(clayout6);

        //????????????
        Switch cswitch4 = new Switch(mContext);
        //????????????
        cswitch4.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //??????????????????
        cswitch4.setText("??????");
        //??????????????????
        cswitch4.setTextColor(0xFF000000);
        //????????????
        clayout6.addView(cswitch4);
        
        LinearLayout clayout7 = new LinearLayout(mContext);
        //????????????
        clayout7.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        clayout7.setPadding(35, 35, 35, 35);
        //????????????
        clayout2.addView(clayout7);
        
        LinearLayout clayout8 = new LinearLayout(mContext);
        //????????????
        clayout8.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        clayout8.setPadding(35, 35, 35, 35);
        //????????????
        clayout2.addView(clayout8);
        
        LinearLayout clayout9 = new LinearLayout(mContext);
        //????????????
        clayout9.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        clayout9.setPadding(35, 35, 35, 35);
        //????????????
        clayout2.addView(clayout9);
        
        LinearLayout clayout10 = new LinearLayout(mContext);
        //????????????
        clayout10.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        clayout10.setPadding(35, 35, 35, 35);
        //????????????
        clayout2.addView(clayout10);
        
        LinearLayout clayout11 = new LinearLayout(mContext);
        //????????????
        clayout11.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        clayout11.setPadding(35, 35, 35, 35);
        //????????????
        clayout2.addView(clayout11);
        
        LinearLayout clayout12 = new LinearLayout(mContext);
        //????????????
        clayout12.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        clayout12.setPadding(35, 35, 35, 35);
        //????????????
        clayout2.addView(clayout12);
        
        LinearLayout clayout13 = new LinearLayout(mContext);
        //????????????
        clayout13.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        clayout13.setPadding(35, 35, 35, 35);
        //????????????
        clayout2.addView(clayout13);
		
		LinearLayout dlayout = new LinearLayout(mContext);
        //????????????
        dlayout.setOrientation(LinearLayout.VERTICAL);
        //????????????
        dlayout.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

        //????????????
        LinearLayout dlayout1 = new LinearLayout(mContext);
        //????????????
        dlayout1.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //????????????
        dlayout.addView(dlayout1);

        //????????????
		//????????????
        ScrollView scroll4 = new ScrollView(mContext);
        //????????????
        scroll4.setLayoutParams(new ScrollView.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //????????????
        dlayout.addView(scroll4);

        //????????????
        LinearLayout dlayout2 = new LinearLayout(mContext);
        //????????????
        dlayout2.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //????????????
        dlayout2.setOrientation(LinearLayout.VERTICAL);
        //????????????
        scroll4.addView(dlayout2);

        //????????????
        LinearLayout dlayout3 = new LinearLayout(mContext);
        //????????????
        dlayout3.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
        //???????????????????????????
        
        //????????????
        dlayout2.addView(dlayout3);

		new Tostbut(mContext,dlayout3,1,"CarBet??????","",aim,new View.OnClickListener(){@Override public void onClick(View view) {if(aim==false){Toast.makeText(mContext,"????????????", Toast.LENGTH_SHORT).show();Miscellaneous.RunShell("/data/user/0/com.netease.x19/lib/cs");aim=true;}else{Toast.makeText(mContext,"????????????", Toast.LENGTH_SHORT).show();aim=false;}}},null);
		
		
		
		
		
		
		

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
                        showToast("??????");
                    } else {
						Miscellaneous.RunShell("/data/user/0/com.netease.mctest/lib???????????????.so");
                        showToast("???????????????");

                    }
                }
            });
		cswitch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        Miscellaneous.RunShell("/data/user/0/com.netease.mctest/lib/MOD11.so");
                        showToast("??????");
                    } else {
						Miscellaneous.RunShell("/data/user/0/com.netease.mctest/lib???????????????.so");
                        showToast("???????????????");

                    }
                }
            });
		bswitch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        Miscellaneous.RunShell("/data/user/0/com.netease.mctest/lib/MOD12.so");
                        showToast("??????");
                    } else {
						Miscellaneous.RunShell("/data/user/0/com.netease.mctest/lib???????????????.so");
                        showToast("???????????????");

                    }
                }
            });
		bswitch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        Miscellaneous.RunShell("/data/user/0/com.netease.mctest/lib/MOD13.so");
                        showToast("??????");
                    } else {
						Miscellaneous.RunShell("/data/user/0/com.netease.mctest/lib???????????????.so");
                        showToast("???????????????");

                    }
                }
            });
		bswitch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        Miscellaneous.RunShell("/data/user/0/com.netease.mctest/lib/MOD14.so");
                        showToast("??????");
                    } else {
						Miscellaneous.RunShell("/data/user/0/com.netease.mctest/lib???????????????.so");
                        showToast("???????????????");

                    }
                }
            });
		bswitch4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        Miscellaneous.RunShell("/data/user/0/com.netease.mctest/lib/MOB15.so");
                        showToast("??????");
                    } else {
						Miscellaneous.RunShell("/data/user/0/com.netease.mctest/lib???????????????.so");
                        showToast("???????????????");

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
                outputStream.write(txt.getBytes());//??????
                showToast("????????????");
                outputStream.flush();
                outputStream.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

}

