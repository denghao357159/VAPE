package com.answer.UI.View;
import android.content.Context;
import android.widget.*;
import android.view.View;

public class Tostbut extends LinearLayout{
    
    public boolean color=true;
    
    public Tostbut(Context context,LinearLayout view,int number,String title,String subtitle,final boolean kj,final View.OnClickListener run,final String sn) {
        super(context);
        int W=context.getResources().getDisplayMetrics().widthPixels;
        int H = context.getResources().getDisplayMetrics().heightPixels;
        
        NewView _s1=new NewView(context, (int)(W * 0.629), (int)(H * 0.16), "LC", 1, 2, null, null, null);
        NewView _s2 = new NewView(context, -1, -1, "LC", 1, 0, "#afffffff", null, null);
        NewView _s3 = new NewView(context, (int)(W * 0.629), (int)(H * 0.14), "CC", 0, 2, null, null, null);
        NewView _s4 = new NewView(context, (int)(W * 0.5), (int)(H * 0.14), "CC", 1, 2, null, null, null);
        final NewView _s5 = new NewView(context, (int)(W * 0.1), (int)(H * 0.08), "CC", 1, 1, "#e9e9e9", 15, null);
		_s5.setElevation(8);
        final NewText _st6 = new NewText(context, null, "CC", 14, "#000000");

        if (kj == true) {
            color=true;
            _s5.setBackgroundDrawable(ASUI.roundBG(new String[]{"#6190e8","#a7bfe8","RT"},15,null,null));
            _s5.setOnClickListener(new View.OnClickListener(){@Override public void onClick(View view){ASUI.UIPlumb(view ,100,0 ,150,null);if(run!=null){run.onClick(view);}if(color){_s5.setBackgroundDrawable(ASUI.roundBG("#e9e9e9",15,null,null));if(sn!=null){_st6.setText(android.text.Html.fromHtml(sn));}else{_st6.setText(android.text.Html.fromHtml("</b><b>关闭"));}color=false;}else{_s5.setBackgroundDrawable(ASUI.roundBG(new String[]{"#6190e8","#a7bfe8","RT"},15,null,null));if(sn!=null){_st6.setText(android.text.Html.fromHtml(sn));}else{_st6.setText(android.text.Html.fromHtml("</b><b>开启"));}color=true;}}});
            if(sn!=null){_st6.setText(android.text.Html.fromHtml(sn));}else{_st6.setText(android.text.Html.fromHtml("</b><b>开启"));}
        }else{
            color=false;
            _s5.setBackgroundDrawable(ASUI.roundBG("#e9e9e9",15,null,null));
            _s5.setOnClickListener(new View.OnClickListener(){@Override public void onClick(View view){ASUI.UIPlumb(view ,100,0 ,150,null);if(run!=null){run.onClick(view);}if(color){_s5.setBackgroundDrawable(ASUI.roundBG("#e9e9e9",15,null,null));if(sn!=null){_st6.setText(android.text.Html.fromHtml(sn));}else{_st6.setText(android.text.Html.fromHtml("</b><b>关闭"));}color=false;}else{_s5.setBackgroundDrawable(ASUI.roundBG(new String[]{"#6190e8","#a7bfe8","RT"},15,null,null));if(sn!=null){_st6.setText(android.text.Html.fromHtml(sn));}else{_st6.setText(android.text.Html.fromHtml("</b><b>开启"));}color=true;}}});
            if(sn!=null){_st6.setText(android.text.Html.fromHtml(sn));}else{_st6.setText(android.text.Html.fromHtml("</b><b>关闭"));}
            }
            
        NewText _st4=new NewText(context, null, "LC", 15, "#000000");
        _st4.setText(android.text.Html.fromHtml("</b><b>- | " + title + " | -"));
        NewText _st5 = new NewText(context, null, "LC", 11, "#000000");
        _st5.setText(android.text.Html.fromHtml(subtitle));
        
        if (number != 1) {_s1.addView(_s2);}
        view.addView(_s3);
        _s3.addView(_s4);
        _s3.addView(_s5);
        _s4.addView(_st4);
        _s4.addView(_st5);
        _s5.addView(_st6);
        ASUI.UIPlumb(view , 100, 0 ,150,null);
        ASUI.UIFadein(_s2 , 0, 100 ,300);
        ASUI.UIFadein(_s3 , 0, 100 ,300);
    }
    
    
}
