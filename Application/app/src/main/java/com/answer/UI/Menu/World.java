package com.answer.UI.Menu;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import android.widget.*;
import android.view.MotionEvent;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.Interpolator;
import com.answer.UI.View.ASUI2;
import android.animation.ValueAnimator;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import com.answer.UI.View.SwitchBut;
import com.answer.UI.View.ASwitch;
import com.answer.UI.View.ASUI;
import com.answer.UI.View.NSwitch;
import com.answer.UI.View.GUIswitch;
import android.app.Activity;
import android.view.ViewGroup;
import com.answer.UI.View.NewView;
import com.answer.UI.Sidebar;
import com.answer.UI.Load;

public class World {
    private static boolean is = false;
    private static Context context;
	private static PopupWindow mainpop;
    private static LinearLayout mainll;
    private static LinearLayout mainll2;
    private static LinearLayout mainll3;
    private static  boolean canmovePop = false;
    private static float X;
    private static float Y;
    private static LinearLayout gui1_6;
    private static LinearLayout gui1_7;
    private  static boolean UI1Boolean=false;
    private static LinearLayout MainUI;

    private static TextView maintv;

    private static ScrollView gui1_8;

    private static LinearLayout gui1_9;

    //private static int[] Interpolators=new int[]{android.view.animation.LinearInterpolator,android.view.animation.AccelerateDecelerateInterpolator,android.view.animation.AccelerateInterpolator,android.view.animation.AnticipateInterpolator,android.view.animation.AnticipateOvershootInterpolator,android.view.animation.BounceInterpolator,android.view.animation.DecelerateInterpolator,android.view.animation.OvershootInterpolator};
	private static  boolean aim = false;

	private static boolean aim2=false;

    private static boolean aim3=false;

	private static boolean aim4=false;

	private static boolean aim5 = false;

	private static GUIswitch switcha;

	private static LinearLayout layout;

	private static PopupWindow main;

	private static LinearLayout LineLayout;

	
	
	
    public static void show(Context ct){

	    context = ct;



        final int[] mib={Color.parseColor("#FFFFFF"),Color.parseColor("#FFFFFF")};
        final float[] mif={10,10,10,10,0,0,0,0};
        final float[] mif2={10,10,10,10,0,0,0,0};
        MainUI = new LinearLayout(context);
        MainUI.setOrientation(1);

        mainll=ASUI2.NewView(context,(int)(W()*0.23),(int)(H()*0.12),"CC",0,0,null,null);
	    mainll.setBackgroundDrawable(ASUI2.roundBG(mib,mif,null,0));
        mainll.setElevation(1);

        int[] mib1={Color.parseColor("#465EFB"),Color.parseColor("#C2FFD8")};
        float[] mif1={0,0,99,99,99,99,99,99};

        mainll2=ASUI2.NewView(context,(int)(H()*0.05),(int)(H()*0.05),"CC",0,0,null,null);
        mainll2.setBackgroundDrawable(ASUI2.roundBG(mib1,mif1,"LR",0));

        mainll3=ASUI2.NewView(context,(int)(W()*0.18),(int)(H()*0.12),"CC",0,0,null,null);
        mainll3.setBackgroundColor(Color.parseColor("#FFFFFF"));

        maintv=ASUI2.NewText(context,"UI","CC",20,null);

		ValueAnimator animator = ObjectAnimator.ofInt(maintv,"textColor",
													  0x88333833, 0x88ca0007, 0x880333dc, 0x88089905);
		animator.setDuration(2000);
		animator.setEvaluator(new ArgbEvaluator());
		animator.setRepeatCount(-1);
		animator.setRepeatMode(ValueAnimator.REVERSE);
		animator.start();
		LineLayout = new LinearLayout(context);
        LineLayout.setOrientation(1);
		
        MainUI.addView(mainll);
        mainll.addView(mainll2);
        mainll.addView(mainll3);
        MainUI.addView(LineLayout);
		
        
		final NewView line =new NewView(context, (int)(W()*0.23),(int)(H()*0.005), "L", 1, 1, new String[]{"#6190e8","#a7bfe8","RT"}, 0, null);
		LineLayout.addView(line);
		LineLayout.setVisibility(View.GONE);
		
		mainll3.addView(maintv);
        mainpop=ASUI2.NewPW(MainUI,(int)(W() * 0.23),-2,false,true,true,"LT",null,-100,0);
        mainll.setOnClickListener(new View.OnClickListener() {



                @Override
                public void onClick(View view) {
                    if(UI1Boolean == false){
                        mainll.setBackgroundDrawable(ASUI2.roundBG(mib,mif2,null,0));
						//  gui1_6.setBackgroundDrawable(ASUI2.roundBG(mib,mif,null,0));
                        MainUI.addView(UIS1());
                        UI1Boolean = true;

                    }else{
                        mainll.setBackgroundDrawable(ASUI2.roundBG(mib,mif,null,0));
						// gui1_6.setBackgroundDrawable(ASUI2.roundBG(mib,mif,null,0));
                        DismissGui(gui1_6,gui1_7,1000);
                     
                        UI1Boolean = false;

                    }

                }
            });

        X = 0.0f;
        mainpop.update(0,0,-1,-1);
        Y = 0.0f;
        mainll.setOnLongClickListener(new View.OnLongClickListener() {

                @Override
                public boolean onLongClick(View view) {
                    canmovePop = true;
                    return false;
                }
            });
        mainll.setOnTouchListener(new View.OnTouchListener(){
                private float lastX; //上一次位置的X.Y坐标
                private float lastY;
                private float nowX;  //当前移动位置的X.Y坐标
                private float nowY;
                private float tranX; //悬浮窗移动位置的相对值
                private float tranY;



                @Override
                public boolean onTouch(View view, MotionEvent event) {
                    int action = event.getAction();

                    if (action == MotionEvent.ACTION_DOWN) {
                        //点击
                        lastX = event.getRawX();
                        lastY = event.getRawY();
                    } else if (action == MotionEvent.ACTION_UP) {
                        //松开  
                        if (!canmovePop){


                        }
                        canmovePop = false;
                    } else if (action == MotionEvent.ACTION_MOVE && canmovePop) {
                        //移动
                        nowX = event.getRawX();
                        nowY = event.getRawY();
                        // 计算XY坐标偏移量
                        tranX = nowX - lastX;
                        tranY = nowY - lastY;
                        X += tranX;
                        Y += tranY;
                        mainpop.update(Math.round(X),Math.round(Y),-1,-1);
                        lastX = nowX;
                        lastY = nowY;

                    }
                    return false;
                }
            });

    }

