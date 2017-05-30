package com.fimi.soul.module.setting.newhand;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import java.util.List;

public class NewHandAdapt extends FragmentStatePagerAdapter {
    private List<Fragment> a;
    private Fragment b;
    private FragmentManager c;
    private FragmentTransaction d;
    private ViewPager e;
    private int f;

    public NewHandAdapt(FragmentManager fragmentManager, List<Fragment> list, ViewPager viewPager) {
        super(fragmentManager);
        this.a = list;
        this.e = viewPager;
        this.c = fragmentManager;
    }

    public int getCount() {
        return this.a.size();
    }

    public Fragment getItem(int i) {
        return (Fragment) this.a.get(i);
    }
}
