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
		
        guimt1 = new NewText(ct, ASUI.FontColor("??l Home"), "LC", 18, "#fadfc4");
		Space = new NewView(ct, (int)(W() * 0.1), (int)(H()*0.01), "CC", 0, 0, "#80535a", null, null);
		text1 = new NewText(ct, ASUI.FontColor("??l Favourite"), "LC", 13, "#fadfc4");
		Space2 = new NewView(ct, (int)(W() * 0.1), (int)(H()*0.01), "CC", 0, 0, "#80535a", null, null);
		
		text2 = new NewText(ct, ASUI.FontColor("??l Config"), "LC", 13, "#fadfc4");
		
        guimt1.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    Load.fw.show();
                    dis();
                }
            });
			
        guiml4 = new NewView(ct, (int)(W() * 0.12), (int)(H() * 0.55), "LC", 1, 0, "#80535a", null, null);
        //??????
        guiml5 = new NewView(ct, (int)(W() * 0.48), (int)(H() * 0.55), "CT", 1, 0, "#80535a", null, null);
        
       
        //1
        //1
        guiml6 = new NewView(ct, (int)(W() * 0.12), (int)(H() * 0.12), "LC", 1, 0, "#80535a", null, null);
        guimt2 = new NewText(ct, ASUI.FontColor("??lPVP"), "LC", 15, "#fadfc4");
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
        guimt3 = new NewText(ct, ASUI.FontColor("??l??????"), "LC", 15, "#fadfc4");
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
        guimt4 = new NewText(ct, ASUI.FontColor("??l??????"), "LC", 15, "#fadfc4");
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
        guimt5 = new NewText(ct, ASUI.FontColor("??l??????"), "LC", 15, "#fadfc4");
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
		
        /*????????????*/
        
        /*??????UI*/
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
        /*????????????*/
        
        /*????????????*/
        guimlg = new NewView(ct, (int)(W() * 0.7), (int)(H() * 0.05), "CC", 1, 2,null, null, null);
        /*??????????????????*/
        
        
        guiml.addView(guiml2);
        guiml2.addView(guimt1);
		guiml2.addView(Space);
		guiml2.addView(text1);
		guiml2.addView(Space2);
		guiml2.addView(text2);
        guiml.addView(guiml3);
        guiml3.addView(guiml4);
        guiml3.addView(guiml5);
        /*??????*/
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
        /*??????*/
        guiml5.addView(qh1);
        guiml5.addView(qh2);
        guiml5.addView(qh3);
        guiml5.addView(qh4);
        /*??????*/
        qh1.addView(qhsv);
        qh2.addView(qhsv2);
        qh3.addView(qhsv3);
        qh4.addView(qhsv4);
        /*??????*/
        qh1.setVisibility(qh1.VISIBLE);
        qh2.setVisibility(qh2.GONE);
        qh3.setVisibility(qh3.GONE);
        qh4.setVisibility(qh4.GONE);
        /*??????*/
        /*????????????*/
        //1
      
      new SwitchBut(context, qhsv, btc, "????????????", "?????????????????????????????????",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btc==false){
                        
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btc=true;
                        
                        
                    }else{
				
						
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btc=false;
                        
                        
                    }
                    }
            });
                    new SwitchBut(context, qhsv, btc1, "????????????", "?????????????????????????????????",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btc1==false){
						
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btc1=true;
                        
                        
                    }else{
						
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btc1=false;
                        
                        
                    }
                    }
            });
            
		new SwitchBut(context, qhsv, btc2, "????????????", "?????????????????????+??????", new ASwitch.OnASwitchChangeListener(){

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
                    new PromptBox().show(context, "large", "?????????id:", null, new Object[]{"??????",new OnClickListener(){
                                                 @Override
                                                 public void onClick(View p1) {
                                                              
                                                 }
                                             },1}, null, new View[]{AEditTextViewAView});
					
												 

                    
                }


            });


		
        new SwitchBut(context, qhsv, btc3, "????????????", "????????????????????????",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btc3==false){
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btc3=true;
                    }else{
                   
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btc3=false;
                        
                        
                    }
                    }
            });
            	
        new SwitchBut(context, qhsv, bttcc, "????????????", "??????????????????????????????",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btc3==false){
               
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btc3=true;
                        
                        
                    }else{
                   
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btc3=false;
                        
                        
                    }
                    }
            });
        new SwitchBut(context, qhsv, btc4, "????????????", "TP?????????????????????????????????",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btc4==false){
                  
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btc4=true;
                        
                        
                    }else{
                  
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btc4=false;
                        
                        
                    }
                    }
            });

                new SwitchBut(context, qhsv, btc5, "????????????", "???????????????????????????",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btc5==false){
                    
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btc5=true;
                        
                        
                    }else{
                  
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btc5=false;
                        
                        
                    }
                    }
            });
        new SwitchBut(context, qhsv, btc6, "????????????", "?????????????????????",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btc6==false){
                    
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btc6=true;
                        
                        
                    }else{
                 
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btc6=false;
                        
                        
                    }
                    }
            });

            //2
            new SwitchBut(context, qhsv, btl, "????????????", "????????????????????????360?????????",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btl==false){
                    
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btl=true;
                        
                        
                    }else{
                  
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btl=false;
                        
                        
                    }
                    }
            });
                    new SwitchBut(context, qhsv, btc7, "?????????", "????????????????????????????????????",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btc7==false){
                  
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btc7=true;
                        
                        
                    }else{
                
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btc7=false;
                        
                        
                    }
                    }
            });
            
            new SwitchBut(context, qhsv2, btch, "????????????", "?????????????????????",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {              final AView AEditTextViewAView = new AView(context, null, (int)(W() * 0.8), (int)(H() * 0.4), "CC", 0, 1, "#80535a", 360);
                    AEditTextViewAView.setOrientation(LinearLayout.VERTICAL);
                    final EditText EnchantEdit2 = new EditText(context);
 
                    LinearLayout.LayoutParams editParams2 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                    //
                    EnchantEdit2.setLayoutParams(editParams2);
                    EnchantEdit2.setHint("??????");
                    EnchantEdit2.setHintTextColor(0xFF000000);
                    EnchantEdit2.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_CLASS_PHONE);
                    EnchantEdit2.setGravity(Gravity.CENTER | Gravity.TOP);
                    EnchantEdit2.setTextColor(0xFF000000);
                    AEditTextViewAView.addView(EnchantEdit2);

                    new PromptBox().show(context, "large", "???????????????:", null, new Object[]{"??????",new OnClickListener(){
                                                 @Override
                                                 public void onClick(View p1) {
                                                                                       
                                                 }
                                             },1}, null, new View[]{AEditTextViewAView});

                    }
            });
