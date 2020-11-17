package com.example.amazighapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnPlay;
    Button btnPractise;
    Button btnScore;
    Button btnAboutUs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btnPlay = findViewById(R.id.btnPlay);
        btnScore = findViewById(R.id.btnScore);
        btnPractise = findViewById(R.id.btnPractise);
        btnAboutUs = findViewById(R.id.btnAboutUs);

        btnPlay.setOnClickListener(this);
        btnScore.setOnClickListener(this);
        btnPractise.setOnClickListener(this);
        btnAboutUs.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.btnPlay:
                // to do code
                break;
            case R.id.btnScore:
                // to do code
                break;
            case R.id.btnPractise:
                // to do code
                break;
            case R.id.btnAboutUs:
                // to do code
                break;
        }
    }
}