package com.example.recyclerview;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPagerAdapter adapter;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tabLayout = (TabLayout) findViewById(R.id.tablayout_id);
        viewPager = (ViewPager) findViewById(R.id.viewpager_id);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        // Fragment Disokin

        adapter.AddFragment(new FragmentHome(), "Home");
        adapter.AddFragment(new FragmentContact(), "Contact");
        adapter.AddFragment(new FragmentSetting(), "Setting");
        adapter.AddFragment(new FragmentLogout(), "Logout");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);


        tabLayout.getTabAt(0).setIcon(R.drawable.ic_home);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_group);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_settings);
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_exit);


        // ngilangin bayangan

        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0);

    }
}
