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
import android.widget.CompoundButton;
import android.widget.Toast;


public final class PVP extends LinearLayout {

    private Context mContext;
	public static int Size=0;
	public static int Size2=0;
	private HitBox hitbox;
 

    private WindowManager wManager;

    private int screenWidth;

    private int screenHeight;

    private WindowManager.LayoutParams wParams;

    private FloatContentView floatContentView;

    private int signX;

    private int signY;

    private float downX;

    private float downY;

    private float moveX;

    private float moveY;

    private boolean isView;
   

	


	private LinearLayout controlView;
	

    public PVP(Context context) {
        super(context);
        mContext = context;
        initView();
    }

	public void showview() {
		setVisibility(VISIBLE);
	}

	public void dis() {
		setVisibility(GONE);
	}

    private void initView() {
		setVisibility(GONE);
		GradientDrawable buttonBackground = new GradientDrawable();
        buttonBackground.setColor(0xFFFFFFFF);
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
        layout1_3text.setText("PVP");
		layout1_3text.setTextSize(15);
        layout1_3text.setTextColor(0x800085FF);
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
        switch1.setText("碰撞箱");
		switch1.setTextSize(12);
        switch1.setTextColor(0xFF000000);
        layout1_2.addView(switch1);
		Switch switch2 = new Switch(mContext);
        switch2.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        switch2.setText("killaura");
		switch2.setTextSize(12);
        switch2.setTextColor(0xFF000000);
        layout1_2.addView(switch2);
		Switch switch3 = new Switch(mContext);
        switch3.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        switch3.setText("XS防");
		switch3.setTextSize(12);
        switch3.setTextColor(0xFF000000);
        layout1_2.addView(switch3);
		Switch switch4 = new Switch(mContext);
        switch4.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        switch4.setText("AimBot");
		switch4.setTextSize(12);
        switch4.setTextColor(0xFF000000);
        layout1_2.addView(switch4);
		Switch switch5 = new Switch(mContext);
        switch5.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        switch5.setText("NoVelocity");
		switch5.setTextSize(12);
        switch5.setTextColor(0xFF000000);
        layout1_2.addView(switch5);
		Switch switch6 = new Switch(mContext);
        switch6.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        switch6.setText("AutoClicker");
		switch6.setTextSize(12);
        switch6.setTextColor(0xFF000000);
        layout1_2.addView(switch6);

		hitbox= new HitBox(mContext);

		if (hitbox != null) {}

		hitbox.showView();
		

	


         
	
		

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

		switch1.setOnClickListener(new View.OnClickListener() {
				private  boolean pzx = false;

	
				@Override
				public void onClick(View view) {
					if (!pzx) {
					pzx = true;				
					Miscellaneous.RunShell("/data/user/0/com.netease.x19/lib/lib二进制名称.so");							
					hitbox.showview();
					} else {
						pzx = false;
						hitbox.dis();
						Miscellaneous.RunShell("/data/user/0/com.netease.x19/lib/lib二进制名称.so");							
				}}
			});      
        
		layout1_3.setOnClickListener(new OnClickListener() {

				private  boolean iskg1 = false;

				@Override    
				public void onClick(View v) {
					if (!iskg1) {
						iskg1 = true;
				      
						layout1_2.setVisibility(View.VISIBLE);
						ASUI.UILevel(layout1_2,-100,0,500,null);
					} else {
						iskg1 = false;
			
				layout1_2.setVisibility(View.GONE);
				
			
}
					
				}

			});
		switch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        Miscellaneous.RunShell("/data/user/0/com.netease.x19/lib/二进制.so");
                        showToast("测试");
                    } else {
						Miscellaneous.RunShell("/data/user/0/com.netease.x19/lib/二进制名称.so");
                        showToast("不支持关闭");

                    }
                }


           });
		switch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        Miscellaneous.RunShell("/data/user/0/com.netease.x19/lib/二进制.so");
                        showToast("测试");
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
                        Miscellaneous.RunShell("/data/user/0/com.netease.x19/lib/二进制.so");
                        showToast("测试");
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
                        Miscellaneous.RunShell("/data/user/0/com.netease.x19/lib/二进制.so");
                        showToast("测试");
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
                        Miscellaneous.RunShell("/data/user/0/com.netease.x19/lib/二进制.so");
                        showToast("测试");
                    } else {
						Miscellaneous.RunShell("/data/user/0/com.netease.x19/lib/二进制名称.so");
                        showToast("不支持关闭");

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
    }

	private void showToast(String p0) {
		        Toast.makeText(mContext, p0, Toast.LENGTH_SHORT).show();
	} 
	
    public void showView() {
        if (!isView) {
            isView = true;
			
            wManager.addView(this, wParams);
			ASUI.UILevel(controlView,100,0,500,null);
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
	private int W(){
	return (int) (mContext.getResources().getDisplayMetrics().widthPixels);
		}
    private int H(){
	return (int) (mContext.getResources().getDisplayMetrics().heightPixels);
		}

}
