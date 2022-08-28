package com.answer.UI.Menu;
import android.content.Context;
import com.answer.UI.View.*;
import android.view.View;
import android.widget.Toast;
import com.answer.UI.Load;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.EditText;
import android.text.InputType;
import android.view.View.OnClickListener;

public class UI {

    public static Context context;

    private static NewView pul;

    private static NewView but;

    private static NewWindow UIcdv;

    private static boolean aim=false;

    private static boolean aim1=false;
	
	private static boolean aim2=false;

    private static boolean aim3=false;
	
	private static boolean aim4=false;

	private static boolean aim5 = false;
	
    public static void show(final Context ct,boolean bl){
        context=ct;

        pul=new NewView(ct,null,null,"CT",1,2,null,null,null);
        but=new NewView(ct,-2,-2,"LC",1,2,null,null,null);
		new NSwitch(ct, but, 1, "快捷键", "</b><b>快捷键面板", aim, new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {
					final AView Layout = new AView(context, null, (int)(W() * 0.8), (int)(H()), "CC", 0, 1, "#FFFFFF", 10);
					Layout.setOrientation(LinearLayout.VERTICAL);
					new NSwitch(ct, Layout, 1, "飞天快捷键", "</b><b>快捷键", aim, new ASwitch.OnASwitchChangeListener(){

							@Override
							public void onASwitchChangeListener(boolean isOn) {
								if (aim == false) {
									ASUI.hint(ct, "test");
									Load.MB.show(ct);

									aim = true;
								} else 
								if (aim == true) {
									ASUI.hint(ct,"test");
									Load.MB.dis();
									aim = false;
								}
							}}
						, null);       
					new NSwitch(ct, Layout, 1, "穿墙快捷键", "</b><b>快捷键", aim1, new ASwitch.OnASwitchChangeListener(){

							@Override
							public void onASwitchChangeListener(boolean isOn) {
								if (aim1 == false) {
									ASUI.hint(ct, "test");
									Load.MB2.show(ct);
									aim1 = true;
								} else 
								if (aim1 == true) {
									Load.MB2.dis();
									ASUI.hint(ct,"test");
									aim1 = false;
								}
							}}
						, null);      
					new NSwitch(ct, Layout, 1, "骑人快捷键", "</b><b>快捷键", aim2, new ASwitch.OnASwitchChangeListener(){

							@Override
							public void onASwitchChangeListener(boolean isOn) {
								if (aim2 == false) {
									ASUI.hint(ct, "test");
									Load.MB3.show(ct);
									aim2 = true;
								} else 
								if (aim2 == true) {
									ASUI.hint(ct,"test");
									Load.MB3.dis();
									aim2 = false;
								}
							}}
						, null);       
					new NSwitch(ct, Layout, 1, "杀戮快捷键", "</b><b>快捷键", aim3, new ASwitch.OnASwitchChangeListener(){

							@Override
							public void onASwitchChangeListener(boolean isOn) {
								if (aim3 == false) {
									ASUI.hint(ct, "test");
									Load.MB4.show(ct);
									aim3 = true;
								} else 
								if (aim3 == true) {
									Load.MB4.dis();
									ASUI.hint(ct,"test");
									aim3 = false;
								}
							}}
						, null);       
					new NSwitch(ct, Layout, 1, "冲刺快捷键", "</b><b>快捷键", aim4, new ASwitch.OnASwitchChangeListener(){

							@Override
							public void onASwitchChangeListener(boolean isOn) {
								if (aim4 == false) {
									ASUI.hint(ct, "test");
									Load.MB5.show(ct);
									aim4 = true;
								} else 
								if (aim4 == true) {
									Load.MB5.dis();
									ASUI.hint(ct,"test");
									aim4 = false;
								}
							}}
						, null);    
					new NSwitch(ct, Layout, 1, "踏空快捷键", "</b><b>快捷键", aim5, new ASwitch.OnASwitchChangeListener(){

							@Override
							public void onASwitchChangeListener(boolean isOn) {
								if (aim5 == false) {
									ASUI.hint(ct, "test");
									Load.MB6.show(ct);
									aim5 = true;
								} else 
								if (aim5 == true) {
									Load.MB6.dis();
									ASUI.hint(ct,"test");
									aim5 = false;
								}
							}}
						, null);       
					
					new PromptBox().show(context, "large", "快捷键面板", null, new Object[]{"确定",new OnClickListener(){
												 @Override
												 public void onClick(View p1) {

												 }
											 },1}, null, new View[]{Layout});



			
      
		
					
				}},null);

			
		
        
        pul.addView(but);

        UIcdv=new NewWindow(ct,pul,"UI",bl);
    }

    public static void dis(){
        if(UIcdv!=null){
            UIcdv.dis();
            UIcdv=null;
        }
    }
    public void show(){
        // aim=
        UIcdv.showAtLocation(pul,Gravity.CENTER,(int)(W()*0.05),0);
    }
    public static int W(){
        return (int) (context.getResources().getDisplayMetrics().widthPixels);
    }
    public static int H(){
        return (int) (context.getResources().getDisplayMetrics().heightPixels);
    }


}
