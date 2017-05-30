package com.fimi.soul.view.sliding;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.fimi.kernel.utils.k;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"NewApi"})
public class FmSlidingTabView extends LinearLayout {
    public int a;
    private Context b;
    private Runnable c;
    private OnPageChangeListener d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private LinearLayout j;
    private HorizontalScrollView k;
    private FmViewPager l;
    private List<String> m;
    private List<Drawable> n;
    private ArrayList<Fragment> o;
    private ArrayList<TextView> p;
    private FmFragmentPagerAdapter q;
    private OnClickListener r;

    public class MyOnPageChangeListener implements OnPageChangeListener {
        final /* synthetic */ FmSlidingTabView a;

        public MyOnPageChangeListener(FmSlidingTabView fmSlidingTabView) {
            this.a = fmSlidingTabView;
        }

        public void onPageScrollStateChanged(int i) {
            if (this.a.d != null) {
                this.a.d.onPageScrollStateChanged(i);
            }
        }

        public void onPageScrolled(int i, float f, int i2) {
            if (this.a.d != null) {
                this.a.d.onPageScrolled(i, f, i2);
            }
        }

        public void onPageSelected(int i) {
            this.a.setCurrentItem(i);
            if (this.a.d != null) {
                this.a.d.onPageSelected(i);
            }
        }
    }

