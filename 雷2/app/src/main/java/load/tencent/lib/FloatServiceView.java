package load.tencent.lib;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.graphics.Typeface;
import android.os.Build;
import android.os.IBinder;
import android.view.Gravity;
import android.view.WindowManager;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

public class FloatServiceView extends Service {

    private Context mContext;

    private FloatControlView floatControlView;

	private WindowManager wManager;

	private WindowManager.LayoutParams wParams;

	private FloatMenu menu;

    @Override
    public IBinder onBind(Intent Intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        this.mContext = this;
		initView();
        floatControlView = new FloatControlView(mContext);
        if (floatControlView != null) {
            floatControlView.showView();
			menu = new FloatMenu(mContext);
			if (menu != null) {
				menu.showView();

			}
		}}

	private void initView() {
		wManager = (WindowManager) mContext.getSystemService(Context.WINDOW_SERVICE);
        wParams = new WindowManager.LayoutParams();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            wParams.type = WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY;
        } else {
            wParams.type = WindowManager.LayoutParams.TYPE_SYSTEM_ALERT;
        }
        wParams.flags = WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL | WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE | WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE | WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN | WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS | WindowManager.LayoutParams.FLAG_FULLSCREEN;
        wParams.gravity = Gravity.BOTTOM | Gravity.RIGHT;
        wParams.x = 60;
        wParams.y = 30;
        wParams.width = WindowManager.LayoutParams.WRAP_CONTENT;
        wParams.height = WindowManager.LayoutParams.WRAP_CONTENT;
        wParams.format = PixelFormat.RGBA_8888;

		TextView WaterMark = new TextView(mContext);
		LayoutParams params = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		WaterMark.setLayoutParams(params);
		WaterMark.setText("FPP MOD客户端");
		WaterMark.setTextSize(10);
		WaterMark.setTextColor(0xFFFFFFFF);
		WaterMark.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));

		wManager.addView(WaterMark, wParams);
	}

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (floatControlView != null) {
            floatControlView.clearView();
        }
    }

}
