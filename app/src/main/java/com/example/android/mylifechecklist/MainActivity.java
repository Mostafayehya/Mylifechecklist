package com.example.android.mylifechecklist;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager fragmentViewPager = (ViewPager) findViewById(R.id.fragments_container);

        TabLayout fragmentTabs = (TabLayout) findViewById(R.id.fragmets_tab);



        FragmentAdapter FA = new FragmentAdapter(getSupportFragmentManager());

        fragmentTabs.setupWithViewPager(fragmentViewPager);

        fragmentViewPager.setAdapter(FA);
    }
}