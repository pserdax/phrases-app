package com.example.gridlayoutdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {



//    public void clickButton(View view){
//
//        int id = view.getId();
//        String ourId="";
//        ourId = view.getResources().getResourceEntryName(id);
//
//        int resourceId = getResources().getIdentifier(ourId,"raw", getPackageName());
//
//        MediaPlayer mplayer = MediaPlayer.create(this, resourceId );
//        mplayer.start();
//        Log.i("Button clicked", ourId);
//    }


    public void clickButton(View view){


        int id  = view.getId();
        String myId  = view.getResources().getResourceEntryName(id);

        int resourceId = getResources().getIdentifier(myId, "raw", getPackageName());

        MediaPlayer mediaPlayer = MediaPlayer.create(this, resourceId);
        mediaPlayer.start();


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }
}
