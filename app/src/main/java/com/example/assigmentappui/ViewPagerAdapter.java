package com.example.assigmentappui;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {


    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @Override
    public Fragment getItem(int position) {
        if (position==0){
            return new Individual();
        }
        else if (position==1){
            return new Professional();
        }
        else {
            return new Merchant();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        if (position==0){
            return "Individual";
        }
        else if (position==1){
            return "Professional";
        }
        else {
            return "Merchant";
        }
    }
}
