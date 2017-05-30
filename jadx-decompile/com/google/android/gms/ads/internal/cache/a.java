package com.google.android.gms.ads.internal.cache;

import android.content.Context;
import android.os.Binder;
import android.support.annotation.Nullable;
import com.google.android.gms.ads.internal.u;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.p.c;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abv;
import com.google.android.gms.internal.tp;
import com.google.android.gms.internal.uf;

@aaa
public class a {
    private final Runnable a = new Runnable(this) {
        final /* synthetic */ a a;

        {
            this.a = r1;
        }

        public void run() {
            this.a.c();
        }
    };
    private final Object b = new Object();
    @Nullable
    private c c;
    @Nullable
    private Context d;
    @Nullable
    private f e;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
        r3 = this;
        r1 = r3.b;
        monitor-enter(r1);
        r0 = r3.d;	 Catch:{ all -> 0x0024 }
        if (r0 == 0) goto L_0x000b;
    L_0x0007:
        r0 = r3.c;	 Catch:{ all -> 0x0024 }
        if (r0 == 0) goto L_0x000d;
    L_0x000b:
        monitor-exit(r1);	 Catch:{ all -> 0x0024 }
    L_0x000c:
        return;
    L_0x000d:
        r0 = new com.google.android.gms.ads.internal.cache.a$3;	 Catch:{ all -> 0x0024 }
        r0.<init>(r3);	 Catch:{ all -> 0x0024 }
        r2 = new com.google.android.gms.ads.internal.cache.a$4;	 Catch:{ all -> 0x0024 }
        r2.<init>(r3);	 Catch:{ all -> 0x0024 }
        r0 = r3.a(r0, r2);	 Catch:{ all -> 0x0024 }
        r3.c = r0;	 Catch:{ all -> 0x0024 }
        r0 = r3.c;	 Catch:{ all -> 0x0024 }
        r0.A();	 Catch:{ all -> 0x0024 }
        monitor-exit(r1);	 Catch:{ all -> 0x0024 }
        goto L_0x000c;
    L_0x0024:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0024 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.cache.a.b():void");
    }

    private void c() {
        synchronized (this.b) {
            if (this.c == null) {
                return;
            }
            if (this.c.t() || this.c.u()) {
                this.c.f();
            }
            this.c = null;
            this.e = null;
            Binder.flushPendingCommands();
            u.u().b();
        }
    }

    public CacheEntryParcel a(CacheOffering cacheOffering) {
        CacheEntryParcel cacheEntryParcel;
        synchronized (this.b) {
            if (this.e == null) {
                cacheEntryParcel = new CacheEntryParcel();
            } else {
                try {
                    cacheEntryParcel = this.e.a(cacheOffering);
                } catch (Throwable e) {
                    b.b("Unable to call into cache service.", e);
                    cacheEntryParcel = new CacheEntryParcel();
                }
            }
        }
        return cacheEntryParcel;
    }

    protected c a(p.b bVar, c cVar) {
        return new c(this.d, u.u().a(), bVar, cVar);
    }

    public void a() {
        if (((Boolean) uf.cz.c()).booleanValue()) {
            synchronized (this.b) {
                b();
                u.e();
                abv.a.removeCallbacks(this.a);
                u.e();
                abv.a.postDelayed(this.a, ((Long) uf.cA.c()).longValue());
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.content.Context r3) {
        /*
        r2 = this;
        if (r3 != 0) goto L_0x0003;
    L_0x0002:
        return;
    L_0x0003:
        r1 = r2.b;
        monitor-enter(r1);
        r0 = r2.d;	 Catch:{ all -> 0x000c }
        if (r0 == 0) goto L_0x000f;
    L_0x000a:
        monitor-exit(r1);	 Catch:{ all -> 0x000c }
        goto L_0x0002;
    L_0x000c:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x000c }
        throw r0;
    L_0x000f:
        r0 = r3.getApplicationContext();	 Catch:{ all -> 0x000c }
        r2.d = r0;	 Catch:{ all -> 0x000c }
        r0 = com.google.android.gms.internal.uf.cy;	 Catch:{ all -> 0x000c }
        r0 = r0.c();	 Catch:{ all -> 0x000c }
        r0 = (java.lang.Boolean) r0;	 Catch:{ all -> 0x000c }
        r0 = r0.booleanValue();	 Catch:{ all -> 0x000c }
        if (r0 == 0) goto L_0x0028;
    L_0x0023:
        r2.b();	 Catch:{ all -> 0x000c }
    L_0x0026:
        monitor-exit(r1);	 Catch:{ all -> 0x000c }
        goto L_0x0002;
    L_0x0028:
        r0 = com.google.android.gms.internal.uf.cx;	 Catch:{ all -> 0x000c }
        r0 = r0.c();	 Catch:{ all -> 0x000c }
        r0 = (java.lang.Boolean) r0;	 Catch:{ all -> 0x000c }
        r0 = r0.booleanValue();	 Catch:{ all -> 0x000c }
        if (r0 == 0) goto L_0x0026;
    L_0x0036:
        r0 = new com.google.android.gms.ads.internal.cache.a$2;	 Catch:{ all -> 0x000c }
        r0.<init>(r2);	 Catch:{ all -> 0x000c }
        r2.a(r0);	 Catch:{ all -> 0x000c }
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.cache.a.a(android.content.Context):void");
    }

    protected void a(tp.b bVar) {
        u.h().a(bVar);
    }
}
