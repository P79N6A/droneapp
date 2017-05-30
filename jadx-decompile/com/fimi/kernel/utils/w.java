package com.fimi.kernel.utils;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

public class w {
    public static final int a = -1728053248;
    private static boolean i;
    private final a b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private View g;
    private View h;

    public static class a {
        private static final String a = "status_bar_height";
        private static final String b = "navigation_bar_height";
        private static final String c = "navigation_bar_height_landscape";
        private static final String d = "navigation_bar_width";
        private final boolean e;
        private final boolean f;
        private final int g;
        private final int h;
        private final boolean i;
        private final int j;
        private final int k;
        private final boolean l;
        private final float m;

        private a(Activity activity, boolean z, boolean z2) {
            boolean z3 = true;
            Resources resources = activity.getResources();
            this.l = resources.getConfiguration().orientation == 1;
            this.m = a(activity);
            this.g = a(resources, a);
            this.h = a((Context) activity);
            this.j = b(activity);
            this.k = c(activity);
            if (this.j <= 0) {
                z3 = false;
            }
            this.i = z3;
            this.e = z;
            this.f = z2;
        }

        @SuppressLint({"NewApi"})
        private float a(Activity activity) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (VERSION.SDK_INT >= 16) {
                activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
            } else {
                activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            }
            return Math.min(((float) displayMetrics.widthPixels) / displayMetrics.density, ((float) displayMetrics.heightPixels) / displayMetrics.density);
        }

        @TargetApi(14)
        private int a(Context context) {
            if (VERSION.SDK_INT < 14) {
                return 0;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16843499, typedValue, true);
            return context.getResources().getDimensionPixelSize(typedValue.resourceId);
        }

        private int a(Resources resources, String str) {
            int identifier = resources.getIdentifier(str, "dimen", SystemMediaRouteProvider.PACKAGE_NAME);
            return identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
        }

        @TargetApi(14)
        private int b(Context context) {
            Resources resources = context.getResources();
            if (VERSION.SDK_INT < 14 || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                return 0;
            }
            return a(resources, this.l ? b : c);
        }

        @TargetApi(14)
        private int c(Context context) {
            return (VERSION.SDK_INT < 14 || ViewConfiguration.get(context).hasPermanentMenuKey()) ? 0 : a(context.getResources(), d);
        }

        public int a(boolean z) {
            int i = 0;
            int i2 = this.e ? this.g : 0;
            if (z) {
                i = this.h;
            }
            return i + i2;
        }

        public boolean a() {
            return this.m >= 600.0f || this.l;
        }

        public int b() {
            return this.g;
        }

        public int c() {
            return this.h;
        }

        public boolean d() {
            return this.i;
        }

        public int e() {
            return this.j;
        }

        public int f() {
            return this.k;
        }

        public int g() {
            return (this.f && a()) ? this.j : 0;
        }

        public int h() {
            return (!this.f || a()) ? 0 : this.k;
        }
    }

    static {
        try {
            Class cls = Class.forName("android.os.SystemProperties");
            i = "V6".equals((String) cls.getDeclaredMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{"ro.miui.ui.version.name"}));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @TargetApi(19)
    public w(Activity activity) {
        Window window = activity.getWindow();
        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
        if (VERSION.SDK_INT >= 19) {
            TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(new int[]{16843759, 16843760});
            try {
                this.c = obtainStyledAttributes.getBoolean(0, false);
                this.d = obtainStyledAttributes.getBoolean(1, false);
                LayoutParams attributes = window.getAttributes();
                if ((67108864 & attributes.flags) != 0) {
                    this.c = true;
                }
                if ((attributes.flags & 134217728) != 0) {
                    this.d = true;
                }
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.b = new a(activity, this.c, this.d);
        if (!this.b.d()) {
            this.d = false;
        }
        if (this.c) {
            a((Context) activity, viewGroup);
        }
        if (this.d) {
            b(activity, viewGroup);
        }
    }

    private void a(Context context, ViewGroup viewGroup) {
        this.g = new View(context);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.b.b());
        layoutParams.gravity = 48;
        if (this.d && !this.b.a()) {
            layoutParams.rightMargin = this.b.f();
        }
        this.g.setLayoutParams(layoutParams);
        this.g.setBackgroundColor(-1728053248);
        this.g.setVisibility(8);
        viewGroup.addView(this.g);
    }

    private void b(Context context, ViewGroup viewGroup) {
        ViewGroup.LayoutParams layoutParams;
        this.h = new View(context);
        if (this.b.a()) {
            layoutParams = new FrameLayout.LayoutParams(-1, this.b.e());
            layoutParams.gravity = 80;
        } else {
            layoutParams = new FrameLayout.LayoutParams(this.b.f(), -1);
            layoutParams.gravity = 5;
        }
        this.h.setLayoutParams(layoutParams);
        this.h.setBackgroundColor(-1728053248);
        this.h.setVisibility(8);
        viewGroup.addView(this.h);
    }

    public a a() {
        return this.b;
    }

    public void a(float f) {
        b(f);
        c(f);
    }

    public void a(int i) {
        c(i);
        e(i);
    }

    public void a(Drawable drawable) {
        b(drawable);
        c(drawable);
    }

    public void a(boolean z) {
        this.e = z;
        if (this.c) {
            this.g.setVisibility(z ? 0 : 8);
        }
    }

    public void a(boolean z, Activity activity) {
        int i = 0;
        if (i) {
            Class cls = activity.getWindow().getClass();
            try {
                Class cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
                int i2 = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
                Method method = cls.getMethod("setExtraFlags", new Class[]{Integer.TYPE, Integer.TYPE});
                Window window = activity.getWindow();
                Object[] objArr = new Object[2];
                if (z) {
                    i = i2;
                }
                objArr[0] = Integer.valueOf(i);
                objArr[1] = Integer.valueOf(i2);
                method.invoke(window, objArr);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @TargetApi(11)
    public void b(float f) {
        if (this.c && VERSION.SDK_INT >= 11) {
            this.g.setAlpha(f);
        }
    }

    public void b(int i) {
        d(i);
        f(i);
    }

    public void b(Drawable drawable) {
        if (this.c) {
            this.g.setBackgroundDrawable(drawable);
        }
    }

    public void b(boolean z) {
        this.f = z;
        if (this.d) {
            this.h.setVisibility(z ? 0 : 8);
        }
    }

    public boolean b() {
        return this.e;
    }

    @TargetApi(11)
    public void c(float f) {
        if (this.d && VERSION.SDK_INT >= 11) {
            this.h.setAlpha(f);
        }
    }

    public void c(int i) {
        if (this.c) {
            this.g.setBackgroundColor(i);
        }
    }

    public void c(Drawable drawable) {
        if (this.d) {
            this.h.setBackgroundDrawable(drawable);
        }
    }

    public boolean c() {
        return this.f;
    }

    public void d(int i) {
        if (this.c) {
            this.g.setBackgroundResource(i);
        }
    }

    public void e(int i) {
        if (this.d) {
            this.h.setBackgroundColor(i);
        }
    }

    public void f(int i) {
        if (this.d) {
            this.h.setBackgroundResource(i);
        }
    }
}
