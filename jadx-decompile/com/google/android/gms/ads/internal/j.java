package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.util.SimpleArrayMap;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.ag;
import com.google.android.gms.ads.internal.client.ah.a;
import com.google.android.gms.ads.internal.client.ao;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.vf;
import com.google.android.gms.internal.vg;
import com.google.android.gms.internal.vh;
import com.google.android.gms.internal.vi;
import com.google.android.gms.internal.xq;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@aaa
public class j extends a {
    private final Context a;
    private final ag b;
    private final xq c;
    @Nullable
    private final vf d;
    @Nullable
    private final vg e;
    private final SimpleArrayMap<String, vi> f;
    private final SimpleArrayMap<String, vh> g;
    private final NativeAdOptionsParcel h;
    private final List<String> i;
    private final ao j;
    private final String k;
    private final VersionInfoParcel l;
    @Nullable
    private WeakReference<q> m;
    private final d n;
    private final Object o = new Object();

    j(Context context, String str, xq xqVar, VersionInfoParcel versionInfoParcel, ag agVar, vf vfVar, vg vgVar, SimpleArrayMap<String, vi> simpleArrayMap, SimpleArrayMap<String, vh> simpleArrayMap2, NativeAdOptionsParcel nativeAdOptionsParcel, ao aoVar, d dVar) {
        this.a = context;
        this.k = str;
        this.c = xqVar;
        this.l = versionInfoParcel;
        this.b = agVar;
        this.e = vgVar;
        this.d = vfVar;
        this.f = simpleArrayMap;
        this.g = simpleArrayMap2;
        this.h = nativeAdOptionsParcel;
        this.i = d();
        this.j = aoVar;
        this.n = dVar;
    }

    private List<String> d() {
        List<String> arrayList = new ArrayList();
        if (this.e != null) {
            arrayList.add("1");
        }
        if (this.d != null) {
            arrayList.add("2");
        }
        if (this.f.size() > 0) {
            arrayList.add("3");
        }
        return arrayList;
    }

    public void a(final AdRequestParcel adRequestParcel) {
        a(new Runnable(this) {
            final /* synthetic */ j b;

            public void run() {
                synchronized (this.b.o) {
                    q c = this.b.c();
                    this.b.m = new WeakReference(c);
                    c.a(this.b.d);
                    c.a(this.b.e);
                    c.a(this.b.f);
                    c.a(this.b.b);
                    c.b(this.b.g);
                    c.a(this.b.d());
                    c.a(this.b.h);
                    c.a(this.b.j);
                    c.a(adRequestParcel);
                }
            }
        });
    }

    protected void a(Runnable runnable) {
        abv.a.post(runnable);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a() {
        /*
        r3 = this;
        r1 = 0;
        r2 = r3.o;
        monitor-enter(r2);
        r0 = r3.m;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x001a;
    L_0x0008:
        r0 = r3.m;	 Catch:{ all -> 0x001d }
        r0 = r0.get();	 Catch:{ all -> 0x001d }
        r0 = (com.google.android.gms.ads.internal.q) r0;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x0018;
    L_0x0012:
        r0 = r0.k();	 Catch:{ all -> 0x001d }
    L_0x0016:
        monitor-exit(r2);	 Catch:{ all -> 0x001d }
    L_0x0017:
        return r0;
    L_0x0018:
        r0 = r1;
        goto L_0x0016;
    L_0x001a:
        monitor-exit(r2);	 Catch:{ all -> 0x001d }
        r0 = r1;
        goto L_0x0017;
    L_0x001d:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x001d }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.j.a():boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.support.annotation.Nullable
    public java.lang.String b() {
        /*
        r3 = this;
        r1 = 0;
        r2 = r3.o;
        monitor-enter(r2);
        r0 = r3.m;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x001a;
    L_0x0008:
        r0 = r3.m;	 Catch:{ all -> 0x001d }
        r0 = r0.get();	 Catch:{ all -> 0x001d }
        r0 = (com.google.android.gms.ads.internal.q) r0;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x0018;
    L_0x0012:
        r0 = r0.j();	 Catch:{ all -> 0x001d }
    L_0x0016:
        monitor-exit(r2);	 Catch:{ all -> 0x001d }
    L_0x0017:
        return r0;
    L_0x0018:
        r0 = r1;
        goto L_0x0016;
    L_0x001a:
        monitor-exit(r2);	 Catch:{ all -> 0x001d }
        r0 = r1;
        goto L_0x0017;
    L_0x001d:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x001d }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.j.b():java.lang.String");
    }

    protected q c() {
        return new q(this.a, this.n, AdSizeParcel.a(this.a), this.k, this.c, this.l);
    }
}