    public static void DismissGui(final View view,final View views,int time){

        UIPlumb(view,0,-100,100,0);
        UIPlumb(views,0,100,100,0);
        LineLayout.setVisibility(view.GONE);
        new Handler().postDelayed(new Runnable(){

                @Override
                public void run() {
                    view.setLayoutParams(new LinearLayout.LayoutParams(0,0));


                }
            }, time);
	};

    public static AnimationSet UIMove(View view,int x1,int x2,int y1,int y2,int time,int type){
        int tp=(type==0?Animation.RELATIVE_TO_SELF:type==1?Animation.RELATIVE_TO_PARENT:Animation.ABSOLUTE);
        AnimationSet aset_4=new AnimationSet(true);
        TranslateAnimation aa_4=new TranslateAnimation(tp,(int)(x1*0.01),tp,(int)(x2*0.01),tp,(int)(y1*0.01),tp,(int)(y2*0.01));
        aa_4.setDuration(2000);
        aset_4.addAnimation(aa_4);
        view.startAnimation(aset_4);
        return aset_4;
    }

    public static RotateAnimation UIRotate(View view,int A,int B,int x,int y,int time,/*int ints*/int type){


		int tp=(type==0?android.view.animation.Animation.RELATIVE_TO_SELF:type==1?android.view.animation.Animation.RELATIVE_TO_PARENT:android.view.animation.Animation.ABSOLUTE);
        RotateAnimation anim=new android.view.animation.RotateAnimation(A, B, tp, (int)(x * 0.01), tp, (int)(y * 0.01));

		// anim.setInterpolator(dhz);
        anim.setDuration(time);
		anim.setFillAfter(true);
		view.startAnimation(anim);
		return anim;
    }

    public static AnimationSet UIPlumb(View view,int In,int out,int time,int type){
        return UIMove(view,0,0,In,out,time,type);
    };

    public static boolean btu=false;
	
