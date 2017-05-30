package com.fimi.soul.module.setting.newhand;

import android.content.Context;
import android.os.Handler;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import com.b.a.b.a.g;
import com.b.a.b.c;
import com.b.a.b.d;
import com.fimi.overseas.soul.R;
import java.util.ArrayList;
import java.util.List;

public class LoopWidget extends FrameLayout {
    private int a;
    private d b;
    private List<ImageView> c;
    private Context d;
    private ViewPager e;
    private boolean f;
    private int g;
    private int h;
    private LinearLayout i;
    private List<ImageView> j;
    private Handler k;
    private c l;
    private final Runnable m;

    class a extends PagerAdapter {
        final /* synthetic */ LoopWidget a;

        a(LoopWidget loopWidget) {
            this.a = loopWidget;
        }

        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) this.a.c.get(i));
        }

        public int getCount() {
            return this.a.c.size();
        }

        public Object instantiateItem(ViewGroup viewGroup, int i) {
            viewGroup.addView((View) this.a.c.get(i));
            return this.a.c.get(i);
        }

        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }
    }

    class b implements OnPageChangeListener {
        final /* synthetic */ LoopWidget a;

        b(LoopWidget loopWidget) {
            this.a = loopWidget;
        }

        public void onPageScrollStateChanged(int i) {
            switch (i) {
                case 0:
                    if (this.a.e.getCurrentItem() == 0) {
                        this.a.e.setCurrentItem(this.a.a, false);
                    } else if (this.a.e.getCurrentItem() == this.a.a + 1) {
                        this.a.e.setCurrentItem(1, false);
                    }
                    this.a.g = this.a.e.getCurrentItem();
                    this.a.f = true;
                    return;
                case 1:
                    this.a.f = false;
                    return;
                case 2:
                    this.a.f = true;
                    return;
                default:
                    return;
            }
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
            for (int i2 = 0; i2 < this.a.j.size(); i2++) {
                if (i2 == i - 1) {
                    ((ImageView) this.a.j.get(i2)).setImageResource(R.drawable.dot_focus);
                } else {
                    ((ImageView) this.a.j.get(i2)).setImageResource(R.drawable.dot_blur);
                }
            }
        }
    }

    public LoopWidget(Context context) {
        this(context, null);
    }

    public LoopWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LoopWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.k = new Handler();
        this.m = new Runnable(this) {
            final /* synthetic */ LoopWidget a;

            {
                this.a = r1;
            }

            public void run() {
                if (this.a.f) {
                    this.a.g = (this.a.g % (this.a.a + 1)) + 1;
                    if (this.a.g == 1) {
                        this.a.e.setCurrentItem(this.a.g, false);
                        this.a.k.post(this.a.m);
                        return;
                    }
                    this.a.e.setCurrentItem(this.a.g);
                    this.a.k.postDelayed(this.a.m, 2000);
                    return;
                }
                this.a.k.postDelayed(this.a.m, 5000);
            }
        };
        this.d = context;
        a(context);
        a();
    }

    private void a() {
        this.c = new ArrayList();
        this.j = new ArrayList();
        this.h = 400;
    }

    private void a(int[] iArr) {
        int i;
        this.a = iArr.length;
        for (i = 0; i < this.a; i++) {
            View imageView = new ImageView(this.d);
            LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.leftMargin = 5;
            layoutParams.rightMargin = 5;
            imageView.setImageResource(R.drawable.dot_blur);
            this.i.addView(imageView, layoutParams);
            this.j.add(imageView);
        }
        ((ImageView) this.j.get(0)).setImageResource(R.drawable.dot_focus);
        for (i = 0; i <= this.a + 1; i++) {
            ImageView imageView2 = new ImageView(this.d);
            imageView2.setScaleType(ScaleType.FIT_XY);
            if (i == 0) {
                imageView2.setImageResource(iArr[this.a - 1]);
            } else if (i == this.a + 1) {
                imageView2.setImageResource(iArr[0]);
            } else {
                imageView2.setImageResource(iArr[i - 1]);
            }
            this.c.add(imageView2);
        }
    }

    private void a(String[] strArr) {
        int i;
        this.a = strArr.length;
        for (i = 0; i < this.a; i++) {
            View imageView = new ImageView(this.d);
            LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.leftMargin = 5;
            layoutParams.rightMargin = 5;
            imageView.setImageResource(R.drawable.dot_blur);
            this.i.addView(imageView, layoutParams);
            this.j.add(imageView);
        }
        ((ImageView) this.j.get(0)).setImageResource(R.drawable.dot_focus);
        for (i = 0; i <= this.a + 1; i++) {
            ImageView imageView2 = new ImageView(this.d);
            imageView2.setScaleType(ScaleType.FIT_XY);
            if (i == 0) {
                this.b.a(strArr[this.a - 1], imageView2, this.l);
            } else if (i == this.a + 1) {
                this.b.a(strArr[0], imageView2, this.l);
            } else {
                this.b.a(strArr[i - 1], imageView2, this.l);
            }
            this.c.add(imageView2);
        }
    }

    private void b() {
        this.c.clear();
        View inflate = LayoutInflater.from(this.d).inflate(R.layout.kanner_layout, this, true);
        this.e = (ViewPager) inflate.findViewById(R.id.vp);
        this.i = (LinearLayout) inflate.findViewById(R.id.ll_dot);
        this.i.setVisibility(8);
        this.i.removeAllViews();
    }

    private void c() {
        this.e.setAdapter(new a(this));
        this.e.setFocusable(true);
        this.e.setCurrentItem(1);
        this.g = 1;
        this.e.setOnPageChangeListener(new b(this));
        d();
    }

    private void d() {
        this.f = true;
        this.k.postDelayed(this.m, 2000);
    }

    public void a(Context context) {
        d.a().a(new com.b.a.b.e.a(context).b(3).a().b(new com.b.a.a.a.b.c()).a(g.LIFO).b().c());
        this.l = new com.b.a.b.c.a().b(true).d(true).d();
        this.b = d.a();
    }

    public void setImagesRes(int[] iArr) {
        b();
        a(iArr);
        c();
    }

    public void setImagesUrl(String[] strArr) {
        b();
        a(strArr);
        c();
    }
}
