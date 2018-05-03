package com.example.administrator.aspectjdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        test();
    }

    @CheckLogin
    public void test(){
        Log.i("tag","判断是否登录");
        startActivity(new Intent(this,Main2Activity.class));
    }
}
