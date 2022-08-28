package com.Eastiy.EXO.View;
import android.content.Context;
import android.app.Activity;
import android.text.Editable;
import android.widget.Toast;

public class AEditText extends android.widget.EditText {

        public AEditText(final Activity activity, String hname, String oname, int size, String color, String color2, boolean bg, int i) {
                super(activity);
                setHint(hname);
                if (color2 != null) {
                        setHintTextColor(android.graphics.Color.parseColor(color2));
                    }
                setText(oname);
                setTextSize(size);
                if (color != null) {
                        setTextColor(android.graphics.Color.parseColor(color));
                    }
                setMaxLines(i);
                setSelectAllOnFocus(true);
                setFocusable(true);
                setFocusableInTouchMode(true);
                requestFocusFromTouch();//让光标放入到点击位置。
                requestFocus();//默认方式获得焦点
                clearFocus();
                setEnabled(true);
                
                if (bg == false) {
                        setBackground(null);
                    }
            }

    }
