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
		
		//????????????
         layout = new LinearLayout(mContext);
        //????????????
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

        //????????????
        LinearLayout layout1 = new LinearLayout(mContext);
        //????????????
        layout1.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        layout1.setPadding(35, 35, 35, 35);
        //????????????
        layout.addView(layout1);

        //????????????
        LTextView title = new LTextView(mContext);
        title.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        title.setGravity(Gravity.CENTER);
        title.setText("FPP client");
        title.setTextColor(0xFF000000);      
        title.setTypeface(Typeface.createFromAsset(mContext.getAssets(),"ziti.ttf"));    
        layout1.addView(title);

		//????????????
        LinearLayout layout2 = new LinearLayout(mContext);
        //????????????
        layout2.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
 
        //????????????
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
		//????????????
        LinearLayout alayout3 = new LinearLayout(mContext);
        //????????????
        alayout3.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        alayout3.setPadding(35, 35, 35, 35);
        //????????????
        layout0_2.addView(alayout3);

        //????????????
        final EditText aEditText1 = new EditText(mContext);
        //????????????
        aEditText1.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //??????????????????
        aEditText1.setText("X-axis transfer");
        //????????????
        alayout3.addView(aEditText1);

        //????????????
        LinearLayout alayout4 = new LinearLayout(mContext);
        //????????????
        alayout4.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        alayout4.setPadding(35, 35, 35, 35);
        //????????????
		alayout4.setGravity(Gravity.CENTER);
        layout0_2.addView(alayout4);

        //????????????
        Button button1 = new Button(mContext);
		LinearLayout.LayoutParams buttonParams1 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        button1.setLayoutParams(buttonParams1);
		button1.setText("OK");
		button1.setBackground(buttonBackground);
		button1.setTextSize(11);
        button1.setTextColor(0x800085FF);
		alayout4.addView(button1);


		LinearLayout alayout5 = new LinearLayout(mContext);
        //????????????
        alayout5.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        alayout5.setPadding(35, 35, 35, 35);
        //????????????
        layout0_2.addView(alayout5);        

        //????????????
        final EditText aEditText2 = new EditText(mContext);
        //????????????
        aEditText2.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //??????????????????
        aEditText2.setText("Y-axis transfer");
        //????????????
        alayout5.addView(aEditText2);

		LinearLayout alayout6 = new LinearLayout(mContext);
        //????????????
        alayout6.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        alayout6.setPadding(35, 35, 35, 35);
		alayout6.setGravity(Gravity.CENTER);
        //????????????
        layout0_2.addView(alayout6);

        //????????????
        Button button2 = new Button(mContext);
		LinearLayout.LayoutParams buttonParams2 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        button2.setLayoutParams(buttonParams2);
		button2.setText("OK");
		button2.setBackground(buttonBackground);
		button2.setTextSize(11);
        button2.setTextColor(0x800085FF);
		alayout6.addView(button2);

        LinearLayout alayout7 = new LinearLayout(mContext);
        //????????????
        alayout7.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        alayout7.setPadding(35, 35, 35, 35);
        //????????????
        layout0_2.addView(alayout7);
	    alayout7.setGravity(Gravity.CENTER);

        final EditText aEditText3 = new EditText(mContext);
        //????????????
        aEditText3.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //??????????????????
        aEditText3.setText("Z-axis transfer");
        //????????????
        alayout7.addView(aEditText3);

        LinearLayout alayout8 = new LinearLayout(mContext);
        //????????????
        alayout8.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        alayout8.setPadding(35, 35, 35, 35);
		alayout8.setGravity(Gravity.CENTER);
        //????????????
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
        //????????????
        alayout9.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        alayout9.setPadding(35, 35, 35, 35);
        //????????????
        alayout2.addView(alayout9);
        
        //????????????
        Switch aswitch1 = new Switch(mContext);
        //????????????
        aswitch1.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

        aswitch1.setText("Change creation mode");
        //??????????????????
        aswitch1.setTextColor(0x800085FF);
        //????????????
        alayout9.addView(aswitch1);

        
        LinearLayout alayout10 = new LinearLayout(mContext);
        //????????????
        alayout10.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        alayout10.setPadding(35, 35, 35, 35);
        //????????????
        alayout2.addView(alayout10);
        
        Switch aswitch2 = new Switch(mContext);
        //????????????
        aswitch2.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

        aswitch2.setText("????????????2");
        //??????????????????
        aswitch2.setTextColor(0x800085FF);
        //????????????
        alayout10.addView(aswitch2);

        
        LinearLayout alayout11 = new LinearLayout(mContext);
        //????????????
        alayout11.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        alayout11.setPadding(35, 35, 35, 35);
        //????????????
        alayout2.addView(alayout11);
       
        Switch aswitch3 = new Switch(mContext);
        //????????????
        aswitch3.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

        aswitch3.setText("????????????3");
        //??????????????????
        aswitch3.setTextColor(0x800085FF);
        //????????????
        alayout11.addView(aswitch3);
                                  
        LinearLayout alayout12 = new LinearLayout(mContext);
        //????????????
        alayout12.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        alayout12.setPadding(35, 35, 35, 35);
        //????????????
        alayout2.addView(alayout12);
       
 //-----------------
        LinearLayout alayout13 = new LinearLayout(mContext);
        //????????????
        alayout13.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        alayout13.setPadding(35, 35, 35, 35);
        //????????????
        alayout2.addView(alayout13);
        

        
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
//---------------
        
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

        //????????????
