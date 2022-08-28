package com.Eastiy.EXO.View;
import android.content.Context;

/*
 * ClassName: AppConfig 
 * Chinese : 应用数据储存中心
 * Time: 2022/08/05/00:32
 * By Answer.Dev
 * QQ 2903536884
 */
public class AppConfig {

   public static final String TAG = "AppConfig";
   
    /*颜色*/
    public static String[] Light=new String[]{"#ffffff"/*0_背景*/,"#f9f9f9"/*1_浅黑色*/,"#f4f4f4"/*2_深灰色*/,"#e9e9e9"/*3_灰色*/,"#000000"/*4*/,"#6699FF"/*5_文本*/,"#000000"/*6*/, "#FFFFFF"/*7*/, "#000000"/*8*/, "#FAFAFA"/*背景_9*/, "#2882FF"/*蓝色_10*/,"#aaffffff"/*透明_11*/,"#7b68ee"/*紫色_12*/ ,"#6495ED"/*文本蓝_13*/ , "#607D8B"/*灰蓝色_14*/};

    public static String[] Dark=new String[]{"#000000"/*0_背景*/,"#222222"/*1_浅黑色*/,"#333333"/*2_深灰色*/,"#3f3f3f"/*3_灰色*/,"#eeeeee"/*4*/,"#3399FF"/*5_文本*/,"#ffffff"/*6*/, "#FFFFFF"/*7*/, "#000000"/*8*/, "#eeeeee"/*背景_9*/, "#4169E1"/*蓝色_10*/ ,"#aa000000"/*透明_11*/ ,"#483d8b"/*紫色_12*/ ,"#4682B4"/*文本蓝_13*/ , "#37474F"/*灰蓝色_14*/};

    public static String[] theme=AppConfig.Light;

    public static int dp2px(Context context, float dipValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dipValue * scale + 0.5f);
    }

    public static int W;
    public static int H;

    public static int getDeviceWidth() {
        return W;
    }

    public static int getDeviceHeight() {
        return H;
    }

    public static int W() {
        return W;
    }

    public static int H() {
        return H;
    }
}
