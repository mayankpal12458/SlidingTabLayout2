package com.example.dell.slidingtablayout2;


import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{
    TabLayout tabLayout;
    Toolbar toolbar;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager=(ViewPager)findViewById(R.id.viewPager);
        setupViewPager(viewPager);

        tabLayout=(TabLayout)findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(viewPager);

    }
    private void setupViewPager(ViewPager viewPager) {
        Pageradapter adapter = new Pageradapter(getSupportFragmentManager());
        adapter.addFragment(new Tab1(),"TAB1");
        adapter.addFragment(new Tab2(),"TAB2");
        adapter.addFragment(new Tab3(),"TAB3");
        viewPager.setAdapter(adapter);
    }
    class Pageradapter extends FragmentPagerAdapter {
        final List<Fragment> mfragmentList=new ArrayList<>();
        final List<String> mfragmenttitleList=new ArrayList<>();

        public Pageradapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return mfragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mfragmentList.size();
        }
        public void addFragment(Fragment fragment, String title){
            mfragmentList.add(fragment);
            mfragmenttitleList.add(title);

        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mfragmenttitleList.get(position);
        }
    }
}

