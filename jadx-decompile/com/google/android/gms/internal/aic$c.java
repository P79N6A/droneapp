package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.a;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.g.b;
import com.google.android.gms.common.api.g.c;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.api.u;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.g.g;
import com.google.android.gms.internal.ahg.e;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

class aic$c<O extends a> implements b, c, ahp {
    final /* synthetic */ aic a;
    private final Queue<ahg> d = new LinkedList();
    private final f e;
    private final com.google.android.gms.common.api.a.c f;
    private final ahh<O> g;
    private final SparseArray<aix> h = new SparseArray();
    private final Set<ahk> i = new HashSet();
    private final SparseArray<Map<ail.b<?>, aiq>> j = new SparseArray();
    private boolean k;
    private ConnectionResult l = null;

    @WorkerThread
    public aic$c(aic com_google_android_gms_internal_aic, u<O> uVar) {
        this.a = com_google_android_gms_internal_aic;
        this.e = uVar.a(aic.a(com_google_android_gms_internal_aic).getLooper(), this, this);
        if (this.e instanceof i) {
            this.f = ((i) this.e).h();
        } else {
            this.f = this.e;
        }
        this.g = uVar.e();
    }

    @WorkerThread
    private void a(Status status) {
        for (ahg a : this.d) {
            a.a(status);
        }
        this.d.clear();
    }

    @WorkerThread
    private void b(ConnectionResult connectionResult) {
        for (ahk a : this.i) {
            a.a(this.g, connectionResult);
        }
        this.i.clear();
    }

    @WorkerThread
    private void b(ahg com_google_android_gms_internal_ahg) {
        com_google_android_gms_internal_ahg.a(this.h);
        try {
            com_google_android_gms_internal_ahg.a(this.f);
        } catch (DeadObjectException e) {
            this.e.f();
            a(1);
        }
    }

    @WorkerThread
    private void e() {
        if (this.k) {
            j();
        }
    }

    @WorkerThread
    private void f() {
        if (this.k) {
            aic.a(this.a).removeMessages(10, this.g);
            aic.a(this.a).removeMessages(9, this.g);
            this.k = false;
        }
    }

    @WorkerThread
    private void g() {
        if (this.k) {
            f();
            a(aic.i(this.a).a(aic.h(this.a)) == 18 ? new Status(8, "Connection timed out while waiting for Google Play services update to complete.") : new Status(8, "API failed to connect while resuming due to an unknown error."));
            this.e.f();
        }
    }

    private void h() {
        aic.a(this.a).removeMessages(11, this.g);
        aic.a(this.a).sendMessageDelayed(aic.a(this.a).obtainMessage(11, this.g), aic.j(this.a));
    }

    private void i() {
        if (this.e.t() && this.j.size() == 0) {
            for (int i = 0; i < this.h.size(); i++) {
                if (((aix) this.h.get(this.h.keyAt(i))).c()) {
                    h();
                    return;
                }
            }
            this.e.f();
        }
    }

    @WorkerThread
    private void j() {
        if (!this.e.t() && !this.e.u()) {
            if (this.e.w() && aic.k(this.a) != 0) {
                aic.a(this.a, aic.i(this.a).a(aic.h(this.a)));
                if (aic.k(this.a) != 0) {
                    a(new ConnectionResult(aic.k(this.a), null));
                    return;
                }
            }
            this.e.a(new aic$d(this.a, this.e, this.g));
        }
    }

    @WorkerThread
    public void a() {
        while (this.e.t() && !this.d.isEmpty()) {
            b((ahg) this.d.remove());
        }
    }

    @WorkerThread
    public void a(int i) {
        b();
        this.k = true;
        aic.a(this.a).sendMessageDelayed(Message.obtain(aic.a(this.a), 9, this.g), aic.b(this.a));
        aic.a(this.a).sendMessageDelayed(Message.obtain(aic.a(this.a), 10, this.g), aic.c(this.a));
        aic.a(this.a, -1);
    }

    @WorkerThread
    public void a(int i, @NonNull ail.b<?> bVar, @NonNull g<Void> gVar) {
        Map map = (Map) this.j.get(i);
        if (map == null || map.get(bVar) == null) {
            gVar.a(new r(Status.c));
            Log.wtf("GoogleApiManager", "Received call to unregister a listener without a matching registration call.", new Exception());
            return;
        }
        a(new e(i, ((aiq) map.get(bVar)).b, gVar, this.j));
    }

    @WorkerThread
    public void a(int i, @NonNull aiq com_google_android_gms_internal_aiq, @NonNull g<Void> gVar) {
        a(new ahg.c(i, com_google_android_gms_internal_aiq, gVar, this.j));
    }