new SwitchBut(context, qhsv2, btach, "????????????", "?????????????????????",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {          final AView AEditTextViewAView = new AView(context, null, (int)(W() * 0.8), (int)(H() * 0.4), "CC", 0, 1, "#80535a", 360);
                    AEditTextViewAView.setOrientation(LinearLayout.VERTICAL);
                    final EditText EnchantEdit3 = new EditText(context);
 
                    LinearLayout.LayoutParams editParams2 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                    //
                    EnchantEdit3.setLayoutParams(editParams2);
                    EnchantEdit3.setHint("??????");
                    EnchantEdit3.setHintTextColor(0xFF000000);
                    EnchantEdit3.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_CLASS_PHONE);
                    EnchantEdit3.setGravity(Gravity.CENTER | Gravity.TOP);
                    EnchantEdit3.setTextColor(0xFF000000);
                    AEditTextViewAView.addView(EnchantEdit3);

                    new PromptBox().show(context, "large", "???????????????:", null, new Object[]{"??????",new OnClickListener(){
                                                 @Override
                                                 public void onClick(View p1) {
                                                     
                                                 
                                                 }
                                             },1}, null, new View[]{AEditTextViewAView});

                    }
            });
        new SwitchBut(context, qhsv2, btc8, "????????????", "????????????????????????",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btc8==false){
                        ASUI.hint(context,"????????????");
                 
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btc8=true;
                        
                        
                    }else{
                        
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btc8=false;
                        
                        
                    }
                    }
            });
            
            
        new SwitchBut(context, qhsv2, btl3, "????????????", "?????????????????????",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btl3==false){
                    
                    
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btl3=true;
                        
                        
                    }else{
                    
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btl3=false;
                        
                        
                    }
                    }
            });

        new SwitchBut(context, qhsv2, btc9, "????????????", "??????????????????",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btc9==false){
                    
					
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btc9=true;
                        
                        
                    }else{
                    
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btc9=false;
                        
                        
                    }
                    }
            });
       new SwitchBut(context, qhsv2, btc10, "????????????", "???????????????????????????????????????",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btc10==false){
                    
					
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btc10=true;
                        
                        
                    }else{
                  
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btc10=false;
                        
                        
                    }
                    }
            });
        new SwitchBut(context, qhsv2, btc12, "????????????", "??????????????????????????????",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btc12==false){
            
				
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btc12=true;
                        
                        
                    }else{
                 
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btc12=false;
                        
                        
                    }
                    }
            });

            
                    new SwitchBut(context, qhsv2, btc13, "????????????", "??????????????????",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btc13==false){
                           
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btc13=true;
                        
                        
                    }else{
                           
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btc13=false;
                        
                        
                    }
                    }
            });
                                new SwitchBut(context, qhsv3, btcfjt, "?????????", "???????????????",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btcfjt==false){
                           
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btcfjt=true;
                        
                        
                    }else{
                           
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btcfjt=false;
                        
                        
                    }
                    }
            });
                new SwitchBut(context, qhsv3, btcwzl, "?????????", "???????????????",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btcwzl==false){
                           
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btcwzl=true;
                        
                        
                    }else{
                           
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btcwzl=false;
                        
                        
                    }
                    }
            });
            new SwitchBut(context, qhsv2, btcssxz, "????????????", "???????????????",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btcssxz==false){
                           
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btcssxz=true;
                        
                        
                    }else{
                           
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btcssxz=false;
                        
                        
                    }
                    }
            });
            //????????????
        new SwitchBut(context, qhsv, btc14, "????????????", "????????????????????????5????????????",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btc14==false){
                   
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btc14=true;
                        
                        
                    }else{
                    
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btc14=false;
                        
                        
                    }
                    }
            });
            //3
            
        new SwitchBut(context, qhsv3, btc15, "????????????", "????????????????????????????????????",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btc15==false){
                
					Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btc15=true;
                        
                        
                    }else{
               
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btc15=false;
                        
                        
                    }
                    }
            });
                        
        new SwitchBut(context, qhsv3, zbcs, "????????????", "XYZ??????????????????",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {      final AView AEditTextViewAView = new AView(context, null, (int)(W() * 0.8), (int)(H() * 0.4), "CC", 0, 1, "#80535a", 360);
                    AEditTextViewAView.setOrientation(LinearLayout.VERTICAL);
                    final EditText EnchantEdit1 = new EditText(context);
                    final EditText NewEnchantEdit1 = new EditText(context);
                    final EditText NewEnchantEdit2 = new EditText(context);
                    LinearLayout.LayoutParams editParams2 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                    //
                    EnchantEdit1.setLayoutParams(editParams2);
                    EnchantEdit1.setHint("X???");
                    EnchantEdit1.setHintTextColor(0xFF000000);
                    EnchantEdit1.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_CLASS_PHONE);
                    EnchantEdit1.setGravity(Gravity.CENTER | Gravity.TOP);
                    EnchantEdit1.setTextColor(0xFF000000);
                    AEditTextViewAView.addView(EnchantEdit1);
                    TextView texta = new TextView(context);
                    texta.setText("\n");
                    AEditTextViewAView.addView(texta);
                    NewEnchantEdit1.setLayoutParams(editParams2);
                    NewEnchantEdit1.setHint("Y???");
                    NewEnchantEdit1.setHintTextColor(0xFF000000);
                    NewEnchantEdit1.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_CLASS_PHONE);
                    NewEnchantEdit1.setGravity(Gravity.CENTER | Gravity.TOP);
                    NewEnchantEdit1.setTextColor(0xFF000000);
                    AEditTextViewAView.addView(NewEnchantEdit1);
                    TextView te = new TextView(context);
                    te.setText("\n");
                    AEditTextViewAView.addView(texta);
                    NewEnchantEdit2.setLayoutParams(editParams2);
                    NewEnchantEdit2.setHint("Z???");
                    NewEnchantEdit2.setHintTextColor(0xFF000000);
                    NewEnchantEdit2.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_CLASS_PHONE);
                    NewEnchantEdit2.setGravity(Gravity.CENTER | Gravity.TOP);
                    NewEnchantEdit2.setTextColor(0xFF000000);
                    AEditTextViewAView.addView(NewEnchantEdit2);
                    new PromptBox().show(context, "large", "???????????????:", null, new Object[]{"??????",new OnClickListener(){
                                                 @Override
                                                 public void onClick(View p1) {
                                                    
													 
                                                 
                                                 }
                                             },1}, null, new View[]{AEditTextViewAView});

                        
                    
                    }
            });
     new SwitchBut(context, qhsv3, btc16, "????????????", "????????????????????????",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btc16==false){
                    
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btc16=true;
                        
                        
                    }else{
             
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btc16=false;
                        
                        
                    }
                    }
            });
            new SwitchBut(context, qhsv3, btc16, "????????????", "??????????????????",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btc16==false){
                    
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btc16=true;
                        
                        
                    }else{
             
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btc16=false;
                        
                        
                    }
                    }
            });
            new SwitchBut(context, qhsv3, btc16, "????????????", "????????????????????????",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btc16==false){
                    
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btc16=true;
                        
                        
                    }else{
             
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btc16=false;
                        
                        
                    }
                    }
            });
            new SwitchBut(context, qhsv3, btc16, "????????????", "????????????????????????",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btc16==false){
                    
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btc16=true;
                        
                        
                    }else{
             
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btc16=false;
                        
                        
                    }
                    }
            });
            new SwitchBut(context, qhsv3, btc16, "????????????", "????????????????????????",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btc16==false){
                    
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btc16=true;
                        
                        
                    }else{
             
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btc16=false;
                        
                        
                    }
                    }
            });
            new SwitchBut(context, qhsv3, btc16, "????????????", "????????????????????????",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btc16==false){
                    
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btc16=true;
                        
                        
                    }else{
             
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btc16=false;
                        
                        
                    }
                    }
            });
            new SwitchBut(context, qhsv3, btc16, "????????????", "????????????????????????",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btc16==false){
                    
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btc16=true;
                        
                        
                    }else{
             
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btc16=false;
                        
                        
                    }
                    }
            });
            new SwitchBut(context, qhsv3, btc16, "????????????", "????????????????????????",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btc16==false){
                    
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btc16=true;
                        
                        
                    }else{
             
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btc16=false;
                        
                        
                    }
                    }
            });
        new SwitchBut(context, qhsv3, btc17, "????????????", "3*3*3???????????????",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(btc17==false){
                  
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btc17=true;
                        
                        
                    }else{
                 
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        btc17=false;
                        
                        
                    }
                    }
            });
        
            
                    
            //4 
        new SwitchBut(context, qhsv4, false, "????????????", "??????????????????",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    PromptBox.show(context,"large","??????",new String[]{"??l????????????????????r",
                                       "1??????????????????Online Lite???????????????/??????(????????????'Online Lite')???????????????????????????,??????????????????????????????(???????????? '????????????' ).",
                                       "2??????????????????????????????/?????????????????????????????????,?????????????????????Online Lite???????????????;???????????????Online Lite,???????????????????????????????????????????????????????????????,??????Online Lite??????????????????????????????????????????,?????????Online Lite??????.",
                                       "??l????????????????????r",
                                       "1???Online Lite?????????????????????????????????????????????????????????.",
                                       "2?????????????????????????????????????????????????????????,Online Lite?????????????????????????????????????????????????????????????????????.",
                                       "3???????????????????????????????????????,???????????????????????????????????????,Online Lite??????????????????????????????????????????????????????.",
                                       "4????????????????????????????????????????????????,??????????????????????????????????????????????????????.",
                                       "5??????????????????????????????????????????????????????????????????????????????.",
                                       "??l????????????????????r",
                                       "1??????????????????Online Lite???,????????????????????????????????????????????????????????????,???????????????????????????????????????Online Lite???????????????????????????????????????.",
                                       "2?????????????????????????????????????????????????????????,????????????????????????????????????????????????????????????????????????,???????????????Online Lite??????????????????????????????.",
                                       "3?????????.Online Lite??????????????????????????????,?????????????????????????????????????????????????????????????????????????????????.",
                                       "4?????????????????????????????????????????????????????????????????????,????????????????????????????????????????????????????????????????????????.",
                                       "5??????????????????????????????Online Lite????????????????????????????????????.",
                                       "",
                                       "",
                                       "???????????????????????????:(Online Lite Team)</font><font color=#000000>",
                                       "??????????????????????????????????????????????????????.",
                                       "1?????????????????????,??????????????????????????????????????????????????????????????????,??????????????????????????????????????????????????????.",
                                       "2??????????????????????????????????????????????????????,???????????????????????????,?????????????????????????????????????????????,??????????????????,????????????????????????.",
                                       "3??????????????????????????????????????????????????????,????????????????????????????????????,???????????????????????????,?????????????????????.",
                                       "4?????????????????????/????????????/????????????/????????????????????????????????????,????????????????????????.",
                                       "5?????????????????????????????????????????????????????????.??????????????????/?????????????????????????????????",
                                       "6??????????????????????????????/?????????,?????????????????????????????????,??????????????????????????????.",
                                       "7?????????????????????????????????.?????????????????????????????????,??????????????????",
                                       "8??????:????????????????????????,???UI??????:Answer 2903536884",
                                       "??l????????????",
                                       "1???????????????????????????????????????????????????????????????????????????????????????????????????",
                                       "2???Online Lite??????????????????????????????????????????????????????????????????????????????????????????????????????",
                                       "3????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????",
                                       "4?????????????????????????????????Online Lite???????????????",
                                       "5????????????????????????????????????????????????",
                                       "",
                                       "",
                                       "BY Answer",
                                       "???????????????2021-01-16-1"},new Object[]{"??4??????",new View.OnClickListener() {@Override
                                           public void onClick(View view) {
                                               Activity ac=(Activity)(context);
                                               ac.finish();
                                           }},1},new Object[]{"??1??????",new View.OnClickListener() {@Override
                                                   public void onClick(View view) {}},1},null);
                }
            });
        
        
           
            
            
            new SwitchBut(context, qhsv4, killbutton, "????????????", "???????????????????????????",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(killbutton==false){
				
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        killbutton=true;
                        
                        
                    }else{
			
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        killbutton=false;
                        
                        
                    }
                    }
            });
            new SwitchBut(context, qhsv4, jumpbutton, "????????????", "???????????????????????????",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(jumpbutton==false){
                   
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        jumpbutton=true;
                        
                        
                    }else{
                
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        jumpbutton=false;
                        
                     
                    }
                    }
            });
           new SwitchBut(context, qhsv4, jptbutton, "????????????", "???????????????????????????",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(jptbutton==false){
                    
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        jptbutton=true;
                        
                        
                    }else{
                  
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        jptbutton=false;
                        
                        
                    }
                    }
            });
            
            new SwitchBut(context, qhsv4, cqbutton, "????????????", "???????????????????????????",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(cqbutton==false){
                        C.show(context);
                        cqbutton=true;
                        ASUI.hint(context,"??????");
                        
                    }else{
                        C.dis();
                        cqbutton=false;
                        ASUI.hout(context,"??????");
                        
                    }
                    }
            });
            new SwitchBut(context, qhsv4, flybutton, "????????????", "???????????????????????????",new ASwitch.OnASwitchChangeListener(){

				@Override
				public void onASwitchChangeListener(boolean isOn) {                    if(flybutton==false){
                    
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
                        flybutton=true;
                        
                        
                    }else{
                   
                        Toast.makeText(context, "????????????", Toast.LENGTH_SHORT).show();
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


