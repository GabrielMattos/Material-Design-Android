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
        myAdapter.addFragment(new RecentsFragment(), "");
        myAdapter.addFragment(new FavoritesFragment(), "");
        myAdapter.addFragment(new NearbyFragment(), "");

        viewPager.setAdapter(myAdapter);

        tabLayout = findViewById(R.id.tabLayout_ID);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.phone);
        tabLayout.getTabAt(1).setIcon(R.drawable.heart);
        tabLayout.getTabAt(2).setIcon(R.drawable.account);

    }
}
