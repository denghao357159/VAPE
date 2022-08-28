package EC.Library;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.graphics.drawable.GradientDrawable;
import android.view.Gravity;
import android.widget.TextView;
import android.graphics.Typeface;
import android.widget.ScrollView;
import android.widget.Button;
import android.graphics.Color;
import android.widget.PopupWindow;
import android.view.WindowManager;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.widget.Toast;

public class MainActivity extends Activity { 
      boolean[] sw=new boolean[1000];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        WindowManager.LayoutParams lp = getWindow().getAttributes();
        lp.alpha = 0.8f;
        getWindow().setAttributes(lp);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
        
        
        
        
        事例.Start(this);
        
        
    }
    
 
    
}
    
