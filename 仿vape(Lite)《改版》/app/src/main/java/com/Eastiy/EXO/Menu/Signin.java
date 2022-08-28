
package com.Eastiy.EXO.Menu;

import android.content.Context;
import android.os.Looper;
import android.widget.PopupWindow;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.widget.ImageView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import java.security.acl.Group;
import android.view.Gravity;
import android.graphics.Matrix;
import android.view.View.OnLongClickListener;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.MotionEvent;
import android.widget.Toast;
import android.app.AlertDialog;
import android.graphics.drawable.GradientDrawable;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import android.widget.TextView;
import android.net.Uri;
import java.net.HttpURLConnection;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.MalformedURLException;

import android.widget.EditText;
import android.text.TextWatcher;
import android.text.Editable;
import android.text.TextUtils;
import android.text.InputType;
import android.widget.Button;
import android.text.method.PasswordTransformationMethod;
import android.widget.CheckBox;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import android.text.method.HideReturnsTransformationMethod;
import android.preference.PreferenceManager;
import android.content.SharedPreferences;
import android.view.inputmethod.EditorInfo;


import android.view.WindowManager;
import android.util.DisplayMetrics;
import android.view.WindowManager.LayoutParams;
import android.os.Build;
import android.graphics.PixelFormat;
import com.Eastiy.EXO.View.NewView;
import com.Eastiy.EXO.View.ASUI;
import com.Eastiy.EXO.View.NewCDV;
import com.Eastiy.EXO.*;
import android.app.Activity;


public class Signin {

    private LinearLayout loginll;

    private LinearLayout loginll2;

    private LinearLayout loginll3;

    private Bitmap bitmap;

    private LinearLayout loginll4;

    private LinearLayout loginll5;

    private LinearLayout loginll6;

    private EditText EditView;



    private ImageView iv;

    private Bitmap ivv;

    private LinearLayout loginll7;

    private LinearLayout loginll8;

    private LinearLayout loginll9;

    private EditText EditView2;

    private LinearLayout loginll10;

    private LinearLayout loginll11;

    private Button loginll12;

    private CheckBox cb;

    private CheckBox cb2;

    private LinearLayout loginll13;

    private LinearLayout loginll14;

	private WindowManager wManager;

	private int screenWidth = 0;

	private int screenHeight=0;

	private WindowManager.LayoutParams wParams;

	private boolean isView = false;

	private Context mContext;

    private NewCDV pop;

    // 创建SharedPreferences对象


    public Signin(final Context context) throws IOException {
        mContext = context;

        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(context);
        final SharedPreferences.Editor editor = pref.edit();


        loginll = new NewView(context, (int)(W() * 0.6), (int)(H() * 0.7), "CT", 1, 1, new String[]{"#FFC0CB","#FFC0CB",null},30,null);

    loginll2=new NewView(context,(int)(-2),(int)(H()*0.06),"CC",1,2,null,null,null);

    loginll3=new NewView(context,(int)(H()*0.2),(int)(H()*0.2),"CC",1,1,new String[]{"#ff00Da7C","#ff00Da7C",null},360,null);

    /*cr=new CardView(context);
     cr.setLayoutParams(new android.widget.LinearLayout.LayoutParams((int)(H()*0.2),(int)(H()*0.2)));
     cr.setRadius(360);
     cr.setBackgroundDrawable(ASUI.roundBG(new String[]{"#ff00Da7C""#ff00Da7C")},new float[]{360,360,360,360,360,360,360,360},null,0));
     */
  //  ivv= BitmapFactory.decodeStream(context.getAssets().open("zhanghao.png"));
    iv=new ImageView(context);
  //  iv.setImageBitmap(ivv);
    iv.setScaleType(ImageView.ScaleType.FIT_XY);
    iv.setLayoutParams(new android.widget.LinearLayout.LayoutParams((int)(-1),(int)(-1)));



    loginll4=new NewView(context,(int)(-2),(int)(H()*0.04),"CC",1,2,null,null ,null);

    loginll5=new NewView(context,(int)(W()*0.3),(int)(H()*0.08),"CC",1,1,new String[]{"#86C0C0C0","#86C0C0C0",null},360,null);

    loginll6=new NewView(context,(int)(W()*0.295),(int)(H()*0.07),"CC",1,1,new String[]{"#FFC0CB","#FFC0CB",null},360,null);
    

    EditView=ASUI.NewET(context, "请输入账号", "", 8, "#000000", false);
    EditView.setGravity(Gravity.LEFT|Gravity.CENTER);
    EditView.setBackgroundColor(Color.parseColor("#00000000"));
    EditView.setLayoutParams(new android.widget.LinearLayout.LayoutParams((int)(W()*0.28),(int)(H())));
    EditView.setMaxLines(1);
    EditView.setInputType(EditorInfo.TYPE_CLASS_TEXT);


    loginll7=new NewView(context,(int)(-2),(int)(H()*0.04),"CC",1,2,null,null ,null);


    loginll8=new NewView(context,(int)(W()*0.3),(int)(H()*0.08),"CC",1,1,new String[]{"#86C0C0C0","#86C0C0C0",null},360,null);

    loginll9=new NewView(context,(int)(W()*0.295),(int)(H()*0.07),"CC",1,1,new String[]{"#FFC0CB","#FFC0CB",null},360,null);


    EditView2=ASUI.NewET(context, "请输入密码", "", 8, "#000000", false);
    EditView2.setGravity(Gravity.LEFT|Gravity.CENTER);
    EditView2.setBackgroundColor(Color.parseColor("#00000000"));
    EditView2.setLayoutParams(new android.widget.LinearLayout.LayoutParams((int)(W()*0.28),(int)(H())));
    EditView2.setMaxLines(1);
    // EditView2.setInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD);
    EditView2.setTransformationMethod(PasswordTransformationMethod.getInstance()); //如果没选中CheckBox则隐藏密码 

//可见editText.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);

    loginll10=new NewView(context,(int)(-2),(int)(H()*0.04),"CC",1,2,null,null,null );

    loginll11=new NewView(context,(int)(W()*0.6),(int)(H()*0.12),"CL",0,2,null,null ,null);



    cb=new CheckBox(context);
    cb.setText("显示密码");

    cb.setOnCheckedChangeListener(new OnCheckedChangeListener() { 

    @Override 
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) { 
        // TODO Auto-generated method stub 
        if (cb.isChecked()) { 

            EditView2.setTransformationMethod(HideReturnsTransformationMethod.getInstance()); //如果被选中则显示密码 
            EditView2.setSelection(EditView2.getText().length());   //TextView默认光标在最左端，这里控制光标在最右端 

        } else { 

            EditView2.setTransformationMethod(PasswordTransformationMethod.getInstance()); //如果没选中CheckBox则隐藏密码 

            EditView2.setSelection(EditView2.getText().length()); 
        } 
    }}); 

