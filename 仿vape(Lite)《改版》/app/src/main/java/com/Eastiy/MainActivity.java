package com.Eastiy;
 
import android.app.Activity;
import android.os.Bundle;
import com.Eastiy.EXO.*;
import android.webkit.*;

public class MainActivity extends Activity { 

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Load.Load(this);
    }
	
		
    
	
} 
