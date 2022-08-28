package com.Eastiy.EXO.View;
import android.widget.TextView;
import android.view.View;
import android.view.Gravity;
import android.content.Context;
import android.widget.LinearLayout;
import android.content.res.AssetManager;
import android.graphics.Typeface;

/*
 * ClassName: AnswerLibrary_AText 
 * Chinese: 文本控件
 * Based: AnswerLibrary 3.1
 * © AnswerTame 2022
 * Time: 2022/08/05/00:06
 * By Answer.Dev
 * QQ 2903536884
 */
public class AText extends TextView {

        public AText(Context context, LinearLayout view, Object text, String gravity, int size, String color) {
                super(context);
                if(view!=null)view.addView(this);
                setGravitys(gravity, this);
                setDecidText(text, this);
                setTextSizes(size, this);
                setTextColors(color, this);
            }

        public AText(Context context, LinearLayout view, Object text, String gravity, int size) {
                super(context);
                if(view!=null)view.addView(this);
                setGravitys(gravity, this);
                setDecidText(text, this);
                setTextSizes(size, this);
            }

        public AText(Context context, LinearLayout view, Object text, String gravity) {
                super(context);
                if(view!=null)view.addView(this);
                setGravitys(gravity, this);
                setDecidText(text, this);
            }

        public AText(Context context, LinearLayout view, Object text) {
                super(context);
                if(view!=null)view.addView(this);
                setGravitys(null, this);
                setDecidText(text, this);
            }

        public AText(Context context, LinearLayout view) {
                super(context);
                if(view!=null)view.addView(this);
                setGravitys(null, this);
            }

        private static void setGravitys(String gravity, TextView v) {
                if (gravity == "LT" || gravity == null) {
                        v.setGravity(android.view.Gravity.LEFT | android.view.Gravity.TOP);
                    } else if (gravity == "LC") {
                        v.setGravity(android.view.Gravity.LEFT | android.view.Gravity.CENTER);
                    } else if (gravity == "LB") {
                        v.setGravity(android.view.Gravity.LEFT | android.view.Gravity.BOTTOM);
                    } else if (gravity == "CT") {
                        v.setGravity(android.view.Gravity.CENTER | android.view.Gravity.TOP);
                    } else if (gravity == "CC") {
                        v.setGravity(android.view.Gravity.CENTER | android.view.Gravity.CENTER);
                    } else if (gravity == "CB") {
                        v.setGravity(android.view.Gravity.CENTER | android.view.Gravity.BOTTOM);
                    } else if (gravity == "RT") {
                        v.setGravity(android.view.Gravity.RIGHT | android.view.Gravity.TOP);
                    } else if (gravity == "RC") {
                        v.setGravity(android.view.Gravity.RIGHT | android.view.Gravity.CENTER);
                    } else if (gravity == "RB") {
                        v.setGravity(Gravity.RIGHT | android.view.Gravity.BOTTOM);
                    }
            }

        private static void setDecidText(Object text, TextView v) {
                if (text instanceof android.text.Spanned) {
                        v.setText((android.text.Spanned)(text));
                    } else {
                        v.setText((String)(text));
                    }
            }

        private static void setTextSizes(int size, TextView v) {
                if (!"null".equals(String.valueOf(size))) {
                        v.setTextSize(size);
                    }
            
            }

        private static void setTextColors(String color, TextView v) {
                if (color != null) {
                        v.setTextColor(android.graphics.Color.parseColor(color));
                    }
            }
    }
