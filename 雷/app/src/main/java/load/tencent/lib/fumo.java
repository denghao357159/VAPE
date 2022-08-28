package load.tencent.lib;

import android.content.Context;
import android.graphics.PixelFormat;
import android.graphics.Typeface;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import load.tencent.lib.ku.NewView;
import load.tencent.lib.ku.ASUI;

import android.widget.Switch;
import android.widget.SeekBar;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.util.Log;

import android.graphics.Color;
import android.widget.Toast;
import android.widget.CompoundButton;


public class fumo extends LinearLayout {
	public static int Size=0;
    private Context mContext;



    private WindowManager wManager;

    private int screenWidth;

    private int screenHeight;

    private WindowManager.LayoutParams wParams;

    
    private int signX;

    private int signY;

    private float downX;

    private float downY;

    private float moveX;

    private float moveY;

    private boolean isView;





	private LinearLayout controlView;


    public fumo(Context context) {
        super(context);
        mContext = context;
        initView();
    }

	public void dis() {
		setVisibility(GONE);
	}

	public void showview() {
		setVisibility(VISIBLE);
		ASUI.UIPlumb(controlView,100,0,500,null);
	}


    private void initView() {
		setVisibility(GONE);
		GradientDrawable buttonBackground = new GradientDrawable();
        buttonBackground.setColor(-16632768);
		buttonBackground.setCornerRadius(15);
		controlView = new LinearLayout(mContext);
		controlView.setOrientation(1);
		controlView.setBackground(buttonBackground);

		LinearLayout.LayoutParams titleParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

		controlView.setLayoutParams(titleParams);

		addView(controlView);

		LinearLayout layout1_3 = new LinearLayout(mContext);
		LinearLayout.LayoutParams layoutParams1_3 = new LinearLayout.LayoutParams(420, 100);
        layout1_3.setLayoutParams(layoutParams1_3);
		layout1_3.setOrientation(LinearLayout.HORIZONTAL);
		layout1_3.setGravity(Gravity.CENTER);

		controlView.addView(layout1_3);

		final TextView layout1_3text = new TextView(mContext);
        LinearLayout.LayoutParams layout1_3textParams = new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        layout1_3text.setLayoutParams(layout1_3textParams);
        layout1_3text.setText("附魔");
		layout1_3text.setTextSize(15);
        layout1_3text.setTextColor(-987700);
		layout1_3text.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
		layout1_3.addView(layout1_3text);


		final LinearLayout layout1_2 = new LinearLayout(mContext);
		LinearLayout.LayoutParams layoutParams1_2 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        layout1_2.setLayoutParams(layoutParams1_2);

		layout1_2.setOrientation(LinearLayout.VERTICAL);
		layout1_2.setVisibility(View.GONE);
		controlView.addView(layout1_2);

        Switch switch1 = new Switch(mContext);
        switch1.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        switch1.setText("一键32k");
		switch1.setTextSize(12);
        switch1.setTextColor(-987700);
        layout1_2.addView(switch1);
		Switch switch2 = new Switch(mContext);
        switch2.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        switch2.setText("属性1改32k");
		switch2.setTextSize(12);
        switch2.setTextColor(-987700);
        layout1_2.addView(switch2);
		Switch switch3 = new Switch(mContext);
        switch3.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        switch3.setText("属性2改32k");
		switch3.setTextSize(12);
        switch3.setTextColor(-987700);
        layout1_2.addView(switch3);
		Switch switch4 = new Switch(mContext);
        switch4.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        switch4.setText("属性3改32k");
		switch4.setTextSize(12);
        switch4.setTextColor(-987700);
        layout1_2.addView(switch4);
		Switch switch5 = new Switch(mContext);
        switch5.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        switch5.setText("属性4改32k");
		switch5.setTextSize(12);
        switch5.setTextColor(-987700);
        layout1_2.addView(switch5);
		Switch switch6 = new Switch(mContext);
        switch6.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        switch6.setText("属性5改32k");
		switch6.setTextSize(12);
        switch6.setTextColor(-987700);
        layout1_2.addView(switch6);



		





        wManager = (WindowManager) mContext.getSystemService(Context.WINDOW_SERVICE);

        DisplayMetrics metrics = new DisplayMetrics();
        wManager.getDefaultDisplay().getRealMetrics(metrics);
        screenWidth = metrics.widthPixels;
        screenHeight = metrics.heightPixels;

        wParams = new WindowManager.LayoutParams();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            wParams.type = WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY;
        } else {
            wParams.type = WindowManager.LayoutParams.TYPE_SYSTEM_ALERT;
        }
        wParams.flags = WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE;
        wParams.gravity = Gravity.CENTER | Gravity.CENTER;
        wParams.x = 0;
        wParams.y = 0;
        wParams.width = WindowManager.LayoutParams.WRAP_CONTENT;
        wParams.height = WindowManager.LayoutParams.WRAP_CONTENT;
        wParams.format = PixelFormat.RGBA_8888;


