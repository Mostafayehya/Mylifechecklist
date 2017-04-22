package com.example.android.mylifechecklist;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by mostafayehya on 18/04/17.
 */

//This is the change to make the commit to gitlab legal

public class FragmentAdapter extends FragmentPagerAdapter {
    public FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        if (position == 0)
            return new SoulFragment();
        else if (position == 1) {
            return new MindFragment();
        } else if (position == 2) {
            return new HeartFragment();
        } else
            return new BodyFragment();

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        if (position == 0)
            return "Soul";
        else if (position == 1) {
            return "Mind";
        } else if (position == 2) {
            return "Heart";
        } else
            return "Body";
    }
}
