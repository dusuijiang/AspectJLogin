package com.example.administrator.aspectjdemo;

import android.app.Application;

/**
 * Created by Administrator on 2018/5/3.
 */

class MyApplication extends Application{
    public static boolean isLogin = true;

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
