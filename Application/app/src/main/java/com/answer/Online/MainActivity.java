package com.answer.Online;
 
import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;
import com.answer.UI.*;
import com.applications.ApplicationUtils;

public class MainActivity extends Activity { 
	ApplicationUtils application;

	 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
                             WindowManager.LayoutParams.FLAG_FULLSCREEN); 
        setContentView(R.layout.activity_main);
		
        application=(ApplicationUtils)getApplication();
		
		
		
        Load.Load(this);
		}
    
	
} 
