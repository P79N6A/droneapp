package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import android.util.Pair;
import com.google.android.gms.common.api.a.a;
import com.google.android.gms.common.api.a.c;
import com.google.android.gms.common.api.a.f;
import com.google.android.gms.common.api.a.i;
import com.google.android.gms.common.api.g.b;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.g.g;
import com.google.android.gms.internal.ahh;
import com.google.android.gms.internal.ahl;
import com.google.android.gms.internal.aic;
import com.google.android.gms.internal.aid;
import com.google.android.gms.internal.aim;
import com.google.android.gms.internal.aiv;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class u<O extends a> {
    private final Context a;
    private final aim b;
    private final a<O> c;
    private final O d;
    private final ahh<O> e;
    private final Looper f;
    private final int g;
    private final aic h;
    private final g i;
    private final AtomicBoolean j;
    private final AtomicInteger k;
    private f l;

    public u(@NonNull Context context, a<O> aVar, O o) {
        this(context, aVar, o, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
    }

    public u(@NonNull Context context, a<O> aVar, O o, Looper looper) {
        this.j = new AtomicBoolean(false);
        this.k = new AtomicInteger(0);
        d.a((Object) context, (Object) "Null context is not permitted.");
        d.a((Object) aVar, (Object) "Api must not be null.");
        d.a((Object) looper, (Object) "Looper must not be null.");
        this.a = context.getApplicationContext();
        this.c = aVar;
        this.d = o;
        this.f = looper;
        this.b = new aim();
        this.e = ahh.a(this.c, this.d);
        this.i = new aid(this);
        Pair a = aic.a(this.a, this);
        this.h = (aic) a.first;
        this.g = ((Integer) a.second).intValue();
    }

    private <TResult, A extends c> com.google.android.gms.g.f<TResult> a(int i, @NonNull aiv<A, TResult> com_google_android_gms_internal_aiv_A__TResult) {
        g gVar = new g();
        this.h.a(this, i, com_google_android_gms_internal_aiv_A__TResult, gVar);
        return gVar.a();
    }

    private <A extends c, T extends ahl.a<? extends m, A>> T a(int i, @NonNull T t) {
        t.l();
        this.h.a(this, i, (ahl.a) t);
        return t;
    }

    @WorkerThread
    public f a(Looper looper, b bVar, g.c cVar) {
        if (!d()) {
            if (this.c.e()) {
                i c = this.c.c();
                this.l = new com.google.android.gms.common.internal.i(this.a, looper, c.b(), bVar, cVar, s.a(this.a), c.b(this.d));
            } else {
                this.l = this.c.b().a(this.a, looper, s.a(this.a), this.d, bVar, cVar);
            }
        }
        return this.l;
    }

    public <TResult, A extends c> com.google.android.gms.g.f<TResult> a(aiv<A, TResult> com_google_android_gms_internal_aiv_A__TResult) {
        return a(0, (aiv) com_google_android_gms_internal_aiv_A__TResult);
    }

    public <A extends c, T extends ahl.a<? extends m, A>> T a(@NonNull T t) {
        return a(0, (ahl.a) t);
    }

    public void a() {
        boolean z = true;
        if (!this.j.getAndSet(true)) {
            this.b.a();
            aic com_google_android_gms_internal_aic = this.h;
            int i = this.g;
            if (this.k.get() <= 0) {
                z = false;
            }
            com_google_android_gms_internal_aic.a(i, z);
        }
    }

    public <TResult, A extends c> com.google.android.gms.g.f<TResult> b(aiv<A, TResult> com_google_android_gms_internal_aiv_A__TResult) {
        return a(1, (aiv) com_google_android_gms_internal_aiv_A__TResult);
    }

    public <A extends c, T extends ahl.a<? extends m, A>> T b(@NonNull T t) {
        return a(1, (ahl.a) t);
    }

    public void b() {
        this.k.incrementAndGet();
    }

    public void c() {
        if (this.k.decrementAndGet() == 0 && this.j.get()) {
            this.h.a(this.g, false);
        }
    }

    public boolean d() {
        return this.l != null;
    }

    public ahh<O> e() {
        return this.e;
    }

    public int f() {
        return this.g;
    }

    public g g() {
        return this.i;
    }

    public Looper h() {
        return this.f;
    }
}
