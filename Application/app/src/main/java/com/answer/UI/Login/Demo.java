package com.answer.UI.Login;
import android.content.Context;
import android.widget.PopupWindow;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.widget.ImageView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.os.LimitExceededException;
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
import android.support.v7.widget.CardView;
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
import com.answer.UI.View.ASUI2;


public class Demo {
    private Context context;
    public PopupWindow pop;

    private LinearLayout loginll;

    private LinearLayout loginll2;

    private LinearLayout loginll3;

    private Bitmap bitmap;

    private LinearLayout loginll4;

    private LinearLayout loginll5;

    private LinearLayout loginll6;

    private EditText EditView;

    private CardView cr;

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

    // ??????SharedPreferences??????
    
    
    public Demo(Context ct){
        try {
        context = ct;
            SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(context);
            final SharedPreferences.Editor editor = pref.edit();
            
        
        loginll=ASUI2.NewView(context,(int)(W()*0.6),(int)(H()*0.7),"CT",1,0,new int[]{Color.parseColor("#ffffff"),Color.parseColor("#ffffff")},new float[]{10,10,10,10,10,10,10,10});
        
        loginll2=ASUI2.NewView(context,(int)(-2),(int)(H()*0.06),"CC",1,0,null,null );
          
        loginll3=ASUI2.NewView(context,(int)(H()*0.2),(int)(H()*0.2),"CC",1,0,new int[]{Color.parseColor("#ff00Da7C"),Color.parseColor("#ff00Da7C")},new float[]{360,360,360,360,360,360,360,360});
        
            cr=new CardView(context);
            cr.setLayoutParams(new android.widget.LinearLayout.LayoutParams((int)(H()*0.2),(int)(H()*0.2)));
            cr.setRadius(360);
            cr.setBackgroundDrawable(ASUI2.roundBG(new int[]{Color.parseColor("#ff00Da7C"),Color.parseColor("#ff00Da7C")},new float[]{360,360,360,360,360,360,360,360},null,0));

            ivv= BitmapFactory.decodeStream(context.getAssets().open("icon_alex.png"));                  
            iv=new ImageView(context);
            iv.setImageBitmap(ivv);
            iv.setScaleType(ImageView.ScaleType.FIT_XY);
            iv.setLayoutParams(new android.widget.LinearLayout.LayoutParams((int)(-1),(int)(-1)));
            
            
            
            loginll4=ASUI2.NewView(context,(int)(-2),(int)(H()*0.04),"CC",1,0,null,null );
            
            loginll5=ASUI2.NewView(context,(int)(W()*0.3),(int)(H()*0.08),"CC",1,0,new int[]{Color.parseColor("#86C0C0C0"),Color.parseColor("#86C0C0C0")},new float[]{360,360,360,360,360,360,360,360});
            
            loginll6=ASUI2.NewView(context,(int)(W()*0.295),(int)(H()*0.07),"CC",1,0,new int[]{Color.parseColor("#FFFFFF"),Color.parseColor("#FFFFFF")},new float[]{360,360,360,360,360,360,360,360});
            
            
            EditView=ASUI2.NewET(context, "???????????????", "", 8, "#000000", false);
            EditView.setGravity(Gravity.LEFT|Gravity.CENTER);
            EditView.setBackgroundColor(Color.parseColor("#00000000"));
            EditView.setLayoutParams(new android.widget.LinearLayout.LayoutParams((int)(W()*0.28),(int)(H())));
            EditView.setMaxLines(1);
            EditView.setInputType(EditorInfo.TYPE_CLASS_PHONE); 
            
            EditView.addTextChangedListener(new TextWatcher(){

                    @Override
                    public void onTextChanged(CharSequence p1, int p2, int p3, int p4) {
                    }

                    @Override
                    public void afterTextChanged(Editable p1) {
                    }

                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                        if(TextUtils.isEmpty(EditView.getText())){
                            iv.setImageBitmap(ivv);
                        }else if(EditView.getText().length()>=6&&EditView.getText().length()<=10){

                            new Thread(new Runnable() {
                                    @Override
                                    public void run() {
                                        bitmap = returnBitMap("http://q.qlogo.cn/headimg_dl?dst_uin="+EditView.getText()+"&spec=100");
                                        
                                        iv.post(new Runnable() {
                                                @Override
                                                public void run() {

                                                    iv.setImageBitmap(bitmap);
                                                    iv.setScaleType(ImageView.ScaleType.FIT_XY);

                                                }
                                            });
                                    }
                                }).start();
                        }else{
                            iv.setImageBitmap(ivv);
                        }
                    }


                });
                
            loginll7=ASUI2.NewView(context,(int)(-2),(int)(H()*0.04),"CC",1,0,null,null );
            
            
            loginll8=ASUI2.NewView(context,(int)(W()*0.3),(int)(H()*0.08),"CC",1,0,new int[]{Color.parseColor("#86C0C0C0"),Color.parseColor("#86C0C0C0")},new float[]{360,360,360,360,360,360,360,360});

            loginll9=ASUI2.NewView(context,(int)(W()*0.295),(int)(H()*0.07),"CC",1,0,new int[]{Color.parseColor("#FFFFFF"),Color.parseColor("#FFFFFF")},new float[]{360,360,360,360,360,360,360,360});


            EditView2=ASUI2.NewET(context, "???????????????", "", 8, "#000000", false);
            EditView2.setGravity(Gravity.LEFT|Gravity.CENTER);
            EditView2.setBackgroundColor(Color.parseColor("#00000000"));
            EditView2.setLayoutParams(new android.widget.LinearLayout.LayoutParams((int)(W()*0.28),(int)(H())));
            EditView2.setMaxLines(1);
           // EditView2.setInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD);
            EditView2.setTransformationMethod(PasswordTransformationMethod.getInstance()); //???????????????CheckBox??????????????? 
            
//??????editText.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
            
            loginll10=ASUI2.NewView(context,(int)(-2),(int)(H()*0.04),"CC",1,0,null,null );
            
            loginll11=ASUI2.NewView(context,(int)(W()*0.6),(int)(H()*0.12),"CL",0,0,null,null );
            
                        
            
            cb=new CheckBox(context);
            cb.setText("????????????");
            
            cb.setOnCheckedChangeListener(new OnCheckedChangeListener() { 

                    @Override 
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) { 
                        // TODO Auto-generated method stub 
                        if(cb.isChecked()){ 

                            EditView2.setTransformationMethod(HideReturnsTransformationMethod.getInstance()); //?????????????????????????????? 
                            EditView2.setSelection(EditView2.getText().length());   //TextView????????????????????????????????????????????????????????? 

                        }else { 

                            EditView2.setTransformationMethod(PasswordTransformationMethod.getInstance()); //???????????????CheckBox??????????????? 

                            EditView2.setSelection(EditView2.getText().length()); 
                        } 
                   }}); 
            