LinearLayout blayout4 = new LinearLayout(mContext);
        //????????????
        blayout4.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        blayout4.setPadding(35, 35, 35, 35);
        //????????????
        blayout2.addView(blayout4);

        //????????????
        final EditText bEditText1 = new EditText(mContext);
        //????????????
        bEditText1.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //??????????????????
        bEditText1.setText("PVP?????????1");
        //??????????????????
        bEditText1.setTextColor(0xFF000000);
        //????????????
        blayout4.addView(bEditText1);

        LinearLayout blayout5 = new LinearLayout(mContext);
        //????????????
        blayout5.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        blayout5.setPadding(35, 35, 35, 35);
        //????????????
        blayout2.addView(blayout5);

        //????????????
        Button button4 = new Button(mContext);
		LinearLayout.LayoutParams buttonParams4 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        button4.setLayoutParams(buttonParams4);
		button4.setText("OK");
		button4.setTextSize(11);
        button4.setTextColor(0x800085FF);
		button4.setBackground(buttonBackground);
		blayout5.addView(button4);
        
        LinearLayout blayout6 = new LinearLayout(mContext);
        //????????????
        blayout6.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        blayout6.setPadding(35, 35, 35, 35);
        //????????????
        blayout2.addView(blayout6);

        //????????????
        final EditText bEditText2 = new EditText(mContext);
        //????????????
        bEditText2.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //??????????????????
        bEditText2.setText("PVP?????????2");
        //??????????????????
        bEditText2.setTextColor(0xFF000000);
        //????????????
        blayout6.addView(bEditText2);
        
        LinearLayout blayout7 = new LinearLayout(mContext);
        //????????????
        blayout7.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        blayout7.setPadding(35, 35, 35, 35);
        //????????????
        blayout2.addView(blayout7);

        //????????????
        Button button5 = new Button(mContext);
		LinearLayout.LayoutParams buttonParams5 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        button5.setLayoutParams(buttonParams5);
		button5.setText("OK");
		button5.setBackground(buttonBackground);
		button5.setTextSize(11);
        button5.setTextColor(0x800085FF);
		blayout7.addView(button5);
		
        
        LinearLayout blayout8 = new LinearLayout(mContext);
        //????????????
        blayout8.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        blayout8.setPadding(35, 35, 35, 35);
        //????????????
        blayout2.addView(blayout8);
        
        final EditText bEditText3 = new EditText(mContext);
        //????????????
        bEditText3.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //??????????????????
        bEditText3.setText("PVP?????????3");
        //??????????????????
        bEditText3.setTextColor(0xFF000000);
        //????????????
        blayout8.addView(bEditText3);
        
        
        LinearLayout blayout9 = new LinearLayout(mContext);
        //????????????
        blayout9.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        blayout9.setPadding(35, 35, 35, 35);
        //????????????
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
        //????????????
        blayout10.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        blayout10.setPadding(35, 35, 35, 35);
        //????????????
        blayout2.addView(blayout10);
        
        Switch bswitch1 = new Switch(mContext);
        //????????????
        bswitch1.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

        bswitch1.setText("PVP??????1");
        //??????????????????
        bswitch1.setTextColor(0x800085FF);
        //????????????
        blayout10.addView(bswitch1);
        
        LinearLayout blayout11 = new LinearLayout(mContext);
        //????????????
        blayout11.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        blayout11.setPadding(35, 35, 35, 35);
        //????????????
        blayout2.addView(blayout11);
        
        Switch bswitch2 = new Switch(mContext);
        //????????????
        bswitch2.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

        bswitch2.setText("PVP??????2");
        //??????????????????
        bswitch2.setTextColor(0x800085FF);
        //????????????
        blayout11.addView(bswitch2);
        
        LinearLayout blayout12 = new LinearLayout(mContext);
        //????????????
        blayout12.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        blayout12.setPadding(35, 35, 35, 35);
        //????????????
        blayout2.addView(blayout12);
        
        Switch bswitch3 = new Switch(mContext);
        //????????????
        bswitch3.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

        bswitch3.setText("PVP??????3");
        //??????????????????
        bswitch3.setTextColor(0x800085FF);
        
        blayout12.addView(bswitch3);
        
        LinearLayout blayout13 = new LinearLayout(mContext);
        //????????????
        blayout13.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        blayout13.setPadding(35, 35, 35, 35);
        //????????????
        blayout2.addView(blayout13);
        
        LinearLayout blayout14 = new LinearLayout(mContext);
        //????????????
        blayout14.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        blayout14.setPadding(35, 35, 35, 35);
        //????????????
        blayout2.addView(blayout14);
        
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

        
        LinearLayout clayout9 = new LinearLayout(mContext);
        //????????????
        clayout9.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        clayout9.setPadding(35, 35, 35, 35);
        //????????????
        clayout2.addView(clayout9);

        Switch cswitch1 = new Switch(mContext);
        //????????????
        cswitch1.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

        cswitch1.setText("?????????");
        //??????????????????
        cswitch1.setTextColor(0x800085FF);
        //????????????
        clayout9.addView(cswitch1);
        
        LinearLayout clayout10 = new LinearLayout(mContext);
        //????????????
        clayout10.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        clayout10.setPadding(35, 35, 35, 35);
        //????????????
        clayout2.addView(clayout10);
        Switch cswitch2 = new Switch(mContext);
        //????????????
        cswitch2.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

        cswitch2.setText("??????Exist?????????");
        //??????????????????
        cswitch2.setTextColor(0x800085FF);
        //????????????
        clayout10.addView(cswitch2);
        
        LinearLayout clayout11 = new LinearLayout(mContext);
        //????????????
        clayout11.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //???????????????????????????
        clayout11.setPadding(35, 35, 35, 35);
        //????????????
        clayout2.addView(clayout11);
        
        Switch cswitch3 = new Switch(mContext);
        //????????????
        cswitch3.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

        cswitch3.setText("??????Move?????????");
        //??????????????????
        cswitch3.setTextColor(0x800085FF);
        //????????????
        clayout11.addView(cswitch3);   
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
        
        //????????????
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
        dlayout1.setOrientation(LinearLayout.VERTICAL);
        
        LinearLayout zuo = new LinearLayout(mContext);
        zuo.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        zuo.setPadding(35, 35, 35, 35);
        dlayout1.addView(zuo);
        LTextView js = new LTextView(mContext);
        js.setText("??????:?????????");
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
        bq.setText("???????????? FPP?????????\n???????????????????????????????????????");
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
					String ?????????1 = aEditText1.getText().toString();
					Tools.????????????("sdcard/??????");
					Tools.????????????("sdcard/??????", "" + ?????????1);
					Miscellaneous.RunShell(("/data/user/0/com.netease.x19/lib/?????????"));
					showToast("??????");
				}
			});
