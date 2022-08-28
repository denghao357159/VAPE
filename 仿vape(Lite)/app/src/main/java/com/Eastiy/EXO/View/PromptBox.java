package com.Eastiy.EXO.View;
import android.content.Context;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.MotionEvent;
import android.widget.Toast;

public class PromptBox {
    
    public static Context context;

    private static int clo;

    private static NewText pt4;

    private static NewText pt2;

    private static NewText pt3;

    private static NewCDV PromptBoxCDV;

    private static double size;

    private static NewView pb0;

    private static NewView pb1;

    private static NewView pb3;

    private static NewView pb2;

    private static NewViewSV pb4;

    private static NewView pb5;

    private static NewView pb6;

    private static NewView pb7;

    private static NewView _pb7;

    private static NewView _pb8;

    private static NewView pb9;

    private static NewView _pb9;

    private static NewText pt1;                                                                                                                
    
    public static void show(Context ct,Object sizes,String title,String[] maintext,final Object[] clo1,final Object[] clo2,Object[] add){
        context=ct;
        if(sizes=="small"){
            size=0.6;
        }else if(sizes=="medium"){
            size=0.8;
        }else if(sizes=="large"){
            size=1;
        }
        if(clo1!=null){
            clo=1;
        }
        if(clo1!=null && clo2!=null){
            clo=2;
        }
        
         pb0=new NewView(ct, -1, -1, "CC", 1, 2, null, null, null);
         pb1 = new NewView(ct, (int)(W() * 0.7*size), (int)(H() * 0.8*size), "CC", 1, 1, "#FFC0CB", 10, null);
         pb2 = new NewView(ct, (int)(W() * 0.65*size), (int)(H() * 0.15), "LC", 1, 1, "#FFC0CB", new int[]{10,10,0,0}, null);
         pb3 = new NewView(ct, (int)(W() * 0.65*size), (int)(H() * 0.8) * (int)(size) - (int)(H() * 0.25), "CC", 1, 2, null, null, null);
         pb4 = new NewViewSV(ct, (int)(W() * 0.65*size), (int)(H() * 0.8*size - H() * 0.25), 2, null, null);
        pb4.setScrollBarDefaultDelayBeforeFade(100);
        pb4.setScrollBarFadeDuration(100);
         pb5=new NewView(ct, (int)(W() * 0.65) * (int)(size), (int)(H() * 0.8) * (int)(size) - (int)(H() * 0.25), "CC", 1, 2, null, null, null);
        pb6 = new NewView(ct, (int)(W() * 0.7) * (int)(size), (int)(H() * 0.1), "CC", 0, 1, "#FFC0CB", new int[]{0,0,10,10}, null);
        
        if(clo==1){
            pb7 = new NewView(ct, (int)(W()*0.7*size/clo-W()*0.0005), (int)(H() * 0.1), "CC", 1, 2, null,null,null);
            _pb7=new NewView(ct, (int)((W() * 0.7*size/clo-W() * 0.0005) * 0.7), (int)(H() * 0.07), "CC", 1, 1, "#FFC0CB", 10, new View.OnClickListener(){@Override
        public void onClick(View view) {
            if (clo1[1] != null) {
            ((View.OnClickListener)(clo1[1])).onClick(view);
            }
            if (clo1[2] != null) {
                PromptBoxCDV.dismiss();
                }
            }});
        _pb7.setOnTouchListener(new View.OnTouchListener(){
                @Override
                public boolean onTouch(View view, MotionEvent event) {
                    switch(event.getAction()){
                        case 0:
                            view.setBackgroundDrawable(ASUI.roundBG("#fff0f0f0",10,null,null));
                            break;
                        case 1:
                            
                            view.setBackgroundDrawable(ASUI.roundBG("#FFC0CB",10,null,null));
                            break;
                        case 2:
                            break;
                    }
					return false;
                }
            });
            
            }else if(clo==2){
                
                pb7 = new NewView(ct, (int)(W()*0.7*size/clo-W()*0.0005), (int)(H() * 0.1), "CC", 1, 2, null,null,null);
                _pb7=new NewView(ct, (int)((W() * 0.7*size/clo-W() * 0.0005) * 0.7), (int)(H() * 0.07), "CC", 1, 1, "#FFC0CB", 10, new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                
                ((View.OnClickListener)(clo1[1])).onClick(view);
                
                        if (clo1[2] != null) {
                        PromptBoxCDV.dismiss();
                        }
                            }});
                                _pb7.setOnTouchListener(new View.OnTouchListener(){
                            @Override
                            public boolean onTouch(View view, MotionEvent event) {
                                switch(event.getAction()){
                            case 0:
                        _pb7.setBackgroundDrawable(ASUI.roundBG("#fff0f0f0",10,null,null));
                    break;
                case 1:

                _pb7.setBackgroundDrawable(ASUI.roundBG("#FFC0CB",10,null,null));
                break;
                case 2:
                break;

                 }
                return false;
              }});
                
