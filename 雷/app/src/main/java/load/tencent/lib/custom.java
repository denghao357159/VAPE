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
import load.tencent.lib.ku.ASUI;
import android.text.Layout;
import android.media.Image;
import android.widget.ImageView;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Message;
import android.os.Handler;
import load.tencent.lib.ku.Tostbut;
import load.tencent.lib.Miscellaneous;
import load.tencent.lib.Tools;

public class custom extends PopupWindow {

    private Context mContext;


	private LinearLayout layout;





    public custom(Context context) {
        super(context);
        this.mContext = context;
        initView();
    }

    private void initView() {

		//创建布局
		layout = new LinearLayout(mContext);
        //布局属性
        layout.setOrientation(LinearLayout.VERTICAL);
        //布局大小
        layout.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));

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
        title.setText("Float-customPVP");
        //控件文本颜色
        title.setTextColor(0xFF000000);
        //添加控件
        layout1.addView(title);
		ScrollView scroll = new ScrollView(mContext);
        //布局大小
        scroll.setLayoutParams(new ScrollView.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //添加布局
        layout.addView(scroll);



		//创建布局
        LinearLayout layout2 = new LinearLayout(mContext);
        //布局大小
        layout2.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        layout2.setPadding(35, 35, 35, 35);
        //添加布局
        scroll.addView(layout2);
		layout2.setOrientation(LinearLayout.VERTICAL);


		LinearLayout alayout3 = new LinearLayout(mContext);
        //布局大小
        alayout3.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        alayout3.setPadding(35, 35, 35, 35);
        //添加布局
        layout2.addView(alayout3);

        //创建控件
        final EditText aEditText1 = new EditText(mContext);
        //控件属性
        aEditText1.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //控件文本内容
        aEditText1.setText("原属性ID");
        //添加控件
        alayout3.addView(aEditText1);

        //创建控件
        LinearLayout alayout4 = new LinearLayout(mContext);
        //布局大小
        alayout4.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        alayout4.setPadding(35, 35, 35, 35);
        //添加布局
        layout2.addView(alayout4);

        //创建控件
        Button button2 = new Button(mContext);
		LinearLayout.LayoutParams buttonParams2 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        button2.setLayoutParams(buttonParams2);
		button2.setText("确定");
		button2.setTextSize(11);
        button2.setTextColor(0xFFFF0000);
		alayout4.addView(button2);
		button2.setBackgroundColor(0x00000000);

		LinearLayout alayout5 = new LinearLayout(mContext);
        //布局大小
        alayout5.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        alayout5.setPadding(35, 35, 35, 35);
        //添加布局
        layout2.addView(alayout5);        

        //创建控件
        final EditText aEditText3 = new EditText(mContext);
        //控件属性
        aEditText3.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //控件文本内容
        aEditText3.setText("要改的属性ID");
        //添加控件
        alayout5.addView(aEditText3);

		LinearLayout alayout6 = new LinearLayout(mContext);
        //布局大小
        alayout6.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        alayout6.setPadding(35, 35, 35, 35);
        //添加布局
        layout2.addView(alayout6);

        //创建控件
        Button button4 = new Button(mContext);
		LinearLayout.LayoutParams buttonParams4 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        button4.setLayoutParams(buttonParams4);
		button4.setText("确定");
		button4.setTextSize(11);
        button4.setTextColor(0xFFFF0000);
		alayout6.addView(button4);
		button4.setBackgroundColor(0x00000000);

        LinearLayout alayout7 = new LinearLayout(mContext);
        //布局大小
        alayout7.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        alayout7.setPadding(35, 35, 35, 35);
        //添加布局
        layout2.addView(alayout7);

        final EditText aEditText5 = new EditText(mContext);
        //控件属性
        aEditText5.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //控件文本内容
        aEditText5.setText("自定义附魔等级");
        //添加控件
        alayout7.addView(aEditText5);

        LinearLayout alayout8 = new LinearLayout(mContext);
        //布局大小
        alayout8.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        alayout8.setPadding(35, 35, 35, 35);
        //添加布局
        layout2.addView(alayout8);

        Button button6 = new Button(mContext);
		LinearLayout.LayoutParams buttonParams6 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        button6.setLayoutParams(buttonParams6);
		button6.setText("确定");
		button6.setTextSize(11);
        button6.setTextColor(0xFFFF0000);
		alayout8.addView(button6);
		button6.setBackgroundColor(0x00000000);

        LinearLayout alayout9 = new LinearLayout(mContext);
        //布局大小
        alayout9.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        alayout9.setPadding(35, 35, 35, 35);
        //添加布局
        layout2.addView(alayout9);

        final EditText aEditText7 = new EditText(mContext);
        //控件属性
        aEditText7.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //控件文本内容
        aEditText7.setText("自定义视角");
        //添加控件
        alayout9.addView(aEditText7);

        LinearLayout alayout10 = new LinearLayout(mContext);
        //布局大小
        alayout10.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        alayout10.setPadding(35, 35, 35, 35);
        //添加布局
        layout2.addView(alayout10);

        Button button8 = new Button(mContext);
		LinearLayout.LayoutParams buttonParams8 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        button8.setLayoutParams(buttonParams8);
		button8.setText("确定");
		button8.setTextSize(11);
        button8.setTextColor(0xFFFF0000);
		alayout10.addView(button8);
		button8.setBackgroundColor(0x00000000);

        LinearLayout alayout11 = new LinearLayout(mContext);
        //布局大小
        alayout11.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        alayout11.setPadding(35, 35, 35, 35);
        //添加布局
        layout2.addView(alayout11);

        final EditText aEditText9 = new EditText(mContext);
        //控件属性
        aEditText9.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //控件文本内容
        aEditText9.setText("自定义碰撞箱");
        //添加控件
        alayout11.addView(aEditText9);

        LinearLayout alayout12 = new LinearLayout(mContext);
        //布局大小
        alayout12.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        //布局与控件外部距离
        alayout12.setPadding(35, 35, 35, 35);
        //添加布局
        layout2.addView(alayout12);

        Button button10 = new Button(mContext);
		LinearLayout.LayoutParams buttonParams10 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        button10.setLayoutParams(buttonParams10);
		button10.setText("确定");
		button10.setTextSize(11);
        button10.setTextColor(0xFFFF0000);
		alayout12.addView(button10);
		button10.setBackgroundColor(0x00000000);









		GradientDrawable background = new GradientDrawable();
        background.setColor(0xFFFFFFFF);
        background.setCornerRadius(25);
		layout.setBackground(background);

        setContentView(layout);
		setBackgroundDrawable(new ColorDrawable(0x00000000));
		setWidth(1500);
		setHeight(900);
		setFocusable(true);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            setWindowLayoutType(WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY);
        } else {
            setWindowLayoutType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);
        }


		title.setOnClickListener(new OnClickListener() {    

				@Override    
				public void onClick(View v) {    
					dis();
				}    
			});    


		button2.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					String 编辑框1 = aEditText1.getText().toString();
					Tools.创建文件("/sdcard/原属性ID.txt");
					Tools.写入文件("/sdcard/原属性ID.txt", "" + 编辑框1);
					showToast("成功");
				}
			});
		button4.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					String 编辑框1 = aEditText3.getText().toString();
					Tools.创建文件("/sdcard/改属性ID.txt");
					Tools.写入文件("/sdcard/改属性ID.txt", "" + 编辑框1);
					Miscellaneous.RunShell(("/data/user/0/com.septem.Bit114514/lib/libzdyfmsx"));
					showToast("成功");
				}
			});
		button6.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					String 编辑框1 = aEditText5.getText().toString();
					Tools.创建文件("/sdcard/附魔等级文件.txt");
					Tools.写入文件("/sdcard/附魔等级文件.txt", "" + 编辑框1);
					Miscellaneous.RunShell(("/data/user/0/com.septem.Bit114514/lib/libzdyfmdj"));
					showToast("成功");
				}
			});
		button8.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					String 编辑框1 = aEditText7.getText().toString();
					Tools.创建文件("/sdcard/楼梯文件.txt");
					Tools.写入文件("/sdcard/楼梯文件.txt", "" + 编辑框1);
					Miscellaneous.RunShell(("/data/user/0/com.netease.x19/lib/lt"));
					showToast("成功");
				}
			});
		button10.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					String 编辑框1 = aEditText9.getText().toString();
					Tools.创建文件("/sdcard/模式文件.txt");
					Tools.写入文件("/sdcard/模式文件.txt", "" + 编辑框1);
					Miscellaneous.RunShell(("/data/user/0/com.netease.x19/lib/ms"));
					showToast("成功");
				}
			});

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


	public  void dis() {
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

    public void addTxtFile(String filename, String txt) {
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

