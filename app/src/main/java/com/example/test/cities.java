package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

class CitiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cities);
        ImageButton a=(ImageButton) findViewById(R.id.imageButton10);
        ImageButton b=(ImageButton) findViewById(R.id.imageButton11);
        ImageButton c=(ImageButton) findViewById(R.id.imageButton12);
        ImageButton d=(ImageButton) findViewById(R.id.imageButton13);
        ImageButton e=(ImageButton) findViewById(R.id.imageButton14);
        ImageButton f=(ImageButton) findViewById(R.id.imageButton15);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                istanbulview();
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bodrumview();
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ankaraview();
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                trabzonview();
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                izmirview();
            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                borsaview();
            }
        });
    }
    public void istanbulview(){
        Intent i =new Intent(this, city1.class);
        startActivity(i);
    }
    public void bodrumview(){
        Intent i =new Intent(this, city2.class);
        startActivity(i);
    }
    public void ankaraview(){
        Intent i =new Intent(this, city3.class);
        startActivity(i);
    }
    public void trabzonview(){
        Intent i =new Intent(this, city4.class);
        startActivity(i);
    }
    public void izmirview(){
        Intent i =new Intent(this, city5.class);
        startActivity(i);
    }
    public void borsaview(){
        Intent i =new Intent(this, city6.class);
        startActivity(i);
    }
}