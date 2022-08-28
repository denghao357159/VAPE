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
import load.tencent.lib.ku.LTextView;
import android.graphics.Typeface;
import android.widget.ImageView;
import android.graphics.BitmapFactory;
import android.graphics.Bitmap;
import load.tencent.lib.ku.ASUI;
import android.text.Layout;
import android.view.animation.Animation;
import android.widget.SeekBar;
import android.util.Log;
import android.transition.Visibility;

public class FloatContentView extends PopupWindow {
public static int Size=0;
	public static int Size2=0;
    private Context mContext;

	private ViewPager page;
private HitBox hitbox;
	private String path;
	private PVP pvp;
	private MOVE move;
	private Exist exist;
    
    private ImageView controlView1;
    private ImageView controlView;
    private ImageView controlView2;

    private LinearLayout layout;
    public FloatContentView(Context context) {
        super(context);
        this.mContext = context;
        initView();
    }


    private void initView() {
		GradientDrawable buttonBackground = new GradientDrawable();
        buttonBackground.setColor(0x00000000);
		buttonBackground.setCornerRadius(30);
        buttonBackground.setStroke(5, 0x800085FF);
		
		GradientDrawable buttonBackground1 = new GradientDrawable();
        buttonBackground1.setColor(0x00000000);
		buttonBackground1.setCornerRadius(40);
        buttonBackground1.setStroke(5, 0x800085FF);
		
		//创建布局
         layout = new LinearLayout(mContext);
        //布局属性
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

        //创建布局
        LinearLayout layout1 = new LinearLayout(mContext);
        //布局大小
        layout1.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        layout1.setPadding(35, 35, 35, 35);
        //添加布局
        layout.addView(layout1);

        //创建控件
        LTextView title = new LTextView(mContext);
        title.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        title.setGravity(Gravity.CENTER);
        title.setText("FPP client");
        title.setTextColor(0xFF000000);      
        title.setTypeface(Typeface.createFromAsset(mContext.getAssets(),"ziti.ttf"));    
        layout1.addView(title);

		//创建布局
        LinearLayout layout2 = new LinearLayout(mContext);
        //布局大小
        layout2.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
 
        //添加布局
        layout.addView(layout2);

		LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT, 1);
	

		TextView menu1 = new TextView(mContext);
		menu1.setLayoutParams(params);
		menu1.setText("Exist");
        menu1.setTextColor(0x800085FF);
	
		layout2.addView(menu1);

		TextView menu2 = new TextView(mContext);
		menu2.setLayoutParams(params);
		menu2.setText("PVP");
		menu2.setTextColor(0x800085FF);
	
		layout2.addView(menu2);

		TextView menu3 = new TextView(mContext);
		menu3.setLayoutParams(params);
		menu3.setText("set");
		menu3.setTextColor(0x800085FF);
	
		layout2.addView(menu3);
        
        TextView menu4 = new TextView(mContext);
        menu4.setLayoutParams(params);
        menu4.setText("about");
        menu4.setTextColor(0x800085FF);

		layout2.addView(menu4);

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
		
		LinearLayout layout2c = new LinearLayout(mContext);
		LinearLayout.LayoutParams layoutParams0 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        layout2c.setLayoutParams(layoutParams0);
		layout2c.setOrientation(LinearLayout.VERTICAL);
		layout2c.setPadding(20, 20, 20, 20);
		alayout2.addView(layout2c);

		LinearLayout layout0_0 = new LinearLayout(mContext);
		LinearLayout.LayoutParams layoutParams0_0 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        layout0_0.setLayoutParams(layoutParams0_0);
		layout0_0.setOrientation(LinearLayout.HORIZONTAL);
		layout2c.addView(layout0_0);

		TextView title3 = new TextView(mContext);
		LinearLayout.LayoutParams title3Params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
		title3.setLayoutParams(title3Params);
		title3.setText("Custom");
		title3.setTextSize(10);
        title3.setTextColor(0x800085FF);
		title3.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
		layout0_0.addView(title3);

