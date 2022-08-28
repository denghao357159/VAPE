package com.answer.UI.View;
import android.widget.LinearLayout;
import android.view.View;
import android.content.Context;

public class AView extends LinearLayout {

        public AView(Context context, LinearLayout view, Object sizeW, Object sizeH, String gravity, Object ori, int cm, Object color, Object cr, final View.OnClickListener set) {
                super(context);
                if(view!=null)view.addView(this);
                setSizeWH(sizeW,sizeH,this);
                setGravitys(gravity,this);
                setOri(ori,this);
                setBackgroundColors(cm,color,cr,this);
                setClickListener(set,this);
            }
            
        public AView(Context context, LinearLayout view, Object sizeW, Object sizeH, String gravity, Object ori, int cm, Object color, Object cr) {
                super(context);
                if(view!=null)view.addView(this);
                setSizeWH(sizeW,sizeH,this);
                setGravitys(gravity,this);
                setOri(ori,this);
                setBackgroundColors(cm,color,cr,this);
            }
            
        public AView(Context context, LinearLayout view, Object sizeW, Object sizeH, String gravity, Object ori, int cm, Object color) {
                super(context);
                if(view!=null)view.addView(this);
                setSizeWH(sizeW,sizeH,this);
                setGravitys(gravity,this);
                setOri(ori,this);
                setBackgroundColors(cm,color,0,this);
            }
            
        public AView(Context context, LinearLayout view, Object sizeW, Object sizeH, String gravity, Object ori, int cm) {
                super(context);
                if(view!=null)view.addView(this);
                setSizeWH(sizeW,sizeH,this);
                setGravitys(gravity,this);
                setOri(ori,this);
                setBackgroundColors(cm,null,0,this);
            }
            
        public AView(Context context, LinearLayout view, Object sizeW, Object sizeH, String gravity, Object ori) {
                super(context);
                if(view!=null)view.addView(this);
                setSizeWH(sizeW,sizeH,this);
                setGravitys(gravity,this);
                setOri(ori,this);
            }
            
        public AView(Context context, LinearLayout view, Object sizeW, Object sizeH) {
                super(context);
                if(view!=null)view.addView(this);
                setSizeWH(sizeW,sizeH,this);
                setGravitys(null,this);
                setOri(1,this);
            }
            
        public AView(Context context, LinearLayout view, Object sizeW) {
                super(context);
                if(view!=null)view.addView(this);
                setSizeWH(sizeW,0,this);
                setGravitys(null,this);
                setOri(1,this);
            }
            
        public AView(Context context, LinearLayout view) {
                super(context);
                if(view!=null)view.addView(this);
                setGravitys(null,this);
                setOri(1,this);
            }

        private static void setSizeWH(Object sizeW, Object sizeH, LinearLayout v) {
                if (sizeW != null && sizeH != null) {
                        v.setLayoutParams(new android.widget.LinearLayout.LayoutParams((int)(sizeW), (int)(sizeH)));
                    }
            }

        private static void setGravitys(String gravity, LinearLayout v) {
                if (gravity == "LT" || gravity == null) {
                        v.setGravity(android.view.Gravity.LEFT | android.view.Gravity.TOP);
                    } else if (gravity == "LC") {
                        v.setGravity(android.view.Gravity.LEFT | android.view.Gravity.CENTER);
                    } else if (gravity == "LB") {
                        v.setGravity(android.view.Gravity.LEFT | android.view.Gravity.BOTTOM);
                    } else if (gravity == "CT") {
                        v.setGravity(android.view.Gravity.CENTER | android.view.Gravity.TOP);
                    } else if (gravity == "CC") {
                        v.setGravity(android.view.Gravity.CENTER | android.view.Gravity.CENTER);
                    } else if (gravity == "CB") {
                        v.setGravity(android.view.Gravity.CENTER | android.view.Gravity.BOTTOM);
                    } else if (gravity == "RT") {
                        v.setGravity(android.view.Gravity.RIGHT | android.view.Gravity.TOP);
                    } else if (gravity == "RC") {
                        v.setGravity(android.view.Gravity.RIGHT | android.view.Gravity.CENTER);
                    } else if (gravity == "RB") {
                        v.setGravity(android.view.Gravity.RIGHT | android.view.Gravity.BOTTOM);
                    }
            }

        private static void setOri(Object ori, LinearLayout v) {
                if (!(ori == null)) {
                        v.setOrientation((int)ori);
                    }
            }

        private static void setBackgroundColors(int cm, Object color, Object cr, LinearLayout v) {
                if (cm == 0) {
                        v.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(android.graphics.Color.parseColor((String)color)));
                    } else if (cm == 1) {
                        v.setBackgroundDrawable(ColorLibrary.roundBG(color, cr, null, null));
                    } else if (cm == 2) {
                    }
            }

        private static void setClickListener(final OnClickListener click, LinearLayout v) {
                if (click != null) {
                        v.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                            click.onClick(view);
                                        }
                                });
                    }
                    }
            }
