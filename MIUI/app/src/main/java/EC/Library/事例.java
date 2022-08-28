package EC.Library;
import android.os.Handler;
import android.content.Context;
import EC.Library.Basis.LlinearLayout;
import EC.Library.Basis.Tools;
import android.view.View;
import EC.Library.Basis.LTextView;
import android.widget.ScrollView;
import EC.Library.Basis.LPopupWindow;
import EC.Library.Basis.LSwitch;
import android.widget.Switch;
import android.view.ViewGroup;
import android.graphics.drawable.GradientDrawable;
import android.graphics.Color;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.view.MotionEvent;

public class 事例 {

    public static final String TAG = "事例";

    private static String Arrow="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";    

    private static boolean[] baaa=new boolean[9999];

    public static void Start(final Context ctx) {

        new Handler().postDelayed(new Runnable(){

                @Override
                public void run() {

                    intView(ctx)  ;


                }
            }, 1000);
    }


    /*
     FontColor，ViewDrawable,LSwitch来源于小萌
     使用了小萌的AddOPSwitch
     
     by.linfei，QQ2583466279
     */

    private static int DoubleToInt(double mDouble) {
        int num = (new Double(mDouble)).intValue();
        return num;
	}


    private static void AddOPTextView(Context ctx, Object objv, String str) {
        int H=Tools.H(ctx);    
        LTextView Title=new LTextView(ctx);
        Title.setGravity("居左");
        Title.setTextColor(Color.parseColor("#9E9E9E"));
        Title.setText("§l" + str);
        Title.setTextSize(11);
        LlinearLayout Empty=new LlinearLayout(ctx);
        Empty.setWH(H * 0.25, H * 0.026);
        Empty.setGravity("居中");

        if (objv instanceof ViewGroup) {
            ((ViewGroup) objv).addView(Empty);
            ((ViewGroup) objv).addView(Title);
        } else if (objv instanceof Integer) {

        }

    }

    private static LlinearLayout AddOPSwitch(final Context ctx, Object objv, String text, final LSwitch.OnSwitchChangeListener onSwitchChangeListener, final int i) {
        int W=Tools.getScreenWidth(ctx),H=Tools.getScreenHeight(ctx);

        boolean a=baaa[i - 1];
        LlinearLayout layout = new LlinearLayout(ctx, 1);
        layout.setWH(H * 0.55, H * 0.1);
        layout.setOrientation(1);
        layout.setGravity("居中");

        LlinearLayout layout2 = new LlinearLayout(ctx, 0);
        layout2.setWH(H * 0.55, H * 0.1);
        layout2.setOrientation(0);

        layout2.setGravity("居右");

        LTextView textView = new LTextView(ctx);
        textView.setText(text);
        textView.setTextSize(15);
        textView.getPaint().setFakeBoldText(true);
        textView.setGravity("左上");
        textView.setTextColor(Color.parseColor("#000000"));
        LlinearLayout MainText = new LlinearLayout(ctx, 0);
        MainText.setGravity("左下");
        MainText.setWH(H * 0.35, H * 0.055);

        LlinearLayout SwitchF = new LlinearLayout(ctx);
        SwitchF.setGravity("右上");      
        SwitchF.setWH(H * 0.2, H * 0.08); 
        // SwitchF.setBackgroundColor(Color.parseColor("#000000"));

        final LSwitch sw = new LSwitch(ctx);
        sw.setLayoutParams(new LinearLayout.LayoutParams(DoubleToInt(W * 0.04), DoubleToInt(H * 0.1))); 
        sw.setOnTouchListener(new View.OnTouchListener(){
                @Override
                public boolean onTouch(View view, MotionEvent event) {
                    int action = event.getAction();
                    if (action == MotionEvent.ACTION_DOWN) {                    
                        baaa[i - 1] = !baaa[i - 1];
                    }
                    return false;
                }
            });

        sw.setOnSwitchChangeListener(onSwitchChangeListener); 

        sw.setCheck(a);

        layout.addView(layout2);//layout2.addView(textView);
        layout2.addView(MainText);MainText.addView(textView);

        layout2.addView(SwitchF);SwitchF.addView(sw);//ps.addView(sw);
        if (objv instanceof ViewGroup) {
            ((ViewGroup) objv).addView(layout);
        } else if (objv instanceof Integer) {

        }
        return layout;
    }



