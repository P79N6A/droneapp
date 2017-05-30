package com.fimi.soul.view.sliding;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentPagerAdapter;
import java.util.ArrayList;

public class FmFragmentPagerAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> a = null;

    public FmFragmentPagerAdapter(FragmentManager fragmentManager, ArrayList<Fragment> arrayList) {
        super(fragmentManager);
        this.a = arrayList;
    }

    public int getCount() {
        return this.a.size();
    }

    public Fragment getItem(int i) {
        return i < this.a.size() ? (Fragment) this.a.get(i) : (Fragment) this.a.get(0);
    }
}
