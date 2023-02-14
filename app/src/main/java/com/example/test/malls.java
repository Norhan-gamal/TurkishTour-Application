package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class malls extends AppCompatActivity {
    private ImageButton b1,b2,b3,b4,b5,b6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malls);
        b1=(ImageButton) findViewById(R.id.imageButton2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity2();
            }

        });
        b2=(ImageButton) findViewById(R.id.imageButton3);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity3();
            }

        });
        b3=(ImageButton) findViewById(R.id.imageButton4);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity4();
            }
        });
        b4=(ImageButton) findViewById(R.id.imageButton5);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity5();
            }
        });
        b4=(ImageButton) findViewById(R.id.imageButton5);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity5();
            }
        });
        b5=(ImageButton) findViewById(R.id.imageButton6);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity6();
            }
        });
        b6=(ImageButton) findViewById(R.id.imageButton7);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity7();
            }
        });

    }
    void openMainActivity2(){
        Intent intent=new Intent(this, mall1.class);
        startActivity(intent);
    }
    void openMainActivity3(){
        Intent intent=new Intent(this, mall2.class);
        startActivity(intent);
    }
    void openMainActivity4(){
        Intent intent=new Intent(this, mall3.class);
        startActivity(intent);
    }
    void openMainActivity5(){
        Intent intent=new Intent(this, mall4.class);
        startActivity(intent);
    }
    void openMainActivity6(){
        Intent intent=new Intent(this, mall5.class);
        startActivity(intent);
    }
    void openMainActivity7(){
        Intent intent=new Intent(this, mall6.class);
        startActivity(intent);
    }
}