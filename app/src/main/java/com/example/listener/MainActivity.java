package com.example.listener;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
        redPoints += 2;
        return false;
    }

    public void clickedSwitchBtn(View view) {
        
    }
}