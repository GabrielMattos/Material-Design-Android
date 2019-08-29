package com.example.imageslideshow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import me.relex.circleindicator.CircleIndicator;
import me.relex.circleindicator.CircleIndicator3;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ViewPager viewPager;
    private SlideShowAdapter adapter;
    private CircleIndicator indicator3;

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
    }
}
