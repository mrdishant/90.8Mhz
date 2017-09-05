package com.nearur.a908mhz;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.MainThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseLongArray;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        h.sendEmptyMessageDelayed(7623,1000);
    }
    Handler h=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            if(msg.what==7623){
               Intent i=new Intent(Splash.this, MainActivity.class);
                startActivity(i);
            }
        }
    };
}
