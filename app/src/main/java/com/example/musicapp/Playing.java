package com.example.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Playing extends AppCompatActivity {
    TextView song_name, artist_name,duration_played,duration_total;
    ImageView cover_art,nextbtn,prevbtn,backbtn,shufflebtn,repeatbtn;
    FloatingActionButton playPausebtn;
    SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing);
        intiView();
        int position=-1;
    }

    private void intiView() {
        song_name=findViewById(R.id.songname);
        artist_name=findViewById(R.id.artist);
        duration_played=findViewById(R.id.durationPlayed);
        duration_total=findViewById(R.id.durationTime);
        cover_art=findViewById(R.id.cover_art);
        nextbtn=findViewById(R.id.next);
        prevbtn=findViewById(R.id.prev);
        shufflebtn=findViewById(R.id.shuffle);
        repeatbtn=findViewById(R.id.repeat);
        playPausebtn=findViewById(R.id.play_pause);
        seekBar=findViewById(R.id.seekBar);
    }
}