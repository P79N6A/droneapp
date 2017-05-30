package com.fimi.soul.module.setting.newhand;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.Log;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.BaseActivity;
import java.util.ArrayList;
import java.util.List;

public class NewHandActivity extends BaseActivity {
    private NewHandAdapt a;
    private ViewPager b;
    private int c;
    private int d;
    private int e;

    public ViewPager a() {
        if (this.b == null) {
            this.b = (ViewPager) findViewById(R.id.view_pager);
        }
        return this.b;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_new_hand);
        List arrayList = new ArrayList();
        arrayList.add(new NewHandStartPagerFragment());
        arrayList.add(new NewHandOneFragment());
        arrayList.add(new NewHandTwoFragment());
        arrayList.add(new NewHandThreeFragment());
        arrayList.add(new NewHandFourFragment());
        arrayList.add(new NewHandFiveFragment());
        arrayList.add(new NewHandSixFragment());
        arrayList.add(new NewHandSevenFragment());
        this.a = new NewHandAdapt(getSupportFragmentManager(), arrayList, a());
        a().setAdapter(this.a);
        a().setCurrentItem(0);
        a().setOnPageChangeListener(new OnPageChangeListener(this) {
            final /* synthetic */ NewHandActivity a;

            {
                this.a = r1;
            }

            public void onPageScrollStateChanged(int i) {
                Log.i("zhej", "pager:" + i);
            }

            public void onPageScrolled(int i, float f, int i2) {
            }

            public void onPageSelected(int i) {
            }
        });
    }
}
