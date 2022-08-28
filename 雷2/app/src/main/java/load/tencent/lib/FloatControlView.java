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

public class FloatControlView extends LinearLayout {

    private Context mContext;

 

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
    private NewView line2;

	private NewView line3;
	
	private NewView line;

	
	

    public FloatControlView(Context context) {
        super(context);
        mContext = context;
        initView();
    }

    private void initView() {
		
		line = new NewView(mContext,(int)(H()*0.05),(int)(H()*0.05),"CC",1,1,"#ffffff",360,null);

        line2 = new NewView(mContext,(int)(H()*0.04),(int)(H()*0.04),"CC",1,1,"#ffffff",360,null);

        line3 = new NewView(mContext,(int)(H()*0.03),(int)(H()*0.03),"CC",1,1,"#ffffff",360,null);
       

        line.addView(line3);
		line.setBackgroundDrawable(ASUI.roundBG(new String[]{"#a7ff8ae8","#ff82c1fb","TB"},360,null,null));

        LinearLayout controlView = new LinearLayout(mContext);
        LinearLayout.LayoutParams titleParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
     
		addView(controlView);
		controlView.addView(line);
		

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

        floatContentView = new FloatContentView(mContext);
        
        line.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
			
                    floatContentView.showView();
				
                }
            });
        line.setOnTouchListener(new OnTouchListener() {

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
