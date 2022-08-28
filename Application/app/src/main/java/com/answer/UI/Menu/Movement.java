package com.answer.UI.Menu;
import android.content.Context;
import com.answer.UI.View.*;
import android.view.View;
import android.widget.Toast;
import com.answer.UI.Load;
import android.view.Gravity;
import android.text.Layout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;

public class Movement {

    public static Context context;

    private static NewView pul;

    private static NewView but;

    

    private static boolean aim=false;

    private static boolean aim2=false;

	private static boolean aim3=false;

	private static boolean aim4=false;

    private static boolean aim5=false;

	private static  boolean Check1 = false;

	private static  boolean Check2 = false
	;
	private static  boolean Check3 = false;


	private static boolean aim6=false;

	private static NewWindow Movecdv;
	

	
    public static void show(final Context ct, boolean bl) {
        context = ct;

        pul = new NewView(ct, null, null, "CT", 1, 2, null, null, null);
        but = new NewView(ct, -2, -2, "LC", 1, 2, null, null, null);
		
        new SwitchBut(context, but, aim, "原子运动", "原子一样运动", new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {
					if (isOn) {
						
						aim = true;	

					}else{

						aim = false;
					}
				}
			});

		new SwitchBut(context, but, aim2, "锁定飞行", "强制飞行", new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {
					if (isOn) {
						
						aim2 = true;	

					}else{

						aim2 = false;
					}
				}
			});
		new SwitchBut(context, but, aim3, "喷气背包", "拥有喷气背包的似移动", new ASwitch.OnASwitchChangeListener(){

				@Override
					public void onASwitchChangeListener(boolean isOn) {
						if (isOn) {
						
						aim3 = true;	

					}else{

						aim3 = false;
					}
				}
			});
		new SwitchBut(context, but, aim4, "穿墙", "穿越墙壁", new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {
					if (isOn) {
						
						aim4 = true;	

					}else{

						aim4 = false;
					}
				}
			});
		new SwitchBut(context, but, aim5, "远跳", "远程跳跃", new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {
					if (isOn) {
						
						aim5 = true;	

					}else{

						aim5 = false;
					}
				}
			});
		new SwitchBut(context, but, aim6, "高跳", "跳的更高",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {
					if (isOn) {
						aim6 = true;	
						;
					}else{

						aim6 = false;
					}
				}
			});
		new CheckBoxBut(context, but, Check1, "飞行加速", "飞行速度x10", new ACheckBox.OnCheckedChangeListener() {



				@Override
				public void onCheckedChanged(ACheckBox checkBox, boolean z) {
					if (z) {
						Check1 = true;	

					}else{
						Check1 = false;


					}
				}


			});
		new CheckBoxBut(context, but, Check2, "点击传送", "点击传送", new ACheckBox.OnCheckedChangeListener() {



				@Override
				public void onCheckedChanged(ACheckBox checkBox, boolean z) {
					if (z) {
						Check2 = true;	

					}else{
						Check2 = false;
					}
				}


			});
		new CheckBoxBut(context, but, Check3, "踏空", "踏空", new ACheckBox.OnCheckedChangeListener() {



				@Override
				public void onCheckedChanged(ACheckBox checkBox, boolean z) {
					if (z) {
						Check3 = true;	

					}else{
						Check3 = false;
					}
				}


			});
		

		
        pul.addView(but);

        Movecdv = new NewWindow(ct, pul, "Move", bl);
    }

    public static void dis() {
        if (Movecdv != null) {
            Movecdv.dis();
            Movecdv = null;
        }
    }
    public void show() {
        // aim=
        Movecdv.showAtLocation(pul, Gravity.CENTER, (int)(W() * 0.05), 0);
    }
    public static int W() {
        return (int) (context.getResources().getDisplayMetrics().widthPixels);
    }
    public static int H() {
        return (int) (context.getResources().getDisplayMetrics().heightPixels);
    }


}
