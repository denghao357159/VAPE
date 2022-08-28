package com.Eastiy.EXO.Menu;
import android.content.Context;
import com.Eastiy.EXO.View.*;
import android.graphics.Color;
import android.os.Handler;
import android.animation.*;
import android.view.View;
import android.view.animation.*;
import android.widget.Toast;
import android.app.Activity;
import android.widget.TextView;
import com.Eastiy.EXO.Load;
import android.widget.*;
import android.text.*;
import android.view.*;
import android.view.View.*;
import com.Eastiy.EXO.*;
import com.Eastiy.EXO.Button.c;
import android.widget.LinearLayout.*;

public class GUIMain {
	
    public static Context context;

    private static NewCDV guimdcdv;

    private static NewView guiml;

    private static NewView guiml2;

    private static NewView guiml3;

    private static NewView guiml4;

    private static NewText guimt1;

    private static NewView guimlg;

    private static NewView guiml5;

    private static NewView guiml6;

    private static NewText guimt2;

    private static NewView guiml7;

    private static boolean a=true;

    private static NewView guiml8;

    private static NewText guimt3;

    private static NewView guiml9;

    private static boolean b=false;

    private static NewView guiml10;

    private static NewText guimt4;

    private static NewView guiml11;
    
    private static boolean c=false;

    private static NewView guiml12;

    private static NewView guiml13;

    private static NewText guimt5;
    
    private static boolean d=false;

    private static NewViewSV qh1;

    private static NewView qhsv;

    private static NewViewSV qh2;

    private static NewView qhsv2;

    private static NewViewSV qh3;

    private static NewView qhsv3;

    private static NewViewSV qh4;

    private static NewView qhsv4;

    private static c C;
    
    
    private static boolean bq=false;
	
	private static boolean bq1=false;
    
    private static boolean btl=false;
    
    
    
    private static boolean zbcs=false;
    
    private static boolean bttcc=false;
    
    private static boolean btl3=false;
    
    private static boolean btach=false;
  
    private static boolean jptbutton=false;
    
    

    private static boolean killbutton=false;
    
    private static boolean jumpbutton=false;
    
    private static boolean cqbutton=false;
    
    private static boolean flybutton=false;
    
    private static boolean btc1=false;
    
    private static boolean btc=false;
    
    private static boolean btc2=false;
    
    private static boolean btc3=false;

    private static boolean btc4=false;
    
    private static boolean btc5=false;
    
    private static boolean btc6=false;
    
    private static boolean btc7=false;
    
    private static boolean btcfjt=false;
    
    private static boolean btcssxz=false;
    
    private static boolean btcwzl=false;
    
    private static boolean btc8=false;
    
	private static boolean btc9=false;
    
    private static boolean btc10=false;
    
    private static boolean btc12=false;
    
    private static boolean btc13=false;
    
    private static boolean btc14=false;
	
    private static boolean btc15=false;
    
    private static boolean btc16=false;
    
    private static boolean btc17=false;
    
    
    private static boolean btch=false;

	private static NewText text1;

	private static NewText text2;

	private static NewView Space;

	private static NewView Space2;
         
