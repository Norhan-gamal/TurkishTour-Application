package com.example.test;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


 class home extends AppCompatActivity {
    MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton butt1 =(ImageButton) findViewById(R.id.imageButton1);
        ImageButton butt2 =(ImageButton) findViewById(R.id.imageButton2);
        ImageButton butt3 =(ImageButton) findViewById(R.id.imageButton3);
        ImageButton butt4 =(ImageButton) findViewById(R.id.imageButton4);
        ImageButton butt5 =(ImageButton) findViewById(R.id.imageButton5);
        ImageButton butt6 =(ImageButton) findViewById(R.id.imageButton6);
        ImageButton n=(ImageButton) findViewById(R.id.song);


        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity4();
            }
        });

        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity1();
            }
        });
        butt6.setOnClickListener(new View.OnClickListener() {
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
        butt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity5();
            }
        });
        butt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity6();
            }
        });

    }
    public void play(View v){
        if(player==null){
            player=MediaPlayer.create(this,R.raw.song);
            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    stopplayer();
                }
            });
        }
        player.start();
    }
    public void stop(View v){
        stopplayer();
    }
    private void stopplayer(){
        if(player!=null){//eno howa asln kan sh8al
            player.release();
            player=null;
            Toast.makeText(this, "released", Toast.LENGTH_SHORT).show();
        }
    }
    protected void onstop(){
        super.onStop();
        stopplayer();
    }

    public void openactivity1() {
        Intent i = new Intent(this, HotelsActivity.class);
        startActivity(i);
    }
    public void openactivity4() {
        Intent i = new Intent(this, PlacesActivity.class);
        startActivity(i);
    }
    public void openactivity2() {
        Intent i = new Intent(this, HospitalsActivity.class);
        startActivity(i);
    }
    public void openactivity3() {
        Intent i = new Intent(this, CitiesActivity.class);
        startActivity(i);
    }
    public void openactivity5() {
        Intent i = new Intent(this, malls.class);
        startActivity(i);
    }
    public void openactivity6() {
        Intent i = new Intent(this, resturants.class);
        startActivity(i);
    }

}