package EC.Library.Basis;
import android.util.DisplayMetrics;
import android.content.Context;
import android.app.Activity;
import android.graphics.drawable.BitmapDrawable;

public class Tools {

    public static final String TAG = "Tools";

     public static int H(Context ctx) {
        Activity act=(Activity)ctx;
        DisplayMetrics metrics = new android.util.DisplayMetrics();
        act.getWindowManager().getDefaultDisplay().getMetrics(metrics);
        return metrics.heightPixels;
    };

   public static int W(Context ctx) {
        Activity act=(Activity)ctx;
        DisplayMetrics metrics = new android.util.DisplayMetrics();
        act.getWindowManager().getDefaultDisplay().getMetrics(metrics);
        return metrics.widthPixels;
	};

    public static BitmapDrawable B64(String str) {
        byte[] A=android.util.Base64.decode(str, 0);
        BitmapDrawable B=new android.graphics.drawable.BitmapDrawable(android.graphics.BitmapFactory.decodeByteArray(A, 0, A.length));
        return B;
    };

    

   public static int getScreenWidth(Context ctx){
        int Width;
        if(H(ctx)>W(ctx)){
            Width = H(ctx);
        }else{
            Width = W(ctx);
        }
        return Width;
   }

   
     public static  int getScreenHeight(Context ctx){
        int Height;
        if(W(ctx)<H(ctx)){
            Height = W(ctx);
        }else{
            Height = H(ctx);
        }
        return Height;
    }

}
