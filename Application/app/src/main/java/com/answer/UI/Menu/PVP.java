package com.answer.UI.Menu;
import android.content.Context;
import com.answer.UI.View.*;
import android.view.View;
import android.widget.Toast;
import com.answer.UI.Load;
import android.view.Gravity;
import com.answer.UI.Sidebar;

public class PVP {
    
    public static Context context;

    private static NewView pul;

    private static NewView but;

    private static NewWindow PVPcdv;

    private static boolean aim=false;

    private static boolean aim2=false;
    
	private static boolean aim3=false;
	
	private static boolean aim4=false;

    private static boolean aim5=false;

	private static  boolean Check1 = false;
	
	private static  boolean Check2 = false;
	
	
	private static boolean aim6=false;

	private static PromptBox PromptBox;

	
	;
	
    public static void show(final Context ct,boolean bl){
        context=ct;
        
        pul=new NewView(ct,null,null,"CT",1,2,null,null,null);
        but=new NewView(ct,-2,-2,"LC",1,2,null,null,null);
			
	    
        
		new SwitchBut(context, but, aim, "锁定", "锁定玩家",new ASwitch.OnASwitchChangeListener(){

			@Override
			public void onASwitchChangeListener(boolean isOn) {
				if (isOn) {
					aim = true;	
					}else{
		
  					aim = false;
					}
				}
			});
		
		new SwitchBut(context, but, aim2, "杀戮", "循环杀戮", new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {
					if (isOn) {
						aim2 = true;	
						
					}else{
						
						aim2 = false;
					}
				}
			});
		new SwitchBut(context, but, aim3, "长臂", "攻击距离增加", new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {
					if (isOn) {
						aim3 = true;	
						
					}else{
						
						aim3 = false;
					}
				}
			});
		new SwitchBut(context, but, aim4, "环绕杀戮", "转圈环绕", new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {
					if (isOn) {
						aim4 = true;	
						
					}else{
						
						aim4 = false;
					}
				}
			});
		new SwitchBut(context, but, aim5, "自瞄", "自动瞄准", new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {
					if (isOn) {
						
						aim5 = true;	
		
					}else{
		
						aim5 = false;
					}
				}
			});
		new SwitchBut(context, but, aim6, "AC连点", "自动点击", new ASwitch.OnASwitchChangeListener(){

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
		new CheckBoxBut(context, but, Check1, "背后", "背后锁定", new ACheckBox.OnCheckedChangeListener() {



				@Override
				public void onCheckedChanged(ACheckBox checkBox, boolean z) {
					if (z) {
						Check1 = true;	
						
					}else{
						Check1 = false;

			
					}
				}


			});
		new CheckBoxBut(context, but, Check2, "骑人", "上空锁定", new ACheckBox.OnCheckedChangeListener() {



				@Override
				public void onCheckedChanged(ACheckBox checkBox, boolean z) {
					if (z) {
						Check2 = true;	
		
					}else{
						Check2 = false;
			}
				}


			});
		        pul.addView(but);
        
       PVPcdv=new NewWindow(ct,pul,"PVP",bl);
    }
    
    public static void dis(){
        if(PVPcdv!=null){
         PVPcdv.dis();
         PVPcdv=null;
        }
    }
    public void show(){
       // aim=
        PVPcdv.showAtLocation(pul,Gravity.CENTER,(int)(W()*0.05),0);
	}
    public static int W(){
        return (int) (context.getResources().getDisplayMetrics().widthPixels);
    }
    public static int H(){
        return (int) (context.getResources().getDisplayMetrics().heightPixels);
    }
    
    
}
