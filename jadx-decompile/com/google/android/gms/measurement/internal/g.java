package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.MainThread;
import android.support.annotation.WorkerThread;
import com.google.android.gms.common.util.e;
import com.tencent.mm.sdk.platformtools.Util;

public class g extends b {
    private Handler a;
    private long b;
    private final Runnable c = new Runnable(this) {
        final /* synthetic */ g a;

        {
            this.a = r1;
        }

        @MainThread
        public void run() {
            this.a.v().a(new Runnable(this) {
                final /* synthetic */ AnonymousClass1 a;

                {
                    this.a = r1;
                }

                public void run() {
                    this.a.a.z();
                }
            });
        }
    };
    private final r d = new r(this, this.n) {
        final /* synthetic */ g a;

        @WorkerThread
        public void a() {
            this.a.B();
        }
    };
    private final r e = new r(this, this.n) {
        final /* synthetic */ g a;

        @WorkerThread
        public void a() {
            this.a.C();
        }
    };

    g(aj ajVar) {
        super(ajVar);
    }

    private void A() {
        synchronized (this) {
            if (this.a == null) {
                this.a = new Handler(Looper.getMainLooper());
            }
        }
    }

    @WorkerThread
    private void B() {
        j();
        w().E().a("Session started, time", Long.valueOf(p().b()));
        x().j.a(false);
        l().a("auto", "_s", new Bundle());
    }

    @WorkerThread
    private void C() {
        j();
        long b = p().b();
        if (this.b == 0) {
            this.b = b - Util.MILLSECONDS_OF_HOUR;
        }
        long a = x().l.a() + (b - this.b);
        x().l.a(a);
        w().E().a("Recording user engagement, ms", Long.valueOf(a));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", a);
        l().a("auto", "_e", bundle);
        x().l.a(0);
        this.b = b;
        this.e.a(Math.max(0, Util.MILLSECONDS_OF_HOUR - x().l.a()));
    }

    @WorkerThread
    private void a(long j) {
        j();
        A();
        this.d.c();
        this.e.c();
        w().E().a("Activity resumed, time", Long.valueOf(j));
        this.b = j;
        if (p().a() - x().i.a() > x().k.a()) {
            x().j.a(true);
            x().l.a(0);
        }
        if (x().j.a()) {
            this.d.a(Math.max(0, x().h.a() - x().l.a()));
        } else {
            this.e.a(Math.max(0, Util.MILLSECONDS_OF_HOUR - x().l.a()));
        }
    }

    @WorkerThread
    private void b(long j) {
        j();
        A();
        this.d.c();
        this.e.c();
        w().E().a("Activity paused, time", Long.valueOf(j));
        if (this.b != 0) {
            x().l.a(x().l.a() + (j - this.b));
        }
        x().k.a(p().a());
        synchronized (this) {
            if (!x().j.a()) {
                this.a.postDelayed(this.c, 1000);
            }
        }
    }

    protected void e() {
    }

    @MainThread
    protected void f() {
        synchronized (this) {
            A();
            this.a.removeCallbacks(this.c);
        }
        final long b = p().b();
        v().a(new Runnable(this) {
            final /* synthetic */ g b;

            public void run() {
                this.b.a(b);
            }
        });
    }

    @MainThread
    protected void g() {
        final long b = p().b();
        v().a(new Runnable(this) {
            final /* synthetic */ g b;

            public void run() {
                this.b.b(b);
            }
        });
    }

    public /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    public /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    public /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    public /* bridge */ /* synthetic */ o k() {
        return super.k();
    }

    public /* bridge */ /* synthetic */ d l() {
        return super.l();
    }

    public /* bridge */ /* synthetic */ z m() {
        return super.m();
    }

    public /* bridge */ /* synthetic */ s n() {
        return super.n();
    }

    public /* bridge */ /* synthetic */ e o() {
        return super.o();
    }

    public /* bridge */ /* synthetic */ e p() {
        return super.p();
    }

    public /* bridge */ /* synthetic */ Context q() {
        return super.q();
    }

    public /* bridge */ /* synthetic */ q r() {
        return super.r();
    }

    public /* bridge */ /* synthetic */ m s() {
        return super.s();
    }

    public /* bridge */ /* synthetic */ ah t() {
        return super.t();
    }

    public /* bridge */ /* synthetic */ g u() {
        return super.u();
    }

    public /* bridge */ /* synthetic */ ai v() {
        return super.v();
    }

    public /* bridge */ /* synthetic */ ab w() {
        return super.w();
    }

    public /* bridge */ /* synthetic */ af x() {
        return super.x();
    }

    public /* bridge */ /* synthetic */ p y() {
        return super.y();
    }

    @WorkerThread
    public void z() {
        j();
        w().D().a("Application backgrounded. Logging engagement");
        long a = x().l.a();
        if (a > 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("_et", a);
            l().a("auto", "_e", bundle);
            x().l.a(0);
            return;
        }
        w().z().a("Not logging non-positive engagement time", Long.valueOf(a));
    }
}
