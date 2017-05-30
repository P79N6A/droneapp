package m.framework.ui.widget.slidingmenu;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import java.lang.reflect.Method;
import java.util.HashMap;

public class SlidingMenu extends RelativeLayout {
    private c a;
    private HashMap<e, View> b;
    private OnClickListener c;
    private OnTouchListener d;
    private b e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private FrameLayout j;
    private LinearLayout k;
    private View l;
    private a m;
    private LinearLayout n;
    private View o;

    public SlidingMenu(Context context) {
        super(context);
        a(context);
    }

    public SlidingMenu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public SlidingMenu(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    private void a(Context context) {
        this.a = new c();
        this.b = new HashMap();
        this.c = new OnClickListener(this) {
            final /* synthetic */ SlidingMenu a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                e eVar = (e) view.getTag();
                if (eVar != null && this.a.e != null && !this.a.e.b(eVar)) {
                    this.a.postDelayed(new Runnable(this) {
                        final /* synthetic */ AnonymousClass1 a;

                        {
                            this.a = r1;
                        }

                        public void run() {
                            this.a.a.d();
                        }
                    }, 500);
                }
            }
        };
        this.d = new OnTouchListener(this) {
            final /* synthetic */ SlidingMenu a;

            {
                this.a = r1;
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case 0:
                        view.setBackgroundResource(this.a.a.a);
                        break;
                    case 1:
                    case 3:
                        view.setBackgroundResource(this.a.a.b);
                        break;
                }
                return false;
            }
        };
        this.f = context.getResources().getDisplayMetrics().widthPixels;
        this.g = (int) (((float) this.f) * this.a.c);
        this.h = (this.f - this.g) / 2;
        setBackgroundResource(this.a.d);
        b(context);
        c(context);
        getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener(this) {
            final /* synthetic */ SlidingMenu a;

            {
                this.a = r1;
            }

            public void onGlobalLayout() {
                this.a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                this.a.post(new Runnable(this) {
                    final /* synthetic */ AnonymousClass3 a;

                    {
                        this.a = r1;
                    }

                    public void run() {
                        this.a.a.d();
                    }
                });
            }
        });
    }

    private void a(View view) {
        if (VERSION.SDK_INT >= 9) {
            try {
                Method method = View.class.getMethod("setOverScrollMode", new Class[]{Integer.TYPE});
                method.setAccessible(true);
                method.invoke(view, new Object[]{Integer.valueOf(2)});
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private void b(Context context) {
        this.j = new FrameLayout(this, context) {
            final /* synthetic */ SlidingMenu a;

            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                return !this.a.i ? true : super.onInterceptTouchEvent(motionEvent);
            }
        };
        this.j.setLayoutParams(new LayoutParams(this.g, -1));
        addView(this.j);
        View linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LayoutParams(-1, -1));
        this.j.addView(linearLayout);
        View scrollView = new ScrollView(context);
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.setVerticalFadingEdgeEnabled(false);
        a(scrollView);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        scrollView.setLayoutParams(layoutParams);
        linearLayout.addView(scrollView);
        this.k = new LinearLayout(context);
        this.k.setOrientation(1);
        this.k.setLayoutParams(new LayoutParams(-1, -1));
        scrollView.addView(this.k);
        this.l = new View(context);
        this.l.setBackgroundColor(0);
        this.l.setLayoutParams(new LayoutParams(-1, -1));
        this.j.addView(this.l);
    }

    private void c(Context context) {
        this.m = new a(this);
        this.m.setHorizontalScrollBarEnabled(false);
        this.m.setHorizontalFadingEdgeEnabled(false);
        a(this.m);
        this.m.setLayoutParams(new LayoutParams(this.f, -1));
        addView(this.m);
        View linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LayoutParams(this.f + this.g, -1));
        this.m.addView(linearLayout);
        View frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(this.g, -1));
        linearLayout.addView(frameLayout);
        View imageView = new ImageView(context);
        imageView.setImageResource(this.a.k);
        imageView.setScaleType(ScaleType.FIT_XY);
        ViewGroup.LayoutParams layoutParams = new LayoutParams(-2, -1);
        layoutParams.gravity = 5;
        imageView.setLayoutParams(layoutParams);
        frameLayout.addView(imageView);
        this.n = new LinearLayout(this, context) {
            final /* synthetic */ SlidingMenu a;

            public boolean onTouchEvent(MotionEvent motionEvent) {
                return true;
            }
        };
        this.n.setBackgroundResource(this.a.j);
        this.n.setLayoutParams(new LinearLayout.LayoutParams(this.f, -1));
        linearLayout.addView(this.n);
    }

    private void d(Context context) {
        this.f = context.getResources().getDisplayMetrics().widthPixels;
        this.g = (int) (((float) this.f) * this.a.c);
        this.h = (this.f - this.g) / 2;
        setBackgroundResource(this.a.d);
        e(context);
        f(context);
    }

    private void e(Context context) {
        ViewGroup.LayoutParams layoutParams = this.j.getLayoutParams();
        layoutParams.width = this.g;
        this.j.setLayoutParams(layoutParams);
        this.k.setPadding(this.a.e, this.a.f, this.a.g, this.a.h);
        if (this.e != null) {
            View a = this.e.a();
            if (a != null) {
                ViewGroup.LayoutParams layoutParams2 = a.getLayoutParams();
                int i = -2;
                if (layoutParams2 != null) {
                    i = layoutParams2.height;
                }
                a.setLayoutParams(new LinearLayout.LayoutParams(-1, i));
                ((LinearLayout) this.j.getChildAt(0)).addView(a);
            }
        }
    }

    private void f() {
        Context context = getContext();
        this.k.removeAllViews();
        int b = this.e.b();
        for (int i = 0; i < b; i++) {
            int i2;
            this.k.addView(this.e.a(i, this.k));
            int a = this.e.a(i).a();
            for (i2 = 0; i2 < a; i2++) {
                e a2 = this.e.a(i, i2);
                View a3 = this.e.a(a2, this.k);
                this.k.addView(a3);
                this.k.addView(g(context));
                this.b.put(a2, a3);
                a3.setTag(a2);
                a3.setOnClickListener(this.c);
                a3.setOnTouchListener(this.d);
            }
            i2 = this.k.getChildCount();
            if (i2 > 0) {
                this.k.removeViewAt(i2 - 1);
            }
        }
    }

    private void f(Context context) {
        ViewGroup.LayoutParams layoutParams = this.m.getLayoutParams();
        layoutParams.width = this.f;
        this.m.setLayoutParams(layoutParams);
        LinearLayout linearLayout = (LinearLayout) this.m.getChildAt(0);
        ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
        layoutParams2.width = this.f + this.g;
        linearLayout.setLayoutParams(layoutParams2);
        FrameLayout frameLayout = (FrameLayout) linearLayout.getChildAt(0);
        layoutParams2 = frameLayout.getLayoutParams();
        layoutParams2.width = this.g;
        frameLayout.setLayoutParams(layoutParams2);
        layoutParams2 = this.n.getLayoutParams();
        layoutParams2.width = this.f;
        this.n.setLayoutParams(layoutParams2);
        this.n.setBackgroundResource(this.a.j);
        ((ImageView) frameLayout.getChildAt(0)).setImageResource(this.a.k);
        if (!this.i) {
            getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener(this) {
                final /* synthetic */ SlidingMenu a;

                {
                    this.a = r1;
                }

                public void onGlobalLayout() {
                    this.a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    this.a.post(new Runnable(this) {
                        final /* synthetic */ AnonymousClass6 a;

                        {
                            this.a = r1;
                        }

                        public void run() {
                            this.a.a.m.scrollTo(this.a.a.g, 0);
                        }
                    });
                }
            });
        }
    }

    private View g(Context context) {
        View view = new View(context);
        view.setBackgroundResource(this.a.l);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, 2));
        return view;
    }

    View a(e eVar) {
        return (View) this.b.get(eVar);
    }

    public void a() {
        if (this.e != null) {
            d(getContext());
            f();
        }
    }

    public void a(int i, int i2) {
        this.a.a = i;
        this.a.b = i2;
    }

    public void a(int i, int i2, int i3, int i4) {
        this.a.e = i;
        this.a.f = i2;
        this.a.g = i3;
        this.a.h = i4;
    }

    public void b() {
        if (this.i) {
            d();
        } else {
            c();
        }
    }

    public void b(int i, int i2) {
        if (this.e != null) {
            e b = this.e.b(i, i2);
            if (b != null) {
                this.e.b(b);
            }
        }
    }

    public void b(e eVar) {
        if (this.e != null && eVar != null) {
            this.e.b(eVar);
        }
    }

    public void c() {
        this.i = true;
        this.m.smoothScrollTo(0, 0);
        if (this.e != null) {
            this.e.a(this.i);
        }
    }

    public void d() {
        this.i = false;
        this.m.smoothScrollTo(this.g, 0);
        if (this.e != null) {
            this.e.a(this.i);
        }
    }

    public boolean e() {
        return this.i;
    }

    public View getBodyView() {
        return this.o;
    }

    c getMenuConfig() {
        return this.a;
    }

    View getMenuCover() {
        return this.l;
    }

    int getMenuWidth() {
        return this.g;
    }

    int getShowMenuWidth() {
        return this.h;
    }

    public void setAdapter(b bVar) {
        this.e = bVar;
        a();
    }

    public void setBodyBackground(int i) {
        this.a.j = i;
    }

    public void setBodyView(View view) {
        this.o = view;
        this.n.removeAllViews();
        if (this.o != null) {
            this.o.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            this.n.addView(this.o);
        }
    }

    public void setMenuBackground(int i) {
        this.a.d = i;
    }

    public void setMenuDivider(int i) {
        this.a.l = i;
    }

    public void setMenuWeight(float f) {
        this.a.c = f;
    }

    public void setShadowRes(int i) {
        this.a.k = i;
    }

    public void setTtleHeight(int i) {
        this.a.i = i;
    }
}
