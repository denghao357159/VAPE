package com.answer.UI.View;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import com.answer.UI.View.AppConfig;

import android.animation.AnimatorSet;
import android.view.animation.DecelerateInterpolator;

public class AnimationLibrary extends AppConfig{

    private static ViewTreeObserver.OnGlobalLayoutListener globallayoutlinstener;

	
    
    /*动画库*/

    /*#揭露*/public static ViewTreeObserver.OnGlobalLayoutListener UIReveal(final View view,final int x,final int y,final int startr,final int endr,final int time){

        globallayoutlinstener=new android.view.ViewTreeObserver.OnGlobalLayoutListener(){
            @Override
            public void onGlobalLayout(){
                Animator anim=ViewAnimationUtils.createCircularReveal(view, x, y, Float.valueOf(startr), Float.valueOf(endr));
                anim.setDuration(time);
                anim.start();

                view.getViewTreeObserver().removeOnGlobalLayoutListener(globallayoutlinstener);
            }};
        view.setVisibility(android.view.View.VISIBLE);
        view.getViewTreeObserver().addOnGlobalLayoutListener(globallayoutlinstener);
        return globallayoutlinstener;
    };
    
    public static ViewTreeObserver.OnGlobalLayoutListener UIReveal(final View view,final int x,final int y,final int startr,final int time){
                return UIReveal(view,x,y,startr,0,time);
    };
    
    public static ViewTreeObserver.OnGlobalLayoutListener UIReveal(final View view,final int x,final int y,final int time){
        return UIReveal(view,x,y,0,time);
    };
    
    public static ViewTreeObserver.OnGlobalLayoutListener UIReveal(final View view,final int x,final int time){
        return UIReveal(view,x,0,time);
    };
    
    
    
    /*#移动*/public static TranslateAnimation UIMove(View view,int x1,int x2,int y1,int y2,int time,Object type){
        int tp=((type==null||type==0)?android.view.animation.Animation.RELATIVE_TO_SELF:type==1?android.view.animation.Animation.RELATIVE_TO_PARENT:android.view.animation.Animation.ABSOLUTE);
        TranslateAnimation dh=new android.view.animation.TranslateAnimation((int)(tp), (int)(x1 * 0.01), (int)(tp),(int)( x2 * 0.01), (int)(tp), (int)(y1 * 0.01), (int)(tp), (int)(y2 * 0.01));
        dh.setDuration(time);
        
        if (view != null)view.startAnimation(dh);
        dh.start();
        dh.startNow();
        return dh;
    };
    /*#旋转*/public static RotateAnimation UIRotate(View view,int A,int B,int x,int y,int time,Object type){

        int tp=((type==null||type==0)?android.view.animation.Animation.RELATIVE_TO_SELF:type==1?android.view.animation.Animation.RELATIVE_TO_PARENT:android.view.animation.Animation.ABSOLUTE);
        RotateAnimation dh=new android.view.animation.RotateAnimation((int)(A),(int)( B), (int)(tp), (int)(x * 0.01), (int)(tp), (int)(y * 0.01));dh.setDuration(time);dh.setFillAfter(true);
        if (view != null)view.startAnimation(dh);
        //dh.startNow();
        return dh;
    };
    /*#收缩*/public static ScaleAnimation UIShrink(View view,int x1,int x2,int y1,int y2,int x,int y,int time,Object type){

        int tp=((type == null || type == 0) ?android.view.animation.Animation.RELATIVE_TO_SELF: type == 1 ?android.view.animation.Animation.RELATIVE_TO_PARENT: android.view.animation.Animation.ABSOLUTE);
        ScaleAnimation dh=new android.view.animation.ScaleAnimation((int)(x1 * 0.01),(int)( x2 * 0.01),(int)( y1 * 0.01),(int)(y2*0.01),(int)(tp),(int)( x * 0.01),(int)( tp),(int)(y * 0.01));
        dh.setDuration(time);
        if (view != null)view.startAnimation(dh);
        //dh.startNow();
        return dh;
    };
    /*#淡入*/public static AlphaAnimation UIFadein(View view,int A,int B,int time){
        AlphaAnimation dh=new android.view.animation.AlphaAnimation((int)(A * 0.01), (int)(B * 0.01));
        dh.setDuration(time);
        if(view != null)view.startAnimation(dh);
        //dh.startNow();
        return dh;
        
    };
    /*#缩放*/public static ScaleAnimation UIZoom(View view,int In,int out,int time,Object type){
        return UIShrink(view,In,out,In,out,50,50,time,type);
    };
    /*#水平*/public static TranslateAnimation UILevel(View view,int In,int out,int time,Object type){
        return UIMove(view,In,out,0,0,time,type);
    };
    /*#垂直*/public static TranslateAnimation UIPlumb(View view,int In,int out,int time,Object type){
        return UIMove(view,0,0,In,out,time,type);
    };

    
    /*属性动画*/
    
