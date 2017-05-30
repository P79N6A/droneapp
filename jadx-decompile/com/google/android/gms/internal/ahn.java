package com.google.android.gms.internal;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.i.a;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.aix.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public abstract class ahn<R extends m> extends i<R> {
    static final ThreadLocal<Boolean> i = new 1();
    private final Object a;
    private final CountDownLatch b;
    private final ArrayList<a> c;
    private n<? super R> d;
    private final AtomicReference<b> e;
    private R f;
    private b g;
    private volatile boolean h;
    protected final a<R> j;
    protected final WeakReference<g> k;
    private boolean l;
    private boolean m;
    private ad n;
    private volatile aiw<R> o;
    private boolean p;

    @Deprecated
    ahn() {
        this.a = new Object();
        this.b = new CountDownLatch(1);
        this.c = new ArrayList();
        this.e = new AtomicReference();
        this.p = false;
        this.j = new a(Looper.getMainLooper());
        this.k = new WeakReference(null);
    }

    @Deprecated
    protected ahn(Looper looper) {
        this.a = new Object();
        this.b = new CountDownLatch(1);
        this.c = new ArrayList();
        this.e = new AtomicReference();
        this.p = false;
        this.j = new a(looper);
        this.k = new WeakReference(null);
    }

    protected ahn(g gVar) {
        this.a = new Object();
        this.b = new CountDownLatch(1);
        this.c = new ArrayList();
        this.e = new AtomicReference();
        this.p = false;
        this.j = new a(gVar != null ? gVar.c() : Looper.getMainLooper());
        this.k = new WeakReference(gVar);
    }

    private void a(R r) {
        this.f = r;
        this.n = null;
        this.b.countDown();
        Status a = this.f.a();
        if (this.l) {
            this.d = null;
        } else if (this.d != null) {
            this.j.a();
            this.j.a(this.d, c());
        } else if (this.f instanceof k) {
            this.g = new b(this, null);
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(a);
        }
        this.c.clear();
    }

    private void b() {
        b bVar = (b) this.e.getAndSet(null);
        if (bVar != null) {
            bVar.a(this);
        }
    }

    private R c() {
        R r;
        boolean z = true;
        synchronized (this.a) {
            if (this.h) {
                z = false;
            }
            d.a(z, (Object) "Result has already been consumed.");
            d.a(i(), (Object) "Result is not ready.");
            r = this.f;
            this.f = null;
            this.d = null;
            this.h = true;
        }
        b();
        return r;
    }

    public static void c(m mVar) {
        if (mVar instanceof k) {
            try {
                ((k) mVar).b();
            } catch (Throwable e) {
                String valueOf = String.valueOf(mVar);
                Log.w("BasePendingResult", new StringBuilder(String.valueOf(valueOf).length() + 18).append("Unable to release ").append(valueOf).toString(), e);
            }
        }
    }

    public final R a(long j, TimeUnit timeUnit) {
        boolean z = true;
        boolean z2 = j <= 0 || Looper.myLooper() != Looper.getMainLooper();
        d.a(z2, (Object) "await must not be called on the UI thread when time is greater than zero.");
        d.a(!this.h, (Object) "Result has already been consumed.");
        if (this.o != null) {
            z = false;
        }
        d.a(z, (Object) "Cannot await if then() has been called.");
        try {
            if (!this.b.await(j, timeUnit)) {
                d(Status.d);
            }
        } catch (InterruptedException e) {
            d(Status.b);
        }
        d.a(i(), (Object) "Result is not ready.");
        return c();
    }

    public <S extends m> q<S> a(p<? super R, ? extends S> pVar) {
        q<S> a;
        boolean z = true;
        d.a(!this.h, (Object) "Result has already been consumed.");
        synchronized (this.a) {
            d.a(this.o == null, (Object) "Cannot call then() twice.");
            if (this.d != null) {
                z = false;
            }
            d.a(z, (Object) "Cannot call then() if callbacks are set.");
            this.p = true;
            this.o = new aiw(this.k);
            a = this.o.a(pVar);
            if (i()) {
                this.j.a(this.o, c());
            } else {
                this.d = this.o;
            }
        }
        return a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
        r2 = this;
        r1 = r2.a;
        monitor-enter(r1);
        r0 = r2.l;	 Catch:{ all -> 0x0029 }
        if (r0 != 0) goto L_0x000b;
    L_0x0007:
        r0 = r2.h;	 Catch:{ all -> 0x0029 }
        if (r0 == 0) goto L_0x000d;
    L_0x000b:
        monitor-exit(r1);	 Catch:{ all -> 0x0029 }
    L_0x000c:
        return;
    L_0x000d:
        r0 = r2.n;	 Catch:{ all -> 0x0029 }
        if (r0 == 0) goto L_0x0016;
    L_0x0011:
        r0 = r2.n;	 Catch:{ RemoteException -> 0x002c }
        r0.a();	 Catch:{ RemoteException -> 0x002c }
    L_0x0016:
        r0 = r2.f;	 Catch:{ all -> 0x0029 }
        c(r0);	 Catch:{ all -> 0x0029 }
        r0 = 1;
        r2.l = r0;	 Catch:{ all -> 0x0029 }
        r0 = com.google.android.gms.common.api.Status.e;	 Catch:{ all -> 0x0029 }
        r0 = r2.b(r0);	 Catch:{ all -> 0x0029 }
        r2.a(r0);	 Catch:{ all -> 0x0029 }
        monitor-exit(r1);	 Catch:{ all -> 0x0029 }
        goto L_0x000c;
    L_0x0029:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0029 }
        throw r0;
    L_0x002c:
        r0 = move-exception;
        goto L_0x0016;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ahn.a():void");
    }

    public final void a(a aVar) {
        boolean z = true;
        d.a(!this.h, (Object) "Result has already been consumed.");
        if (aVar == null) {
            z = false;
        }
        d.b(z, "Callback cannot be null.");
        synchronized (this.a) {
            if (i()) {
                aVar.a(this.f.a());
            } else {
                this.c.add(aVar);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.android.gms.common.api.n<? super R> r6) {
        /*
        r5 = this;
        r0 = 1;
        r1 = 0;
        r3 = r5.a;
        monitor-enter(r3);
        if (r6 != 0) goto L_0x000c;
    L_0x0007:
        r0 = 0;
        r5.d = r0;	 Catch:{ all -> 0x0027 }
        monitor-exit(r3);	 Catch:{ all -> 0x0027 }
    L_0x000b:
        return;
    L_0x000c:
        r2 = r5.h;	 Catch:{ all -> 0x0027 }
        if (r2 != 0) goto L_0x002a;
    L_0x0010:
        r2 = r0;
    L_0x0011:
        r4 = "Result has already been consumed.";
        com.google.android.gms.common.internal.d.a(r2, r4);	 Catch:{ all -> 0x0027 }
        r2 = r5.o;	 Catch:{ all -> 0x0027 }
        if (r2 != 0) goto L_0x002c;
    L_0x001a:
        r1 = "Cannot set callbacks if then() has been called.";
        com.google.android.gms.common.internal.d.a(r0, r1);	 Catch:{ all -> 0x0027 }
        r0 = r5.e();	 Catch:{ all -> 0x0027 }
        if (r0 == 0) goto L_0x002e;
    L_0x0025:
        monitor-exit(r3);	 Catch:{ all -> 0x0027 }
        goto L_0x000b;
    L_0x0027:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0027 }
        throw r0;
    L_0x002a:
        r2 = r1;
        goto L_0x0011;
    L_0x002c:
        r0 = r1;
        goto L_0x001a;
    L_0x002e:
        r0 = r5.i();	 Catch:{ all -> 0x0027 }
        if (r0 == 0) goto L_0x003f;
    L_0x0034:
        r0 = r5.j;	 Catch:{ all -> 0x0027 }
        r1 = r5.c();	 Catch:{ all -> 0x0027 }
        r0.a(r6, r1);	 Catch:{ all -> 0x0027 }
    L_0x003d:
        monitor-exit(r3);	 Catch:{ all -> 0x0027 }
        goto L_0x000b;
    L_0x003f:
        r5.d = r6;	 Catch:{ all -> 0x0027 }
        goto L_0x003d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ahn.a(com.google.android.gms.common.api.n):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.android.gms.common.api.n<? super R> r7, long r8, java.util.concurrent.TimeUnit r10) {
        /*
        r6 = this;
        r0 = 1;
        r1 = 0;
        r3 = r6.a;
        monitor-enter(r3);
        if (r7 != 0) goto L_0x000c;
    L_0x0007:
        r0 = 0;
        r6.d = r0;	 Catch:{ all -> 0x0027 }
        monitor-exit(r3);	 Catch:{ all -> 0x0027 }
    L_0x000b:
        return;
    L_0x000c:
        r2 = r6.h;	 Catch:{ all -> 0x0027 }
        if (r2 != 0) goto L_0x002a;
    L_0x0010:
        r2 = r0;
    L_0x0011:
        r4 = "Result has already been consumed.";
        com.google.android.gms.common.internal.d.a(r2, r4);	 Catch:{ all -> 0x0027 }
        r2 = r6.o;	 Catch:{ all -> 0x0027 }
        if (r2 != 0) goto L_0x002c;
    L_0x001a:
        r1 = "Cannot set callbacks if then() has been called.";
        com.google.android.gms.common.internal.d.a(r0, r1);	 Catch:{ all -> 0x0027 }
        r0 = r6.e();	 Catch:{ all -> 0x0027 }
        if (r0 == 0) goto L_0x002e;
    L_0x0025:
        monitor-exit(r3);	 Catch:{ all -> 0x0027 }
        goto L_0x000b;
    L_0x0027:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0027 }
        throw r0;
    L_0x002a:
        r2 = r1;
        goto L_0x0011;
    L_0x002c:
        r0 = r1;
        goto L_0x001a;
    L_0x002e:
        r0 = r6.i();	 Catch:{ all -> 0x0027 }
        if (r0 == 0) goto L_0x003f;
    L_0x0034:
        r0 = r6.j;	 Catch:{ all -> 0x0027 }
        r1 = r6.c();	 Catch:{ all -> 0x0027 }
        r0.a(r7, r1);	 Catch:{ all -> 0x0027 }
    L_0x003d:
        monitor-exit(r3);	 Catch:{ all -> 0x0027 }
        goto L_0x000b;
    L_0x003f:
        r6.d = r7;	 Catch:{ all -> 0x0027 }
        r0 = r6.j;	 Catch:{ all -> 0x0027 }
        r4 = r10.toMillis(r8);	 Catch:{ all -> 0x0027 }
        r0.a(r6, r4);	 Catch:{ all -> 0x0027 }
        goto L_0x003d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ahn.a(com.google.android.gms.common.api.n, long, java.util.concurrent.TimeUnit):void");
    }

    protected final void a(ad adVar) {
        synchronized (this.a) {
            this.n = adVar;
        }
    }

    public void a(b bVar) {
        this.e.set(bVar);
    }

    protected abstract R b(Status status);

    public final void b(R r) {
        boolean z = true;
        synchronized (this.a) {
            if (this.m || this.l || (i() && m())) {
                c(r);
                return;
            }
            d.a(!i(), (Object) "Results have already been set");
            if (this.h) {
                z = false;
            }
            d.a(z, (Object) "Result has already been consumed");
            a((m) r);
        }
    }

    public final R d() {
        boolean z = true;
        d.a(Looper.myLooper() != Looper.getMainLooper(), (Object) "await must not be called on the UI thread");
        d.a(!this.h, (Object) "Result has already been consumed");
        if (this.o != null) {
            z = false;
        }
        d.a(z, (Object) "Cannot await if then() has been called.");
        try {
            this.b.await();
        } catch (InterruptedException e) {
            d(Status.b);
        }
        d.a(i(), (Object) "Result is not ready.");
        return c();
    }

    public final void d(Status status) {
        synchronized (this.a) {
            if (!i()) {
                b(b(status));
                this.m = true;
            }
        }
    }

    public boolean e() {
        boolean z;
        synchronized (this.a) {
            z = this.l;
        }
        return z;
    }

    public Integer f() {
        return null;
    }

    public final boolean i() {
        return this.b.getCount() == 0;
    }

    public boolean j() {
        boolean e;
        synchronized (this.a) {
            if (((g) this.k.get()) == null || !this.p) {
                a();
            }
            e = e();
        }
        return e;
    }

    public void k() {
        a(null);
    }

    public void l() {
        boolean z = this.p || ((Boolean) i.get()).booleanValue();
        this.p = z;
    }

    boolean m() {
        return false;
    }
}
