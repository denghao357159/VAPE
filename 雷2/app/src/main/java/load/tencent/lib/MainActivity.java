package load.tencent.lib;

import android.app.Activity;
import android.os.Bundle;
import load.tencent.lib.ku.Toast;
import android.graphics.Color;
import android.view.Gravity;
import android.view.WindowManager;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
                             WindowManager.LayoutParams.FLAG_FULLSCREEN); 
        setContentView(R.layout.activity_main);
        
        FloatStartService.load(this);


	   
    }

}