    private static void Segmentation(Context ctx, Object objv) {
        int H=Tools.H(ctx);
        LlinearLayout $s1=new LlinearLayout(ctx);
        $s1.setWH(H * 0.6, H * 0.05);
        $s1.setGravity("居中"); 
        LlinearLayout Empty=new LlinearLayout(ctx);
        Empty.setWH(H * 0.6, H * 0.006);
        Empty.setGravity("居中");
        LlinearLayout s1=new LlinearLayout(ctx);
        s1.setWH(H * 0.6, H * 0.004);
        s1.setGravity("中上");
        $s1.setOrientation(1);
        s1.setBackgroundDrawable("#249E9E9E", 180, null);
        $s1.addView(Empty);
        $s1.addView(s1);

        if (objv instanceof ViewGroup) {
            ((ViewGroup) objv).addView($s1);
        } else if (objv instanceof Integer) {

        }
    }


    private static void intView(final Context ctx) {
        int W=Tools.getScreenWidth(ctx),H=Tools.H(ctx);
        final LPopupWindow sdV=new LPopupWindow(ctx);
        LlinearLayout $s1=new LlinearLayout(ctx);
        $s1.setWH(H * 0.6, H * 0.86);
        $s1.setOrientation(1);
        $s1.setGravity("居中");     
        LlinearLayout s1=new LlinearLayout(ctx);
        s1.setWH(H * 0.6, H * 0.86);
        s1.setGravity("中上");
        $s1.setOrientation(1);
        s1.setBackgroundDrawable("#ffffff", 40, null);
        LlinearLayout Empty=new LlinearLayout(ctx);
        Empty.setWH(H * 0.6, H * 0.03);
        Empty.setGravity("居中");
        Empty.setOrientation(1); 
        LlinearLayout $Title1=new LlinearLayout(ctx);
        $Title1.setWH(H * 0.15, H * 0.009);
        $Title1.setGravity("居中");
        $Title1.setBackgroundDrawable("#2196F3", 180, null);
        $Title1.setOrientation(1);
        LlinearLayout Empty2=new LlinearLayout(ctx);
        Empty2.setWH(H * 0.25, H * 0.052);
        Empty2.setGravity("居中");
        Empty2.setOrientation(1);
        LlinearLayout $Title2=new LlinearLayout(ctx);
        $Title2.setWH(H * 0.55, H * 0.055);
        $Title2.setGravity("居左");
        $Title2.setOrientation(1);
        LlinearLayout Title2=new LlinearLayout(ctx);
        Title2.setWH(H * 0.05, H * 0.05);
        Title2.setGravity("居左");
        Title2.setOrientation(1);
        Title2.setBackground(Tools.B64(Arrow));
        Title2.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    log(ctx);
                    sdV.dismiss();
                }
            });
        LlinearLayout Empty3=new LlinearLayout(ctx);
        Empty3.setWH(H * 0.25, H * 0.015);
        Empty3.setGravity("居中");
        Empty3.setOrientation(1); 
        LlinearLayout $Title3=new LlinearLayout(ctx);
        $Title3.setWH(H * 0.55, H * 0.065);
        $Title3.setGravity("居中");
        $Title3.setOrientation(1);  
        LTextView Title3=new LTextView(ctx);
        Title3.setGravity("居左");
        Title3.setTextColor(Color.parseColor("#000000"));
        Title3.setText("§l一个模板");
        Title3.setTextSize(21);
        LlinearLayout Empty4=new LlinearLayout(ctx);
        Empty4.setWH(H * 0.25, H * 0.03);
        Empty4.setGravity("居中");
        Empty4.setOrientation(1); 
        ScrollView sv=new ScrollView(ctx);
        sv.setLayoutParams(new android.widget.LinearLayout.LayoutParams((new Double(H * 0.55)).intValue(), (new Double(H * 0.559)).intValue())); 
        sv.setVerticalScrollBarEnabled(false);
        sv.setHorizontalScrollBarEnabled(false);
        LlinearLayout ll=new LlinearLayout(ctx);
        ll.setWH(H * 0.55, H * 0.559);
        ll.setGravity("居中");
        ll.setOrientation(1);  
        LTextView Title4=new LTextView(ctx);
        Title4.setGravity("居左");
        Title4.setTextColor(Color.parseColor("#9E9E9E"));
        Title4.setText("§l「疯婆婆提供Partial foundation」");
        Title4.setTextSize(11);
        LlinearLayout Empty5=new LlinearLayout(ctx);
        Empty5.setWH(H * 0.25, H * 0.026);
        Empty5.setGravity("居中");
        Empty5.setOrientation(1); 
        LTextView Title5=new LTextView(ctx);
        Title5.setGravity("居左");
        Title5.setTextColor(Color.parseColor("#9E9E9E"));
        Title5.setText("§l [MIUI buttery hatch]");
        Title5.setTextSize(11);
        LlinearLayout $av=new LlinearLayout(ctx);
        $av.setWH(H * 0.6, H * 0.01);
        $av.setGravity("居中");
        $av.setOrientation(1); 
        LlinearLayout av=new LlinearLayout(ctx);
        av.setWH(H * 0.1, H * 0.006);
        av.setGravity("中上");
        av.setOrientation(1);
        av.setBackgroundDrawable("#349E9E9E", 180, null);
        $s1.addView(s1);
        s1.addView(Empty);
        s1.addView($Title1);
        s1.addView(Empty2);
        s1.addView($Title2);
        s1.addView(Empty3);
        s1.addView($Title3);
        s1.addView(Empty4);
        s1.addView(sv);
        sv.addView(ll);
        $Title2.addView(Title2);
        $Title3.addView(Title3);
        ll.addView(Title4);
        ll.addView(Empty5);
        ll.addView(Title5);


        AddOPSwitch(ctx, ll, "功能一", new LSwitch.OnSwitchChangeListener(){
                public void OnChange(boolean check) {

                    if (check == true) {
                        Toast.makeText(ctx, "开启", Toast.LENGTH_SHORT).show();
                        Miscellaneous.RunShell("data/data/com.nidong.cmswat.m4399/lib/libxun1.so");

                    }
					else if(check==false) {
						Toast.makeText(ctx, "关闭", Toast.LENGTH_SHORT).show();         
						Miscellaneous.RunShell("data/data/com.nidong.cmswat.m4399/lib/libxun1.so");
					}
                }
            }, 1);


        AddOPSwitch(ctx, ll, "功能二", new LSwitch.OnSwitchChangeListener(){
                public void OnChange(boolean check) {

                    if (check == true) {
						Toast.makeText(ctx, "开启", Toast.LENGTH_SHORT).show();
						Miscellaneous.RunShell("data/data/com.nidong.cmswat.m4399/lib/libxun1.so");
					    
					}
			        else if(check==false) {
						Toast.makeText(ctx, "关闭", Toast.LENGTH_SHORT).show();
						Miscellaneous.RunShell("data/data/com.nidong.cmswat.m4399/lib/libxun1.so");
					}
                }
            }, 2);


        AddOPSwitch(ctx, ll, "功能三", new LSwitch.OnSwitchChangeListener(){
                public void OnChange(boolean check) {

                    if (check == true) {
                        Toast.makeText(ctx, "开启", Toast.LENGTH_SHORT).show();
                        Miscellaneous.RunShell("data/data/com.nidong.cmswat.m4399/lib/libxun1.so");

                    }
					else if(check==false) {
						Toast.makeText(ctx, "关闭", Toast.LENGTH_SHORT).show();         
						Miscellaneous.RunShell("data/data/com.nidong.cmswat.m4399/lib/libxun1.so");
					}
                }
            }, 3);


        AddOPSwitch(ctx, ll, "功能四", new LSwitch.OnSwitchChangeListener(){
                public void OnChange(boolean check) {

                    if (check == true) {
                        Toast.makeText(ctx, "开启", Toast.LENGTH_SHORT).show();
                        Miscellaneous.RunShell("data/data/com.nidong.cmswat.m4399/lib/libxun1.so");

                    }
					else if(check==false) {
						Toast.makeText(ctx, "关闭", Toast.LENGTH_SHORT).show();         
						Miscellaneous.RunShell("data/data/com.nidong.cmswat.m4399/lib/libxun1.so");
					}
                }
            }, 4);
            
            
                   AddOPSwitch(ctx, ll, "功能四", new LSwitch.OnSwitchChangeListener(){
                public void OnChange(boolean check) {

                    if (check == true) {
                        Toast.makeText(ctx, "开启", Toast.LENGTH_SHORT).show();
                        Miscellaneous.RunShell("data/data/com.nidong.cmswat.m4399/lib/libxun1.so");

                    }
					else if(check==false) {
						Toast.makeText(ctx, "关闭", Toast.LENGTH_SHORT).show();         
						Miscellaneous.RunShell("data/data/com.nidong.cmswat.m4399/lib/libxun1.so");
					}
                }
            }, 4);
            
            
                   AddOPSwitch(ctx, ll, "功能四", new LSwitch.OnSwitchChangeListener(){
                public void OnChange(boolean check) {

                    if (check == true) {
                        Toast.makeText(ctx, "开启", Toast.LENGTH_SHORT).show();
                        Miscellaneous.RunShell("data/data/com.nidong.cmswat.m4399/lib/libxun1.so");

                    }
					else if(check==false) {
						Toast.makeText(ctx, "关闭", Toast.LENGTH_SHORT).show();         
						Miscellaneous.RunShell("data/data/com.nidong.cmswat.m4399/lib/libxun1.so");
					}
                }
            }, 4);
            
            
                   AddOPSwitch(ctx, ll, "功能四", new LSwitch.OnSwitchChangeListener(){
                public void OnChange(boolean check) {

                    if (check == true) {
                        Toast.makeText(ctx, "开启", Toast.LENGTH_SHORT).show();
                        Miscellaneous.RunShell("data/data/com.nidong.cmswat.m4399/lib/libxun1.so");

                    }
					else if(check==false) {
						Toast.makeText(ctx, "关闭", Toast.LENGTH_SHORT).show();         
						Miscellaneous.RunShell("data/data/com.nidong.cmswat.m4399/lib/libxun1.so");
					}
                }
            }, 4);
            
            
                   AddOPSwitch(ctx, ll, "功能四", new LSwitch.OnSwitchChangeListener(){
                public void OnChange(boolean check) {

                    if (check == true) {
                        Toast.makeText(ctx, "开启", Toast.LENGTH_SHORT).show();
                        Miscellaneous.RunShell("data/data/com.nidong.cmswat.m4399/lib/libxun1.so");

                    }
					else if(check==false) {
						Toast.makeText(ctx, "关闭", Toast.LENGTH_SHORT).show();         
						Miscellaneous.RunShell("data/data/com.nidong.cmswat.m4399/lib/libxun1.so");
					}
                }
            }, 4);
            
            
                   AddOPSwitch(ctx, ll, "功能四", new LSwitch.OnSwitchChangeListener(){
                public void OnChange(boolean check) {

                    if (check == true) {
                        Toast.makeText(ctx, "开启", Toast.LENGTH_SHORT).show();
                        Miscellaneous.RunShell("data/data/com.nidong.cmswat.m4399/lib/libxun1.so");

                    }
					else if(check==false) {
						Toast.makeText(ctx, "关闭", Toast.LENGTH_SHORT).show();         
						Miscellaneous.RunShell("data/data/com.nidong.cmswat.m4399/lib/libxun1.so");
					}
                }
            }, 4);
            
            
                   AddOPSwitch(ctx, ll, "功能四", new LSwitch.OnSwitchChangeListener(){
                public void OnChange(boolean check) {

                    if (check == true) {
                        Toast.makeText(ctx, "开启", Toast.LENGTH_SHORT).show();
                        Miscellaneous.RunShell("data/data/com.nidong.cmswat.m4399/lib/libxun1.so");

                    }
					else if(check==false) {
						Toast.makeText(ctx, "关闭", Toast.LENGTH_SHORT).show();         
						Miscellaneous.RunShell("data/data/com.nidong.cmswat.m4399/lib/libxun1.so");
					}
                }
            }, 4);
            
            
                   AddOPSwitch(ctx, ll, "功能四", new LSwitch.OnSwitchChangeListener(){
                public void OnChange(boolean check) {

                    if (check == true) {
                        Toast.makeText(ctx, "开启", Toast.LENGTH_SHORT).show();
                        Miscellaneous.RunShell("data/data/com.nidong.cmswat.m4399/lib/libxun1.so");

                    }
					else if(check==false) {
						Toast.makeText(ctx, "关闭", Toast.LENGTH_SHORT).show();         
						Miscellaneous.RunShell("data/data/com.nidong.cmswat.m4399/lib/libxun1.so");
					}
                }
            }, 4);
            
            
                   AddOPSwitch(ctx, ll, "功能四", new LSwitch.OnSwitchChangeListener(){
                public void OnChange(boolean check) {

                    if (check == true) {
                        Toast.makeText(ctx, "开启", Toast.LENGTH_SHORT).show();
                        Miscellaneous.RunShell("data/data/com.nidong.cmswat.m4399/lib/libxun1.so");

                    }
					else if(check==false) {
						Toast.makeText(ctx, "关闭", Toast.LENGTH_SHORT).show();         
						Miscellaneous.RunShell("data/data/com.nidong.cmswat.m4399/lib/libxun1.so");
					}
                }
            }, 4);
            
            
                   AddOPSwitch(ctx, ll, "功能四", new LSwitch.OnSwitchChangeListener(){
                public void OnChange(boolean check) {

                    if (check == true) {
                        Toast.makeText(ctx, "开启", Toast.LENGTH_SHORT).show();
                        Miscellaneous.RunShell("data/data/com.nidong.cmswat.m4399/lib/libxun1.so");

                    }
					else if(check==false) {
						Toast.makeText(ctx, "关闭", Toast.LENGTH_SHORT).show();         
						Miscellaneous.RunShell("data/data/com.nidong.cmswat.m4399/lib/libxun1.so");
					}
                }
            }, 4);
            
            
                   AddOPSwitch(ctx, ll, "功能四", new LSwitch.OnSwitchChangeListener(){
                public void OnChange(boolean check) {

                    if (check == true) {
                        Toast.makeText(ctx, "开启", Toast.LENGTH_SHORT).show();
                        Miscellaneous.RunShell("data/data/com.nidong.cmswat.m4399/lib/libxun1.so");

                    }
					else if(check==false) {
						Toast.makeText(ctx, "关闭", Toast.LENGTH_SHORT).show();         
						Miscellaneous.RunShell("data/data/com.nidong.cmswat.m4399/lib/libxun1.so");
					}
                }
            }, 4);
            
            
                   AddOPSwitch(ctx, ll, "功能四", new LSwitch.OnSwitchChangeListener(){
                public void OnChange(boolean check) {

                    if (check == true) {
                        Toast.makeText(ctx, "开启", Toast.LENGTH_SHORT).show();
                        Miscellaneous.RunShell("data/data/com.nidong.cmswat.m4399/lib/libxun1.so");

                    }
					else if(check==false) {
						Toast.makeText(ctx, "关闭", Toast.LENGTH_SHORT).show();         
						Miscellaneous.RunShell("data/data/com.nidong.cmswat.m4399/lib/libxun1.so");
					}
                }
            }, 4);
            
            
        Segmentation(ctx, ll);


        AddOPTextView(ctx, ll, "「使用了部分疯婆婆UI库」");
        AddOPTextView(ctx, ll, "「使用了FPPUI库」");
        AddOPTextView(ctx, ll, "「by.FPP」");  


        s1.addView($av);
        s1.addView(av);


        sdV.setWidth((new Double(H * 0.6)).intValue());
        sdV.setHeight((new Double(H * 0.86)).intValue());
        sdV.setFocusable(false);
        sdV.setTouchable(true);
        sdV.setContentView($s1);
        sdV.showAtLocation("居左", 75, 0);
    }


    private static void log(final Context ctx) {

        int H=Tools.H(ctx);

        LlinearLayout $s1=new LlinearLayout(ctx);
        $s1.setWH(H * 0.1, H * 0.11);
        $s1.setOrientation(1);
        $s1.setGravity("居中");  

        LTextView Title=new LTextView(ctx);
        Title.setGravity("居左");
        Title.setTextColor(Color.parseColor("#46ffffff"));
        Title.setText("§l)");
        Title.setTextSize(35);


        $s1.addView(Title);
        final LPopupWindow sdV=new LPopupWindow(ctx);      
        sdV.setWidth((new Double(H * 0.1)).intValue());
        sdV.setHeight((new Double(H * 0.11)).intValue());
        sdV.setFocusable(false);
        sdV.setTouchable(true);
        sdV.setContentView($s1);
        sdV.showAtLocation("居左", 20, 0);


        Title.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    intView(ctx);
                    sdV.dismiss();
                }
            });
    }

}