    public static void show(Context ct){
        context=ct;
        guiml = new NewView(ct, (int)(W() * 0.7), (int)(H() * 0.75), "CC", 1, 1, "#80535a", 30, null);
        guiml2 = new NewView(ct, (int)(W() * 0.65), (int)(H() * 0.15), "LC", 0, 1, "#80535a", new int[]{30,30,0,0}, null);
        guiml3 = new NewView(ct, (int)(W() * 0.6), (int)(H() * 0.75) - (int)(H() * 0.2), "LC", 0, 0, "#80535a", null, null);
		Space = new NewView(ct, (int)(W() * 0.1), (int)(H()*0.01), "CC", 0, 0, "#80535a", null, null);
		
        guimt1 = new NewText(ct, ASUI.FontColor("§l Home"), "LC", 18, "#fadfc4");
		Space = new NewView(ct, (int)(W() * 0.1), (int)(H()*0.01), "CC", 0, 0, "#80535a", null, null);
		text1 = new NewText(ct, ASUI.FontColor("§l Favourite"), "LC", 13, "#fadfc4");
		Space2 = new NewView(ct, (int)(W() * 0.1), (int)(H()*0.01), "CC", 0, 0, "#80535a", null, null);
		
		text2 = new NewText(ct, ASUI.FontColor("§l Config"), "LC", 13, "#fadfc4");
		
        guimt1.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Load.fw.show();
                    dis();
                }
            });
			
        guiml4 = new NewView(ct, (int)(W() * 0.12), (int)(H() * 0.55), "LC", 1, 0, "#80535a", null, null);
        //切换
        guiml5 = new NewView(ct, (int)(W() * 0.48), (int)(H() * 0.55), "CT", 1, 0, "#80535a", null, null);
        
       
        //1
        //1
        guiml6 = new NewView(ct, (int)(W() * 0.12), (int)(H() * 0.12), "LC", 1, 0, "#80535a", null, null);
        guimt2 = new NewText(ct, ASUI.FontColor("§lPVP"), "LC", 15, "#fadfc4");
        guiml7 = new NewView(ct, (int)(W() * 0.05), (int)(H() * 0.01), "CC", 1, 1, "#eeeecf", 360, null);
        if(a==true){
			guimt1.setTextColor(Color.parseColor("#eeeecf"));
			dhh(guiml7);
        }
        guiml6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(b==true){
                        dosdhh(guiml9);
                    }else if(c==true){
                        dosdhh(guiml11);
                    }else if(d==true){
                        dosdhh(guiml13);
                    }
                    if(a==false){
                        ASUI.UIPlumb(qh1 ,100,0 ,150,null);
                        qh1.setVisibility(qh1.VISIBLE);
                        qh2.setVisibility(qh2.GONE);
                        qh3.setVisibility(qh3.GONE);
                        qh4.setVisibility(qh4.GONE);
                        dhh(guiml7);
                        a=true;
                        b=false;
                        c=false;
                        d=false;
                        guimt2.setTextColor(Color.parseColor("#eeeecf"));
                        guimt3.setTextColor(Color.parseColor("#ffffff"));
                        guimt4.setTextColor(Color.parseColor("#ffffff"));
                        guimt5.setTextColor(Color.parseColor("#ffffff"));
                    }
                }
            });
        //2
        guiml8 = new NewView(ct, (int)(W() * 0.12), (int)(H() * 0.12), "LC", 1, 0, "#80535a", null, null);
        guimt3 = new NewText(ct, ASUI.FontColor("§l移动"), "LC", 15, "#fadfc4");
        guiml9 = new NewView(ct, (int)(W() * 0.05), (int)(H() * 0.01), "CC", 1, 1, "#eeeecf", 360, null);
        guiml8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(a==true){
                        dosdhh(guiml7);
                    }else if(c==true){
                        dosdhh(guiml11);
                    }else if(d==true){
                        dosdhh(guiml13);
                    }
                    if(b==false){
                        ASUI.UIPlumb(qh2 ,100,0 ,150,null);
                        qh1.setVisibility(qh1.GONE);
                        qh2.setVisibility(qh2.VISIBLE);
                        qh3.setVisibility(qh3.GONE);
                        qh4.setVisibility(qh4.GONE);
                        dhh(guiml9);
                        b=true;
                        a=false;
                        c=false;
                        d=false;
                        guimt3.setTextColor(Color.parseColor("#eeeecf"));
                        guimt2.setTextColor(Color.parseColor("#ffffff"));
                        guimt4.setTextColor(Color.parseColor("#ffffff"));
                        guimt5.setTextColor(Color.parseColor("#ffffff"));
                    }
                }
            });

        //3
        guiml10 = new NewView(ct, (int)(W() * 0.12), (int)(H() * 0.12), "LC", 1, 0, "#00000000", null, null);
        guimt4 = new NewText(ct, ASUI.FontColor("§l生存"), "LC", 15, "#fadfc4");
        guiml11 = new NewView(ct, (int)(W() * 0.05), (int)(H() * 0.01), "CC", 1, 1, "#eeeecf", 360, null);
        guiml10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(a==true){
                        dosdhh(guiml7);
                    }else if(b==true){
                        dosdhh(guiml9);
                    }else if(d==true){
                        dosdhh(guiml13);
                    }
                    if(c==false){
                        ASUI.UIPlumb(qh3 ,100,0 ,150,null);
                        qh1.setVisibility(qh1.GONE);
                        qh2.setVisibility(qh2.GONE);
                        qh3.setVisibility(qh3.VISIBLE);
                        qh4.setVisibility(qh4.GONE);
                        dhh(guiml11);
                        c=true;
                        a=false;
                        b=false;
                        d=false;
                        guimt4.setTextColor(Color.parseColor("#eeeecf"));
                        guimt2.setTextColor(Color.parseColor("#ffffff"));
                        guimt3.setTextColor(Color.parseColor("#ffffff"));
                        guimt5.setTextColor(Color.parseColor("#ffffff"));
                    }
                }
            });


        //4
        guiml12 = new NewView(ct, (int)(W() * 0.12), (int)(H() * 0.12), "LC", 1, 0, "#80535a", null, null);
        guimt5 = new NewText(ct, ASUI.FontColor("§l界面"), "LC", 15, "#fadfc4");
        guiml13 = new NewView(ct, (int)(W() * 0.05), (int)(H() * 0.01), "CC", 1, 1, "#eeeecf", 360, null);
        guiml12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(a==true){
                        dosdhh(guiml7);
                    }else if(c==true){
                        dosdhh(guiml11);
                    }else if(b==true){
                        dosdhh(guiml9);
                    }
                    if(d==false){
                        ASUI.UIPlumb(qh4 ,100,0 ,150,null);
                        qh1.setVisibility(qh1.GONE);
                        qh2.setVisibility(qh2.GONE);
                        qh3.setVisibility(qh3.GONE);
                        qh4.setVisibility(qh4.VISIBLE);
                        dhh(guiml13);
                        d=true;
                        a=false;
                        c=false;
                        b=false;
                        guimt5.setTextColor(Color.parseColor("#eeeecf"));
                        guimt2.setTextColor(Color.parseColor("#ffffff"));
                        guimt4.setTextColor(Color.parseColor("#ffffff"));
                        guimt3.setTextColor(Color.parseColor("#ffffff"));
                    }
                }
            });
		
        /*选择结束*/
        
        /*切换UI*/
        //1
        qhsv=new NewView(ct, (int)(W() * 0.48), (int)(H() * 0.55), "CT", 1, 2,null, null, null);
        qh1=new NewViewSV(ct,-2,-2,2,null,null);
        //2
        qhsv2=new NewView(ct, (int)(W() * 0.48), (int)(H() * 0.55), "CT", 1, 2,null, null, null);
        qh2=new NewViewSV(ct,-2,-2,2,null,null);
        //3
        qhsv3=new NewView(ct, (int)(W() * 0.48), (int)(H() * 0.55), "CT", 1, 2,null, null, null);
        qh3=new NewViewSV(ct,-2,-2,2,null,null);
        //4
        qhsv4=new NewView(ct, (int)(W() * 0.48), (int)(H() * 0.55), "CT", 1, 2,null, null, null);
        qh4=new NewViewSV(ct,-2,-2,2,null,null);
        /*结束切换*/
        
        /*底部空格*/
        guimlg = new NewView(ct, (int)(W() * 0.7), (int)(H() * 0.05), "CC", 1, 2,null, null, null);
        /*底部空格结束*/
        
        
        guiml.addView(guiml2);
        guiml2.addView(guimt1);
		guiml2.addView(Space);
		guiml2.addView(text1);
		guiml2.addView(Space2);
		guiml2.addView(text2);
        guiml.addView(guiml3);
        guiml3.addView(guiml4);
        guiml3.addView(guiml5);
        /*开始*/
        //1
        guiml4.addView(guiml6);
        guiml6.addView(guimt2);
        guiml6.addView(guiml7);
        
        //2
        guiml4.addView(guiml8);
        guiml8.addView(guimt3);
        guiml8.addView(guiml9);
        
        //3
        guiml4.addView(guiml10);
        guiml10.addView(guimt4);
        guiml10.addView(guiml11);
        
        //4
        guiml4.addView(guiml12);
        guiml12.addView(guimt5);
        guiml12.addView(guiml13);
        /*切换*/
        guiml5.addView(qh1);
        guiml5.addView(qh2);
        guiml5.addView(qh3);
        guiml5.addView(qh4);
        /*分割*/
        qh1.addView(qhsv);
        qh2.addView(qhsv2);
        qh3.addView(qhsv3);
        qh4.addView(qhsv4);
        /*分割*/
        qh1.setVisibility(qh1.VISIBLE);
        qh2.setVisibility(qh2.GONE);
        qh3.setVisibility(qh3.GONE);
        qh4.setVisibility(qh4.GONE);
        /*结束*/
        /*功能列表*/
        //1
      
      new SwitchBut(context, qhsv, btc, "玩家杀戮", "自动攻击范围内所有玩家",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btc==false){
                        
                        Toast.makeText(context, "开启成功", Toast.LENGTH_SHORT).show();
                        btc=true;
                        
                        
                    }else{
				
						
                        Toast.makeText(context, "关闭成功", Toast.LENGTH_SHORT).show();
                        btc=false;
                        
                        
                    }
                    }
            });
                    new SwitchBut(context, qhsv, btc1, "实体杀戮", "自动攻击范围内所有实体",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btc1==false){
						
                        Toast.makeText(context, "开启成功", Toast.LENGTH_SHORT).show();
                        btc1=true;
                        
                        
                    }else{
						
                        Toast.makeText(context, "关闭成功", Toast.LENGTH_SHORT).show();
                        btc1=false;
                        
                        
                    }
                    }
            });
            
		new SwitchBut(context, qhsv, btc2, "设置杀戮", "自定义杀戮频率+范围", new ASwitch.OnASwitchChangeListener(){

				private dialogbox dialogbox;

				@Override
				public void onASwitchChangeListener(boolean isOn) {        
				
                    final AView AEditTextViewAView = new AView(context, null, (int)(W() * 0.8), (int)(H() * 0.4), "CC", 0, 1, "#80535a", 360);
                    AEditTextViewAView.setOrientation(LinearLayout.VERTICAL);
                    final EditText EnchantEdit = new EditText(context);
                    final EditText NewEnchantEdit = new EditText(context);
                    LinearLayout.LayoutParams editParams2 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                    //
                    EnchantEdit.setLayoutParams(editParams2);
                    EnchantEdit.setHint("SetCps");
                    EnchantEdit.setHintTextColor(0xFF00000000);
                    EnchantEdit.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_CLASS_PHONE);
                    EnchantEdit.setGravity(Gravity.CENTER | Gravity.TOP);
                    EnchantEdit.setTextColor(0xFF000000);
                    AEditTextViewAView.addView(EnchantEdit);
                    TextView texta = new TextView(context);
                    texta.setText("\n");
                    AEditTextViewAView.addView(texta);
                    NewEnchantEdit.setLayoutParams(editParams2);
                    NewEnchantEdit.setHint("SetRange");
                    NewEnchantEdit.setHintTextColor(0xFF00000000);
                    NewEnchantEdit.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_CLASS_PHONE);
                    NewEnchantEdit.setGravity(Gravity.CENTER | Gravity.TOP);
                    NewEnchantEdit.setTextColor(0xFF000000);
                    AEditTextViewAView.addView(NewEnchantEdit);
                    new PromptBox().show(context, "large", "请输入id:", null, new Object[]{"确定",new OnClickListener(){
                                                 @Override
                                                 public void onClick(View p1) {
                                                              
                                                 }
                                             },1}, null, new View[]{AEditTextViewAView});
					
												 

                    
                }


            });


		
        new SwitchBut(context, qhsv, btc3, "玩家体积", "所玩家的实体扩大",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btc3==false){
                        Toast.makeText(context, "开启成功", Toast.LENGTH_SHORT).show();
                        btc3=true;
                    }else{
                   
                        Toast.makeText(context, "关闭成功", Toast.LENGTH_SHORT).show();
                        btc3=false;
                        
                        
                    }
                    }
            });
            	
        new SwitchBut(context, qhsv, bttcc, "实体体积", "所有生命体的实体扩大",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btc3==false){
               
                        Toast.makeText(context, "开启成功", Toast.LENGTH_SHORT).show();
                        btc3=true;
                        
                        
                    }else{
                   
                        Toast.makeText(context, "关闭成功", Toast.LENGTH_SHORT).show();
                        btc3=false;
                        
                        
                    }
                    }
            });
        new SwitchBut(context, qhsv, btc4, "锁定上方", "TP至离附近最短的玩家头上",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btc4==false){
                  
                        Toast.makeText(context, "开启成功", Toast.LENGTH_SHORT).show();
                        btc4=true;
                        
                        
                    }else{
                  
                        Toast.makeText(context, "关闭成功", Toast.LENGTH_SHORT).show();
                        btc4=false;
                        
                        
                    }
                    }
            });

                new SwitchBut(context, qhsv, btc5, "激流杀戮", "自动攻击范围内实体",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btc5==false){
                    
                        Toast.makeText(context, "开启成功", Toast.LENGTH_SHORT).show();
                        btc5=true;
                        
                        
                    }else{
                  
                        Toast.makeText(context, "关闭成功", Toast.LENGTH_SHORT).show();
                        btc5=false;
                        
                        
                    }
                    }
            });
        new SwitchBut(context, qhsv, btc6, "锁定目标", "自动向前方点击",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btc6==false){
                    
                        Toast.makeText(context, "开启成功", Toast.LENGTH_SHORT).show();
                        btc6=true;
                        
                        
                    }else{
                 
                        Toast.makeText(context, "关闭成功", Toast.LENGTH_SHORT).show();
                        btc6=false;
                        
                        
                    }
                    }
            });

            //2
            new SwitchBut(context, qhsv, btl, "环绕目标", "瞄准玩家并在周围360度旋转",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btl==false){
                    
                        Toast.makeText(context, "开启成功", Toast.LENGTH_SHORT).show();
                        btl=true;
                        
                        
                    }else{
                  
                        Toast.makeText(context, "关闭成功", Toast.LENGTH_SHORT).show();
                        btl=false;
                        
                        
                    }
                    }
            });
                    new SwitchBut(context, qhsv, btc7, "黑洞杀", "将附近的人集中在自己身上",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btc7==false){
                  
                        Toast.makeText(context, "开启成功", Toast.LENGTH_SHORT).show();
                        btc7=true;
                        
                        
                    }else{
                
                        Toast.makeText(context, "关闭成功", Toast.LENGTH_SHORT).show();
                        btc7=false;
                        
                        
                    }
                    }
            });
            
            new SwitchBut(context, qhsv2, btch, "飞行变速", "自定义飞行速度",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {              final AView AEditTextViewAView = new AView(context, null, (int)(W() * 0.8), (int)(H() * 0.4), "CC", 0, 1, "#80535a", 360);
                    AEditTextViewAView.setOrientation(LinearLayout.VERTICAL);
                    final EditText EnchantEdit2 = new EditText(context);
 
                    LinearLayout.LayoutParams editParams2 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                    //
                    EnchantEdit2.setLayoutParams(editParams2);
                    EnchantEdit2.setHint("倍速");
                    EnchantEdit2.setHintTextColor(0xFF000000);
                    EnchantEdit2.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_CLASS_PHONE);
                    EnchantEdit2.setGravity(Gravity.CENTER | Gravity.TOP);
                    EnchantEdit2.setTextColor(0xFF000000);
                    AEditTextViewAView.addView(EnchantEdit2);

                    new PromptBox().show(context, "large", "请输入倍速:", null, new Object[]{"确定",new OnClickListener(){
                                                 @Override
                                                 public void onClick(View p1) {
                                                                                       
                                                 }
                                             },1}, null, new View[]{AEditTextViewAView});

                    }
            });
