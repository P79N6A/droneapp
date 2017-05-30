package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import com.google.android.gms.internal.xs.a;

@aaa
public final class xj extends a {
    private final Object a = new Object();
    private xl.a b;
    private xi c;

    public void a() {
        synchronized (this.a) {
            if (this.c != null) {
                this.c.v();
            }
        }
    }

    public void a(int i) {
        synchronized (this.a) {
            if (this.b != null) {
                this.b.a(i == 3 ? 1 : 2);
                this.b = null;
            }
        }
    }

    public void a(@Nullable xi xiVar) {
        synchronized (this.a) {
            this.c = xiVar;
        }
    }

    public void a(xl.a aVar) {
        synchronized (this.a) {
            this.b = aVar;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.google.android.gms.internal.xt r4) {
        /*
        r3 = this;
        r1 = r3.a;
        monitor-enter(r1);
        r0 = r3.b;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x0012;
    L_0x0007:
        r0 = r3.b;	 Catch:{ all -> 0x001d }
        r2 = 0;
        r0.a(r2, r4);	 Catch:{ all -> 0x001d }
        r0 = 0;
        r3.b = r0;	 Catch:{ all -> 0x001d }
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
    L_0x0011:
        return;
    L_0x0012:
        r0 = r3.c;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x001b;
    L_0x0016:
        r0 = r3.c;	 Catch:{ all -> 0x001d }
        r0.z();	 Catch:{ all -> 0x001d }
    L_0x001b:
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
        goto L_0x0011;
    L_0x001d:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.xj.a(com.google.android.gms.internal.xt):void");
    }

    public void b() {
        synchronized (this.a) {
            if (this.c != null) {
                this.c.w();
            }
        }
    }

    public void c() {
        synchronized (this.a) {
            if (this.c != null) {
                this.c.x();
            }
        }
    }

    public void d() {
        synchronized (this.a) {
            if (this.c != null) {
                this.c.y();
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e() {
        /*
        r3 = this;
        r1 = r3.a;
        monitor-enter(r1);
        r0 = r3.b;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x0012;
    L_0x0007:
        r0 = r3.b;	 Catch:{ all -> 0x001d }
        r2 = 0;
        r0.a(r2);	 Catch:{ all -> 0x001d }
        r0 = 0;
        r3.b = r0;	 Catch:{ all -> 0x001d }
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
    L_0x0011:
        return;
    L_0x0012:
        r0 = r3.c;	 Catch:{ all -> 0x001d }
        if (r0 == 0) goto L_0x001b;
    L_0x0016:
        r0 = r3.c;	 Catch:{ all -> 0x001d }
        r0.z();	 Catch:{ all -> 0x001d }
    L_0x001b:
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
        goto L_0x0011;
    L_0x001d:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001d }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.xj.e():void");
    }

    public void f() {
        synchronized (this.a) {
            if (this.c != null) {
                this.c.A();
            }
        }
    }
}
