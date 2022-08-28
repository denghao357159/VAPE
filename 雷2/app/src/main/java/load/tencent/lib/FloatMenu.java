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
import android.widget.Button;
import android.widget.ImageView;
import java.io.InputStream;
import android.graphics.BitmapFactory;
import java.io.IOException;
import android.graphics.Bitmap;


public final class FloatMenu extends LinearLayout {

    private Context mContext;
	public static int Size=500;
	public static int Size2=0;
	private HitBox hitbox;
	private PVP pvp;
	private MOVE move;
	private Exist exist;
 

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
	

    public FloatMenu(Context context) {
        super(context);
        mContext = context;
        initView();
    }

	public void dis() {
		
	}

    private void initView() {
		
		
		GradientDrawable buttonBackground1 = new GradientDrawable();
        buttonBackground1.setColor(0xFFFFFFFF);
		buttonBackground1.setCornerRadius(0);
		controlView = new LinearLayout(mContext);
		controlView.setOrientation(1);
		controlView.setBackground(buttonBackground1);
			
		LinearLayout.LayoutParams titleParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
		
		controlView.setLayoutParams(titleParams);

		addView(controlView);
		
		LinearLayout layout1_3 = new LinearLayout(mContext);
		LinearLayout.LayoutParams layoutParams1_3 = new LinearLayout.LayoutParams(500, 100);
        layout1_3.setLayoutParams(layoutParams1_3);
		layout1_3.setOrientation(2);
		layout1_3.setGravity(Gravity.CENTER);
		controlView.addView(layout1_3);

		final TextView layout1_3text = new TextView(mContext);
        LinearLayout.LayoutParams layout1_3textParams = new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        layout1_3text.setLayoutParams(layout1_3textParams);
        layout1_3text.setText("Eastiy");
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

        final Button Button1 = new Button(mContext);
        Button1.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        Button1.setText("PVPmenu：未加载");
		Button1.setTextSize(12);
        Button1.setTextColor(0xFF000000);
        layout1_2.addView(Button1);
		Button1.setBackground(buttonBackground1);
		final Button Button2 = new Button(mContext);
        Button2.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        Button2.setText("Movemenu：未加载");
		Button2.setTextSize(12);
        Button2.setTextColor(0xFF000000);
        layout1_2.addView(Button2);
		Button2.setBackground(buttonBackground1);
		final Button Button3 = new Button(mContext);
        Button3.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        Button3.setText("Existmenu：未加载");
		Button3.setTextSize(12);
        Button3.setTextColor(0xFF000000);
        layout1_2.addView(Button3);
		Button3.setBackground(buttonBackground1);
	
	
		
		
		pvp= new PVP(mContext);
		if (pvp != null) {} 
		pvp.showView();
		move= new MOVE(mContext);
		if (move != null) {}
		move.showView();
		exist= new Exist(mContext);
		if (exist != null) {}
		exist.showView();
		

	


         
	
		

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

		Button1.setOnClickListener(new View.OnClickListener() {
				private  boolean pzx = false;

	
				@Override
				public void onClick(View view) {
					if (!pzx) {
						pzx = true;
Button1.setText("PVPmenu：已加载");
						pvp.showview();
					} else {
						pzx = false;
						pvp.dis();
Button1.setText("PVPmenu：未加载");
				}}
			});  
			
		Button2.setOnClickListener(new View.OnClickListener() {
				private  boolean pzx = false;


				@Override
				public void onClick(View view) {
					if (!pzx) {
						pzx = true;
				Button2.setText("Movemenu：已加载");
						move.showview();
					} else {
						pzx = false;
						move.dis();
						Button2.setText("Movemenu：未加载");
					}}
			});      
		Button3.setOnClickListener(new View.OnClickListener() {
				private  boolean pzx = false;


				@Override
				public void onClick(View view) {
					if (!pzx) {
						pzx = true;
						Button3.setText("Exiatmenu：已加载");
						exist.showview();
					} else {
						pzx = false;
						exist.dis();
						Button3.setText("Exiatmenu：未加载");
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