		final LinearLayout layout0_2 = new LinearLayout(mContext);
		LinearLayout.LayoutParams layoutParams0_2 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        layout0_2.setLayoutParams(layoutParams0_2);
		layout0_2.setOrientation(LinearLayout.VERTICAL);
		layout0_2.setVisibility(View.GONE);
		layout2c.addView(layout0_2);

        Switch aswitch0_1 = new Switch(mContext);
        aswitch0_1.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        aswitch0_1.setText("initialization");
		aswitch0_1.setTextSize(10);
        aswitch0_1.setTextColor(0xFF000000);
        layout0_2.addView(aswitch0_1);
		//创建控件
        LinearLayout alayout3 = new LinearLayout(mContext);
        //布局大小
        alayout3.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        alayout3.setPadding(35, 35, 35, 35);
        //添加布局
        layout0_2.addView(alayout3);

        //创建控件
        final EditText aEditText1 = new EditText(mContext);
        //控件属性
        aEditText1.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //控件文本内容
        aEditText1.setText("X-axis transfer");
        //添加控件
        alayout3.addView(aEditText1);

        //创建控件
        LinearLayout alayout4 = new LinearLayout(mContext);
        //布局大小
        alayout4.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        alayout4.setPadding(35, 35, 35, 35);
        //添加布局
		alayout4.setGravity(Gravity.CENTER);
        layout0_2.addView(alayout4);

        //创建控件
        Button button1 = new Button(mContext);
		LinearLayout.LayoutParams buttonParams1 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        button1.setLayoutParams(buttonParams1);
		button1.setText("OK");
		button1.setBackground(buttonBackground);
		button1.setTextSize(11);
        button1.setTextColor(0x800085FF);
		alayout4.addView(button1);


		LinearLayout alayout5 = new LinearLayout(mContext);
        //布局大小
        alayout5.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        alayout5.setPadding(35, 35, 35, 35);
        //添加布局
        layout0_2.addView(alayout5);        

        //创建控件
        final EditText aEditText2 = new EditText(mContext);
        //控件属性
        aEditText2.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //控件文本内容
        aEditText2.setText("Y-axis transfer");
        //添加控件
        alayout5.addView(aEditText2);

		LinearLayout alayout6 = new LinearLayout(mContext);
        //布局大小
        alayout6.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        alayout6.setPadding(35, 35, 35, 35);
		alayout6.setGravity(Gravity.CENTER);
        //添加布局
        layout0_2.addView(alayout6);

        //创建控件
        Button button2 = new Button(mContext);
		LinearLayout.LayoutParams buttonParams2 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        button2.setLayoutParams(buttonParams2);
		button2.setText("OK");
		button2.setBackground(buttonBackground);
		button2.setTextSize(11);
        button2.setTextColor(0x800085FF);
		alayout6.addView(button2);

        LinearLayout alayout7 = new LinearLayout(mContext);
        //布局大小
        alayout7.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        alayout7.setPadding(35, 35, 35, 35);
        //添加布局
        layout0_2.addView(alayout7);
	    alayout7.setGravity(Gravity.CENTER);

        final EditText aEditText3 = new EditText(mContext);
        //控件属性
        aEditText3.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //控件文本内容
        aEditText3.setText("Z-axis transfer");
        //添加控件
        alayout7.addView(aEditText3);

        LinearLayout alayout8 = new LinearLayout(mContext);
        //布局大小
        alayout8.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        alayout8.setPadding(35, 35, 35, 35);
		alayout8.setGravity(Gravity.CENTER);
        //添加布局
        layout0_2.addView(alayout8);

        Button button3 = new Button(mContext);
		LinearLayout.LayoutParams buttonParams3 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        button3.setLayoutParams(buttonParams3);
		button3.setText("OK");
		button3.setBackground(buttonBackground);
		button3.setTextSize(11);
        button3.setTextColor(0x800085FF);
		alayout8.addView(button3);



	

