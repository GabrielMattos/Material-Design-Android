package com.example.circularprogressdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private ProgressDialog dialog;
    private Handler handler;
    private Runnable runnable;
    private Timer timer;
    private int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dialog = new ProgressDialog(MainActivity.this);
        dialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        dialog.setIndeterminate(false);
        dialog.setTitle("Progress Dialog");
        dialog.setMessage("Please Wait...");
        dialog.show();
        dialog.setProgress(0);
        dialog.setMax(100);

        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                i += 5;
                if(i <= 100) {
                    dialog.setProgress(i);
                } else {
                    timer.cancel();
                    dialog.cancel();
                    i = 0;
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
        //dialog.cancel();
    }
}