new SwitchBut(context, qhsv2, btach, "人物变速", "自定义人物变速",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {          final AView AEditTextViewAView = new AView(context, null, (int)(W() * 0.8), (int)(H() * 0.4), "CC", 0, 1, "#80535a", 360);
                    AEditTextViewAView.setOrientation(LinearLayout.VERTICAL);
                    final EditText EnchantEdit3 = new EditText(context);
 
                    LinearLayout.LayoutParams editParams2 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                    //
                    EnchantEdit3.setLayoutParams(editParams2);
                    EnchantEdit3.setHint("倍速");
                    EnchantEdit3.setHintTextColor(0xFF000000);
                    EnchantEdit3.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_CLASS_PHONE);
                    EnchantEdit3.setGravity(Gravity.CENTER | Gravity.TOP);
                    EnchantEdit3.setTextColor(0xFF000000);
                    AEditTextViewAView.addView(EnchantEdit3);

                    new PromptBox().show(context, "large", "请输入倍速:", null, new Object[]{"确定",new OnClickListener(){
                                                 @Override
                                                 public void onClick(View p1) {
                                                     
                                                 
                                                 }
                                             },1}, null, new View[]{AEditTextViewAView});

                    }
            });
        new SwitchBut(context, qhsv2, btc8, "锁定飞行", "锁定人物飞行模式",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btc8==false){
                        ASUI.hint(context,"锁定飞行");
                 
                        Toast.makeText(context, "开启成功", Toast.LENGTH_SHORT).show();
                        btc8=true;
                        
                        
                    }else{
                        
                        Toast.makeText(context, "关闭成功", Toast.LENGTH_SHORT).show();
                        btc8=false;
                        
                        
                    }
                    }
            });
            
            
        new SwitchBut(context, qhsv2, btl3, "喷气背包", "向人物目标前进",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btl3==false){
                    
                    
                        Toast.makeText(context, "开启成功", Toast.LENGTH_SHORT).show();
                        btl3=true;
                        
                        
                    }else{
                    
                        Toast.makeText(context, "关闭成功", Toast.LENGTH_SHORT).show();
                        btl3=false;
                        
                        
                    }
                    }
            });

        new SwitchBut(context, qhsv2, btc9, "人物穿墙", "人物穿墙模式",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btc9==false){
                    
					
                        Toast.makeText(context, "开启成功", Toast.LENGTH_SHORT).show();
                        btc9=true;
                        
                        
                    }else{
                    
                        Toast.makeText(context, "关闭成功", Toast.LENGTH_SHORT).show();
                        btc9=false;
                        
                        
                    }
                    }
            });
       new SwitchBut(context, qhsv2, btc10, "虚空回弹", "掉下虚空会回到掉落前的方块",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btc10==false){
                    
					
                        Toast.makeText(context, "开启成功", Toast.LENGTH_SHORT).show();
                        btc10=true;
                        
                        
                    }else{
                  
                        Toast.makeText(context, "关闭成功", Toast.LENGTH_SHORT).show();
                        btc10=false;
                        
                        
                    }
                    }
            });
        new SwitchBut(context, qhsv2, btc12, "点击传送", "点击那个方块传送到哪",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btc12==false){
            
				
                        Toast.makeText(context, "开启成功", Toast.LENGTH_SHORT).show();
                        btc12=true;
                        
                        
                    }else{
                 
                        Toast.makeText(context, "关闭成功", Toast.LENGTH_SHORT).show();
                        btc12=false;
                        
                        
                    }
                    }
            });

            
                    new SwitchBut(context, qhsv2, btc13, "飞行权限", "获取飞行权限",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btc13==false){
                           
                        Toast.makeText(context, "开启成功", Toast.LENGTH_SHORT).show();
                        btc13=true;
                        
                        
                    }else{
                           
                        Toast.makeText(context, "关闭成功", Toast.LENGTH_SHORT).show();
                        btc13=false;
                        
                        
                    }
                    }
            });
                                new SwitchBut(context, qhsv3, btcfjt, "反击退", "不会被击退",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btcfjt==false){
                           
                        Toast.makeText(context, "开启成功", Toast.LENGTH_SHORT).show();
                        btcfjt=true;
                        
                        
                    }else{
                           
                        Toast.makeText(context, "关闭成功", Toast.LENGTH_SHORT).show();
                        btcfjt=false;
                        
                        
                    }
                    }
            });
                new SwitchBut(context, qhsv3, btcwzl, "无重力", "不会被击退",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btcwzl==false){
                           
                        Toast.makeText(context, "开启成功", Toast.LENGTH_SHORT).show();
                        btcwzl=true;
                        
                        
                    }else{
                           
                        Toast.makeText(context, "关闭成功", Toast.LENGTH_SHORT).show();
                        btcwzl=false;
                        
                        
                    }
                    }
            });
            new SwitchBut(context, qhsv2, btcssxz, "水上行走", "不会被击退",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btcssxz==false){
                           
                        Toast.makeText(context, "开启成功", Toast.LENGTH_SHORT).show();
                        btcssxz=true;
                        
                        
                    }else{
                           
                        Toast.makeText(context, "关闭成功", Toast.LENGTH_SHORT).show();
                        btcssxz=false;
                        
                        
                    }
                    }
            });
            //临时插件
        new SwitchBut(context, qhsv, btc14, "自动挖床", "会自动破坏范围内5米的蛋糕",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btc14==false){
                   
                        Toast.makeText(context, "开启成功", Toast.LENGTH_SHORT).show();
                        btc14=true;
                        
                        
                    }else{
                    
                        Toast.makeText(context, "关闭成功", Toast.LENGTH_SHORT).show();
                        btc14=false;
                        
                        
                    }
                    }
            });
            //3
            
        new SwitchBut(context, qhsv3, btc15, "创造背包", "获取管理员权限和万能副手",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btc15==false){
                
					Toast.makeText(context, "开启成功", Toast.LENGTH_SHORT).show();
                        btc15=true;
                        
                        
                    }else{
               
                        Toast.makeText(context, "关闭成功", Toast.LENGTH_SHORT).show();
                        btc15=false;
                        
                        
                    }
                    }
            });
                        
        new SwitchBut(context, qhsv3, zbcs, "坐标传送", "XYZ轴自定义传送",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {      final AView AEditTextViewAView = new AView(context, null, (int)(W() * 0.8), (int)(H() * 0.4), "CC", 0, 1, "#80535a", 360);
                    AEditTextViewAView.setOrientation(LinearLayout.VERTICAL);
                    final EditText EnchantEdit1 = new EditText(context);
                    final EditText NewEnchantEdit1 = new EditText(context);
                    final EditText NewEnchantEdit2 = new EditText(context);
                    LinearLayout.LayoutParams editParams2 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                    //
                    EnchantEdit1.setLayoutParams(editParams2);
                    EnchantEdit1.setHint("X轴");
                    EnchantEdit1.setHintTextColor(0xFF000000);
                    EnchantEdit1.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_CLASS_PHONE);
                    EnchantEdit1.setGravity(Gravity.CENTER | Gravity.TOP);
                    EnchantEdit1.setTextColor(0xFF000000);
                    AEditTextViewAView.addView(EnchantEdit1);
                    TextView texta = new TextView(context);
                    texta.setText("\n");
                    AEditTextViewAView.addView(texta);
                    NewEnchantEdit1.setLayoutParams(editParams2);
                    NewEnchantEdit1.setHint("Y轴");
                    NewEnchantEdit1.setHintTextColor(0xFF000000);
                    NewEnchantEdit1.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_CLASS_PHONE);
                    NewEnchantEdit1.setGravity(Gravity.CENTER | Gravity.TOP);
                    NewEnchantEdit1.setTextColor(0xFF000000);
                    AEditTextViewAView.addView(NewEnchantEdit1);
                    TextView te = new TextView(context);
                    te.setText("\n");
                    AEditTextViewAView.addView(texta);
                    NewEnchantEdit2.setLayoutParams(editParams2);
                    NewEnchantEdit2.setHint("Z轴");
                    NewEnchantEdit2.setHintTextColor(0xFF000000);
                    NewEnchantEdit2.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_CLASS_PHONE);
                    NewEnchantEdit2.setGravity(Gravity.CENTER | Gravity.TOP);
                    NewEnchantEdit2.setTextColor(0xFF000000);
                    AEditTextViewAView.addView(NewEnchantEdit2);
                    new PromptBox().show(context, "large", "请输入坐标:", null, new Object[]{"确定",new OnClickListener(){
                                                 @Override
                                                 public void onClick(View p1) {
                                                    
													 
                                                 
                                                 }
                                             },1}, null, new View[]{AEditTextViewAView});

                        
                    
                    }
            });
     new SwitchBut(context, qhsv3, btc16, "点击破坏", "点击方块即可破坏",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btc16==false){
                    
                        Toast.makeText(context, "开启成功", Toast.LENGTH_SHORT).show();
                        btc16=true;
                        
                        
                    }else{
             
                        Toast.makeText(context, "关闭成功", Toast.LENGTH_SHORT).show();
                        btc16=false;
                        
                        
                    }
                    }
            });
            new SwitchBut(context, qhsv3, btc16, "矿物透视", "显示所有矿物",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btc16==false){
                    
                        Toast.makeText(context, "开启成功", Toast.LENGTH_SHORT).show();
                        btc16=true;
                        
                        
                    }else{
             
                        Toast.makeText(context, "关闭成功", Toast.LENGTH_SHORT).show();
                        btc16=false;
                        
                        
                    }
                    }
            });
            new SwitchBut(context, qhsv3, btc16, "夜视效果", "点击方块即可破坏",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btc16==false){
                    
                        Toast.makeText(context, "开启成功", Toast.LENGTH_SHORT).show();
                        btc16=true;
                        
                        
                    }else{
             
                        Toast.makeText(context, "关闭成功", Toast.LENGTH_SHORT).show();
                        btc16=false;
                        
                        
                    }
                    }
            });
            new SwitchBut(context, qhsv3, btc16, "玩家方框", "点击方块即可破坏",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btc16==false){
                    
                        Toast.makeText(context, "开启成功", Toast.LENGTH_SHORT).show();
                        btc16=true;
                        
                        
                    }else{
             
                        Toast.makeText(context, "关闭成功", Toast.LENGTH_SHORT).show();
                        btc16=false;
                        
                        
                    }
                    }
            });
            new SwitchBut(context, qhsv3, btc16, "玩家射线", "点击方块即可破坏",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btc16==false){
                    
                        Toast.makeText(context, "开启成功", Toast.LENGTH_SHORT).show();
                        btc16=true;
                        
                        
                    }else{
             
                        Toast.makeText(context, "关闭成功", Toast.LENGTH_SHORT).show();
                        btc16=false;
                        
                        
                    }
                    }
            });
            new SwitchBut(context, qhsv3, btc16, "玩家显血", "点击方块即可破坏",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btc16==false){
                    
                        Toast.makeText(context, "开启成功", Toast.LENGTH_SHORT).show();
                        btc16=true;
                        
                        
                    }else{
             
                        Toast.makeText(context, "关闭成功", Toast.LENGTH_SHORT).show();
                        btc16=false;
                        
                        
                    }
                    }
            });
            new SwitchBut(context, qhsv3, btc16, "一键崩服", "点击方块即可破坏",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btc16==false){
                    
                        Toast.makeText(context, "开启成功", Toast.LENGTH_SHORT).show();
                        btc16=true;
                        
                        
                    }else{
             
                        Toast.makeText(context, "关闭成功", Toast.LENGTH_SHORT).show();
                        btc16=false;
                        
                        
                    }
                    }
            });
            new SwitchBut(context, qhsv3, btc16, "强开坐标", "点击方块即可破坏",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btc16==false){
                    
                        Toast.makeText(context, "开启成功", Toast.LENGTH_SHORT).show();
                        btc16=true;
                        
                        
                    }else{
             
                        Toast.makeText(context, "关闭成功", Toast.LENGTH_SHORT).show();
                        btc16=false;
                        
                        
                    }
                    }
            });
        new SwitchBut(context, qhsv3, btc17, "范围破坏", "3*3*3的方块破坏",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btc17==false){
                  
                        Toast.makeText(context, "开启成功", Toast.LENGTH_SHORT).show();
                        btc17=true;
                        
                        
                    }else{
                 
                        Toast.makeText(context, "关闭成功", Toast.LENGTH_SHORT).show();
                        btc17=false;
                        
                        
                    }
                    }
            });
        
            
                    
            //4 
        new SwitchBut(context, qhsv4, false, "用户协议", "务必不要二改",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    PromptBox.show(context,"large","协议",new String[]{"§l一、特别提示§r",
                                       "1、您在使用本Online Lite及相关产品/功能(以下简称'Online Lite')提供的各项服务之前,应仔细阅读本服务协议(以下简称 '用户协议' ).",
                                       "2、如您不同意本协议及/或开发者随时对其的修改,您可以主动取消Online Lite提供的服务;您一旦使用Online Lite,即视为您已了解并完全同意本服务协议各项内容,包括Online Lite对服务协议随时所做的任何修改,并成为Online Lite用户.",
                                       "§l二、隐私政策§r",
                                       "1、Online Lite尊重并保护所有使用服务用户的个人隐私权.",
                                       "2、为了给您提供更准确、更有个性化的服务,Online Lite会按照本隐私权政策的规定使用和披露您的个人信息.",
                                       "3、除本隐私权政策另有规定外,在未征得您事先许可的情况下,Online Lite不会将这些信息对外披露或向第三方提供.",
                                       "4、您在同意本应用服务使用协议之时,即视为您已经同意本隐私权政策全部内容.",
                                       "5、本隐私权政策属于本应用服务使用协议不可分割的一部分.",
                                       "§l三、使用规则§r",
                                       "1、用户在使用Online Lite时,必须遵守中华人民共和国相关法律法规的规定,用户应同意将不会利用本服务Online Lite进行任何违法或不正当的活动.",
                                       "2、用户违反本协议或相关的服务条款的规定,导致或产生的任何第三方主张的任何索赔、要求或损失,您同意赔偿Online Lite与作者并使之免受损害.",
                                       "3、对此.Online Lite有权视用户的行为性质,采取包括但不限于终止服务、限制使用、追究法律责任等措施.",
                                       "4、用户不得对本服务任何部分或本服务之使用或获得,进行复制、拷贝、出售、转售或用于任何其它商业目的.",
                                       "5、用户须对自己在使用Online Lite过程中的行为承担相应责任.",
                                       "",
                                       "",
                                       "免责声明及使用条款:(Online Lite Team)</font><font color=#000000>",
                                       "使用该资源表示您已同意并接受相关条款.",
                                       "1、资源仅作分享,作者不会对使用者使用该资源造成的一切后果负责,包括但不限于流量的收取、数据的损坏等.",
                                       "2、对于存在于源码中非原创未授权的代码,已尽可能联系原作者,但由于互联网的复杂性可能有疏漏,可联系我处理,但不会负其它责任.",
                                       "3、对于版本更新、免责声明等公告修改时,请用户查询并阅读有关内容,若继续使用代表同意,否则应停止使用.",
                                       "4、禁止盗用代码/破解代码/修改代码/未经允许发布到第三方平台,或提供给个人使用.",
                                       "5、禁止在作者注册的相关网络平台进行骚扰.禁止无脑威胁/强迫作做一些不正当的事",
                                       "6、请勿使用他人的破解/魔改端,可能含有病毒或不良信息,请使用作者发布的正版.",
                                       "7、一切解释权归作者所有.如果您违反上述一条规定,赔款按照情况",
                                       "8、注:违约将承担其责任,本UI作者:Answer 2903536884",
                                       "§l四、其他",
                                       "1、如双方就本协议内容或其执行发生任何争议，双方应尽量友好协商解决。",
                                       "2、Online Lite未行使或执行本服务协议任何权利或规定，不构成对前述权利或权利之放弃。",
                                       "3、如本协议中的任何条款无论因何种原因完全或部分无效或不具有执行力，本协议的其余条款仍应有效并且有约束力。",
                                       "4、此协议的最终解释权归Online Lite开发者所有",
                                       "5、以上协议对于疯婆婆来说就是狗屁",
                                       "",
                                       "",
                                       "BY Answer",
                                       "修订日期：2021-01-16-1"},new Object[]{"§4拒绝",new View.OnClickListener() {@Override
                                           public void onClick(View view) {
                                               Activity ac=(Activity)(context);
                                               ac.finish();
                                           }},1},new Object[]{"§1同意",new View.OnClickListener() {@Override
                                                   public void onClick(View view) {}},1},null);
                }
            });
        
        
           
            
            
            new SwitchBut(context, qhsv4, killbutton, "杀戮按钮", "玩家杀戮的快捷按钮",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(killbutton==false){
				
                        Toast.makeText(context, "开启成功", Toast.LENGTH_SHORT).show();
                        killbutton=true;
                        
                        
                    }else{
			
                        Toast.makeText(context, "关闭成功", Toast.LENGTH_SHORT).show();
                        killbutton=false;
                        
                        
                    }
                    }
            });
            new SwitchBut(context, qhsv4, jumpbutton, "跳跃按钮", "单次跳跃的快捷按钮",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(jumpbutton==false){
                   
                        Toast.makeText(context, "开启成功", Toast.LENGTH_SHORT).show();
                        jumpbutton=true;
                        
                        
                    }else{
                
                        Toast.makeText(context, "关闭成功", Toast.LENGTH_SHORT).show();
                        jumpbutton=false;
                        
                     
                    }
                    }
            });
           new SwitchBut(context, qhsv4, jptbutton, "喷气按钮", "喷气背包的快捷按钮",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(jptbutton==false){
                    
                        Toast.makeText(context, "开启成功", Toast.LENGTH_SHORT).show();
                        jptbutton=true;
                        
                        
                    }else{
                  
                        Toast.makeText(context, "关闭成功", Toast.LENGTH_SHORT).show();
                        jptbutton=false;
                        
                        
                    }
                    }
            });
            
            new SwitchBut(context, qhsv4, cqbutton, "穿墙按钮", "人物穿墙的快捷按钮",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(cqbutton==false){
                        C.show(context);
                        cqbutton=true;
                        ASUI.hint(context,"穿墙");
                        
                    }else{
                        C.dis();
                        cqbutton=false;
                        ASUI.hout(context,"穿墙");
                        
                    }
                    }
            });
            new SwitchBut(context, qhsv4, flybutton, "飞行按钮", "人物穿墙的快捷按钮",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(flybutton==false){
                    
                        Toast.makeText(context, "开启成功", Toast.LENGTH_SHORT).show();
                        flybutton=true;
                        
                        
                    }else{
                   
                        Toast.makeText(context, "关闭成功", Toast.LENGTH_SHORT).show();
                        flybutton=false;
                        
                        
                    }
                    }
            });
        guiml.addView(guimlg);

        
        
        
        guimdcdv=new NewCDV(guiml,(int)(W()*0.7),(int)(H()*0.75),false,true,true,"CC","Tr",0,0);

    }
    
    public static void dis(){
        if(guimdcdv!=null){
        guimdcdv.dismiss();
        guimdcdv=null;
        }
    }

    private static int W(){
        return (int) (context.getResources().getDisplayMetrics().widthPixels);
    }

    private static int H(){
        return (int) (context.getResources().getDisplayMetrics().heightPixels);
    }
    private static void dhh(final View guiml7){
        guiml7.setBackgroundDrawable(ASUI.roundBG("#ff3778d9",360,null,null));
        guiml7.setLayoutParams(new android.widget.LinearLayout.LayoutParams((int)(W()*0.05),(int)(H()*0.01)));
        new Handler().postDelayed(new Runnable(){
                @Override
                public void run() {
                    new Handler().postDelayed(new Runnable(){
                            @Override
                            public void run() {
                                guiml7.setLayoutParams(new android.widget.LinearLayout.LayoutParams((int)(W()*0.045),(int)(H()*0.01)));
                                new Handler().postDelayed(new Runnable(){
                                        @Override
                                        public void run() {
                                            guiml7.setLayoutParams(new android.widget.LinearLayout.LayoutParams((int)(W()*0.04),(int)(H()*0.01)));
                                            new Handler().postDelayed(new Runnable(){
                                                    @Override
                                                    public void run() {
                                                        guiml7.setLayoutParams(new android.widget.LinearLayout.LayoutParams((int)(W()*0.035),(int)(H()*0.01)));
                                                        new Handler().postDelayed(new Runnable(){
                                                                @Override
                                                                public void run() {
                                                                    guiml7.setLayoutParams(new android.widget.LinearLayout.LayoutParams((int)(W()*0.03),(int)(H()*0.01)));
                                                                    new Handler().postDelayed(new Runnable(){
                                                                            @Override
                                                                            public void run() {
                                                                                guiml7.setLayoutParams(new android.widget.LinearLayout.LayoutParams((int)(W()*0.025),(int)(H()*0.01)));
                                                                                new Handler().postDelayed(new Runnable(){
                                                                                        @Override
                                                                                        public void run() {
                                                                                            guiml7.setLayoutParams(new android.widget.LinearLayout.LayoutParams((int)(W()*0.02),(int)(H()*0.01)));
                                                                                            new Handler().postDelayed(new Runnable(){

                                                                                                    @Override
                                                                                                    public void run() {
                                                                                                        guiml7.setLayoutParams(new android.widget.LinearLayout.LayoutParams((int)(W()*0.015),(int)(H()*0.01)));
                                                                                                        new Handler().postDelayed(new Runnable(){

                                                                                                                @Override
                                                                                                                public void run() {
                                                                                                                    guiml7.setLayoutParams(new android.widget.LinearLayout.LayoutParams((int)(W()*0.01),(int)(H()*0.01)));
                                                                                                                }
                                                                                                            }, 30);
                                                                                                    }
                                                                                                }, 20);
                                                                                        }
                                                                                    }, 50);
                                                                            }
                                                                        }, 50);
                                                                }
                                                            }, 50);
                                                    }
                                                }, 50);
                                        }
                                    }, 50);
                            }
                        }, 50);
                }
            }, 50);
    }
    private static void dosdhh(final View v){
        v.setBackgroundDrawable(ASUI.roundBG("#eeeecf",360,null,null));
        v.setLayoutParams(new android.widget.LinearLayout.LayoutParams((int)(W()*0.01),(int)(H()*0.01)));
        new Handler().postDelayed(new Runnable(){
                @Override
                public void run() {
                    v.setLayoutParams(new android.widget.LinearLayout.LayoutParams((int)(W()*0.015),(int)(H()*0.01)));
                    new Handler().postDelayed(new Runnable(){
                            @Override
                            public void run() {
                                v.setLayoutParams(new android.widget.LinearLayout.LayoutParams((int)(W()*0.02),(int)(H()*0.01)));
                                new Handler().postDelayed(new Runnable(){
                                        @Override
                                        public void run() {
                                            v.setLayoutParams(new android.widget.LinearLayout.LayoutParams((int)(W()*0.025),(int)(H()*0.01)));
                                            new Handler().postDelayed(new Runnable(){
                                                    @Override
                                                    public void run() {
                                                        v.setLayoutParams(new android.widget.LinearLayout.LayoutParams((int)(W()*0.03),(int)(H()*0.01)));
                                                        new Handler().postDelayed(new Runnable(){
                                                                @Override
                                                                public void run() {
                                                                    v.setLayoutParams(new android.widget.LinearLayout.LayoutParams((int)(W()*0.035),(int)(H()*0.01)));
                                                                    new Handler().postDelayed(new Runnable(){
                                                                            @Override
                                                                            public void run() {
                                                                                v.setLayoutParams(new android.widget.LinearLayout.LayoutParams((int)(W()*0.04),(int)(H()*0.01)));
                                                                                new Handler().postDelayed(new Runnable(){
                                                                                        @Override
                                                                                        public void run() {
                                                                                            v.setLayoutParams(new android.widget.LinearLayout.LayoutParams((int)(W()*0.045),(int)(H()*0.01)));
                                                                                            new Handler().postDelayed(new Runnable(){
                                                                                                    @Override
                                                                                                    public void run() {
                                                                                                        v.setLayoutParams(new android.widget.LinearLayout.LayoutParams((int)(W()*0.05),(int)(H()*0.01)));
                                                                                                    }
                                                                                                }, 30);
                                                                                        }
                                                                                    }, 20);
                                                                            }
                                                                        }, 50);
                                                                }
                                                            }, 50);
                                                    }
                                                }, 50);
                                        }
                                    }, 50);
                            }
                        }, 50);
                }
            }, 50);
    }


}


