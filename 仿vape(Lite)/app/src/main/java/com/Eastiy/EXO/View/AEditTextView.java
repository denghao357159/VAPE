package com.Eastiy.EXO.View;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.LinearLayout;

public class AEditTextView {

        public AEditTextView(final Activity activity, String title, String hint, String str, int textsize, String color, String color2, int i, final Object[] clo1, final Object[] clo2) {
                int W =  (int) (activity.getResources().getDisplayMetrics().widthPixels * 0.7);
                int H = (int) (activity.getResources().getDisplayMetrics().heightPixels * 0.8);

                AView AEditTextViewAView = new AView(activity, null, (int)(W * 0.8), (int)(H * 0.12), "CC", 0, 1, "#FFFFFF", 360);

                EditText AEditTextAView=AEditTextAView(activity, AEditTextViewAView, 3, hint, str, textsize, color, color2, i);

                EditText AEditTextAView2=AEditTextAView(activity, AEditTextViewAView, 3, hint, str, textsize, color, color2, i);

                EditText AEditTextAView3=AEditTextAView(activity, AEditTextViewAView, 3, hint, str, textsize, color, color2, i);

                new PromptBox().show(activity, "large", title, null, clo1, clo2, new View[]{AEditTextViewAView});
            }

        public static EditText AEditTextAView(final Activity activity, AView view, int ints, String hint, String str, int textsize, String color, String color2, int i) {
                int W =  (int) (activity.getResources().getDisplayMetrics().widthPixels * 0.7);
                int H = (int) (activity.getResources().getDisplayMetrics().heightPixels * 0.8);

                AView AEditTextViewAView = null;
              //  if (tests == 1) {
                        AEditTextViewAView = new AView(activity, view, (int)(W * 0.7 / ints), (int)(H * 0.12), "CC", 0, 1, "#FFFFFF", 360);

                        final AEditText EditTexts=new AEditText(activity, hint, str, textsize, color, color2, false, i);
                        EditTexts.setLayoutParams(new LinearLayout.LayoutParams((int)(W * 0.7 / ints), (int)(H * 0.12)));
                        AEditTextViewAView.addView(EditTexts);
                        EditTexts.setOnClickListener(new OnClickListener(){
                                    @Override
                                    public void onClick(View p1) {
                                            InputMethodManager imm = (InputMethodManager) activity.getSystemService(activity.INPUT_METHOD_SERVICE);
                                            imm.toggleSoftInput(0, InputMethodManager.HIDE_NOT_ALWAYS);
                                        }});

                        AView AEditTextViewAView2 =new AView(activity, view, (int)(W * 0.06 / ints), (int)(H * 0.12), "CC", 1,1,"#00FFFFFF");
                    /*} else if (tests == 2) {
                        AEditTextViewAView = new AView(activity, view, (int)(W * 0.7 / ints), (int)(H * 0.12), "LC", 0, 1, "#FFFFFF", 360);
                         //   AView AEditTextViewAView2 =new AView(activity, view, (int)(W * 0.06 / ints), (int)(H * 0.12), "CC", 1,1,"#fffafafa",360);

                        final AEditText EditTexts=new AEditText(activity, hint, str, textsize, color, color2, false, i);
                        EditTexts.setLayoutParams(new LinearLayout.LayoutParams((int)(W * 0.7 / ints), (int)(H * 0.12)));
                        AEditTextViewAView.addView(EditTexts);
                        EditTexts.setOnClickListener(new OnClickListener(){
                                    @Override
                                    public void onClick(View p1) {
                                            InputMethodManager imm = (InputMethodManager) activity.getSystemService(activity.INPUT_METHOD_SERVICE);
                                            imm.toggleSoftInput(0, InputMethodManager.HIDE_NOT_ALWAYS);
                                        }});
                    }
*/
                return EditTexts;

            }

    }
