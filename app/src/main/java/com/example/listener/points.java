package com.example.listener;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class points extends AppCompatActivity {
    int Redscore, Bluescore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_points);

        Intent gi = getIntent();
        Redscore = gi.getIntExtra("Red",0);
        Bluescore = gi.getIntExtra("Blue",0);
        tvr.setText("red score: " + scoreRed);
        tvb.setText("Blue score: " + scoreBlue);
    }
}