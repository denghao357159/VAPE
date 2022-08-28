package com.applications;

import android.app.Activity;
import android.os.Bundle;
import android.content.Context;
import com.answer.UI.*;
import android.app.Application;
import com.answer.Online.UnCeHandler;


public class ApplicationUtils extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        this.context = getApplicationContext();
        UnCeHandler.getInstance().init(context);
        }
       }