    @WorkerThread
    public void a(int i, boolean z) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ahg com_google_android_gms_internal_ahg = (ahg) it.next();
            if (com_google_android_gms_internal_ahg.a == i && com_google_android_gms_internal_ahg.b != 1 && com_google_android_gms_internal_ahg.a()) {
                it.remove();
            }
        }
        ((aix) this.h.get(i)).a();
        this.j.delete(i);
        if (!z) {
            this.h.remove(i);
            aic.f(this.a).remove(i);
            if (this.h.size() == 0 && this.d.isEmpty()) {
                f();
                this.e.f();
                aic.g(this.a).remove(this.g);
                synchronized (aic.c()) {
                    aic.e(this.a).remove(this.g);
                }
            }
        }
    }

    @WorkerThread
    public void a(@Nullable Bundle bundle) {
        b();
        b(ConnectionResult.v);
        f();
        for (int i = 0; i < this.j.size(); i++) {
            for (aiq com_google_android_gms_internal_aiq : ((Map) this.j.get(this.j.keyAt(i))).values()) {
                try {
                    com_google_android_gms_internal_aiq.a.a(this.f, new g());
                } catch (DeadObjectException e) {
                    this.e.f();
                    a(1);
                }
            }
        }
        a();
        h();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.support.annotation.WorkerThread
    public void a(@android.support.annotation.NonNull com.google.android.gms.common.ConnectionResult r6) {
        /*
        r5 = this;
        r5.b();
        r0 = r5.a;
        r1 = -1;
        com.google.android.gms.internal.aic.a(r0, r1);
        r5.b(r6);
        r0 = r5.h;
        r1 = 0;
        r0 = r0.keyAt(r1);
        r1 = r5.d;
        r1 = r1.isEmpty();
        if (r1 == 0) goto L_0x001e;
    L_0x001b:
        r5.l = r6;
    L_0x001d:
        return;
    L_0x001e:
        r1 = com.google.android.gms.internal.aic.c();
        monitor-enter(r1);
        r2 = r5.a;	 Catch:{ all -> 0x0044 }
        r2 = com.google.android.gms.internal.aic.d(r2);	 Catch:{ all -> 0x0044 }
        if (r2 == 0) goto L_0x0047;
    L_0x002b:
        r2 = r5.a;	 Catch:{ all -> 0x0044 }
        r2 = com.google.android.gms.internal.aic.e(r2);	 Catch:{ all -> 0x0044 }
        r3 = r5.g;	 Catch:{ all -> 0x0044 }
        r2 = r2.contains(r3);	 Catch:{ all -> 0x0044 }
        if (r2 == 0) goto L_0x0047;
    L_0x0039:
        r2 = r5.a;	 Catch:{ all -> 0x0044 }
        r2 = com.google.android.gms.internal.aic.d(r2);	 Catch:{ all -> 0x0044 }
        r2.b(r6, r0);	 Catch:{ all -> 0x0044 }
        monitor-exit(r1);	 Catch:{ all -> 0x0044 }
        goto L_0x001d;
    L_0x0044:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0044 }
        throw r0;
    L_0x0047:
        monitor-exit(r1);	 Catch:{ all -> 0x0044 }
        r1 = r5.a;
        r0 = r1.a(r6, r0);
        if (r0 != 0) goto L_0x001d;
    L_0x0050:
        r0 = r6.c();
        r1 = 18;
        if (r0 != r1) goto L_0x005b;
    L_0x0058:
        r0 = 1;
        r5.k = r0;
    L_0x005b:
        r0 = r5.k;
        if (r0 == 0) goto L_0x007d;
    L_0x005f:
        r0 = r5.a;
        r0 = com.google.android.gms.internal.aic.a(r0);
        r1 = r5.a;
        r1 = com.google.android.gms.internal.aic.a(r1);
        r2 = 9;
        r3 = r5.g;
        r1 = android.os.Message.obtain(r1, r2, r3);
        r2 = r5.a;
        r2 = com.google.android.gms.internal.aic.b(r2);
        r0.sendMessageDelayed(r1, r2);
        goto L_0x001d;
    L_0x007d:
        r0 = new com.google.android.gms.common.api.Status;
        r1 = 17;
        r2 = r5.g;
        r2 = r2.a();
        r2 = java.lang.String.valueOf(r2);
        r3 = new java.lang.StringBuilder;
        r4 = java.lang.String.valueOf(r2);
        r4 = r4.length();
        r4 = r4 + 38;
        r3.<init>(r4);
        r4 = "API: ";
        r3 = r3.append(r4);
        r2 = r3.append(r2);
        r3 = " is not available on this device.";
        r2 = r2.append(r3);
        r2 = r2.toString();
        r0.<init>(r1, r2);
        r5.a(r0);
        goto L_0x001d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.aic$c.a(com.google.android.gms.common.ConnectionResult):void");
    }

    public void a(ConnectionResult connectionResult, com.google.android.gms.common.api.a<?> aVar, int i) {
        a(connectionResult);
    }

    @WorkerThread
    public void a(ahg com_google_android_gms_internal_ahg) {
        if (this.e.t()) {
            b(com_google_android_gms_internal_ahg);
            h();
            return;
        }
        this.d.add(com_google_android_gms_internal_ahg);
        if (this.l == null || !this.l.a()) {
            j();
        } else {
            a(this.l);
        }
    }

    @WorkerThread
    public void a(ahk com_google_android_gms_internal_ahk) {
        this.i.add(com_google_android_gms_internal_ahk);
    }

    @WorkerThread
    public void b() {
        this.l = null;
    }

    @WorkerThread
    public void b(int i) {
        this.h.put(i, new aix(this.e));
    }

    ConnectionResult c() {
        return this.l;
    }

    @WorkerThread
    public void c(final int i) {
        ((aix) this.h.get(i)).a(new c(this) {
            final /* synthetic */ aic$c b;

            public void a() {
                if (this.b.d.isEmpty()) {
                    this.b.a(i, false);
                }
            }
        });
    }

    boolean d() {
        return this.e.t();
    }
}
