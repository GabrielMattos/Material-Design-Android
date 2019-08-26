package com.example.circularprogressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    private Handler handler;
    private Runnable runnable;
    private Timer timer;
    private int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progressBar_id);

        progressBar.setVisibility(View.VISIBLE);
        progressBar.setProgress(0);
        progressBar.setSecondaryProgress(0);
        progressBar.setMax(100);
        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                //timer.cancel();
                //progressBar.setVisibility(View.GONE);

                if(++i <= 100) {
                    progressBar.setProgress(i);
                    progressBar.setSecondaryProgress(i + 10);
                } else {
                    timer.cancel();
                    progressBar.setVisibility(View.GONE);
                }
            }
        };

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(runnable);
            }
        }, 1000, 300);
    }
}
