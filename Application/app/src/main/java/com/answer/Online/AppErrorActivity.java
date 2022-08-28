package com.answer.Online;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;
import android.app.Activity;


public class AppErrorActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bug);
		
		
		
		Intent intent = getIntent();
		String error = getIntent().getStringExtra("BUG");
		
		TextView textView = findViewById(R.id.bugTextView);
		textView.setTextColor(Color.RED);
		textView.setText("<Error>" + error.replace("... 9 more", "").replace("... 11 more", ""));
		textView.setTextIsSelectable(true);
		
		
		
		
	}

	@Override
	public void onBackPressed() {
		android.os.Process.killProcess(android.os.Process.myPid());
		super.onBackPressed();
	}
    
}
