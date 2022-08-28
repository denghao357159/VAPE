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


public class HitBox extends LinearLayout {
	public static int Size=0;
    private Context mContext;
	private int Size2=0;

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


    public HitBox(Context context) {
        super(context);
        mContext = context;
        initView();
    }

	public void dis() {
		setVisibility(GONE);
	}

	public void showview() {
		setVisibility(VISIBLE);
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
		LinearLayout.LayoutParams layoutParams1_3 = new LinearLayout.LayoutParams(520, 100);
        layout1_3.setLayoutParams(layoutParams1_3);
		layout1_3.setOrientation(LinearLayout.HORIZONTAL);
		layout1_3.setGravity(Gravity.CENTER);
		controlView.addView(layout1_3);

		final TextView layout1_3text = new TextView(mContext);
        LinearLayout.LayoutParams layout1_3textParams = new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        layout1_3text.setLayoutParams(layout1_3textParams);
        layout1_3text.setText("HitBox");
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






		final SeekBar SeekBar = new SeekBar(mContext);
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
		SeekBartext.setTextSize(12);
        SeekBartext.setTextColor(0xFF000000);
		layout1_2.addView(SeekBartext);
	    layout1_2.addView(SeekBar);
		final SeekBar SeekBar2 = new SeekBar(mContext);
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
		SeekBartext2.setTextSize(12);
        SeekBartext2.setTextColor(0xFF000000);
		layout1_2.addView(SeekBartext2);
	    layout1_2.addView(SeekBar2);







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
		SeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {


				@Override
				public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
					Log.e("xyh", "onProgressChanged: " + progress + "");

					Size = progress;


					SeekBartext.setText("hitBox width Size:" + Size);		
					Tools.创建文件("sdcard/文件");
					Tools.写入文件("sdcard/文件", "" + SeekBar);
					Miscellaneous.RunShell(("/data/user/0/com.netease.x19/lib/二进制"));
					
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


					SeekBartext2.setText("hitBox height Size:" + Size2);		
					Tools.创建文件("sdcard/文件");
					Tools.写入文件("sdcard/文件", "" + SeekBar2);
					Miscellaneous.RunShell(("/data/user/0/com.netease.x19/lib/二进制"));
					//SaveText("/sdcard/BFORNORNG/deviation",py+"/");
				}
				@Override
				public void onStartTrackingTouch(SeekBar seekBar) {
				}

				@Override
				public void onStopTrackingTouch(SeekBar seekBar) {

				}
			});


		layout1_3.setOnClickListener(new OnClickListener() {

				private  boolean iskg1 = false;

				@Override    
				public void onClick(View v) {
					if (!iskg1) {
						iskg1 = true;

						layout1_2.setVisibility(View.VISIBLE);

						ASUI.UILevel(layout1_2, -100, 0, 500, null);

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
}
	
    public void showView() {
        if (!isView) {
            isView = true;
            wManager.addView(this, wParams);
			ASUI.UILevel(controlView, -100, 0, 500, null);
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

}
