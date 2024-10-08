package com.example.listener;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnLongClickListener{
    Button btnRed,btnBlue,btnSwitch;
    int bluePoints,redPoints;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();


        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bluePoints++;
            }
        });
        btnRed.setOnLongClickListener(this);
    }

    private void initViews() {
        btnRed = findViewById(R.id.btnRed);
        btnBlue = findViewById(R.id.btnBlue);
        btnSwitch = findViewById(R.id.btnSwitch);
    }

    @Override
    public boolean onLongClick(View v) {
        Toast.makeText(this, "You have successfully pressed the red button!", Toast.LENGTH_SHORT).show();
        redPoints += 2;
        return false;
    }

    public void clickedSwitchBtn(View view) {
        Intent si = new Intent(this , points.class);
        si.putExtra("Red", redPoints);
        si.putExtra("Blue", bluePoints);
        redPoints = 0;
        bluePoints = 0;
        startActivity(si);

    }
}