                _pb8=new NewView(ct, (int)(W() * 0.001), (int)(H() * 0.05), "CC", 1, 1, "#ff808080", 0, null);
                pb9 = new NewView(ct, (int)(W()*0.7*size/clo-W()*0.0005), (int)(H() * 0.1), "CC", 1, 2, null,null, null);
                _pb9 = new NewView(ct, (int)((W()*0.7*size/clo-W()*0.0005)* 0.7), (int)(H() * 0.07), "CC", 1, 1, "#FFC0CB", 10, new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    
                    ((View.OnClickListener)(clo2[1])).onClick(view);
                    
                    if(clo2[2] != null){
                        PromptBoxCDV.dismiss();
                    }
                }
            });
            
        _pb9.setOnTouchListener(new View.OnTouchListener(){
                @Override
                public boolean onTouch(View view, MotionEvent event) {
                    switch(event.getAction()){
                        case 0:
                            _pb9.setBackgroundDrawable(ASUI.roundBG("#fff0f0f0",10,null,null));
                            break;
                        case 1:

                            _pb9.setBackgroundDrawable(ASUI.roundBG("#FFC0CB",10,null,null));
                            break;
                        case 2:
                        
                            break;
                    }
                    return false;
                }
            });
           }
           
        pt1=new NewText(ct, ASUI.FontColor("§l" + title), "LC", 18, "#000000");
        if (clo == 1) {
             pt2 = new NewText(ct, ASUI.FontColor("§l" + (String)(clo1[0].toString())), "CC", 15, "#000000");
        }
        if (clo == 2) {
             pt2=new NewText(ct, ASUI.FontColor("§l" + (String)(clo1[0].toString())), "CC", 15, "#000000");
             pt3 = new NewText(ct, ASUI.FontColor("§l" + (String)(clo2[0].toString())), "CC", 15, "#000000");
        }
        
        if (maintext != null) {
            String maintexts="";
            for(int a=0;a<maintext.length;a++){
                maintexts=maintexts+maintext[a]+"\n";
            }
           pt4=new NewText(ct, ASUI.FontColor(maintexts), "LC", 14, "#000000");
        }
        pb0.addView(pb1);
        pb1.addView(pb2);
        pb2.addView(pt1);
        pb1.addView(pb3);
        pb3.addView(pb4);
        pb4.addView(pb5);
        if(maintext!=null){
            pb5.addView(pt4);
        }
        if(add!=null){
            for(int a=0;a<add.length;a++){
                if(add[a] != null){
                    pb5.addView((View)(add[a]));
                }
            }
        }
        pb1.addView(pb6);
        if(clo==1){
            pb6.addView(pb7);
            pb7.addView(_pb7);
            _pb7.addView(pt2);
        }else if(clo==2){
            pb6.addView(pb7);
            pb7.addView(_pb7);
            _pb7.addView(pt2);
            pb6.addView(_pb8);
            pb6.addView(pb9);
            pb9.addView(_pb9);
            _pb9.addView(pt3);
        }
        PromptBoxCDV=new NewCDV(pb0, -1, -1, true,true,false,"CC","Tr", 0, 0);
        
    }
    
    public static void dis(){
        PromptBoxCDV.dismiss();
    }
    
    private static int W(){
        return (int) (context.getResources().getDisplayMetrics().widthPixels);
    }
    
    private static int H(){
        return (int) (context.getResources().getDisplayMetrics().heightPixels);
    }
}
