package load.tencent.lib.ku;
import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Message;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.util.Size;
import android.widget.Toast;
import android.widget.TextView;
import android.graphics.drawable.GradientDrawable;

public class Toast {
	private int w;
	private int h;
	private int X;
	private float sz;
	private float TY;
	private float alp;
	private float ntx;
    private Context context;
	private PopupWindow pop;
	private TextView tx;
	private String strs;
	private int during;
    public Toast(Context c,String str,int gravity,float size,int dur,int color){
    GradientDrawable bd1=new GradientDrawable();
        bd1.setCornerRadius(30);
        int[] bd1ys1 = {Color.parseColor("#00FFF7"), Color.parseColor("#00AFFF")};
        bd1.setShape(GradientDrawable.RECTANGLE);
        bd1.setColors(bd1ys1);
        bd1.setGradientType(android.graphics.drawable.GradientDrawable.LINEAR_GRADIENT);//设置线性渐变
        bd1.setOrientation(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT);//设置渐变方向
        
		context = c;WindowManager wm = (WindowManager)context.getSystemService(Context.WINDOW_SERVICE);  
		w= wm.getDefaultDisplay().getWidth();  
		h= wm.getDefaultDisplay().getHeight();  
		strs = str;
		during = dur;
		pop = new PopupWindow(context);
		tx = new TextView(context);
		pop.setContentView(tx);
        pop.setBackgroundDrawable(context.getResources().getDrawable(android.R.color.transparent));
		tx.setBackgroundDrawable(bd1);
		tx.setAlpha(0.9f);
		tx.setTextColor(color);
		tx.setText(str);
		tx.setTextSize(size);
		TY = tx.getY();
		ntx = TY;
		pop.showAtLocation(tx,gravity,0,0);
		pop.setTouchable(false);
		X = 0;
		tx.setAlpha(0f);
		alp = 0f;
		shandler.sendEmptyMessageDelayed(0, 0);
	}
	private final Handler mhandler = new Handler() {
		@Override
		public void handleMessage(Message msg) {
			switch(msg.what){
				case 0:
					if (TY > (ntx + h)) {
						//Toast.makeText(context,"2",1000).show();
						mhandler.removeMessages(0);
						pop.dismiss();
						break;
					}
					TY -= 16f;
					tx.setY(TY);
					mhandler.sendEmptyMessageDelayed(0, 10);
					break;
				case 1:
					break;
			}
		}
	};
	private final Handler shandler = new Handler() {
		@Override
		public void handleMessage(Message msg) {
			switch(msg.what){
				case 0:
					if (alp > 0.84f) {
						//Toast.makeText(context,"1",1000).show();
						shandler.removeMessages(0);
						new Handler().postDelayed(new Runnable(){

								@Override
								public void run() {
									mhandler.sendEmptyMessageDelayed(0, 0);
								}
							}, during);
						break;
					}
					tx.setAlpha(alp);
					alp += 0.01f;
					shandler.sendEmptyMessageDelayed(0, 10);
					break;
				case 1:
					break;
			}
		}
	};
    
}
