package com.answer.UI;


import android.content.Context;
import android.widget.PopupWindow;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.view.Gravity;
import android.app.Activity;
import android.os.Handler;
import android.widget.TextView;
import java.util.ArrayList;
import com.answer.UI.View.LTextView;
import android.animation.ValueAnimator;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import com.answer.UI.View.NewView;

public class Sidebar {
	private ArrayList list;
	private static Context context;
	private PopupWindow BarPop;
	private LinearLayout lineBar;
	public Sidebar(Context ct,String title){
		this.context = ct;
		list = new ArrayList();
		BarPop = new PopupWindow(context);
		BarPop.setTouchable(false);
		//显示右边栏
		lineBar = new LinearLayout(context);
		lineBar.setOrientation(0);
		lineBar.setBackgroundColor(0);
		final NewView line =new NewView(context, 15, 600, "RT", 1, 1, new String[]{"#6190e8","#a7bfe8","RT"}, 0, null);
		
		
		TextView tx = new TextView(context);
		tx.setText(title);
		tx.setTextSize(16);
		
		ValueAnimator animator = ObjectAnimator.ofInt(tx,"textColor",
													  0x88333833, 0x88ca0007, 0x880333dc, 0x88089905);
		animator.setDuration(2000);
		animator.setEvaluator(new ArgbEvaluator());
		animator.setRepeatCount(-1);
		animator.setRepeatMode(ValueAnimator.REVERSE);
		animator.start();
		
		
		lineBar.addView(tx);
		lineBar.addView(line);
		BarPop.setBackgroundDrawable(context.getResources().getDrawable(android.R.color.transparent));
		//加载SideBar界面
		BarPop.setContentView(lineBar);
		
		BarPop.showAtLocation(lineBar,Gravity.RIGHT|Gravity.TOP,20,0);
		ValueAnimator animatort = ObjectAnimator.ofInt(line,"backgroundColor",
													   0x88089905, 0x88ca0007, 0x880333dc, 0x88333833);
		animatort.setDuration(1000);                 
		animatort.setEvaluator(new ArgbEvaluator());
		animatort.setRepeatCount(-1);
		animatort.setRepeatMode(ValueAnimator.REVERSE);
		animatort.start();
		
		
	}

	//增加右边栏内容
	public void addSideBar(String str){
		LTextView tx1 = new LTextView(context);
		tx1.setText(str);
		list.add(str);
		lineBar.addView(tx1);
	}
	//移除右边栏内容
	public void removeSideBar(String str){
		for (int i = 0;i < list.size();i++){
			if (list.get(i).toString().equals(str)){
				lineBar.removeViewAt(i + 1);
				list.remove(i);
				break;
			}
		}
	}
    public static int W(){
        return (int) (context.getResources().getDisplayMetrics().widthPixels);
    }
    public static int H(){
        return (int) (context.getResources().getDisplayMetrics().heightPixels);
    }
}

