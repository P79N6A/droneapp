package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.internal.acz.a;

@aaa
public class zk implements Runnable {
    protected final acy a;
    protected boolean b;
    protected boolean c;
    private final Handler d;
    private final long e;
    private long f;
    private a g;
    private final int h;
    private final int i;

    public zk(a aVar, acy com_google_android_gms_internal_acy, int i, int i2) {
        this(aVar, com_google_android_gms_internal_acy, i, i2, 200, 50);
    }

    public zk(a aVar, acy com_google_android_gms_internal_acy, int i, int i2, long j, long j2) {
        this.e = j;
        this.f = j2;
        this.d = new Handler(Looper.getMainLooper());
        this.a = com_google_android_gms_internal_acy;
        this.g = aVar;
        this.b = false;
        this.c = false;
        this.h = i2;
        this.i = i;
    }

    static /* synthetic */ long c(zk zkVar) {
        long j = zkVar.f - 1;
        zkVar.f = j;
        return j;
    }

    public void a() {
        this.d.postDelayed(this, this.e);
    }

    public void a(AdResponseParcel adResponseParcel) {
        a(adResponseParcel, new adk(this, this.a, adResponseParcel.q));
    }

    public void a(AdResponseParcel adResponseParcel, adk com_google_android_gms_internal_adk) {
        this.a.setWebViewClient(com_google_android_gms_internal_adk);
        this.a.loadDataWithBaseURL(TextUtils.isEmpty(adResponseParcel.b) ? null : u.e().a(adResponseParcel.b), adResponseParcel.c, "text/html", "UTF-8", null);
    }

    public synchronized void b() {
        this.b = true;
    }

    public synchronized boolean c() {
        return this.b;
    }

    public boolean d() {
        return this.c;
    }

    public void run() {
        if (this.a == null || c()) {
            this.g.a(this.a, true);
        } else {
            new a(this, this.a.a()).execute(new Void[0]);
        }
    }
}
