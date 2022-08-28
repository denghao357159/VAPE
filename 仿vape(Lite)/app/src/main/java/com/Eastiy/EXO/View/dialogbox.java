package com.Eastiy.EXO.View;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import com.Eastiy.EXO.View.*;

/*
 * ClassName: AnswerLibrary_dialogbox 
 * Chinese: 弹窗
 * Based: AnswerLibrary 3.1
 * © AnswerTame 2022
 * Time: 2022/08/05/00:18
 * By Answer.Dev
 * QQ 2903536884
 */
public class dialogbox {
    /*
     *支持全局Activity
     */
    private ACdv boxc;

    private double h;

    private TextView boxtit;

    private AView boxb2;

    private AView boxb;

    private AText boxt2;

    private AText boxt;

    



    public dialogbox(Activity activity,LinearLayout addui, Object title, int mod, final OnClickListener ft, final OnClickListener ft2, OnDismissListener ft3, Double hss) {

        if (boxc != null) {boxc.dismiss();}
        if (hss == null) {h = H() * 0.45;} else if (hss >= H() * 0.6) {h = H() * 0.6;}else{h=hss;}
        
        
        AView boxl = new AView(activity, null, W(), H(), "CB", 1);
        AView boxv = new AView(activity, boxl, W() * 0.85, h, "CC", 1, 1, AppConfig.theme[0], 60);
        boxv.setY(-(int)(H()*0.04));
        //按钮
        AView boxtb = new AView(activity, boxv, W() * 0.8, H() * 0.06, "CC", 0);
        AView boxv2 = new AView(activity, boxv, W() * 0.755, h - H() * 0.15, "CT", 1);
        AView boxv2ss = new AView(activity, null, null, null, "CT", 1);
        AViewSV boxv2s = new AViewSV(activity,boxv2ss, null, null, 2, null);
        boxv2s.setOverScrollMode(View.OVER_SCROLL_NEVER);
        boxv2s.setVerticalScrollBarEnabled(false);
       
        
        AView boxv3 = new AView(activity, null, W() * 0.8, H() * 0.1, "CT", 0);
        if (mod != 0) {

            final AView boxb = new AView(activity, boxv3, W() * 0.3, H() * 0.06, "CC", 1, 1, AppConfig.theme[2], 360, new OnClickListener(){
                    @Override
                    public void onClick(View p1) {
                        if(ft!=null)ft.onClick(p1);
                        boxc.dismiss();
                    }
                });

            boxb.setOnTouchListener(new android.view.View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent e) {
                        switch (e.getAction()) {
                            case android.view.MotionEvent.ACTION_DOWN:
                                boxb.setBackgroundDrawable(ColorLibrary.roundBG(AppConfig.theme[3], 360));
                                break;
                            case android.view.MotionEvent.ACTION_UP:
                                boxb.setBackgroundDrawable(ColorLibrary.roundBG(AppConfig.theme[2], 360));
                                break;
                        }
                        return false;
                    }});

            AView boxf = new AView(activity, boxv3, W() * 0.025, H() * 0.04, "CC", 0);


            boxb2 = new AView(activity, boxv3, W() * 0.3, H() * 0.06, "CC", 1, 1, AppConfig.theme[10], 360, new OnClickListener(){
                    @Override
                    public void onClick(View p1) {
                        if(ft2!=null)ft2.onClick(p1);
                        boxc.dismiss();
                    }
                });

            boxb2.setOnTouchListener(new android.view.View.OnTouchListener(){
                    @Override
                    public boolean onTouch(View v, MotionEvent e) {
                        switch (e.getAction()) {
                            case android.view.MotionEvent.ACTION_DOWN:
                                boxb2.setBackgroundDrawable(ColorLibrary.roundBG(AppConfig.theme[5], 360));
                                break;
                            case android.view.MotionEvent.ACTION_UP:
                                boxb2.setBackgroundDrawable(ColorLibrary.roundBG(AppConfig.theme[10], 360));
                                break;
                        }
                        return false;
                    }});