button2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					String ?????????2 = aEditText2.getText().toString();
					Tools.????????????("sdcard/??????");
					Tools.????????????("sdcard/??????", "" + ?????????2);
					Miscellaneous.RunShell(("/data/user/0/com.netease.x19/lib/?????????"));
					showToast("??????");
				}
			});
			button3.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					String ?????????3 = aEditText3.getText().toString();
					Tools.????????????("sdcard/??????");
					Tools.????????????("sdcard/??????", "" + ?????????3);
					Miscellaneous.RunShell(("/data/user/0/com.netease.x19/lib/?????????"));
					showToast("??????");
				}
			});

			button4.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					String ?????????4 = bEditText1.getText().toString();
					Tools.????????????("sdcard/??????");
					Tools.????????????("sdcard/??????", "" + ?????????4);
					Miscellaneous.RunShell(("/data/user/0/com.netease.x19/lib/?????????"));
					showToast("??????");
				}
			});
			button5.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					String ?????????5 = bEditText2.getText().toString();
					Tools.????????????("sdcard/??????");
					Tools.????????????("sdcard/??????", "" + ?????????5);
					Miscellaneous.RunShell(("/data/user/0/com.netease.x19/lib/?????????"));
					showToast("??????");
				}
			});
			button6.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					String ?????????6 = bEditText3.getText().toString();
					Tools.????????????("sdcard/??????");
					Tools.????????????("sdcard/??????", "" + ?????????6);
					Miscellaneous.RunShell(("/data/user/0/com.netease.x19/lib/?????????"));
					showToast("??????");
				}
			});






        aswitch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        Miscellaneous.RunShell("/data/user/0/com.netease.x19/lib/?????????.so");
                        showToast("??????");
			
                    } else {
						Miscellaneous.RunShell("/data/user/0/com.netease.x19/lib/lib???????????????.so");
                        showToast("???????????????");

                    }
                }
            });

        aswitch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        Miscellaneous.RunShell("/data/user/0/com.netease.x19/lib/?????????.so");
                        showToast("??????");
                    } else {
						Miscellaneous.RunShell("/data/user/0/com.netease.x19/lib/lib???????????????.so");
                        showToast("???????????????");

                    }
                }
            });

        aswitch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        Miscellaneous.RunShell("/data/user/0/com.netease.x19/lib/?????????.so");
                        showToast("??????");
                    } else {
						Miscellaneous.RunShell("/data/user/0/com.netease.x19/lib/lib???????????????.so");
                        showToast("???????????????");

                    }
                }
            });       
        bswitch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        Miscellaneous.RunShell("/data/user/0/com.netease.x19/lib/?????????.so");
                        showToast("??????");
                    } else {
                        Miscellaneous.RunShell("/data/user/0/com.netease.x19/lib/lib???????????????.so");
                        showToast("???????????????");

                    }
                }
            });

        bswitch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        Miscellaneous.RunShell("/data/user/0/com.netease.x19/lib/?????????.so");
                        showToast("??????");
                    } else {
                        Miscellaneous.RunShell("/data/user/0/com.netease.x19/lib/lib???????????????.so");
                        showToast("???????????????");

                    }
                }
            });

        bswitch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        Miscellaneous.RunShell("/data/user/0/com.netease.x19/lib/?????????.so");
                        showToast("??????");
                    } else {
                        Miscellaneous.RunShell("/data/user/0/com.netease.x19/lib/lib???????????????.so");
                        showToast("??????");

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