    public FmSlidingTabView(Fragment fragment) {
        super(fragment.getActivity());
        this.f = -1;
        this.g = 30;
        this.h = ViewCompat.MEASURED_STATE_MASK;
        this.i = ViewCompat.MEASURED_STATE_MASK;
        this.j = null;
        this.k = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = new OnClickListener(this) {
            final /* synthetic */ FmSlidingTabView a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                this.a.l.setCurrentItem(((FmTabItemView) view).getIndex());
            }
        };
        this.b = fragment.getActivity();
        a();
        if (VERSION.SDK_INT <= 17) {
            k.c(FmSlidingTabView.class, "AbSlidingTabView(Fragment fragment) 要求最低SDK版本17");
            return;
        }
        this.q = new FmFragmentPagerAdapter(fragment.getChildFragmentManager(), this.o);
        this.l.setAdapter(this.q);
        this.l.setOnPageChangeListener(new MyOnPageChangeListener(this));
        this.l.setOffscreenPageLimit(3);
        addView(this.l, new LayoutParams(-1, -1));
    }

    public FmSlidingTabView(Context context) {
        this(context, null);
    }

    public FmSlidingTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = -1;
        this.g = 30;
        this.h = ViewCompat.MEASURED_STATE_MASK;
        this.i = ViewCompat.MEASURED_STATE_MASK;
        this.j = null;
        this.k = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = /* anonymous class already generated */;
        this.b = context;
        a();
        this.q = new FmFragmentPagerAdapter(((FragmentActivity) this.b).getFragmentManager(), this.o);
        this.l.setAdapter(this.q);
        this.l.setOnPageChangeListener(new MyOnPageChangeListener(this));
        this.l.setOffscreenPageLimit(3);
        addView(this.l, new LayoutParams(-1, -1));
    }

    private void a(String str, int i) {
        a(str, i, null);
    }

    private void a(String str, int i, Drawable drawable) {
        View fmTabItemView = new FmTabItemView(this.b);
        if (this.f != -1) {
            fmTabItemView.setTabBackgroundResource(this.f);
        }
        if (drawable != null) {
            fmTabItemView.a(null, drawable, null, null);
        }
        fmTabItemView.setTabTextColor(this.h);
        fmTabItemView.setTabTextSize(this.g);
        fmTabItemView.a(i, str);
        this.p.add(fmTabItemView.getTextView());
        fmTabItemView.setOnClickListener(this.r);
        this.j.addView(fmTabItemView, new LayoutParams(0, -1, 1.0f));
    }

    private void b(int i) {
        final View childAt = this.j.getChildAt(i);
        if (this.c != null) {
            removeCallbacks(this.c);
        }
        this.c = new Runnable(this) {
            final /* synthetic */ FmSlidingTabView b;

            public void run() {
                this.b.k.smoothScrollTo(childAt.getLeft() - ((this.b.getWidth() - childAt.getWidth()) / 2), 0);
                this.b.c = null;
            }
        };
        post(this.c);
    }

    public void a() {
        setOrientation(1);
        setBackgroundColor(Color.rgb(255, 255, 255));
        this.k = new HorizontalScrollView(this.b);
        this.k.setHorizontalScrollBarEnabled(false);
        this.k.setSmoothScrollingEnabled(true);
        this.j = new LinearLayout(this.b);
        this.j.setOrientation(0);
        this.j.setGravity(17);
        this.k.addView(this.j, new ViewGroup.LayoutParams(-2, -1));
        addView(this.k, new ViewGroup.LayoutParams(-1, -2));
        this.l = new FmViewPager(this.b);
        this.l.setId(1985);
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.m = new ArrayList();
        this.n = new ArrayList();
        if (!(this.b instanceof FragmentActivity)) {
            k.c(FmSlidingTabView.class, "构造AbSlidingTabView的参数context,必须是FragmentActivity的实例。");
        }
    }

    public void a(int i) {
        this.j.removeViewAt(i);
        this.o.remove(i);
        this.p.remove(i);
        this.n.remove(i);
        this.m.remove(i);
        this.q.notifyDataSetChanged();
        b();
    }

    public void a(int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < this.p.size(); i5++) {
            ((TextView) this.p.get(i5)).setPadding(i, i2, i3, i4);
        }
    }

    public void a(String str, Fragment fragment) {
        this.m.add(str);
        this.o.add(fragment);
        this.q.notifyDataSetChanged();
        b();
    }

    public void a(String str, Fragment fragment, Drawable drawable) {
        this.m.add(str);
        this.o.add(fragment);
        this.n.add(drawable);
        this.q.notifyDataSetChanged();
        b();
    }

    public void a(List<String> list, List<Fragment> list2) {
        this.m.addAll(list);
        this.o.addAll(list2);
        this.q.notifyDataSetChanged();
        b();
    }

    public void a(List<String> list, List<Fragment> list2, List<Drawable> list3) {
        this.m.addAll(list);
        this.o.addAll(list2);
        this.n.addAll(list3);
        this.q.notifyDataSetChanged();
        b();
    }

    public void b() {
        this.j.removeAllViews();
        this.p.clear();
        int count = this.q.getCount();
        for (int i = 0; i < count; i++) {
            if (this.n.size() > 0) {
                a((String) this.m.get(i), i, (Drawable) this.n.get(i));
            } else {
                a((String) this.m.get(i), i);
            }
        }
        if (this.e > count) {
            this.e = count - 1;
        }
        setCurrentItem(this.e);
        requestLayout();
    }

    public void c() {
        this.j.removeAllViews();
        this.o.clear();
        this.p.clear();
        this.n.clear();
        this.m.clear();
        this.q.notifyDataSetChanged();
        b();
    }

    public ViewPager getViewPager() {
        return this.l;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.c != null) {
            post(this.c);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.c != null) {
            removeCallbacks(this.c);
        }
    }

    public void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        boolean z = mode == 1073741824;
        this.k.setFillViewport(z);
        int childCount = this.j.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.a = -1;
        } else if (childCount > 2) {
            this.a = (int) (((float) MeasureSpec.getSize(i)) * 0.4f);
        } else {
            this.a = MeasureSpec.getSize(i) / 2;
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, i2);
        mode = getMeasuredWidth();
        if (z && measuredWidth != mode) {
            setCurrentItem(this.e);
        }
    }

    public void setCurrentItem(int i) {
        if (this.l == null) {
            throw new IllegalStateException("ViewPager has not been bound.");
        }
        this.e = i;
        int childCount = this.j.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            FmTabItemView fmTabItemView = (FmTabItemView) this.j.getChildAt(i2);
            boolean z = i2 == i;
            fmTabItemView.setSelected(z);
            if (z) {
                fmTabItemView.setTabTextColor(this.i);
                b(i);
            } else {
                fmTabItemView.setTabTextColor(this.h);
            }
            i2++;
        }
    }

    public void setOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        this.d = onPageChangeListener;
    }

    public void setSlidingEnabled(boolean z) {
        this.l.setPagingEnabled(z);
    }

    public void setTabBackgroundResource(int i) {
        this.f = i;
    }

    public void setTabLayoutBackgroundResource(int i) {
        this.j.setBackgroundResource(i);
    }

    public void setTabSelectColor(int i) {
        this.i = i;
    }

    public void setTabTextColor(int i) {
        this.h = i;
    }

    public void setTabTextSize(int i) {
        this.g = i;
    }
}
