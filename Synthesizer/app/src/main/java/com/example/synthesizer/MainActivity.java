package com.example.synthesizer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;

    private MediaPlayer mpE;
    private MediaPlayer mpF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button)findViewById(R.id.eButton);
        button2 = (Button)findViewById(R.id.fButton);
        mpE = MediaPlayer.create(this, R.raw.scalee);
        mpF = MediaPlayer.create(this, R.raw.scalef);

    }

    public void onButton1Click(View view){
        mpE.seekTo(0);
        Log.i("Tag", "mEButton Clicked");
        mpE.start();
    }

    public void onButton2Click(View view){
        mpE.seekTo(0);
        Log.i("Tag", "mFButton Clicked");
        mpF.start();
    }
}
