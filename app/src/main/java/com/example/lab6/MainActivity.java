package com.example.lab6;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ProgressBar progressBar;
    private int CurrentProgress=0;
    private Button startProgress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ProgressBar progressBar=findViewById(R.id.progressbar);
        progressBar=findViewById(R.id.progressbar);
        //startProgress = findViewById(start_Progress);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        //getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        CurrentProgress=CurrentProgress+10;
        progressBar.setProgress(CurrentProgress);
        progressBar.setMax(100);

    }


}