	public static PopupWindow createPopupWindow(Activity ctx, LinearLayout layouta, int WZ, int ax, int ay) {
        final PopupWindow popupWindow = new PopupWindow(layouta, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, true);
        popupWindow.setFocusable(false);
        popupWindow.setOutsideTouchable(false);
        popupWindow.showAtLocation(ctx.getWindow().getDecorView(), WZ, ax , ay);
        return popupWindow;
    }
    public static LinearLayout UIS1(){
        LineLayout.setVisibility(View.VISIBLE);
        final int[] mib={Color.parseColor("#FFFFFF"),Color.parseColor("#FFFFFF")};
        final float[] mif={10,10,10,10,10,10,10,10};


		final int[] USC={Color.parseColor("#FFFFFF"),Color.parseColor("#FFFFFF")};
		final float[] USCF={0,0,0,0,10,10,10,10};
        gui1_6=ASUI2.NewView(context,(int)(W()*0.23),(int)(H()*0.5),"CC",1,0,null,null);
        gui1_6.setBackgroundDrawable(ASUI2.roundBG(mib,mif,null,0));
        gui1_7=ASUI2.NewView(context,(int)(W()*0.23),(int)(H()*0.5),"CC",1,0,null,null);
        gui1_7.setBackgroundDrawable(ASUI2.roundBG(mib,mif,null,0));
        gui1_8=ASUI2.NewViewSV(context,(int)(W()*0.23),(int)(H()*0.5),0,null,null);
        gui1_9=ASUI2.NewView(context,(int)(W()*0.23),(int)(H()*0.5),"CC",1,0,null,null);
        new Handler().postDelayed(new Runnable(){

                @Override
                public void run() {
                    gui1_6.setBackgroundDrawable(ASUI2.roundBG(USC,USCF,null,0));

                }
            }, 1200);

		//   DismissGui(gui1_6,gui1_7,1800);
        UI1Boolean = false;




		final int[] btc={Color.parseColor("#465EFB"),Color.parseColor("#ffffff")};
        final float[] btf={360,360,360,360,360,360,360,360};

        final int[] btc2={Color.parseColor("#465EFB"),Color.parseColor("#000000")};







        UIPlumb(gui1_6,-100,0,200,0);
        UIPlumb(gui1_7,100,0,200,0);
        gui1_6.addView(gui1_7);
        gui1_7.addView(gui1_8);
        gui1_8.addView(gui1_9);
		
		
			
        
		switcha = new GUIswitch(context, gui1_9, 1, "Test", "</b><b>快捷键", aim, new ASwitch.OnASwitchChangeListener(){

				private Sidebar sidebar;

				@Override
				public void onASwitchChangeListener(boolean isOn) {
					if (aim == false) {
						ASUI.hint(context, "test");
					    sidebar = new Sidebar(context, "Online");
						aim = true;
					} else 
					if (aim == true) {
			
						ASUI.hint(context,"test");
						aim = false;
					}
				}}
			, null);      
		
        gui1_9.addView(ASUI2.Space(context,(int)(W()),(int)(H()*0.03)));
		new GUIswitch(context, gui1_9, 1, "Test", "</b><b>快捷键", aim2, new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {
					if (aim2 == false) {
						ASUI.hint(context, "test");

						aim2 = true;
					} else 
					if (aim2 == true) {

						ASUI.hint(context,"test");
						aim2 = false;
					}
				}}
			, null);      
        gui1_9.addView(ASUI2.Space(context,(int)(W()),(int)(H()*0.03)));
        new GUIswitch(context, gui1_9, 1, "Test", "</b><b>快捷键", aim3, new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {
					if (aim3 == false) {
						ASUI.hint(context, "test");

						aim3 = true;
					} else 
					if (aim3 == true) {

						ASUI.hint(context,"test");
						aim3 = false;
					}
				}}
			, null);      
        gui1_9.addView(ASUI2.Space(context,(int)(W()),(int)(H()*0.03)));
		new GUIswitch(context, gui1_9, 1, "Test", "</b><b>快捷键", aim4, new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {
					if (aim4 == false) {
						ASUI.hint(context, "test");

						aim4 = true;
					} else 
					if (aim4 == true) {

						ASUI.hint(context,"test");
						aim4 = false;
					}
				}}
			, null);      
        gui1_9.addView(ASUI2.Space(context,(int)(W()),(int)(H()*0.03)));
		new GUIswitch(context, gui1_9, 1, "Test", "</b><b>快捷键", aim5, new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {
					if (aim5 == false) {
						ASUI.hint(context, "test");

						aim5 = true;
					} else 
					if (aim5 == true) {

						ASUI.hint(context,"test");
						aim5 = false;
					}
				}}
			, null);      

        
        return gui1_6;

    };

    public static void   cfg(){
		final int[] mib={Color.parseColor("#FFFFFF"),Color.parseColor("#FFFFFF")};
        final float[] mif={10,10,10,10,10,10,10,10};
		
		int[] location = new int[2];
		switcha.getLocationOnScreen(location);
		int x = location[0];
		int y = location[1];
		layout=ASUI2.NewView(context,(int)(W()*0.25),(int)(H()*0.5),"CC",1,0,null,null);
		gui1_6.setBackgroundDrawable(ASUI2.roundBG(mib,mif,null,0));
		
		main=ASUI2.NewPW(layout,(int)(W() * 0.25),-2,false,true,true,"CC",null,360,y);
		
		
		}

	public static void dis(){
        mainpop.dismiss();


	}
    private static int W(){
        return (int) (context.getResources().getDisplayMetrics().widthPixels);
    }
    private static int H(){
        return (int) (context.getResources().getDisplayMetrics().heightPixels);
    }

}

