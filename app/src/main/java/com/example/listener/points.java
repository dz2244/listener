package com.example.listener;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class points extends AppCompatActivity {
    TextView tvr , tvb;
    int Redscore, Bluescore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_points);
        initViews();


        Intent gi = getIntent();
        Redscore = gi.getIntExtra("Red",0);
        Bluescore = gi.getIntExtra("Blue",0);
        tvr.setText("the red score is: " + Redscore);
        tvb.setText("the Blue score is : " + Bluescore);

    }

    private void initViews() {
        tvr = findViewById(R.id.tvr);
        tvb = findViewById(R.id.tvb);
    }

    public void clickedReturn(View view) {
        finish();
    }
}