		LinearLayout layout0_3 = new LinearLayout(mContext);
		LinearLayout.LayoutParams layoutParams0_3 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 60);
        layout0_3.setLayoutParams(layoutParams0_3);
		layout0_3.setOrientation(LinearLayout.HORIZONTAL);
		layout0_3.setBackground(buttonBackground1);
		layout0_3.setGravity(Gravity.CENTER);
		layout2c.addView(layout0_3);

		final TextView layout0_3text = new TextView(mContext);
        LinearLayout.LayoutParams layout0_3textParams = new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        layout0_3text.setLayoutParams(layout0_3textParams);
        layout0_3text.setText("Open");
		layout0_3text.setTextSize(10);
        layout0_3text.setTextColor(0x800085FF);
		layout0_3text.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
		layout0_3.addView(layout0_3text);
		
        
  
		
		
        LinearLayout alayout9 = new LinearLayout(mContext);
        //布局大小
        alayout9.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        alayout9.setPadding(35, 35, 35, 35);
        //添加布局
        alayout2.addView(alayout9);
        
        //创建控件
        Switch aswitch1 = new Switch(mContext);
        //控件属性
        aswitch1.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

        aswitch1.setText("Change creation mode");
        //控件文本颜色
        aswitch1.setTextColor(0x800085FF);
        //添加控件
        alayout9.addView(aswitch1);

        
        LinearLayout alayout10 = new LinearLayout(mContext);
        //布局大小
        alayout10.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        alayout10.setPadding(35, 35, 35, 35);
        //添加布局
        alayout2.addView(alayout10);
        
        Switch aswitch2 = new Switch(mContext);
        //控件属性
        aswitch2.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

        aswitch2.setText("生存功能2");
        //控件文本颜色
        aswitch2.setTextColor(0x800085FF);
        //添加控件
        alayout10.addView(aswitch2);

        
        LinearLayout alayout11 = new LinearLayout(mContext);
        //布局大小
        alayout11.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        alayout11.setPadding(35, 35, 35, 35);
        //添加布局
        alayout2.addView(alayout11);
       
        Switch aswitch3 = new Switch(mContext);
        //控件属性
        aswitch3.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

        aswitch3.setText("生存功能3");
        //控件文本颜色
        aswitch3.setTextColor(0x800085FF);
        //添加控件
        alayout11.addView(aswitch3);
                                  
        LinearLayout alayout12 = new LinearLayout(mContext);
        //布局大小
        alayout12.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        alayout12.setPadding(35, 35, 35, 35);
        //添加布局
        alayout2.addView(alayout12);
       
 //-----------------
        LinearLayout alayout13 = new LinearLayout(mContext);
        //布局大小
        alayout13.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        alayout13.setPadding(35, 35, 35, 35);
        //添加布局
        alayout2.addView(alayout13);
        

        
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
//---------------
        
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
		LinearLayout layout1c = new LinearLayout(mContext);
		LinearLayout.LayoutParams layoutParams1 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        layout1c.setLayoutParams(layoutParams1);
		layout1c.setOrientation(LinearLayout.VERTICAL);
		layout1c.setPadding(20, 20, 20, 20);
		blayout2.addView(layout1c);
		
		LinearLayout layout1_1 = new LinearLayout(mContext);
		LinearLayout.LayoutParams layoutParams1_1 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        layout1_1.setLayoutParams(layoutParams1_1);
		layout1_1.setOrientation(LinearLayout.HORIZONTAL);
		layout1c.addView(layout1_1);

		TextView title2 = new TextView(mContext);
		LinearLayout.LayoutParams title2Params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
		title2.setLayoutParams(title2Params);
		title2.setText("hitBoxes");
		title2.setTextSize(10);
        title2.setTextColor(0x800085FF);
		title2.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
		layout1_1.addView(title2);

		final LinearLayout layout1_2 = new LinearLayout(mContext);
		LinearLayout.LayoutParams layoutParams1_2 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        layout1_2.setLayoutParams(layoutParams1_2);
		layout1_2.setOrientation(LinearLayout.VERTICAL);
		layout1_2.setVisibility(View.GONE);
		layout1c.addView(layout1_2);

        Switch bswitch0_1 = new Switch(mContext);
        bswitch0_1.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        bswitch0_1.setText("initialization");
		bswitch0_1.setTextSize(10);
        bswitch0_1.setTextColor(0xFF000000);
        layout1_2.addView(bswitch0_1);

   


		SeekBar SeekBar = new SeekBar(mContext);
        LinearLayout.LayoutParams SeekBarParams = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        SeekBar.setLayoutParams(SeekBarParams);
        SeekBar.setPadding(10, 10, 10, 10);
		SeekBar.setMin(0);
		SeekBar.setMax(10);
		SeekBar.setProgress(0);
	

		final TextView SeekBartext = new TextView(mContext);
        LinearLayout.LayoutParams SeekBartextParams = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        SeekBartext.setLayoutParams(SeekBartextParams);
        SeekBartext.setText("hitBox width Size:0");
		SeekBartext.setTextSize(10);
        SeekBartext.setTextColor(0xFF000000);
		layout1_2.addView(SeekBartext);
	    layout1_2.addView(SeekBar);
		SeekBar SeekBar2 = new SeekBar(mContext);
        LinearLayout.LayoutParams SeekBarParams2 = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        SeekBar2.setLayoutParams(SeekBarParams2);
        SeekBar2.setPadding(10, 10, 10, 10);
		SeekBar2.setMin(0);
		SeekBar2.setMax(10);
		SeekBar2.setProgress(0);


		final TextView SeekBartext2 = new TextView(mContext);
        LinearLayout.LayoutParams SeekBartextParams2 = new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        SeekBartext2.setLayoutParams(SeekBartextParams2);
        SeekBartext2.setText("hitBox height Size:0");
		SeekBartext2.setTextSize(10);
        SeekBartext2.setTextColor(0xFF000000);
		layout1_2.addView(SeekBartext2);
	    layout1_2.addView(SeekBar2);
		
		
		LinearLayout layout1_3 = new LinearLayout(mContext);
		LinearLayout.LayoutParams layoutParams1_3 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 60);
        layout1_3.setLayoutParams(layoutParams1_3);
		layout1_3.setOrientation(LinearLayout.HORIZONTAL);
		layout1_3.setBackground(buttonBackground1);
		layout1_3.setGravity(Gravity.CENTER);
		layout1c.addView(layout1_3);

		final TextView layout1_3text = new TextView(mContext);
        LinearLayout.LayoutParams layout1_3textParams = new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        layout1_3text.setLayoutParams(layout1_3textParams);
        layout1_3text.setText("Open");
		layout1_3text.setTextSize(10);
        layout1_3text.setTextColor(0x800085FF);
		layout1_3text.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
		layout1_3.addView(layout1_3text);

        //创建布局
