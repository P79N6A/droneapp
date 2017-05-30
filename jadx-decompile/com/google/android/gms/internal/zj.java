package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.acz.a;
import java.util.concurrent.atomic.AtomicBoolean;

@aaa
public abstract class zj implements abx<Void>, a {
    protected final zn.a a;
    protected final Context b;
    protected final acy c;
    protected final abi.a d;
    protected AdResponseParcel e;
    protected final Object f = new Object();
    private Runnable g;
    private AtomicBoolean h = new AtomicBoolean(true);

    protected zj(Context context, abi.a aVar, acy com_google_android_gms_internal_acy, zn.a aVar2) {
        this.b = context;
        this.d = aVar;
        this.e = this.d.b;
        this.c = com_google_android_gms_internal_acy;
        this.a = aVar2;
    }

    private abi b(int i) {
        AdRequestInfoParcel adRequestInfoParcel = this.d.a;
        return new abi(adRequestInfoParcel.c, this.c, this.e.d, i, this.e.f, this.e.j, this.e.l, this.e.k, adRequestInfoParcel.i, this.e.h, null, null, null, null, null, this.e.i, this.d.d, this.e.g, this.d.f, this.e.n, this.e.o, this.d.h, null, this.e.C, this.e.D, this.e.E, this.e.F, this.e.G, null, this.e.J, this.e.N);
    }

    public final Void a() {
        d.b("Webview render task needs to be called on UI thread.");
        this.g = new 1(this);
        abv.a.postDelayed(this.g, ((Long) uf.aY.c()).longValue());
        b();
        return null;
    }

    protected void a(int i) {
        if (i != -2) {
            this.e = new AdResponseParcel(i, this.e.k);
        }
        this.c.e();
        this.a.b(b(i));
    }

    public void a(acy com_google_android_gms_internal_acy, boolean z) {
        int i = 0;
        b.a("WebView finished loading.");
        if (this.h.getAndSet(false)) {
            if (z) {
                i = c();
            }
            a(i);
            abv.a.removeCallbacks(this.g);
        }
    }

    protected abstract void b();

    protected int c() {
        return -2;
    }

    public void d() {
        if (this.h.getAndSet(false)) {
            this.c.stopLoading();
            u.g().a(this.c);
            a(-1);
            abv.a.removeCallbacks(this.g);
        }
    }

    public /* synthetic */ Object e() {
        return a();
    }
}
