package com.example.amazighapp;

import androidx.appcompat.app.AppCompatActivity;

import com.example.amazighapp.Play.*;
import com.example.amazighapp.Practise.PractiseCategoryActivity;

import android.app.Activity;
import android.content.Intent;
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
                transitionToActivity(PlayCategoryActivity.class);
                break;
            case R.id.btnScore:
                transitionToActivity(ScoreActivity.class);
                break;
            case R.id.btnPractise:
                transitionToActivity(PractiseCategoryActivity.class);
                break;
            case R.id.btnAboutUs:
                transitionToActivity(AboutUsActivity.class);
                break;
        }
    }

    private void transitionToActivity(Class activity) {
        Intent intent = new Intent(this, activity);
        startActivity(intent);
    }
}