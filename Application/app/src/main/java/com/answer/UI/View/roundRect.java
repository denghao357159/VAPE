package com.answer.UI.View;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import java.util.ArrayList;



public class roundRect extends GradientDrawable {


        public roundRect(Object arr, Object arr2, String f, Object s) {
                int[] arrs=null;
                float[] arrs2=null;

                GradientDrawable.Orientation jb = null;
                int type = 0;
                //上下
                if (f == "TB" || f == null) {
                        jb = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM;
                        //左右
                    } else if (f == "LR") {
                        jb = android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT;
                        //右上
                    } else if (f == "RT") {
                        jb = android.graphics.drawable.GradientDrawable.Orientation.BL_TR;
                        //右下
                    } else if (f == "RB") {
                        jb = android.graphics.drawable.GradientDrawable.Orientation.TL_BR;
                    }
                if (s == 0 || s == null) {
                        type = android.graphics.drawable.GradientDrawable.LINEAR_GRADIENT;
                    } else if (s == 1) {
                        type = android.graphics.drawable.GradientDrawable.RADIAL_GRADIENT;
                    } else if (s == 2) {
                        type = android.graphics.drawable.GradientDrawable.SWEEP_GRADIENT;
                    }

                if (!isArray(arr)) {
                        arrs = new int[]{arr,arr,arr};
                        setColors(arrs);
                    } else {
                        setColors((int[])(arr));
                    }
                if (!isArray(arr2)) {
                        arrs2 = new float[]{Float.valueOf(arr2 + ""),Float.valueOf(arr2 + ""),Float.valueOf(arr2 + ""),Float.valueOf(arr2 + ""),Float.valueOf(arr2 + ""),Float.valueOf(arr2 + ""),Float.valueOf(arr2 + ""),Float.valueOf(arr2 + "")};
                        setCornerRadii(arrs2);
                    } else {
                        int[] arr2s=(int[])(arr2);
                        arrs2 = new float[]{Float.valueOf(arr2s[0] + ""),Float.valueOf(arr2s[0] + ""),Float.valueOf(arr2s[1] + ""),Float.valueOf(arr2s[1] + ""),Float.valueOf(arr2s[2] + ""),Float.valueOf(arr2s[2] + ""),Float.valueOf(arr2s[3] + ""),Float.valueOf(arr2s[3] + "")};
                        setCornerRadii(arrs2);
                    }
                if (arr2 == null) {
                        float[] arr2s=new float[]{10,10,10,10,10,10,10,10};
                        setCornerRadii(arr2s);
                    }

                setShape(GradientDrawable.RECTANGLE);
                setGradientType(type);
                setOrientation(jb);
            }

        public roundRect(Object arr, Object arr2, String f) {
                int[] arrs=null;
                float[] arrs2=null;

                GradientDrawable.Orientation jb = null;
                int type = 0;
                //上下
                if (f == "TB" || f == null) {
                        jb = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM;
                        //左右
                    } else if (f == "LR") {
                        jb = android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT;
                        //右上
                    } else if (f == "RT") {
                        jb = android.graphics.drawable.GradientDrawable.Orientation.BL_TR;
                        //右下
                    } else if (f == "RB") {
                        jb = android.graphics.drawable.GradientDrawable.Orientation.TL_BR;
                    }

                type = android.graphics.drawable.GradientDrawable.LINEAR_GRADIENT;

                if (!isArray(arr)) {
                        arrs = new int[]{arr,arr,arr};
                        setColors(arrs);
                    } else {
                        setColors((int[])(arr));
                    }
                if (!isArray(arr2)) {
                        arrs2 = new float[]{Float.valueOf(arr2 + ""),Float.valueOf(arr2 + ""),Float.valueOf(arr2 + ""),Float.valueOf(arr2 + ""),Float.valueOf(arr2 + ""),Float.valueOf(arr2 + ""),Float.valueOf(arr2 + ""),Float.valueOf(arr2 + "")};
                        setCornerRadii(arrs2);
                    } else {
                        int[] arr2s=(int[])(arr2);
                        arrs2 = new float[]{Float.valueOf(arr2s[0] + ""),Float.valueOf(arr2s[0] + ""),Float.valueOf(arr2s[1] + ""),Float.valueOf(arr2s[1] + ""),Float.valueOf(arr2s[2] + ""),Float.valueOf(arr2s[2] + ""),Float.valueOf(arr2s[3] + ""),Float.valueOf(arr2s[3] + "")};
                        setCornerRadii(arrs2);
                    }
                if (arr2 == null) {
                        float[] arr2s=new float[]{10,10,10,10,10,10,10,10};
                        setCornerRadii(arr2s);
                    }

                setShape(GradientDrawable.RECTANGLE);
                setGradientType(type);
                setOrientation(jb);
            }

        public roundRect(Object arr, Object arr2) {
                int[] arrs=null;
                float[] arrs2=null;

                GradientDrawable.Orientation jb = null;
                int type = 0;
                //上下
                jb = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM;
                
                type = android.graphics.drawable.GradientDrawable.LINEAR_GRADIENT;

                if (!isArray(arr)) {
                        arrs = new int[]{arr,arr,arr};
                        setColors(arrs);
                    } else {
                        setColors((int[])(arr));
                    }
                if (!isArray(arr2)) {
                        arrs2 = new float[]{Float.valueOf(arr2 + ""),Float.valueOf(arr2 + ""),Float.valueOf(arr2 + ""),Float.valueOf(arr2 + ""),Float.valueOf(arr2 + ""),Float.valueOf(arr2 + ""),Float.valueOf(arr2 + ""),Float.valueOf(arr2 + "")};
                        setCornerRadii(arrs2);
                    } else {
                        int[] arr2s=(int[])(arr2);
                        arrs2 = new float[]{Float.valueOf(arr2s[0] + ""),Float.valueOf(arr2s[0] + ""),Float.valueOf(arr2s[1] + ""),Float.valueOf(arr2s[1] + ""),Float.valueOf(arr2s[2] + ""),Float.valueOf(arr2s[2] + ""),Float.valueOf(arr2s[3] + ""),Float.valueOf(arr2s[3] + "")};
                        setCornerRadii(arrs2);
                    }
                if (arr2 == null) {
                        float[] arr2s=new float[]{10,10,10,10,10,10,10,10};
                        setCornerRadii(arr2s);
                    }

                setShape(GradientDrawable.RECTANGLE);
                setGradientType(type);
                setOrientation(jb);
            }

        public roundRect(Object arr) {
                int[] arrs=null;
                float[] arrs2=null;

                GradientDrawable.Orientation jb = null;
                int type = 0;
                //上下
                jb = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM;

                type = android.graphics.drawable.GradientDrawable.LINEAR_GRADIENT;

                if (!isArray(arr)) {
                        arrs = new int[]{arr,arr,arr};
                        setColors(arrs);
                    } else {
                        setColors((int[])(arr));
                    }

                float[] arr2s=new float[]{10,10,10,10,10,10,10,10};
                setCornerRadii(arr2s);

                setShape(GradientDrawable.RECTANGLE);
                setGradientType(type);
                setOrientation(jb);
            }


        public static boolean isArray(Object obj) {
                if (obj == null) {
                        return false;
                    }
                return obj.getClass().isArray();
            }


    }
