package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

 class PlacesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);
        ImageButton butt1=(ImageButton) findViewById(R.id.imageButton10);
        ImageButton butt2=(ImageButton) findViewById(R.id.imageButton11);
        ImageButton butt3=(ImageButton) findViewById(R.id.imageButton12);
        ImageButton butt4=(ImageButton) findViewById(R.id.imageButton13);
        ImageButton butt5=(ImageButton) findViewById(R.id.imageButton14);
        ImageButton butt6=(ImageButton) findViewById(R.id.imageButton15);

        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click1();
            }
        });
        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click2();
            }
        });
        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click3();
            }
        });
        butt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click4();
            }
        });
        butt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click5();
            }
        });
        butt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click6();
            }
        });
    }
    public void click1(){
        Intent i =new Intent(this, Place1Activity.class);
        startActivity(i);
    }
    public void click2(){
        Intent i =new Intent(this, Place2Activity.class);
        startActivity(i);
    }
    public void click3(){
        Intent i =new Intent(this, Place3Activity.class);
        startActivity(i);
    }
    public void click4(){
        Intent i =new Intent(this, Place4Activity.class);
        startActivity(i);
    }
    public void click5(){
        Intent i =new Intent(this, Place5Activity.class);
        startActivity(i);
    }
    public void click6(){
        Intent i =new Intent(this, Place6Activity.class);
        startActivity(i);
    }
}
