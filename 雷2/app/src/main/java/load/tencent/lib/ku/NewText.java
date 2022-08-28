/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.AssetManager
 *  android.graphics.Canvas
 *  android.graphics.Color
 *  android.graphics.LinearGradient
 *  android.graphics.Shader
 *  android.graphics.Shader$TileMode
 *  android.graphics.Typeface
 *  android.text.Spanned
 *  android.text.TextPaint
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.widget.TextView
 *  com.GroupED.UI.View.NewText
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package load.tencent.lib.ku;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

/*
 * Exception performing whole class analysis ignored.
 */
public class NewText
extends TextView {
    public NewText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /*
     * Enabled aggressive block sorting
     */
    public NewText(Context context, Object object, String string2, int n, String string3) {
        super(context);
        if (string2 == "LT") {
            this.setGravity(51);
        } else if (string2 == "LC") {
            this.setGravity(19);
        } else if (string2 == "LB") {
            this.setGravity(83);
        } else if (string2 == "CT") {
            this.setGravity(49);
        } else if (string2 == "CC") {
            this.setGravity(17);
        } else if (string2 == "CB") {
            this.setGravity(81);
        } else if (string2 == "RT") {
            this.setGravity(53);
        } else if (string2 == "RC") {
            this.setGravity(21);
        } else if (string2 == "RB") {
            this.setGravity(85);
        }
        if (object instanceof Spanned) {
            this.setText((CharSequence)((Spanned)object));
        } else {
            this.setText((CharSequence)((String)object));
        }
        this.setTypeface(Typeface.createFromAsset((AssetManager)context.getAssets(), (String)"fonts/font1.ttf"));
        if (!"null".equals((Object)String.valueOf((int)n))) {
            this.setTextSize((float)n);
        }
        if (string3 != null) {
            this.setTextColor(Color.parseColor((String)string3));
            return;
        }
		}
        
    public static int geth(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec((int)0, (int)0), View.MeasureSpec.makeMeasureSpec((int)0, (int)0));
        return view.getMeasuredHeight();
    }

    public static int getw(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec((int)0, (int)0), View.MeasureSpec.makeMeasureSpec((int)0, (int)0));
        return view.getMeasuredWidth();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}

