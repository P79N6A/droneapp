package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import com.google.android.gms.common.util.s;

@aaa
public class tp {
    private final Object a = new Object();
    private a b = null;
    private boolean c = false;

    @Nullable
    public Activity a() {
        Activity activity = null;
        synchronized (this.a) {
            if (!s.d()) {
            } else if (this.b != null) {
                activity = this.b.a();
            }
        }
        return activity;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.content.Context r5) {
        /*
        r4 = this;
        r2 = r4.a;
        monitor-enter(r2);
        r0 = r4.c;	 Catch:{ all -> 0x001f }
        if (r0 != 0) goto L_0x004c;
    L_0x0007:
        r0 = com.google.android.gms.common.util.s.d();	 Catch:{ all -> 0x001f }
        if (r0 != 0) goto L_0x000f;
    L_0x000d:
        monitor-exit(r2);	 Catch:{ all -> 0x001f }
    L_0x000e:
        return;
    L_0x000f:
        r0 = com.google.android.gms.internal.uf.ao;	 Catch:{ all -> 0x001f }
        r0 = r0.c();	 Catch:{ all -> 0x001f }
        r0 = (java.lang.Boolean) r0;	 Catch:{ all -> 0x001f }
        r0 = r0.booleanValue();	 Catch:{ all -> 0x001f }
        if (r0 != 0) goto L_0x0022;
    L_0x001d:
        monitor-exit(r2);	 Catch:{ all -> 0x001f }
        goto L_0x000e;
    L_0x001f:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x001f }
        throw r0;
    L_0x0022:
        r1 = 0;
        r0 = r5.getApplicationContext();	 Catch:{ all -> 0x001f }
        if (r0 != 0) goto L_0x002a;
    L_0x0029:
        r0 = r5;
    L_0x002a:
        r3 = r0 instanceof android.app.Application;	 Catch:{ all -> 0x001f }
        if (r3 == 0) goto L_0x004e;
    L_0x002e:
        r0 = (android.app.Application) r0;	 Catch:{ all -> 0x001f }
    L_0x0030:
        if (r0 != 0) goto L_0x0039;
    L_0x0032:
        r0 = "Can not cast Context to Application";
        com.google.android.gms.ads.internal.util.client.b.d(r0);	 Catch:{ all -> 0x001f }
        monitor-exit(r2);	 Catch:{ all -> 0x001f }
        goto L_0x000e;
    L_0x0039:
        r1 = r4.b;	 Catch:{ all -> 0x001f }
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r1 = new com.google.android.gms.internal.tp$a;	 Catch:{ all -> 0x001f }
        r1.<init>();	 Catch:{ all -> 0x001f }
        r4.b = r1;	 Catch:{ all -> 0x001f }
    L_0x0044:
        r1 = r4.b;	 Catch:{ all -> 0x001f }
        r1.a(r0, r5);	 Catch:{ all -> 0x001f }
        r0 = 1;
        r4.c = r0;	 Catch:{ all -> 0x001f }
    L_0x004c:
        monitor-exit(r2);	 Catch:{ all -> 0x001f }
        goto L_0x000e;
    L_0x004e:
        r0 = r1;
        goto L_0x0030;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.tp.a(android.content.Context):void");
    }

    public void a(b bVar) {
        synchronized (this.a) {
            if (!s.d()) {
            } else if (((Boolean) uf.ao.c()).booleanValue()) {
                if (this.b == null) {
                    this.b = new a();
                }
                this.b.a(bVar);
            }
        }
    }

    @Nullable
    public Context b() {
        Context context = null;
        synchronized (this.a) {
            if (!s.d()) {
            } else if (this.b != null) {
                context = this.b.b();
            }
        }
        return context;
    }
}
