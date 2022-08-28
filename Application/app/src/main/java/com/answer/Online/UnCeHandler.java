package com.answer.Online;

import android.content.Context;
import android.content.Intent;

import java.io.PrintWriter;
import java.io.StringWriter;
import android.app.*;



public class UnCeHandler implements Thread.UncaughtExceptionHandler {
    private Thread.UncaughtExceptionHandler defaultHandler;
    public static UnCeHandler exceptionHandler;
    private  boolean inited = false ;
    private Context context;
    //private Activity activity;
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        StringWriter sw= new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		e.printStackTrace(pw);
        String errlog= sw.toString();
        //
        Intent i = new Intent(context, AppErrorActivity.class);
        //异常信息,在那边获取然后显示
        i.putExtra("BUG",errlog);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(i);
        //((Activity)this.context).overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
        android.os.Process.killProcess(android.os.Process.myPid());
    }
    public UnCeHandler(){}
    public static UnCeHandler getInstance(){
        if(exceptionHandler==null){
            exceptionHandler=new UnCeHandler();
        }
        return  exceptionHandler;
    }

    public void init(Context context){
        if(inited)return;
        this.context=context;
        defaultHandler=Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }
}


