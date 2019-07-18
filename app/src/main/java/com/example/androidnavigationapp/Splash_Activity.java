package com.example.androidnavigationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Splash_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_);
        Thread splash = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(2000);
                    Intent go = new Intent(Splash_Activity.this,MainActivity.class);
                    startActivity(go);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        splash.start();
    }
}
