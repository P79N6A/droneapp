package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a.c;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.j;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class aia implements ahp, aig {
    final Map<d<?>, f> a;
    final Map<d<?>, ConnectionResult> d = new HashMap();
    final s e;
    final Map<com.google.android.gms.common.api.a<?>, Integer> f;
    final com.google.android.gms.common.api.a.b<? extends aok, aom> g;
    int h;
    final ahy i;
    final com.google.android.gms.internal.aig.a j;
    private final Lock k;
    private final Condition l;
    private final Context m;
    private final j n;
    private final b o;
    private volatile ahz p;
    private ConnectionResult q = null;

    static abstract class a {
        private final ahz a;

        protected a(ahz com_google_android_gms_internal_ahz) {
            this.a = com_google_android_gms_internal_ahz;
        }

        protected abstract void a();

        public final void a(aia com_google_android_gms_internal_aia) {
            com_google_android_gms_internal_aia.k.lock();
            try {
                if (com_google_android_gms_internal_aia.p == this.a) {
                    a();
                    com_google_android_gms_internal_aia.k.unlock();
                }
            } finally {
                com_google_android_gms_internal_aia.k.unlock();
            }
        }
    }

    final class b extends Handler {
        final /* synthetic */ aia a;

        b(aia com_google_android_gms_internal_aia, Looper looper) {
            this.a = com_google_android_gms_internal_aia;
            super(looper);
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    ((a) message.obj).a(this.a);
                    return;
                case 2:
                    throw ((RuntimeException) message.obj);
                default:
                    Log.w("GACStateManager", "Unknown message id: " + message.what);
                    return;
            }
        }
    }

    public aia(Context context, ahy com_google_android_gms_internal_ahy, Lock lock, Looper looper, j jVar, Map<d<?>, f> map, s sVar, Map<com.google.android.gms.common.api.a<?>, Integer> map2, com.google.android.gms.common.api.a.b<? extends aok, aom> bVar, ArrayList<aho> arrayList, com.google.android.gms.internal.aig.a aVar) {
        this.m = context;
        this.k = lock;
        this.n = jVar;
        this.a = map;
        this.e = sVar;
        this.f = map2;
        this.g = bVar;
        this.i = com_google_android_gms_internal_ahy;
        this.j = aVar;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((aho) it.next()).a((ahp) this);
        }
        this.o = new b(this, looper);
        this.l = lock.newCondition();
        this.p = new ahx(this);
    }

    public ConnectionResult a(long j, TimeUnit timeUnit) {
        a();
        long toNanos = timeUnit.toNanos(j);
        while (e()) {
            if (toNanos <= 0) {
                try {
                    c();
                    return new ConnectionResult(14, null);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return new ConnectionResult(15, null);
                }
            }
            toNanos = this.l.awaitNanos(toNanos);
        }
        return d() ? ConnectionResult.v : this.q != null ? this.q : new ConnectionResult(13, null);
    }

    @Nullable
    public ConnectionResult a(@NonNull com.google.android.gms.common.api.a<?> aVar) {
        d d = aVar.d();
        if (this.a.containsKey(d)) {
            if (((f) this.a.get(d)).t()) {
                return ConnectionResult.v;
            }
            if (this.d.containsKey(d)) {
                return (ConnectionResult) this.d.get(d);
            }
        }
        return null;
    }

    public <A extends c, R extends m, T extends com.google.android.gms.internal.ahl.a<R, A>> T a(@NonNull T t) {
        t.l();
        return this.p.a((com.google.android.gms.internal.ahl.a) t);
    }

    public void a() {
        this.p.c();
    }

    public void a(int i) {
        this.k.lock();
        try {
            this.p.a(i);
        } finally {
            this.k.unlock();
        }
    }

    public void a(@Nullable Bundle bundle) {
        this.k.lock();
        try {
            this.p.a(bundle);
        } finally {
            this.k.unlock();
        }
    }

    void a(ConnectionResult connectionResult) {
        this.k.lock();
        try {
            this.q = connectionResult;
            this.p = new ahx(this);
            this.p.a();
            this.l.signalAll();
        } finally {
            this.k.unlock();
        }
    }

    public void a(@NonNull ConnectionResult connectionResult, @NonNull com.google.android.gms.common.api.a<?> aVar, int i) {
        this.k.lock();
        try {
            this.p.a(connectionResult, aVar, i);
        } finally {
            this.k.unlock();
        }
    }

    void a(a aVar) {
        this.o.sendMessage(this.o.obtainMessage(1, aVar));
    }

    void a(RuntimeException runtimeException) {
        this.o.sendMessage(this.o.obtainMessage(2, runtimeException));
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append(str).append("mState=").println(this.p);
        for (com.google.android.gms.common.api.a aVar : this.f.keySet()) {
            printWriter.append(str).append(aVar.f()).println(":");
            ((f) this.a.get(aVar.d())).a(concat, fileDescriptor, printWriter, strArr);
        }
    }

    public boolean a(ait com_google_android_gms_internal_ait) {
        return false;
    }

    public ConnectionResult b() {
        a();
        while (e()) {
            try {
                this.l.await();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        return d() ? ConnectionResult.v : this.q != null ? this.q : new ConnectionResult(13, null);
    }

    public <A extends c, T extends com.google.android.gms.internal.ahl.a<? extends m, A>> T b(@NonNull T t) {
        t.l();
        return this.p.b(t);
    }

    public void c() {
        if (this.p.b()) {
            this.d.clear();
        }
    }

    public boolean d() {
        return this.p instanceof ahv;
    }

    public boolean e() {
        return this.p instanceof ahw;
    }

    public void f() {
        if (d()) {
            ((ahv) this.p).d();
        }
    }

    public void g() {
    }

    void h() {
        this.k.lock();
        try {
            this.p = new ahw(this, this.e, this.f, this.n, this.g, this.k, this.m);
            this.p.a();
            this.l.signalAll();
        } finally {
            this.k.unlock();
        }
    }

    void i() {
        this.k.lock();
        try {
            this.i.o();
            this.p = new ahv(this);
            this.p.a();
            this.l.signalAll();
        } finally {
            this.k.unlock();
        }
    }

    void j() {
        for (f f : this.a.values()) {
            f.f();
        }
    }
}