    public static ObjectAnimator AnimationOriginaux(View view,String direction,float... parameter,int time){
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(view, direction,parameter);
        objectAnimator.setDuration(time);
        
        objectAnimator.start();
        return objectAnimator;
    }
    
    /*水平平移(左右)*/
    
    public static ObjectAnimator Transparentanimation(View view,float... parameter,int time){
        return AnimationOriginaux(view,"translationX",parameter,time);
    }

    /*垂直平移(上下)*/
    public static ObjectAnimator Displacementanimation(View view,float... parameter,int time){
        return AnimationOriginaux(view,"translationY",parameter,time);
    }
    
    /*缩放*/
    public static AnimatorSet Zoomanimation(View view,float... parameter,int time){
        AnimatorSet animatorSet = new AnimatorSet();//组合动画  
        ObjectAnimator scaleX = ObjectAnimator.ofFloat(view, "scaleX", parameter);  
        ObjectAnimator scaleY = ObjectAnimator.ofFloat(view, "scaleY", parameter);  

        animatorSet.setDuration(time);  
        animatorSet.setInterpolator(new DecelerateInterpolator());  
        animatorSet.play(scaleX).with(scaleY);//两个动画同时开始  
        animatorSet.start(); 
        
       return animatorSet;
    }
    
    /*缩放x轴*/
    public static ObjectAnimator ZoomXanimation(View view,float... parameter,int time){
       return AnimationOriginaux(view,"scaleX",parameter,time);
    }
    
    /*缩放Y轴*/
    public static ObjectAnimator ZoomYanimation(View view,float... parameter,int time){
       return AnimationOriginaux(view,"scaleY",parameter,time);
    }
    
    /*旋转*/
    public static ObjectAnimator rotationanimation(View view,float... parameter,int time){
        return AnimationOriginaux(view,"rotation",parameter,time);
    }
    
    /*旋转*/
    public static ObjectAnimator rotationanimationX(View view,float... parameter,int time){
        return AnimationOriginaux(view,"rotationX",parameter,time);
    }
    
    /*旋转*/
    public static void rotationanimationY(View view,float... parameter,int time){
        AnimationOriginaux(view,"rotationY",parameter,time);
    }
    
    /*淡入*/
    public static void Alphaanimation(View view,float... parameter,int time){
        AnimationOriginaux(view,"alpha",parameter,time);
    }
    
    /*渐渐改变背景颜色*/
    public static void Colorchangeanimation(NewView view,int... color,int time){
        ObjectAnimator objectAnimator = ObjectAnimator.ofInt(view,"backgroundColor",color);
        objectAnimator.setDuration(time);
        objectAnimator.setEvaluator(new android.animation.ArgbEvaluator());
        objectAnimator.start();
    }

    public static void Rotationanimation(View view,String direction,Object[] angle,int time){
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(view, direction, Float.valueOf(angle[0]),Float.valueOf(angle[1]),Float.valueOf(angle[2]));
        objectAnimator.setDuration(time);  
        objectAnimator.start();  
    }

    public static void Zoomanimations(View view,int time,float... proportion){
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(view, "scaleX", proportion);
        objectAnimator.setDuration(time);  
        objectAnimator.start();  

        ObjectAnimator objectAnimator2 = ObjectAnimator.ofFloat(view, "scaleY", proportion);
        objectAnimator2.setDuration(time);  
        objectAnimator2.start();  
    }

    public static void Waterdropanimation(View view,int time){
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(view, "scaleX", new float[]{1, 0.8f,1.3f,0.9f,1});
        objectAnimator.setDuration(time);  
        objectAnimator.start();  

        ObjectAnimator objectAnimator2 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{1, 0.8f,1.3f,0.9f,1});
        objectAnimator2.setDuration(time);  
        objectAnimator2.start();  

    }
    


    public static void LongClickObjectAnimator(View views){
        views.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(final View view) {
                    
                    AnimationLibrary.rotationanimationX(view, new float[]{0f,-40f}, 800).addListener(new ObjectAnimator.AnimatorListener(){
                            @Override
                            public void onAnimationStart(Animator p1) {
                            }

                            @Override
                            public void onAnimationCancel(Animator p1) {
                            }

                            @Override
                            public void onAnimationRepeat(Animator p1) {
                            }

                            @Override
                            public void onAnimationEnd(Animator p1) {
                                
                                AnimationLibrary.rotationanimationX(view, new float[]{-40f,20f}, 450).addListener(new ObjectAnimator.AnimatorListener(){

                                        @Override
                                        public void onAnimationStart(Animator p1) {
                                        }

                                        @Override
                                        public void onAnimationCancel(Animator p1) {
                                        }

                                        @Override
                                        public void onAnimationRepeat(Animator p1) {
                                        }

                                        @Override
                                        public void onAnimationEnd(Animator p1) {
                                            
                                            AnimationLibrary.rotationanimationX(view, new float[]{20f,0f}, 300);
                                        }
                                    });
                            }
                        });
                    return false;
                }
            });
    }
    
}