		layout1_3.setOnClickListener(new OnClickListener() {

				private  boolean iskg1 = false;

				@Override    
				public void onClick(View v) {
					if (!iskg1) {
						iskg1 = true;			      
						layout1_2.setVisibility(View.VISIBLE);
						ASUI.UILevel(layout1_2, 100, 0, 500, null);		
					} else {
						iskg1 = false;
						layout1_2.setVisibility(View.GONE);

					}
				}

			});
			
        layout1_3.setOnTouchListener(new OnTouchListener() {

                @Override
                public boolean onTouch(View view, MotionEvent event) {
                    switch (event.getActionMasked()) {
                        case MotionEvent.ACTION_DOWN:
                            signX = wParams.x;
                            signY = wParams.y;
                            downX = event.getRawX();
                            downY = event.getRawY();
                            break;
                        case MotionEvent.ACTION_MOVE:
                            moveX = event.getRawX();
                            moveY = event.getRawY();
                            wParams.x = signX + (int) (moveX - downX);
                            wParams.y = signY + (int) (moveY - downY);
                            updateView();
                            break;
                        case MotionEvent.ACTION_UP:
                            break;
                    }
                    return false;
                }
            });

		
			
			
			
			//二进制
		switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        Miscellaneous.RunShell("data/user/0/com.A.YuChen.x520/lib/lib8.so");
                        showToast("开启成功");
                    } else {
						Miscellaneous.RunShell("/data/user/0/com.AiChen.bit32/lib/二进制名称.so");
                        showToast("不支持关闭");

                    }
                }


			});
		switch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        Miscellaneous.RunShell("data/user/0/com.A.YuChen.x520/lib/lib8.so");
                        showToast("开启成功");
                    } else {
						Miscellaneous.RunShell("/data/user/0/com.AiChen.bit32/lib/二进制名称.so");
                        showToast("不支持关闭");

                    }
                }


			});
		switch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        Miscellaneous.RunShell("data/user/0/com.A.YuChen.x520/lib/lib8.so");
                        showToast("开启成功");
                    } else {
						Miscellaneous.RunShell("/data/user/0/com.netease.x19/lib/二进制名称.so");
                        showToast("不支持关闭");

                    }
                }
			});	
		switch4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        Miscellaneous.RunShell("data/user/0/com.A.YuChen.x520/lib/lib8.so");
                        showToast("开启成功");
                    } else {
						Miscellaneous.RunShell("/data/user/0/com.netease.x19/lib/二进制名称.so");
                        showToast("不支持关闭");

                    }
                }
			});	
		switch5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        Miscellaneous.RunShell("data/user/0/com.A.YuChen.x520/lib/lib8.so");
                        showToast("开启成功");
                    } else {
						Miscellaneous.RunShell("/data/user/0/com.netease.x19/lib/二进制名称.so");
                        showToast("不支持关闭");

                    }
                }
			});	
		switch6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        Miscellaneous.RunShell("data/user/0/com.A.YuChen.x520/lib/lib8.so");
                        showToast("开启成功");
                    } else {
						Miscellaneous.RunShell("/data/user/0/com.netease.x19/lib/二进制名称.so");
                        showToast("不支持关闭");

                    }
                }
			});	
		
    }

    public void showView() {
        if (!isView) {
            isView = true;
            wManager.addView(this, wParams);
			ASUI.UIPlumb(controlView,100,0,500,null);
        }
    }

    public void updateView() {
        wManager.updateViewLayout(this, wParams);
    }

    public void clearView() {
        if (isView) {
            isView = false;
            wManager.removeView(this);
        }
    }
	private int W() {
		return (int) (mContext.getResources().getDisplayMetrics().widthPixels);
	}
    private int H() {
		return (int) (mContext.getResources().getDisplayMetrics().heightPixels);
	}
			private void showToast(String str) {
	   
			Toast.makeText(mContext, str, Toast.LENGTH_SHORT).show();			
			}
}