LinearLayout blayout4 = new LinearLayout(mContext);
        //布局大小
        blayout4.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        blayout4.setPadding(35, 35, 35, 35);
        //添加布局
        blayout2.addView(blayout4);

        //创建控件
        final EditText bEditText1 = new EditText(mContext);
        //控件属性
        bEditText1.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //控件文本内容
        bEditText1.setText("PVP自定义1");
        //控件文本颜色
        bEditText1.setTextColor(0xFF000000);
        //添加控件
        blayout4.addView(bEditText1);

        LinearLayout blayout5 = new LinearLayout(mContext);
        //布局大小
        blayout5.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        blayout5.setPadding(35, 35, 35, 35);
        //添加布局
        blayout2.addView(blayout5);

        //创建控件
        Button button4 = new Button(mContext);
		LinearLayout.LayoutParams buttonParams4 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        button4.setLayoutParams(buttonParams4);
		button4.setText("OK");
		button4.setTextSize(11);
        button4.setTextColor(0x800085FF);
		button4.setBackground(buttonBackground);
		blayout5.addView(button4);
        
        LinearLayout blayout6 = new LinearLayout(mContext);
        //布局大小
        blayout6.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        blayout6.setPadding(35, 35, 35, 35);
        //添加布局
        blayout2.addView(blayout6);

        //创建控件
        final EditText bEditText2 = new EditText(mContext);
        //控件属性
        bEditText2.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //控件文本内容
        bEditText2.setText("PVP自定义2");
        //控件文本颜色
        bEditText2.setTextColor(0xFF000000);
        //添加控件
        blayout6.addView(bEditText2);
        
        LinearLayout blayout7 = new LinearLayout(mContext);
        //布局大小
        blayout7.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        blayout7.setPadding(35, 35, 35, 35);
        //添加布局
        blayout2.addView(blayout7);

        //创建控件
        Button button5 = new Button(mContext);
		LinearLayout.LayoutParams buttonParams5 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        button5.setLayoutParams(buttonParams5);
		button5.setText("OK");
		button5.setBackground(buttonBackground);
		button5.setTextSize(11);
        button5.setTextColor(0x800085FF);
		blayout7.addView(button5);
		
        
        LinearLayout blayout8 = new LinearLayout(mContext);
        //布局大小
        blayout8.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        blayout8.setPadding(35, 35, 35, 35);
        //添加布局
        blayout2.addView(blayout8);
        
        final EditText bEditText3 = new EditText(mContext);
        //控件属性
        bEditText3.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //控件文本内容
        bEditText3.setText("PVP自定义3");
        //控件文本颜色
        bEditText3.setTextColor(0xFF000000);
        //添加控件
        blayout8.addView(bEditText3);
        
        
        LinearLayout blayout9 = new LinearLayout(mContext);
        //布局大小
        blayout9.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        blayout9.setPadding(35, 35, 35, 35);
        //添加布局
        blayout2.addView(blayout9);
        
        Button button6 = new Button(mContext);
		LinearLayout.LayoutParams buttonParams6 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        button6.setLayoutParams(buttonParams6);
		button6.setText("OK");
		button6.setTextSize(11);
        button6.setTextColor(0x800085FF);
		button6.setBackground(buttonBackground);
		blayout9.addView(button6);
		
        
        LinearLayout blayout10 = new LinearLayout(mContext);
        //布局大小
        blayout10.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        blayout10.setPadding(35, 35, 35, 35);
        //添加布局
        blayout2.addView(blayout10);
        
        Switch bswitch1 = new Switch(mContext);
        //控件属性
        bswitch1.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

        bswitch1.setText("PVP功能1");
        //控件文本颜色
        bswitch1.setTextColor(0x800085FF);
        //添加控件
        blayout10.addView(bswitch1);
        
        LinearLayout blayout11 = new LinearLayout(mContext);
        //布局大小
        blayout11.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        blayout11.setPadding(35, 35, 35, 35);
        //添加布局
        blayout2.addView(blayout11);
        
        Switch bswitch2 = new Switch(mContext);
        //控件属性
        bswitch2.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

        bswitch2.setText("PVP功能2");
        //控件文本颜色
        bswitch2.setTextColor(0x800085FF);
        //添加控件
        blayout11.addView(bswitch2);
        
        LinearLayout blayout12 = new LinearLayout(mContext);
        //布局大小
        blayout12.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        blayout12.setPadding(35, 35, 35, 35);
        //添加布局
        blayout2.addView(blayout12);
        
        Switch bswitch3 = new Switch(mContext);
        //控件属性
        bswitch3.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

        bswitch3.setText("PVP功能3");
        //控件文本颜色
        bswitch3.setTextColor(0x800085FF);
        
        blayout12.addView(bswitch3);
        
        LinearLayout blayout13 = new LinearLayout(mContext);
        //布局大小
        blayout13.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        blayout13.setPadding(35, 35, 35, 35);
        //添加布局
        blayout2.addView(blayout13);
        
        LinearLayout blayout14 = new LinearLayout(mContext);
        //布局大小
        blayout14.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        blayout14.setPadding(35, 35, 35, 35);
        //添加布局
        blayout2.addView(blayout14);
        
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

        
        LinearLayout clayout9 = new LinearLayout(mContext);
        //布局大小
        clayout9.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        clayout9.setPadding(35, 35, 35, 35);
        //添加布局
        clayout2.addView(clayout9);

        Switch cswitch1 = new Switch(mContext);
        //控件属性
        cswitch1.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

        cswitch1.setText("初始化");
        //控件文本颜色
        cswitch1.setTextColor(0x800085FF);
        //添加控件
        clayout9.addView(cswitch1);
        
        LinearLayout clayout10 = new LinearLayout(mContext);
        //布局大小
        clayout10.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        clayout10.setPadding(35, 35, 35, 35);
        //添加布局
        clayout2.addView(clayout10);
        Switch cswitch2 = new Switch(mContext);
        //控件属性
        cswitch2.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

        cswitch2.setText("加载Exist悬浮窗");
        //控件文本颜色
        cswitch2.setTextColor(0x800085FF);
        //添加控件
        clayout10.addView(cswitch2);
        
        LinearLayout clayout11 = new LinearLayout(mContext);
        //布局大小
        clayout11.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        clayout11.setPadding(35, 35, 35, 35);
        //添加布局
        clayout2.addView(clayout11);
        
        Switch cswitch3 = new Switch(mContext);
        //控件属性
        cswitch3.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

        cswitch3.setText("加载Move悬浮窗");
        //控件文本颜色
        cswitch3.setTextColor(0x800085FF);
        //添加控件
        clayout11.addView(cswitch3);   
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
        
        //创建布局
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
        dlayout1.setOrientation(LinearLayout.VERTICAL);
        
        LinearLayout zuo = new LinearLayout(mContext);
        zuo.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        zuo.setPadding(35, 35, 35, 35);
        dlayout1.addView(zuo);
        LTextView js = new LTextView(mContext);
        js.setText("作者:疯婆婆");
        js.setTextSize(11);
        js.setTextColor(0xFF4D4DFF); 
        zuo.addView(js);
        controlView = new ImageView(mContext);
        try {
            InputStream mInputStream = mContext.getAssets().open("gan.png");
            Bitmap bitmap = BitmapFactory.decodeStream(mInputStream);
            controlView.setImageBitmap(bitmap);
        } catch (IOException e) {
            e.printStackTrace();
        }
        zuo.addView(controlView, 100, 100);

        controlView1 = new ImageView(mContext);
        try {
            InputStream mInputStream = mContext.getAssets().open("gan1.png");
            Bitmap bitmap = BitmapFactory.decodeStream(mInputStream);
            controlView1.setImageBitmap(bitmap);
        } catch (IOException e) {
            e.printStackTrace();
        }
        zuo.addView(controlView1, 100, 100);

        controlView2 = new ImageView(mContext);
        try {
            InputStream mInputStream = mContext.getAssets().open("gan2.png");
            Bitmap bitmap = BitmapFactory.decodeStream(mInputStream);
            controlView2.setImageBitmap(bitmap);
        } catch (IOException e) {
            e.printStackTrace();
        }
        zuo.addView(controlView2, 100, 100);
        
        LinearLayout zuo1 = new LinearLayout(mContext);
        zuo1.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        zuo1.setPadding(35, 35, 35, 35);
        dlayout1.addView(zuo1);
        LTextView bq = new LTextView(mContext);
        bq.setText("版权所有 FPP工作室\n如有倒卖二改行为，发现严惩");
        bq.setTextSize(11);
        bq.setTextColor(0xFF4D4DFF); 
        zuo1.addView(bq);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            setWindowLayoutType(WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY);
        
        } else {
            
        setWindowLayoutType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);
        }



        ArrayList<View> aList = new ArrayList<View>();
        aList.add(alayout);
        aList.add(blayout);
        aList.add(clayout);
        aList.add(dlayout);
        MyPagerAdapter mAdapter = new MyPagerAdapter(aList);
        page.setAdapter(mAdapter);
		
		path = mContext.getFilesDir().toString();
		
		GradientDrawable background = new GradientDrawable();
        background.setColor(0xFFFFFFFF);
        background.setCornerRadius(30);
		layout.setBackground(background);
		
        setContentView(layout);
		setBackgroundDrawable(new ColorDrawable(0x00000000));
		setWidth(600);
		setHeight(900);
        
        setFocusable(true);
       

		menu1.setOnClickListener(new OnClickListener() {    

				@Override    
				public void onClick(View v) {    
					page.setCurrentItem(0);
				}    
			});    

		menu2.setOnClickListener(new OnClickListener() {    

				@Override    
				public void onClick(View v) {    
					page.setCurrentItem(1);
				}    
			});    

		menu3.setOnClickListener(new OnClickListener() {    

				@Override    
				public void onClick(View v) {    
					page.setCurrentItem(2);
				}    
			});    
        menu4.setOnClickListener(new OnClickListener() {    

                @Override    
                public void onClick(View v) {    
                    page.setCurrentItem(3);
                    }    
                    }); 
		layout1_3.setOnClickListener(new OnClickListener() {

				private  boolean iskg1 = false;

				@Override    
				public void onClick(View v) {
					if (!iskg1) {
						iskg1 = true;
						layout1_2.setVisibility(View.VISIBLE);
						layout1_3text.setText("Take Back");
					} else {
						iskg1 = false;
						layout1_2.setVisibility(View.GONE);
						layout1_3text.setText("Open");

					}
				}
				
			});
		layout0_3.setOnClickListener(new OnClickListener() {

				private  boolean iskg2 = false;

				@Override    
				public void onClick(View v) {
					if (!iskg2) {
						iskg2 = true;
						layout0_2.setVisibility(View.VISIBLE);
						layout0_3text.setText("Take Back");
					} else {
						iskg2 = false;
						layout0_2.setVisibility(View.GONE);
						layout0_3text.setText("Open");

					}
				}

			});
		
        SeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
				@Override
				public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
					Log.e("xyh", "onProgressChanged: " + progress + "");

					Size = progress;
	
			
					SeekBartext.setText("hitBox width Size:"+Size);		
					//SaveText("/sdcard/BFORNORNG/deviation",py+"/");
				}
				@Override
				public void onStartTrackingTouch(SeekBar seekBar) {
				}

				@Override
				public void onStopTrackingTouch(SeekBar seekBar) {

				}
			});
		SeekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
				@Override
				public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
					Log.e("xyh", "onProgressChanged: " + progress + "");

					Size2 = progress;


					SeekBartext2.setText("hitBox height Size:"+Size2);		
					//SaveText("/sdcard/BFORNORNG/deviation",py+"/");
				}
				@Override
				public void onStartTrackingTouch(SeekBar seekBar) {
				}

				@Override
				public void onStopTrackingTouch(SeekBar seekBar) {

				}
			});
          
			button1.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					String 编辑框1 = aEditText1.getText().toString();
					Tools.创建文件("sdcard/文件");
					Tools.写入文件("sdcard/文件", "" + 编辑框1);
					Miscellaneous.RunShell(("/data/user/0/com.netease.x19/lib/二进制"));
					showToast("成功");
				}
			});
