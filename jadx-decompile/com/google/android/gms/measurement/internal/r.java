package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.internal.d;

abstract class r {
    private static volatile Handler b;
    private final aj a;
    private final Runnable c = new Runnable(this) {
        final /* synthetic */ r a;

        {
            this.a = r1;
        }

        public void run() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.a.a.h().a((Runnable) this);
                return;
            }
            boolean b = this.a.b();
            this.a.d = 0;
            if (b && this.a.e) {
                this.a.a();
            }
        }
    };
    private volatile long d;
    private boolean e = true;

    r(aj ajVar) {
        d.a(ajVar);
        this.a = ajVar;
    }

    private Handler d() {
        if (b != null) {
            return b;
        }
        Handler handler;
        synchronized (r.class) {
            if (b == null) {
                b = new Handler(this.a.r().getMainLooper());
            }
            handler = b;
        }
        return handler;
    }

    public abstract void a();

    public void a(long j) {
        c();
        if (j >= 0) {
            this.d = this.a.s().a();
            if (!d().postDelayed(this.c, j)) {
                this.a.f().f().a("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    public boolean b() {
        return this.d != 0;
    }

    public void c() {
        this.d = 0;
        d().removeCallbacks(this.c);
    }
}
