package com.example.kiro.demotab;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by kiro on 4/10/18.
 */

public class SimpleFragmentPageAdapter extends FragmentPagerAdapter {

    private  String[] tabtitle = new String[]{"الاسعار","منتجاتكم","منتجاتنا","تواصل معنا","اقتراحاتكم"};
    Context context;
    private  int pagecount = 5;
    public SimpleFragmentPageAdapter(FragmentManager fm,Context context) {
        super(fm);
        this.context = context;

    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Tab1Price x = new Tab1Price();
                return x;
            case 1:
                Tab2Yours b = new Tab2Yours();
                return b;
            case 2:
                Tab3Ours y = new Tab3Ours();
                return y;
            case 3:
                Tab4Contact z = new Tab4Contact();
                return z;
            case 4:
                Tab5Suggest c = new Tab5Suggest();
                return c;
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return pagecount;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabtitle[position];
    }
}
