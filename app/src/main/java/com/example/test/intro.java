package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;

public class intro extends AppCompatActivity {
    Thread timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        timer = new Thread(){
            @Override
            public void run() {
                try {
                    synchronized (this){//check that there is onl one thread
                        wait(5000);//5 sec
                    }
                } catch (InterruptedException e){
                    e.printStackTrace();// handel exceptions
                } finally {
                    Intent intent = new Intent(intro.this, login.class);
                    startActivity(intent);
                    finish();
                }
            }
        };
        timer.start();
    }
}