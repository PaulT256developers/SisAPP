package com.example.mysis;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.VideoView;

public class splash extends AppCompatActivity {

    Handler handler;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


/*
        try{
            VideoView videoHolder=new VideoView(this);
            setContentView(videoHolder);
            Uri video = Uri.parse("android.resource://" + getPackageName()+"/"+ R.raw.splassh);
            videoHolder.setOnCompletionListener(new MediaPlayer.OnCompletionListener(){
                public void onCompletion(MediaPlayer mp){
                    jump();}
            });
            videoHolder.start();
        }catch (Exception ex){
            jump();
        }}

    public boolean onTouchEvent(MotionEvent event){
        jump();
        return true;
    }
    private void jump(){
        if(isFinishing()) return;
        startActivity(new Intent(this, MainActivity2.class));
        finish();

    }*/

        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splash.this, MainActivity2.class);
                startActivity(intent);
                finish();
            }
        },3000);

    }
}