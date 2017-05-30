package com.fimi.soul.media.gallery;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.widget.TextView;
import com.fimi.overseas.soul.R;
import com.fimi.soul.base.BaseActivity;
import com.fimi.soul.view.HackyViewPager;
import java.util.ArrayList;

public class ImagePagerActivity extends BaseActivity {
    public static final String a = "image_index";
    public static final String b = "image_urls";
    public static final String c = "image_native";
    private static final String d = "STATE_POSITION";
    private HackyViewPager e;
    private int f;
    private TextView g;

    private class a extends FragmentStatePagerAdapter {
        public ArrayList<String> a;
        public boolean b;
        final /* synthetic */ ImagePagerActivity c;

        public a(ImagePagerActivity imagePagerActivity, FragmentManager fragmentManager, ArrayList<String> arrayList, boolean z) {
            this.c = imagePagerActivity;
            super(fragmentManager);
            this.a = arrayList;
            this.b = z;
        }

        public int getCount() {
            return this.a == null ? 0 : this.a.size();
        }

        public Fragment getItem(int i) {
            return ImageDetailFragment.a((String) this.a.get(i), this.b);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.image_detail_pager);
        this.f = getIntent().getIntExtra("image_index", 0);
        ArrayList stringArrayListExtra = getIntent().getStringArrayListExtra("image_urls");
        boolean booleanExtra = getIntent().getBooleanExtra(c, false);
        this.e = (HackyViewPager) findViewById(R.id.pager);
        this.e.setAdapter(new a(this, getSupportFragmentManager(), stringArrayListExtra, booleanExtra));
        this.g = (TextView) findViewById(R.id.indicator);
        if (this.e.getAdapter().getCount() == 1) {
            this.g.setVisibility(4);
        }
        this.g.setText(getString(R.string.viewpager_indicator, new Object[]{Integer.valueOf(1), Integer.valueOf(this.e.getAdapter().getCount())}));
        this.e.setOnPageChangeListener(new OnPageChangeListener(this) {
            final /* synthetic */ ImagePagerActivity a;

            {
                this.a = r1;
            }

            public void onPageScrollStateChanged(int i) {
            }

            public void onPageScrolled(int i, float f, int i2) {
            }

            public void onPageSelected(int i) {
                this.a.g.setText(this.a.getString(R.string.viewpager_indicator, new Object[]{Integer.valueOf(i + 1), Integer.valueOf(this.a.e.getAdapter().getCount())}));
            }
        });
        if (bundle != null) {
            this.f = bundle.getInt(d);
        }
        this.e.setCurrentItem(this.f);
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt(d, this.e.getCurrentItem());
    }
}
