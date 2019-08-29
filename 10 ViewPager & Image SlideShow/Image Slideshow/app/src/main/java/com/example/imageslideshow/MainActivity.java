package com.example.imageslideshow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.os.Handler;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

import me.relex.circleindicator.CircleIndicator;
import me.relex.circleindicator.CircleIndicator3;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ViewPager viewPager;
    private SlideShowAdapter adapter;
    private CircleIndicator indicator3;
    private Handler handler;
    private Runnable runnable;
    private Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar_ID);
        setSupportActionBar(toolbar);

        viewPager = findViewById(R.id.viewPager_ID);
        indicator3 = findViewById(R.id.circleIndicator_ID);
        adapter = new SlideShowAdapter(this);
        viewPager.setAdapter(adapter);
        indicator3.setViewPager(viewPager);
        handler = new Handler();

        runnable = new Runnable() {
            @Override
            public void run() {
                int i = viewPager.getCurrentItem();
                if(i == adapter.images.length -1) {
                    i = 0;
                    viewPager.setCurrentItem(i, true);
                } else {
                    i++;
                    viewPager.setCurrentItem(i, true);
                }
            }
        };

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(runnable);
            }
        }, 4000, 4000);
    }
}
