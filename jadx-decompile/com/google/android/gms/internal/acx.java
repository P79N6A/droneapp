package com.google.android.gms.internal;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.ads.internal.overlay.k;
import com.google.android.gms.common.internal.d;

@aaa
public class acx {
    private final acy a;
    private final Context b;
    private final ViewGroup c;
    private k d;

    public acx(Context context, ViewGroup viewGroup, acy com_google_android_gms_internal_acy) {
        this(context, viewGroup, com_google_android_gms_internal_acy, null);
    }

    acx(Context context, ViewGroup viewGroup, acy com_google_android_gms_internal_acy, k kVar) {
        this.b = context;
        this.c = viewGroup;
        this.a = com_google_android_gms_internal_acy;
        this.d = kVar;
    }

    public k a() {
        d.b("getAdVideoUnderlay must be called from the UI thread.");
        return this.d;
    }

    public void a(int i, int i2, int i3, int i4) {
        d.b("The underlay may only be modified from the UI thread.");
        if (this.d != null) {
            this.d.a(i, i2, i3, i4);
        }
    }

    public void a(int i, int i2, int i3, int i4, int i5, boolean z) {
        if (this.d == null) {
            uj.a(this.a.y().a(), this.a.x(), "vpr2");
            this.d = new k(this.b, this.a, i5, z, this.a.y().a());
            this.c.addView(this.d, 0, new LayoutParams(-1, -1));
            this.d.a(i, i2, i3, i4);
            this.a.l().a(false);
        }
    }

    public void b() {
        d.b("onPause must be called from the UI thread.");
        if (this.d != null) {
            this.d.h();
        }
    }

    public void c() {
        d.b("onDestroy must be called from the UI thread.");
        if (this.d != null) {
            this.d.m();
            this.c.removeView(this.d);
            this.d = null;
        }
    }
}
