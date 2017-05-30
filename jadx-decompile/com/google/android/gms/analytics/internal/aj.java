package com.google.android.gms.analytics.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.internal.d;

abstract class aj {
    private static volatile Handler b;
    private final v a;
    private final Runnable c = new Runnable(this) {
        final /* synthetic */ aj a;

        {
            this.a = r1;
        }

        public void run() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.a.a.h().a((Runnable) this);
                return;
            }
            boolean c = this.a.c();
            this.a.d = 0;
            if (c && !false) {
                this.a.a();
            }
        }
    };
    private volatile long d;

    aj(v vVar) {
        d.a((Object) vVar);
        this.a = vVar;
    }

    private Handler e() {
        if (b != null) {
            return b;
        }
        Handler handler;
        synchronized (aj.class) {
            if (b == null) {
                b = new Handler(this.a.b().getMainLooper());
            }
            handler = b;
        }
        return handler;
    }

    public abstract void a();

    public void a(long j) {
        d();
        if (j >= 0) {
            this.d = this.a.d().a();
            if (!e().postDelayed(this.c, j)) {
                this.a.f().e("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    public long b() {
        return this.d == 0 ? 0 : Math.abs(this.a.d().a() - this.d);
    }

    public void b(long j) {
        long j2 = 0;
        if (!c()) {
            return;
        }
        if (j < 0) {
            d();
            return;
        }
        long abs = j - Math.abs(this.a.d().a() - this.d);
        if (abs >= 0) {
            j2 = abs;
        }
        e().removeCallbacks(this.c);
        if (!e().postDelayed(this.c, j2)) {
            this.a.f().e("Failed to adjust delayed post. time", Long.valueOf(j2));
        }
    }

    public boolean c() {
        return this.d != 0;
    }

    public void d() {
        this.d = 0;
        e().removeCallbacks(this.c);
    }
}
