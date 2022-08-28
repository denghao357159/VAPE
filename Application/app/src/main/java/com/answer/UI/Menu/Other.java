package com.answer.UI.Menu;
import android.content.Context;
import com.answer.UI.View.*;
import android.view.View;
import android.widget.Toast;
import com.answer.UI.Load;
import android.view.Gravity;
import android.widget.EditText;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.view.View.OnClickListener;
import android.text.InputType;

public class Other {

    public static Context context;

    private static NewView pul;

    private static NewView but;

    private static NewWindow Othercdv;

	
	
	
	
    private static boolean aim=false;

    private static boolean aim1=false;
	
	private static boolean aim2=false;

	private static boolean aim3=false;

	private static boolean aim4=false;

	private static OSeekBar ASeekBar;

	private static ASeekBar oSeekBar;
	

    public static void show(final Context ct,final boolean bl){
        context=ct;

        pul=new NewView(ct,null,null,"CT",1,2,null,null,null);
        but=new NewView(ct,-2,-2,"LC",1,2,null,null,null)
		;
        new NSwitch(ct, but, 1, "自定义传送", "</b><b>传送", aim, new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {
					
						ASUI.hint(ct, "已打开自定义窗口");
						final AView AEditTextViewAView = new AView(context, null, (int)(W() * 0.8), (int)(H() * 0.6), "CC", 0, 1, "#FFFFFF", 10);
						AEditTextViewAView.setOrientation(LinearLayout.VERTICAL);
						final EditText EnchantEdit1 = new EditText(context);
						final EditText EnchantEdit2 = new EditText(context);
						final EditText EnchantEdit3 = new EditText(context);
						LinearLayout.LayoutParams editParams2 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
						//
						EnchantEdit1.setLayoutParams(editParams2);
						EnchantEdit1.setHint("X轴");
						EnchantEdit1.setHintTextColor(0xFF000000);
						EnchantEdit1.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_CLASS_PHONE);
						EnchantEdit1.setGravity(Gravity.CENTER | Gravity.TOP);
						EnchantEdit1.setTextColor(0xFF000000);
						AEditTextViewAView.addView(EnchantEdit1);
						final AView View = new AView(context, null, (int)(W() * 0.01), (int)(H() * 0.04), "CC", 0, 1, "#FFFFFF", 10);			
						AEditTextViewAView.addView(View);
						EnchantEdit2.setLayoutParams(editParams2);
						EnchantEdit2.setHint("Y轴");
						EnchantEdit2.setHintTextColor(0xFF000000);
						EnchantEdit2.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_CLASS_PHONE);
						EnchantEdit2.setGravity(Gravity.CENTER | Gravity.TOP);
						EnchantEdit2.setTextColor(0xFF000000);
						AEditTextViewAView.addView(EnchantEdit2);
						final AView View2 = new AView(context, null, (int)(W() * 0.01), (int)(H() * 0.04), "CC", 0, 1, "#FFFFFF", 10);			
						AEditTextViewAView.addView(View2);
						EnchantEdit3.setLayoutParams(editParams2);
						EnchantEdit3.setHint("Z轴");
						EnchantEdit3.setHintTextColor(0xFF000000);
						EnchantEdit3.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_CLASS_PHONE);
						EnchantEdit3.setGravity(Gravity.CENTER | Gravity.TOP);
						EnchantEdit3.setTextColor(0xFF000000);
						AEditTextViewAView.addView(EnchantEdit3);
						new PromptBox().show(context, "large", "请输入:", null, new Object[]{"确定",new OnClickListener(){
													 @Override
													 public void onClick(View p1) {

													 }
												 },1}, null, new View[]{AEditTextViewAView});
						
						
				}}
			, null);       
        new NSwitch(ct, but, 1, "自定义杀戮", "</b><b>配置杀戮", aim1, new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {
					
			
						ASUI.hint(ct, "test");
						final AView AEditTextViewAView = new AView(context, null, (int)(W() * 0.8), (int)(H()*0.8), "CC", 0, 1, "#FFFFFF", 10);
						AEditTextViewAView.setOrientation(LinearLayout.VERTICAL);
						final EditText EnchantEdit1 = new EditText(context);
						final EditText EnchantEdit2 = new EditText(context);
						final EditText EnchantEdit3 = new EditText(context);
						final EditText EnchantEdit4 = new EditText(context);
						
						LinearLayout.LayoutParams editParams2 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
						//
						EnchantEdit1.setLayoutParams(editParams2);
						EnchantEdit1.setHint("SetRange");
						EnchantEdit1.setHintTextColor(0xFF000000);
						EnchantEdit1.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_CLASS_PHONE);
						EnchantEdit1.setGravity(Gravity.CENTER | Gravity.TOP);
						EnchantEdit1.setTextColor(0xFF000000);
						AEditTextViewAView.addView(EnchantEdit1);
						final AView View = new AView(context, null, (int)(W() * 0.01), (int)(H() * 0.04), "CC", 0, 1, "#FFFFFF", 10);			
						AEditTextViewAView.addView(View);
						EnchantEdit2.setLayoutParams(editParams2);
						EnchantEdit2.setHint("SetMaxCPS");
						EnchantEdit2.setHintTextColor(0xFF000000);
						EnchantEdit2.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_CLASS_PHONE);
						EnchantEdit2.setGravity(Gravity.CENTER | Gravity.TOP);
						EnchantEdit2.setTextColor(0xFF000000);
						AEditTextViewAView.addView(EnchantEdit2);
						final AView View2 = new AView(context, null, (int)(W() * 0.01), (int)(H() * 0.04), "CC", 0, 1, "#FFFFFF", 10);			
						AEditTextViewAView.addView(View2);
						EnchantEdit3.setLayoutParams(editParams2);
						EnchantEdit3.setHint("SetMinCPS");
						EnchantEdit3.setHintTextColor(0xFF000000);
						EnchantEdit3.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_CLASS_PHONE);
						EnchantEdit3.setGravity(Gravity.CENTER | Gravity.TOP);
						EnchantEdit3.setTextColor(0xFF000000);
						AEditTextViewAView.addView(EnchantEdit3);
						final AView View3 = new AView(context, null, (int)(W() * 0.01), (int)(H() * 0.04), "CC", 0, 1, "#FFFFFF", 10);			
						AEditTextViewAView.addView(View3);
						EnchantEdit4.setLayoutParams(editParams2);
						EnchantEdit4.setHint("SetTurnSpeed");
						EnchantEdit4.setHintTextColor(0xFF000000);
						EnchantEdit4.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_CLASS_PHONE);
						EnchantEdit4.setGravity(Gravity.CENTER | Gravity.TOP);
						EnchantEdit4.setTextColor(0xFF000000);
						AEditTextViewAView.addView(EnchantEdit4);
						new PromptBox().show(context, "large", "请输入:", null, new Object[]{"确定",new OnClickListener(){
													 @Override
													 public void onClick(View p1) {

													 }
												 },1}, null, new View[]{AEditTextViewAView});

						
						
				}}
			, null);       
		new NSwitch(ct, but, 1, "自定义高跳", "</b><b>高跳高度", aim2,  new ASwitch.OnASwitchChangeListener(){

					@Override
					public void onASwitchChangeListener(boolean isOn) {
					
						ASUI.hint(ct, "test");
						final AView AEditTextViewAView = new AView(context, null, (int)(W() * 0.8), (int)(H()*0.6), "CC", 0, 1, "#FFFFFF", 10);
						AEditTextViewAView.setOrientation(LinearLayout.VERTICAL);
						final EditText EnchantEdit1 = new EditText(context);
						
						LinearLayout.LayoutParams editParams2 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
						//
						EnchantEdit1.setLayoutParams(editParams2);
						EnchantEdit1.setHint("SetHigh");
						EnchantEdit1.setHintTextColor(0xFF000000);
						EnchantEdit1.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_CLASS_PHONE);
						EnchantEdit1.setGravity(Gravity.CENTER | Gravity.TOP);
						EnchantEdit1.setTextColor(0xFF000000);
						AEditTextViewAView.addView(EnchantEdit1);
							new PromptBox().show(context, "large", "请输入:", null, new Object[]{"确定",new OnClickListener(){
													 @Override
													 public void onClick(View p1) {

													 }
												 },1}, null, new View[]{AEditTextViewAView});


						
				}}
			, null);       
		new NSwitch(ct, but, 1, "自定义远跳", "</b><b>远跳长度", aim3, new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {
					
					
						ASUI.hint(ct, "test");
						final AView AEditTextViewAView = new AView(context, null, (int)(W() * 0.8), (int)(H()*0.6), "CC", 0, 1, "#FFFFFF", 10);
						AEditTextViewAView.setOrientation(LinearLayout.VERTICAL);
						final EditText EnchantEdit1 = new EditText(context);

						LinearLayout.LayoutParams editParams2 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
						//
						EnchantEdit1.setLayoutParams(editParams2);
						EnchantEdit1.setHint("SetWidth");
						EnchantEdit1.setHintTextColor(0xFF000000);
						EnchantEdit1.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_CLASS_PHONE);
						EnchantEdit1.setGravity(Gravity.CENTER | Gravity.TOP);
						EnchantEdit1.setTextColor(0xFF000000);
						AEditTextViewAView.addView(EnchantEdit1);
						new PromptBox().show(context, "large", "请输入:", null, new Object[]{"确定",new OnClickListener(){
													 @Override
													 public void onClick(View p1) {

													 }
												 },1}, null, new View[]{AEditTextViewAView});


						
				}}
			, null);       
		new NSwitch(ct, but, 1, "自定义碰撞箱", "</b><b>设置碰撞箱大小", aim4, new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {
					
					
						ASUI.hint(ct, "已打开自定义窗口");
						final AView AEditTextViewAView = new AView(context, null, (int)(W() * 0.8), (int)(H() * 0.6), "CC", 0, 1, "#FFFFFF", 10);
						AEditTextViewAView.setOrientation(LinearLayout.VERTICAL);
						final EditText EnchantEdit1 = new EditText(context);
						final EditText EnchantEdit2 = new EditText(context);
						
						LinearLayout.LayoutParams editParams2 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
						//
						EnchantEdit1.setLayoutParams(editParams2);
						EnchantEdit1.setHint("SetWidth");
						EnchantEdit1.setHintTextColor(0xFF000000);
						EnchantEdit1.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_CLASS_PHONE);
						EnchantEdit1.setGravity(Gravity.CENTER | Gravity.TOP);
						EnchantEdit1.setTextColor(0xFF000000);
						AEditTextViewAView.addView(EnchantEdit1);
						final AView View = new AView(context, null, (int)(W() * 0.01), (int)(H() * 0.04), "CC", 0, 1, "#FFFFFF", 10);			
						AEditTextViewAView.addView(View);
						EnchantEdit2.setLayoutParams(editParams2);
						EnchantEdit2.setHint("SetHigh");
						EnchantEdit2.setHintTextColor(0xFF000000);
						EnchantEdit2.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_CLASS_PHONE);
						EnchantEdit2.setGravity(Gravity.CENTER | Gravity.TOP);
						EnchantEdit2.setTextColor(0xFF000000);
						AEditTextViewAView.addView(EnchantEdit2);
						
						new PromptBox().show(context, "large", "请输入:", null, new Object[]{"确定",new OnClickListener(){
													 @Override
													 public void onClick(View p1) {

													 }
												 },1}, null, new View[]{AEditTextViewAView});

						
				}}
			, null);       
		
		oSeekBar = new ASeekBar(ct);
		oSeekBar.setLayoutParams(new ViewGroup.LayoutParams((int)(W() * 0.6), (int)(H() * 0.04)));
		
		but.addView(oSeekBar);


        
		
		

        pul.addView(but);

        Othercdv=new NewWindow(ct,pul,"Other",bl);
		
    }

    public static void dis(){
        if(Othercdv!=null){
            Othercdv.dis();
            Othercdv=null;
        }
    }
    public void show(){
        // aim=
        Othercdv.showAtLocation(pul,Gravity.CENTER,(int)(W()*0.05),0);
    }
    public static int W(){
        return (int) (context.getResources().getDisplayMetrics().widthPixels);
    }
    public static int H(){
        return (int) (context.getResources().getDisplayMetrics().heightPixels);
    }


}