    loginll13=new NewView(context,(int)(W()*0.02),(int)(-2),"CL",0,2,null,null ,null);

    cb2=new CheckBox(context);
    cb2.setText("记住密码");



    loginll14=new NewView(context,(int)(W()*0.02),(int)(-2),"CL",0,2,null,null,null );


  loginll12=ASUI.NewButton(context,"登录",(int)(W()*0.08),(int)(H()*0.1));
    loginll12.setBackgroundDrawable(ASUI.roundBG(new String[]{"#2196f3","#2196f3",null},30,null,0));

		if (pref.getBoolean("remember", false)) {

			EditView.setText(pref.getString("username", EditView.getText().toString())); // 账号
			EditView2.setText(pref.getString("password", EditView2.getText().toString())); // 密码
			cb2.setChecked(true);
		}
		loginll12.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					// 先获取输入的账号和密码（验证省略，假定一直有值）
									new Thread(new Runnable(){
							@Override
							public void run() {
 		}}).start();

					pop.dismiss();
					
					((Activity)context).runOnUiThread(new Runnable() {

							@Override
							public void run() {
							
							
                        Load.fw = new FloatWin(context);
                        
                    }});

					if (cb2.isChecked()) {

										} else {
						editor.clear();
					}
					editor.apply();
				}
			});





    loginll.addView(loginll2);
    loginll.addView(loginll3);
    loginll3.addView(iv);

    loginll.addView(loginll4);
    loginll.addView(loginll5);
    loginll5.addView(loginll6);
    loginll6.addView(EditView);
    loginll.addView(loginll7);
    loginll.addView(loginll8);
    loginll8.addView(loginll9);
    loginll9.addView(EditView2);
    loginll.addView(loginll10);
    loginll.addView(loginll11);
    loginll11.addView(cb);
    loginll11.addView(loginll13);
    loginll11.addView(cb2);
    loginll11.addView(loginll14);
    loginll11.addView(loginll12);



    pop=new NewCDV(loginll,(int)(W()*0.6),(int)(H()*0.7),true,true,false,"CC","In",0,0);

    }




    private int W() {
        return (int) (mContext.getResources().getDisplayMetrics().widthPixels);
    }
    private int H() {
        return (int) (mContext.getResources().getDisplayMetrics().heightPixels);
    }
    private Bitmap returnBitMap(String url) {
        URL myFileUrl = null;
        Bitmap bitmap = null;
        try {
            myFileUrl = new URL(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        try {
            HttpURLConnection conn = (HttpURLConnection) myFileUrl
                .openConnection();
            conn.setDoInput(true);
            conn.connect();
            InputStream is = conn.getInputStream();
            bitmap = BitmapFactory.decodeStream(is);
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bitmap;
    }

}
