package com.example.dell.slidingtablayout2;

import android.content.pm.LabeledIntent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by dell on 12/23/2017.
 */

public class Pageradapter extends FragmentStatePagerAdapter {
    int tabcount;

    public Pageradapter(FragmentManager fm) {
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Tab1 tab1=new Tab1();
                return tab1;
            case 1:
                Tab2 tab2=new Tab2();
                return tab2;
            case 3:
                Tab3 tab3=new Tab3();
                return tab3;
            default:
                return null;
        }


    }

    @Override
    public int getCount() {
        return tabcount;
    }
}

