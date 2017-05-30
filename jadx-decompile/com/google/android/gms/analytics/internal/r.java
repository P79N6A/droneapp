package com.google.android.gms.analytics.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.analytics.p;
import com.google.android.gms.common.internal.d;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class r extends t {
    private final ab a;

    public r(v vVar, w wVar) {
        super(vVar);
        d.a((Object) wVar);
        this.a = wVar.j(vVar);
    }

    public long a(x xVar) {
        D();
        d.a((Object) xVar);
        m();
        long a = this.a.a(xVar, true);
        if (a == 0) {
            this.a.a(xVar);
        }
        return a;
    }

    protected void a() {
        this.a.E();
    }

    public void a(final int i) {
        D();
        b("setLocalDispatchPeriod (sec)", Integer.valueOf(i));
        r().a(new Runnable(this) {
            final /* synthetic */ r b;

            public void run() {
                this.b.a.a(((long) i) * 1000);
            }
        });
    }

    public void a(final am amVar) {
        D();
        r().a(new Runnable(this) {
            final /* synthetic */ r b;

            public void run() {
                this.b.a.a(amVar);
            }
        });
    }

    public void a(final c cVar) {
        d.a((Object) cVar);
        D();
        b("Hit delivery requested", cVar);
        r().a(new Runnable(this) {
            final /* synthetic */ r b;

            public void run() {
                this.b.a.a(cVar);
            }
        });
    }

    public void a(final String str, final Runnable runnable) {
        d.a(str, (Object) "campaign param can't be empty");
        r().a(new Runnable(this) {
            final /* synthetic */ r c;

            public void run() {
                this.c.a.a(str);
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
    }

    public void a(final boolean z) {
        a("Network connectivity status changed", Boolean.valueOf(z));
        r().a(new Runnable(this) {
            final /* synthetic */ r b;

            public void run() {
                this.b.a.a(z);
            }
        });
    }

    public void b() {
        this.a.b();
    }

    public void c() {
        D();
        l();
        r().a(new Runnable(this) {
            final /* synthetic */ r a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.a.h();
            }
        });
    }

    public void d() {
        D();
        Context o = o();
        if (k.a(o) && l.a(o)) {
            Intent intent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            intent.setComponent(new ComponentName(o, "com.google.android.gms.analytics.AnalyticsService"));
            o.startService(intent);
            return;
        }
        a(null);
    }

    public boolean e() {
        D();
        try {
            r().a(new Callable<Void>(this) {
                final /* synthetic */ r a;

                {
                    this.a = r1;
                }

                public Void a() {
                    this.a.a.F();
                    return null;
                }

                public /* synthetic */ Object call() {
                    return a();
                }
            }).get(4, TimeUnit.SECONDS);
            return true;
        } catch (InterruptedException e) {
            d("syncDispatchLocalHits interrupted", e);
            return false;
        } catch (ExecutionException e2) {
            e("syncDispatchLocalHits failed", e2);
            return false;
        } catch (TimeoutException e3) {
            d("syncDispatchLocalHits timed out", e3);
            return false;
        }
    }

    public void f() {
        D();
        p.d();
        this.a.f();
    }

    public void g() {
        q("Radio powered up");
        d();
    }

    void h() {
        m();
        this.a.e();
    }

    void i() {
        m();
        this.a.d();
    }
}
