package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.ac;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.yl.a;
import java.util.Map;

@aaa
public class ym extends yn implements vt {
    DisplayMetrics a;
    int b = -1;
    int c = -1;
    int d = -1;
    int e = -1;
    int f = -1;
    int g = -1;
    private final acy h;
    private final Context i;
    private final WindowManager j;
    private final tx k;
    private float l;
    private int m;

    public ym(acy com_google_android_gms_internal_acy, Context context, tx txVar) {
        super(com_google_android_gms_internal_acy);
        this.h = com_google_android_gms_internal_acy;
        this.i = context;
        this.k = txVar;
        this.j = (WindowManager) context.getSystemService("window");
    }

    private void g() {
        this.a = new DisplayMetrics();
        Display defaultDisplay = this.j.getDefaultDisplay();
        defaultDisplay.getMetrics(this.a);
        this.l = this.a.density;
        this.m = defaultDisplay.getRotation();
    }

    private void h() {
        int[] iArr = new int[2];
        this.h.getLocationOnScreen(iArr);
        a(ac.a().b(this.i, iArr[0]), ac.a().b(this.i, iArr[1]));
    }

    private yl i() {
        return new a().b(this.k.a()).a(this.k.b()).c(this.k.f()).d(this.k.c()).e(this.k.d()).a();
    }

    void a() {
        this.b = ac.a().b(this.a, this.a.widthPixels);
        this.c = ac.a().b(this.a, this.a.heightPixels);
        Activity f = this.h.f();
        if (f == null || f.getWindow() == null) {
            this.d = this.b;
            this.e = this.c;
            return;
        }
        int[] a = u.e().a(f);
        this.d = ac.a().b(this.a, a[0]);
        this.e = ac.a().b(this.a, a[1]);
    }

    public void a(int i, int i2) {
        int i3 = this.i instanceof Activity ? u.e().d((Activity) this.i)[0] : 0;
        if (this.h.k() == null || !this.h.k().e) {
            this.f = ac.a().b(this.i, this.h.getMeasuredWidth());
            this.g = ac.a().b(this.i, this.h.getMeasuredHeight());
        }
        b(i, i2 - i3, this.f, this.g);
        this.h.l().a(i, i2);
    }

    public void a(acy com_google_android_gms_internal_acy, Map<String, String> map) {
        c();
    }

    void b() {
        if (this.h.k().e) {
            this.f = this.b;
            this.g = this.c;
            return;
        }
        this.h.measure(0, 0);
    }

    public void c() {
        g();
        a();
        b();
        e();
        f();
        h();
        d();
    }

    void d() {
        if (b.a(2)) {
            b.c("Dispatching Ready Event.");
        }
        c(this.h.o().b);
    }

    void e() {
        a(this.b, this.c, this.d, this.e, this.l, this.m);
    }

    void f() {
        this.h.b("onDeviceFeaturesReceived", i().a());
    }
}
