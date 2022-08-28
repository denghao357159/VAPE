package EC.Library.Basis;
import android.widget.TextView;
import android.content.Context;
import android.graphics.Color;

public class LTextView extends TextView {

    public static final String TAG = "LTextView";



    public LTextView(Context ctx) {
        super(ctx);
    };

    public void setWH(int sizeW, int sizeH) {
        setLayoutParams(new android.widget.LinearLayout.LayoutParams(sizeW, sizeH));

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

    


    public void setText(String txt) {
        setText(FontColor.parse(txt));
    }


    public void setText(Character txt) {
        setText(txt);

    }
    


}
