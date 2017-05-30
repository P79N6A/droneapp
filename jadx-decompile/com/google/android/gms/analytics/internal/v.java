package com.google.android.gms.analytics.internal;

import android.content.Context;
import com.google.android.gms.analytics.c;
import com.google.android.gms.analytics.p;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import java.lang.Thread.UncaughtExceptionHandler;

public class v {
    private static volatile v a;
    private final Context b;
    private final Context c;
    private final e d;
    private final ah e;
    private final g f;
    private final p g;
    private final r h;
    private final al i;
    private final q j;
    private final j k;
    private final c l;
    private final ad m;
    private final a n;
    private final aa o;
    private final ak p;

    protected v(w wVar) {
        Context a = wVar.a();
        d.a((Object) a, (Object) "Application context can't be null");
        Object b = wVar.b();
        d.a(b);
        this.b = a;
        this.c = b;
        this.d = wVar.h(this);
        this.e = wVar.g(this);
        g f = wVar.f(this);
        f.E();
        this.f = f;
        String str;
        if (e().a()) {
            f = f();
            str = u.a;
            f.s(new StringBuilder(String.valueOf(str).length() + 33).append("Google Analytics ").append(str).append(" is starting up.").toString());
        } else {
            f = f();
            str = u.a;
            f.s(new StringBuilder(String.valueOf(str).length() + 134).append("Google Analytics ").append(str).append(" is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4").toString());
        }
        j q = wVar.q(this);
        q.E();
        this.k = q;
        q e = wVar.e(this);
        e.E();
        this.j = e;
        r l = wVar.l(this);
        ad d = wVar.d(this);
        a c = wVar.c(this);
        aa b2 = wVar.b(this);
        ak a2 = wVar.a(this);
        p a3 = wVar.a(a);
        a3.a(a());
        this.g = a3;
        c i = wVar.i(this);
        d.E();
        this.m = d;
        c.E();
        this.n = c;
        b2.E();
        this.o = b2;
        a2.E();
        this.p = a2;
        al p = wVar.p(this);
        p.E();
        this.i = p;
        l.E();
        this.h = l;
        if (e().a()) {
            f().b("Device AnalyticsService version", u.a);
        }
        i.a();
        this.l = i;
        l.b();
    }

    public static v a(Context context) {
        d.a((Object) context);
        if (a == null) {
            synchronized (v.class) {
                if (a == null) {
                    e d = h.d();
                    long b = d.b();
                    v vVar = new v(new w(context));
                    a = vVar;
                    c.d();
                    b = d.b() - b;
                    long longValue = ((Long) ao.Q.a()).longValue();
                    if (b > longValue) {
                        vVar.f().c("Slow initialization (ms)", Long.valueOf(b), Long.valueOf(longValue));
                    }
                }
            }
        }
        return a;
    }

    private void a(t tVar) {
        d.a((Object) tVar, (Object) "Analytics service not created/initialized");
        d.b(tVar.C(), "Analytics service not initialized");
    }

    protected UncaughtExceptionHandler a() {
        return new UncaughtExceptionHandler(this) {
            final /* synthetic */ v a;

            {
                this.a = r1;
            }

            public void uncaughtException(Thread thread, Throwable th) {
                g g = this.a.g();
                if (g != null) {
                    g.e("Job execution failed", th);
                }
            }
        };
    }

    public Context b() {
        return this.b;
    }

    public Context c() {
        return this.c;
    }

    public e d() {
        return this.d;
    }

    public ah e() {
        return this.e;
    }

    public g f() {
        a(this.f);
        return this.f;
    }

    public g g() {
        return this.f;
    }

    public p h() {
        d.a(this.g);
        return this.g;
    }

    public r i() {
        a(this.h);
        return this.h;
    }

    public al j() {
        a(this.i);
        return this.i;
    }

    public c k() {
        d.a(this.l);
        d.b(this.l.c(), "Analytics instance not initialized");
        return this.l;
    }

    public q l() {
        a(this.j);
        return this.j;
    }

    public j m() {
        a(this.k);
        return this.k;
    }

    public j n() {
        return (this.k == null || !this.k.C()) ? null : this.k;
    }

    public a o() {
        a(this.n);
        return this.n;
    }

    public ad p() {
        a(this.m);
        return this.m;
    }

    public aa q() {
        a(this.o);
        return this.o;
    }

    public ak r() {
        return this.p;
    }

    public void s() {
        p.d();
    }
}
