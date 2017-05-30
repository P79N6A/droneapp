package com.fimi.soul.media.gallery;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import com.fimi.soul.view.photodraweeview.d;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class DroneImagePagerAdapter extends FragmentStatePagerAdapter {
    Map<Integer, DroneImageDetailFragment> a = new Hashtable();
    private ArrayList<String> b;
    private ArrayList<String> c;
    private DroneImageDetailFragment d;
    private d e;
    private ViewPager f;

    public DroneImagePagerAdapter(FragmentManager fragmentManager, ArrayList<String> arrayList) {
        super(fragmentManager);
        this.b = arrayList;
    }

    public DroneImagePagerAdapter(FragmentManager fragmentManager, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        super(fragmentManager);
        this.b = arrayList;
        this.c = arrayList2;
    }

    public DroneImageDetailFragment a(int i) {
        return (DroneImageDetailFragment) this.a.get(Integer.valueOf(i));
    }

    public void a(ViewPager viewPager) {
        this.f = viewPager;
    }

    public void a(d dVar) {
        this.e = dVar;
    }

    public void a(ArrayList<String> arrayList) {
        this.b = arrayList;
    }

    public int getCount() {
        return this.b == null ? 0 : this.b.size();
    }

    public Fragment getItem(int i) {
        String str = (String) this.b.get(i);
        this.d = new DroneImageDetailFragment();
        this.d.b(str);
        this.d.a(i);
        if (this.e != null) {
            this.d.a(this.e);
        }
        if (this.c != null && this.c.size() > 0) {
            this.d.c((String) this.c.get(i));
        }
        this.a.put(Integer.valueOf(i), this.d);
        return this.d;
    }

    public int getItemPosition(Object obj) {
        return (obj == null || ((DroneImageDetailFragment) obj).a() != this.f.getCurrentItem()) ? super.getItemPosition(obj) : -2;
    }
}