button2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					String 编辑框2 = aEditText2.getText().toString();
					Tools.创建文件("sdcard/文件");
					Tools.写入文件("sdcard/文件", "" + 编辑框2);
					Miscellaneous.RunShell(("/data/user/0/com.netease.x19/lib/二进制"));
					showToast("成功");
				}
			});
			button3.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					String 编辑框3 = aEditText3.getText().toString();
					Tools.创建文件("sdcard/文件");
					Tools.写入文件("sdcard/文件", "" + 编辑框3);
					Miscellaneous.RunShell(("/data/user/0/com.netease.x19/lib/二进制"));
					showToast("成功");
				}
			});

			button4.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					String 编辑框4 = bEditText1.getText().toString();
					Tools.创建文件("sdcard/文件");
					Tools.写入文件("sdcard/文件", "" + 编辑框4);
					Miscellaneous.RunShell(("/data/user/0/com.netease.x19/lib/二进制"));
					showToast("成功");
				}
			});
			button5.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					String 编辑框5 = bEditText2.getText().toString();
					Tools.创建文件("sdcard/文件");
					Tools.写入文件("sdcard/文件", "" + 编辑框5);
					Miscellaneous.RunShell(("/data/user/0/com.netease.x19/lib/二进制"));
					showToast("成功");
				}
			});
			button6.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					String 编辑框6 = bEditText3.getText().toString();
					Tools.创建文件("sdcard/文件");
					Tools.写入文件("sdcard/文件", "" + 编辑框6);
					Miscellaneous.RunShell(("/data/user/0/com.netease.x19/lib/二进制"));
					showToast("成功");
				}
			});






        aswitch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        Miscellaneous.RunShell("/data/user/0/com.netease.x19/lib/二进制.so");
                        showToast("测试");
			
                    } else {
						Miscellaneous.RunShell("/data/user/0/com.netease.x19/lib/lib二进制名称.so");
                        showToast("不支持关闭");

                    }
                }
            });

        aswitch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        Miscellaneous.RunShell("/data/user/0/com.netease.x19/lib/二进制.so");
                        showToast("测试");
                    } else {
						Miscellaneous.RunShell("/data/user/0/com.netease.x19/lib/lib二进制名称.so");
                        showToast("不支持关闭");

                    }
                }
            });

        aswitch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        Miscellaneous.RunShell("/data/user/0/com.netease.x19/lib/二进制.so");
                        showToast("测试");
                    } else {
						Miscellaneous.RunShell("/data/user/0/com.netease.x19/lib/lib二进制名称.so");
                        showToast("不支持关闭");

                    }
                }
            });       
        bswitch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        Miscellaneous.RunShell("/data/user/0/com.netease.x19/lib/二进制.so");
                        showToast("测试");
                    } else {
                        Miscellaneous.RunShell("/data/user/0/com.netease.x19/lib/lib二进制名称.so");
                        showToast("不支持关闭");

                    }
                }
            });

        bswitch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        Miscellaneous.RunShell("/data/user/0/com.netease.x19/lib/二进制.so");
                        showToast("测试");
                    } else {
                        Miscellaneous.RunShell("/data/user/0/com.netease.x19/lib/lib二进制名称.so");
                        showToast("不支持关闭");

                    }
                }
            });

        bswitch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        Miscellaneous.RunShell("/data/user/0/com.netease.x19/lib/二进制.so");
                        showToast("测试");
                    } else {
                        Miscellaneous.RunShell("/data/user/0/com.netease.x19/lib/lib二进制名称.so");
                        showToast("测试");

                    }
                }
            });       
        
        cswitch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

				

                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
						hitbox= new HitBox(mContext);
						if (hitbox != null) {}
						
                    } else {
                        pvp.clearView();

                    }
                }
            });

        cswitch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
						exist= new Exist(mContext);
						if (exist != null) {}
						exist.showView();
                    } else {
exist.clearView();

                    }
                }
            });

        cswitch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
		                move= new MOVE(mContext);
			       
						if (move != null) {}
			        
						move.showView();
                    } else {
 move.clearView();
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
        Toast.makeText(mContext, str, Toast.LENGTH_SHORT).show();
	}


    public void showView() {
        
        this.showAtLocation(this.getContentView(), Gravity.RIGHT, 0, 0);
      
		ASUI.UIFadein(layout , 0, 500 ,300);
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

