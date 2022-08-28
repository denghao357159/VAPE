package EC.Library.Basis;
import android.widget.LinearLayout;
import android.content.Context;

public class LlinearLayout extends LinearLayout {

    public LlinearLayout(Context ctx) {
        super(ctx);
      // setOrientation(1);
      setOrientation(1);
    };
    
    public LlinearLayout(Context ctx,int mi) {
        super(ctx);
        // setOrientation(1);
        setOrientation(mi);
    };
    
    
    public void setWH(int sizeW, int sizeH) {
        setLayoutParams(new android.widget.LinearLayout.LayoutParams(sizeW, sizeH));

    }
    
    public void setWH(double sizeW, double sizeH) {
        setLayoutParams(new android.widget.LinearLayout.LayoutParams(double2int(sizeW), double2int(sizeH)));

    }

    private int double2int(double mDouble){
        int num = (new Double(mDouble)).intValue();
        return num;
    }
    
    
    
    public void setGravity(String gravity) {
        if (gravity.equals("左上")) {
            setGravity(android.view.Gravity.LEFT | android.view.Gravity.TOP);
        } else if (gravity.equals("居左")) {
            setGravity(android.view.Gravity.LEFT | android.view.Gravity.CENTER);
        } else if (gravity.equals("左下")) {
            setGravity(android.view.Gravity.LEFT | android.view.Gravity.BOTTOM);
        } else if (gravity.equals("中上")) {
            setGravity(android.view.Gravity.CENTER | android.view.Gravity.TOP);
        } else if (gravity.equals("居中")) {
            setGravity(android.view.Gravity.CENTER | android.view.Gravity.CENTER);
        } else if (gravity.equals("中下")) {
            setGravity(android.view.Gravity.CENTER | android.view.Gravity.BOTTOM);
        } else if (gravity.equals("右上")) {
            setGravity(android.view.Gravity.RIGHT | android.view.Gravity.TOP);
        } else if (gravity.equals("居右")) {
            setGravity(android.view.Gravity.RIGHT | android.view.Gravity.CENTER);
        } else if (gravity.equals("右下")) {
            setGravity(android.view.Gravity.RIGHT | android.view.Gravity.BOTTOM);
        }


    }

    public void setBackgroundDrawable(int color, float[] cr, String or) {
        setBackgroundDrawable(ViewDrawable.RoundBG(color, cr, or)); 

    }


    public void setBackgroundDrawable(int[] color, float[] cr, String or) {
        setBackgroundDrawable(ViewDrawable.RoundBG(color, cr, or)); 

    }
    public void setBackgroundDrawable(int color, int cr, String or) {
        float[] Radii = new float[]{
            cr,cr,cr,cr,cr,cr,cr,cr
        };
        setBackgroundDrawable(ViewDrawable.RoundBG(color, Radii, or)); 

    }

    public void setBackgroundDrawable(int[] color, int cr, String or) {
        float[] Radii = new float[]{
            cr,cr,cr,cr,cr,cr,cr,cr
        };
        setBackgroundDrawable(ViewDrawable.RoundBG(color, Radii, or)); 

    }
    
    public void setBackgroundDrawable(String color, int cr, String or) {
        float[] Radii = new float[]{
            cr,cr,cr,cr,cr,cr,cr,cr
        };
        setBackgroundDrawable(ViewDrawable.RoundBG(android.graphics.Color.parseColor(color), Radii, or)); 

    }
    
    
    
    






}