            loginll13=ASUI2.NewView(context,(int)(W()*0.02),(int)(-2),"CL",0,0,null,null );
                   
            cb2=new CheckBox(context);
            cb2.setText("????????????");
            
            
            
            loginll14=ASUI2.NewView(context,(int)(W()*0.02),(int)(-2),"CL",0,0,null,null );


            loginll12=ASUI2.NewButton(context,"??????",(int)(W()*0.08),(int)(H()*0.1));
            loginll12.setBackgroundDrawable(ASUI2.roundBG(new int[]{Color.parseColor("#2196f3"),Color.parseColor("#2196f3")},new float[]{10,10,10,10,10,10,10,10},null,0));
            
// ??????????????????????????????????????????
            if (pref.getBoolean("remember", false)) {
                // ??????????????????????????????????????????????????????
                // ???????????????????????????????????????
                EditView.setText(pref.getString("username", "")); // ??????
                EditView2.setText(pref.getString("password", "")); // ??????
                cb2.setChecked(true); // ?????????????????????
            }
// ???????????????????????????
            loginll12.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // ????????????????????????????????????????????????????????????????????????
                        String uname = EditView.getText().toString();
                        String pwd = EditView2.getText().toString();
                      
                        // ??????????????????????????????????????????
                        if (cb2.isChecked()) {
                            // ?????????????????????????????????????????????????????????
                            editor.putBoolean("remember", true);
                            editor.putString("username", uname);
                            editor.putString("password", pwd);
                        } else {
                            // ????????????????????????????????????????????????
                            editor.clear();
                        }
                        // ???????????????????????????????????????????????????commit???apply
                        editor.apply();
                        // editor.commit();
                    }
                });
            
            
                    
        
        
            loginll.addView(loginll2);
            loginll.addView(loginll3);
            loginll3.addView(cr);
            cr.addView(iv);
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
            
            
            
        pop=ASUI2.NewPW(loginll,(int)(W()*0.6),(int)(H()*0.7),true,true,false,"CC","In",0,0);
        } catch (IOException e) {}
    }
    public void show(){
        pop.showAtLocation(loginll,Gravity.CENTER,0,0);
    }
    public void dis(){
        pop.dismiss();
    }
    void show(String str){
        Toast.makeText(context,str,Toast.LENGTH_LONG).show();
    }
    private int W(){
        return (int) (context.getResources().getDisplayMetrics().widthPixels);
    }
    private int H(){
        return (int) (context.getResources().getDisplayMetrics().heightPixels);
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
