package com.answer.UI.View;
import android.app.Activity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

public class ACdv extends PopupWindow {

    public ACdv(Activity ctx, View view, Object sizeW, Object sizeH, boolean fa, boolean ta, boolean ca, String gravity, Object Astyle, int pyx, int pyy, final Object disrun) {
        if (Astyle == null || Astyle == "Di" || Astyle == 1) {
            setAnimationStyle(android.R.style.Animation_Dialog);
        } else if (Astyle == "In" || Astyle == 2) {
            setAnimationStyle(android.R.style.Animation_InputMethod);
        } else if (Astyle == "To" || Astyle == 3) {
            setAnimationStyle(android.R.style.Animation_Toast);
        } else if (Astyle == "Tr" || Astyle == 4) {
            setAnimationStyle(android.R.style.Animation_Translucent);
        } else if (Astyle == "Ac" || Astyle == 0) {
            setAnimationStyle(android.R.style.Animation_Activity);
        }

        setContentView(view);
        if (sizeW != null) {setWidth(Double.valueOf(sizeW.toString()).intValue());}
        if (sizeH != null) {setHeight(Double.valueOf(sizeH.toString()).intValue());}

        setFocusable(fa);//可返回关闭
        setTouchable(ta);//可触摸的
        
        setClippingEnabled(ca);//允许弹出窗口超出屏幕范围

        if (gravity == "LT") {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.LEFT | android.view.Gravity.TOP, pyx, pyy);
        } else if (gravity == "LC") {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.LEFT | android.view.Gravity.CENTER, pyx, pyy);
        } else if (gravity == "LB") {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.LEFT | android.view.Gravity.BOTTOM, pyx, pyy);
        } else if (gravity == "CT") {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.CENTER | android.view.Gravity.TOP, pyx, pyy);
        } else if (gravity == "CC" || gravity == null) {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.CENTER | android.view.Gravity.CENTER, pyx, pyy);
        } else if (gravity == "CB") {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.CENTER | android.view.Gravity.BOTTOM, pyx, pyy);
        } else if (gravity == "RT") {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.RIGHT | android.view.Gravity.TOP, pyx, pyy);
        } else if (gravity == "RC") {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.RIGHT | android.view.Gravity.CENTER, pyx, pyy);
        } else if (gravity == "RB") {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.RIGHT | android.view.Gravity.BOTTOM, pyx, pyy);
        }

        if (android.os.Build.VERSION.SDK_INT >= 26) {
            setWindowLayoutType(WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY);

        } else {
            setWindowLayoutType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);     

        }

        
        if (disrun != null) {
            setOnDismissListener(new android.widget.PopupWindow.OnDismissListener(){
                    @Override
                    public void onDismiss() {
                        ((OnDismissListener)(disrun)).onDismiss();
                    }});
        }

    }

    public ACdv(Activity ctx, View view, Object sizeW, Object sizeH, boolean fa, boolean ta, boolean ca, String gravity, Object Astyle, int pyx, int pyy) {
        if (Astyle == null || Astyle == "Di") {
            setAnimationStyle(android.R.style.Animation_Dialog);
        } else if (Astyle == "In") {
            setAnimationStyle(android.R.style.Animation_InputMethod);
        } else if (Astyle == "To") {
            setAnimationStyle(android.R.style.Animation_Toast);
        } else if (Astyle == "Tr") {
            setAnimationStyle(android.R.style.Animation_Translucent);
        } else if (Astyle == "Ac") {
            setAnimationStyle(android.R.style.Animation_Activity);
        }

        setContentView(view);
        if (sizeW != null) {setWidth(sizeW);}
        if (sizeH != null) {setHeight(sizeH);}

        setFocusable(fa);//可返回关闭
        setTouchable(ta);//可触摸的
        setClippingEnabled(ca);//允许弹出窗口超出屏幕范围

        if (gravity == "LT") {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.LEFT | android.view.Gravity.TOP, pyx, pyy);
        } else if (gravity == "LC") {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.LEFT | android.view.Gravity.CENTER, pyx, pyy);
        } else if (gravity == "LB") {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.LEFT | android.view.Gravity.BOTTOM, pyx, pyy);
        } else if (gravity == "CT") {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.CENTER | android.view.Gravity.TOP, pyx, pyy);
        } else if (gravity == "CC" || gravity == null) {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.CENTER | android.view.Gravity.CENTER, pyx, pyy);
        } else if (gravity == "CB") {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.CENTER | android.view.Gravity.BOTTOM, pyx, pyy);
        } else if (gravity == "RT") {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.RIGHT | android.view.Gravity.TOP, pyx, pyy);
        } else if (gravity == "RC") {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.RIGHT | android.view.Gravity.CENTER, pyx, pyy);
        } else if (gravity == "RB") {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.RIGHT | android.view.Gravity.BOTTOM, pyx, pyy);
        }

        if (android.os.Build.VERSION.SDK_INT >= 26) {
            setWindowLayoutType(WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY);

        } else {
            setWindowLayoutType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);     

        }

        
    }

    public ACdv(Activity ctx, View view, Object sizeW, Object sizeH, boolean fa, boolean ta, boolean ca, String gravity, Object Astyle, int pyx) {
        if (Astyle == null || Astyle == "Di") {
            setAnimationStyle(android.R.style.Animation_Dialog);
        } else if (Astyle == "In") {
            setAnimationStyle(android.R.style.Animation_InputMethod);
        } else if (Astyle == "To") {
            setAnimationStyle(android.R.style.Animation_Toast);
        } else if (Astyle == "Tr") {
            setAnimationStyle(android.R.style.Animation_Translucent);
        } else if (Astyle == "Ac") {
            setAnimationStyle(android.R.style.Animation_Activity);
        }


        setContentView(view);
        if (sizeW != null) {setWidth(sizeW);}
        if (sizeH != null) {setHeight(sizeH);}




        setFocusable(fa);//可返回关闭
        setTouchable(ta);//可触摸的
        setClippingEnabled(ca);//允许弹出窗口超出屏幕范围

        if (gravity == "LT") {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.LEFT | android.view.Gravity.TOP, pyx, 0);
        } else if (gravity == "LC") {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.LEFT | android.view.Gravity.CENTER, pyx, 0);
        } else if (gravity == "LB") {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.LEFT | android.view.Gravity.BOTTOM, pyx, 0);
        } else if (gravity == "CT") {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.CENTER | android.view.Gravity.TOP, pyx, 0);
        } else if (gravity == "CC" || gravity == null) {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.CENTER | android.view.Gravity.CENTER, pyx, 0);
        } else if (gravity == "CB") {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.CENTER | android.view.Gravity.BOTTOM, pyx, 0);
        } else if (gravity == "RT") {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.RIGHT | android.view.Gravity.TOP, pyx, 0);
        } else if (gravity == "RC") {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.RIGHT | android.view.Gravity.CENTER, pyx, 0);
        } else if (gravity == "RB") {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.RIGHT | android.view.Gravity.BOTTOM, pyx, 0);
        }

        if (android.os.Build.VERSION.SDK_INT >= 26) {
            setWindowLayoutType(WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY);

        } else {
            setWindowLayoutType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);     

        }

        
    }

    public ACdv(Activity ctx, View view, Object sizeW, Object sizeH, boolean fa, boolean ta, boolean ca, String gravity, Object Astyle) {
        if (Astyle == null || Astyle == "Di") {
            setAnimationStyle(android.R.style.Animation_Dialog);
        } else if (Astyle == "In") {
            setAnimationStyle(android.R.style.Animation_InputMethod);
        } else if (Astyle == "To") {
            setAnimationStyle(android.R.style.Animation_Toast);
        } else if (Astyle == "Tr") {
            setAnimationStyle(android.R.style.Animation_Translucent);
        } else if (Astyle == "Ac") {
            setAnimationStyle(android.R.style.Animation_Activity);
        }
        setContentView(view);
        if (sizeW != null) {setWidth(sizeW);}
        if (sizeH != null) {setHeight(sizeH);}
        setFocusable(fa);//可返回关闭
        setTouchable(ta);//可触摸的
        setClippingEnabled(ca);//允许弹出窗口超出屏幕范围

        if (gravity == "LT") {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.LEFT | android.view.Gravity.TOP, 0, 0);
        } else if (gravity == "LC") {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.LEFT | android.view.Gravity.CENTER, 0, 0);
        } else if (gravity == "LB") {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.LEFT | android.view.Gravity.BOTTOM, 0, 0);
        } else if (gravity == "CT") {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.CENTER | android.view.Gravity.TOP, 0, 0);
        } else if (gravity == "CC" || gravity == null) {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.CENTER | android.view.Gravity.CENTER, 0, 0);
        } else if (gravity == "CB") {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.CENTER | android.view.Gravity.BOTTOM, 0, 0);
        } else if (gravity == "RT") {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.RIGHT | android.view.Gravity.TOP, 0, 0);
        } else if (gravity == "RC") {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.RIGHT | android.view.Gravity.CENTER, 0, 0);
        } else if (gravity == "RB") {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.RIGHT | android.view.Gravity.BOTTOM, 0, 0);
        }

        if (android.os.Build.VERSION.SDK_INT >= 26) {
            setWindowLayoutType(WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY);

        } else {
            setWindowLayoutType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);     

        }

        
        }

    public ACdv(Activity ctx, View view, Object sizeW, Object sizeH, boolean fa, boolean ta, boolean ca, String gravity) {

        setAnimationStyle(android.R.style.Animation_Dialog);


        setContentView(view);
        if (sizeW != null) {setWidth(sizeW);}
        if (sizeH != null) {setHeight(sizeH);}


        setFocusable(fa);//可返回关闭
        setTouchable(ta);//可触摸的
        setClippingEnabled(ca);//允许弹出窗口超出屏幕范围

        if (gravity == "LT") {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.LEFT | android.view.Gravity.TOP, 0, 0);
        } else if (gravity == "LC") {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.LEFT | android.view.Gravity.CENTER, 0, 0);
        } else if (gravity == "LB") {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.LEFT | android.view.Gravity.BOTTOM, 0, 0);
        } else if (gravity == "CT") {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.CENTER | android.view.Gravity.TOP, 0, 0);
        } else if (gravity == "CC" || gravity == null) {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.CENTER | android.view.Gravity.CENTER, 0, 0);
        } else if (gravity == "CB") {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.CENTER | android.view.Gravity.BOTTOM, 0, 0);
        } else if (gravity == "RT") {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.RIGHT | android.view.Gravity.TOP, 0, 0);
        } else if (gravity == "RC") {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.RIGHT | android.view.Gravity.CENTER, 0, 0);
        } else if (gravity == "RB") {
            showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.RIGHT | android.view.Gravity.BOTTOM, 0, 0);
        }
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            setWindowLayoutType(WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY);

        } else {
            setWindowLayoutType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);     

        }

        setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);

    }

    public ACdv(Activity ctx, View view, Object sizeW, Object sizeH, boolean fa, boolean ta, boolean ca) {
        setAnimationStyle(android.R.style.Animation_Dialog);
        showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.CENTER | android.view.Gravity.CENTER, 0, 0);
        setContentView(view);
        if (sizeW != null) {setWidth(sizeW);}
        if (sizeH != null) {setHeight(sizeH);}
        setFocusable(fa);//可返回关闭
        setTouchable(ta);//可触摸的
        setClippingEnabled(ca);//允许弹出窗口超出屏幕范围

        if (android.os.Build.VERSION.SDK_INT >= 26) {
            setWindowLayoutType(WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY);
        } else {
            setWindowLayoutType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);     

        }

        
    }

    public ACdv(Activity ctx, View view, Object sizeW, Object sizeH, boolean fa, boolean ta) {
        setAnimationStyle(android.R.style.Animation_Dialog);
        showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.CENTER | android.view.Gravity.CENTER, 0, 0);
        setContentView(view);
        if (sizeW != null) {setWidth(sizeW);}
        if (sizeH != null) {setHeight(sizeH);}
        setFocusable(fa);//可返回关闭
        setTouchable(ta);//可触摸的

        if (android.os.Build.VERSION.SDK_INT >= 26) {
            setWindowLayoutType(WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY);

        } else {
            setWindowLayoutType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);     

        }

        setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);

    }

    public ACdv(Activity ctx, View view, Object sizeW, Object sizeH, boolean fa) {
        setAnimationStyle(android.R.style.Animation_Dialog);
        showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.CENTER | android.view.Gravity.CENTER, 0, 0);
        setContentView(view);
        if (sizeW != null) {setWidth(sizeW);}
        if (sizeH != null) {setHeight(sizeH);}
        setFocusable(fa);//可返回关闭

        if (android.os.Build.VERSION.SDK_INT >= 26) {
            setWindowLayoutType(WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY);

        } else {
            setWindowLayoutType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);     

        }

        
    }

    public ACdv(Activity ctx, View view, Object sizeW, Object sizeH) {
        setAnimationStyle(android.R.style.Animation_Dialog);
        showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.CENTER | android.view.Gravity.CENTER, 0, 0);
        setContentView(view);
        if (sizeW != null) {setWidth(sizeW);}
        if (sizeH != null) {setHeight(sizeH);}

        if (android.os.Build.VERSION.SDK_INT >= 26) {
            setWindowLayoutType(WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY);

        } else {
            setWindowLayoutType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);     

        }

        
    }

    public ACdv(Activity ctx, View view, Object sizeW) {
        setAnimationStyle(android.R.style.Animation_Dialog);
        showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.CENTER | android.view.Gravity.CENTER, 0, 0);
        setContentView(view);
        if (sizeW != null) {setWidth(sizeW);}

        if (android.os.Build.VERSION.SDK_INT >= 26) {
            setWindowLayoutType(WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY);

        } else {
            setWindowLayoutType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);     

        }

    
    }

    public ACdv(Activity ctx, View view) {
        setAnimationStyle(android.R.style.Animation_Dialog);
        showAtLocation(ctx.getWindow().getDecorView(), android.view.Gravity.CENTER | android.view.Gravity.CENTER, 0, 0);
        setContentView(view);

        if (android.os.Build.VERSION.SDK_INT >= 26) {
            setWindowLayoutType(WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY);

        } else {
            setWindowLayoutType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);     

        }

        
    }


}
