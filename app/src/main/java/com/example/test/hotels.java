package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

class HotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);
        ImageButton butt1 =(ImageButton) findViewById(R.id.imageButton2);
        ImageButton butt2 =(ImageButton) findViewById(R.id.imageButton3);
        ImageButton butt3 =(ImageButton) findViewById(R.id.imageButton4);
        ImageButton butt4 =(ImageButton) findViewById(R.id.imageButton5);
        ImageButton butt5 =(ImageButton) findViewById(R.id.imageButton6);
        ImageButton butt6 =(ImageButton) findViewById(R.id.imageButton7);
        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity1();
            }
        });
        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity2();
            }
        });
        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity3();
            }
        });
        butt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity4();
            }
        });
        butt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity5();
            }
        });
        butt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity6();
            }
        });
    }
    public void openactivity1(){
        Intent i =new Intent(this,hotel1.class);
        startActivity(i);
    }
    public void openactivity2(){
        Intent i =new Intent(this, hotel2.class);
        startActivity(i);
    }
    public void openactivity3(){
        Intent i =new Intent(this, hotel3.class);
        startActivity(i);
    }
    public void openactivity4(){
        Intent i =new Intent(this,  hotel4.class);
        startActivity(i);
    }
    public void openactivity5(){
        Intent i =new Intent(this,  hotel5.class);
        startActivity(i);
    }
    public void openactivity6(){
        Intent i =new Intent(this,  hotel6.class);
        startActivity(i);
    }
}