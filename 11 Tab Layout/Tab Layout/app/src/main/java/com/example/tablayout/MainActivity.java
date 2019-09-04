package com.example.tablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar_ID);
        setSupportActionBar(toolbar);

        viewPager = findViewById(R.id.viewPager_ID);

        ViewPagerAdapter myAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        myAdapter.addFragment(new OneFragment(), "ITEM ONE");
        myAdapter.addFragment(new TwoFragment(), "ITEM TWO");
        myAdapter.addFragment(new ThreeFragment(), "ITEM THREE");
        myAdapter.addFragment(new ThreeFragment(), "ITEM FOUR");
        myAdapter.addFragment(new ThreeFragment(), "ITEM FIVE");
        myAdapter.addFragment(new ThreeFragment(), "ITEM SIX");


        viewPager.setAdapter(myAdapter);

        tabLayout = findViewById(R.id.tabLayout_ID);
        tabLayout.setupWithViewPager(viewPager);

    }
}