            if (isArray(title)) {
                String[] titles=(String[])(title);
                
                boxtit = new AText(activity, boxtb, ColorLibrary.FontColor("§l" + titles[0]), "CC", 17, AppConfig.theme[4]);
                boxt = new AText(activity, null, ColorLibrary.FontColor("§l" + titles[1]), "CC", 17, AppConfig.theme[4]);
                boxt2 = new AText(activity, null, ColorLibrary.FontColor("§l" + titles[2]), "CC", 17, AppConfig.theme[7]);
                boxb.addView(boxt);
                boxb2.addView(boxt2);

            } else {

                boxtit = new AText(activity, boxtb, ColorLibrary.FontColor("§l" + title), "CC", 17, AppConfig.theme[4]);
                boxt = new AText(activity, boxb, "取消", "CC", 17, AppConfig.theme[4]);
                boxt2 = new AText(activity, boxb2, "确定", "CC", 17, AppConfig.theme[7]);

            };

        } else {

            boxb = new AView(activity, boxv3, W() * 0.8, H() * 0.06, "CC", 1, 1, AppConfig.theme[10], 360, new OnClickListener(){
                    @Override
                    public void onClick(View p1) {
                        if(ft!=null)ft.onClick(p1);
                        boxc.dismiss();
                    }
                });
                
            boxb.setOnTouchListener(new android.view.View.OnTouchListener(){
                    @Override
                    public boolean onTouch(View v, MotionEvent e) {
                        switch (e.getAction()) {
                            case android.view.MotionEvent.ACTION_DOWN:
                                boxb.setBackgroundDrawable(ColorLibrary.roundBG(AppConfig.theme[5], 360));
                                break;
                            case android.view.MotionEvent.ACTION_UP:
                                boxb.setBackgroundDrawable(ColorLibrary.roundBG(AppConfig.theme[10], 360));
                                break;
                        }
                        return false;
                    }});


            if (isArray(title)) {
                String[] titles=(String[])(title);

                boxtit = new AText(activity, boxtb, ColorLibrary.FontColor("§l" + titles[0]), "CC", 17, AppConfig.theme[4]);
                boxt = new AText(activity, boxb, ColorLibrary.FontColor("§l" + titles[1]), "CC", 17, AppConfig.theme[7]);
            } else {
                boxtit = new AText(activity, boxtb, ColorLibrary.FontColor("§l" + title), "CC", 17, AppConfig.theme[4]);
                boxt = new AText(activity, boxb, "确定", "CC", 17, AppConfig.theme[7]);
            }

        }
   
        boxv2.addView(boxv2s);
        //boxv2s.addView(boxv2ss);
        if(addui!=null){
            boxv2ss.addView(addui);
           
        }
        
        boxv.addView(boxv3);

        boxc = new ACdv(activity, boxl, W(), H(), true, true, true, "CB", 1, 0, 0, ft3);
        boxc.setBackgroundDrawable( ColorLibrary.roundBG("#22000000"));
        AnimationLibrary.UIReveal(boxtb, (int)(W() * 0.25), (int)(H() * 0.04), 0, (int)(W() * 0.25), 2000);
        AnimationLibrary.UIPlumb(boxv, -20, 0, 300, 0);
        AnimationLibrary.Zoomanimations(boxv,650,110*0.01f,100*0.01f,110*0.01f,100*0.01f);
       
        boxv.setTranslationZ(10);

    }
    
    
    public dialogbox(Activity activity,LinearLayout addui, Object title, int mod, OnClickListener ft, OnClickListener ft2, OnDismissListener ft3) {
        new dialogbox(activity,addui, title, mod, ft, ft2, ft3, null);
    }

    public dialogbox(Activity activity,LinearLayout addui, Object title, int mod, OnClickListener ft, OnClickListener ft2) {
        new dialogbox(activity,addui, title, mod, ft, ft2, null);
    }

    public dialogbox(Activity activity,LinearLayout addui, Object title, int mod, OnClickListener ft) {
        new dialogbox(activity,addui, title, mod, ft, null);
    }

    public dialogbox(Activity activity,LinearLayout addui, Object title, int mod) {
        new dialogbox(activity,addui, title, mod, null);
    }

    public dialogbox(Activity activity,LinearLayout addui, Object title) {
        new dialogbox(activity,addui, title, 1);
    }

    public dialogbox(Activity activity,LinearLayout addui) {
        new dialogbox(activity,addui, "提示");
    }
    
    public dialogbox(Activity activity) {
        AView addui=new AView(activity, null, W() * 0.8, H() * 0.6);
        new dialogbox(activity, addui, "提示");
    }

    private static int W() {
        return (int)(AppConfig.getDeviceWidth());
    };

    private static int H() {
        return AppConfig.getDeviceHeight();
    };

    public static boolean isArray(Object obj) {
        if (obj == null) {
            return false;
        }
        return obj.getClass().isArray();
    }

}


