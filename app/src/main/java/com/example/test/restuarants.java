package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

class resturants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restuarants);
        ImageButton bb1=(ImageButton) findViewById(R.id.imageButton2);
        ImageButton bb2=(ImageButton) findViewById(R.id.imageButton3);
        ImageButton bb3=(ImageButton) findViewById(R.id.imageButton4);
        ImageButton bb4=(ImageButton) findViewById(R.id.imageButton5);
        ImageButton bb5=(ImageButton) findViewById(R.id.imageButton6);
        ImageButton bb6=(ImageButton) findViewById(R.id.imageButton7);

        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(resturants.this,resturant1.class);
                startActivity(i);
            }
        });


        bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(resturants.this,resturant2.class);
                startActivity(i);
            }
        });

        bb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(resturants.this,resturant3.class);
                startActivity(i);
            }
        });

        bb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(resturants.this,resturant4.class);
                startActivity(i);
            }
        });

        bb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(resturants.this,resturant5.class);
                startActivity(i);
            }
        });

        bb6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(resturants.this,resturant6.class);
                startActivity(i);
            }
        });
    }
}