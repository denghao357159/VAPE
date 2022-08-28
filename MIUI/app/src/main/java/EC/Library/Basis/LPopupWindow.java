package EC.Library.Basis;
import android.widget.PopupWindow;
import android.content.Context;
import android.app.Activity;
import android.view.WindowManager;
import android.util.DisplayMetrics;
import android.os.Build;

public class LPopupWindow extends PopupWindow {

    public static final String TAG = "LPopupWindow";
    private Activity ctx;
    public LPopupWindow(Context mctx) {
        super();
        ctx = (Activity)mctx;
    };
    

    
    
    
    public void showAtLocation(String gravity, int pyx, int pyy) {

        if (gravity.equals("左上")) {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.LEFT | android.view.Gravity.TOP, pyx, pyy);
        } else if (gravity.equals("居左")) {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.LEFT | android.view.Gravity.CENTER, pyx, pyy);
        } else if (gravity.equals("左下")) {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.LEFT | android.view.Gravity.BOTTOM, pyx, pyy);
        } else if (gravity.equals("中上")) {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.CENTER | android.view.Gravity.TOP, pyx, pyy);
        } else if (gravity.equals("居中")) {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.CENTER | android.view.Gravity.CENTER, pyx, pyy);
        } else if (gravity.equals("中下")) {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.CENTER | android.view.Gravity.BOTTOM, pyx, pyy);
        } else if (gravity.equals("右上")) {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.RIGHT | android.view.Gravity.TOP, pyx, pyy);
        } else if (gravity.equals("居右")) {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.RIGHT | android.view.Gravity.CENTER, pyx, pyy);
        } else if (gravity.equals("右下")) {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.RIGHT | android.view.Gravity.BOTTOM, pyx, pyy);
        }
    }

    
    
    


    public void setBackgroundDrawable(int color, float[] cr, String or) {
        setBackgroundDrawable(ViewDrawable.RoundBG(color, cr, or)); 

    }


    public void setBackgroundDrawable(int[] color, float[] cr, String or) {
        setBackgroundDrawable(ViewDrawable.RoundBG(color, cr, or)); 

    }
    public void setBackgroundDrawable(int color, float cr, String or) {
        float[] Radii = new float[]{
            cr,cr,cr,cr,cr,cr,cr,cr
        };
        setBackgroundDrawable(ViewDrawable.RoundBG(color, Radii, or)); 

    }

    public void setBackgroundDrawable(int[] color, float cr, String or) {
        float[] Radii = new float[]{
            cr,cr,cr,cr,cr,cr,cr,cr
        };
        setBackgroundDrawable(ViewDrawable.RoundBG(color, Radii, or)); 

    }
    
    public void setSuspension() {


        WindowManager windowManager = (WindowManager) ctx.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics metrics = new DisplayMetrics();
		windowManager.getDefaultDisplay().getRealMetrics(metrics);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            setWindowLayoutType(WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY);
        } else {
            setWindowLayoutType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);
        }

    }





}
