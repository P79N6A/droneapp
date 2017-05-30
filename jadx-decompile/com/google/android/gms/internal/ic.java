package com.google.android.gms.internal;

import com.google.android.gms.internal.kt.a;
import com.google.firebase.b;
import com.google.firebase.database.d;
import com.google.firebase.database.g;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

public class ic {
    protected kt a;
    protected ig b;
    protected hy c;
    protected ip d;
    protected String e;
    protected String f;
    protected a g = a.INFO;
    protected boolean h;
    protected long i = 10485760;
    protected b j;
    private boolean k = false;
    private boolean l = false;
    private il m;

    class AnonymousClass1 implements hm {
        final /* synthetic */ hy a;

        AnonymousClass1(hy hyVar) {
            this.a = hyVar;
        }

        public void a(boolean z, final hm.a aVar) {
            this.a.a(z, new hy.a(this) {
                final /* synthetic */ AnonymousClass1 b;

                public void a(String str) {
                    aVar.a(str);
                }

                public void b(String str) {
                    aVar.b(str);
                }
            });
        }
    }

    private void A() {
        if (this.e == null) {
            this.e = "default";
        }
    }

    private static hm a(hy hyVar) {
        return new AnonymousClass1(hyVar);
    }

    private String c(String str) {
        return "Firebase/" + "5" + "/" + g.g() + "/" + str;
    }

    private il q() {
        if (this.m == null) {
            if (lz.a()) {
                r();
            } else if (ih.a()) {
                il ilVar = ih.INSTANCE;
                ilVar.b();
                this.m = ilVar;
            } else {
                this.m = ii.INSTANCE;
            }
        }
        return this.m;
    }

    private synchronized void r() {
        this.m = new gw(this.j);
    }

    private void s() {
        v();
        q();
        y();
        x();
        w();
        A();
        z();
    }

    private void t() {
        this.b.b();
        this.d.d();
    }

    private ScheduledExecutorService u() {
        ip m = m();
        if (m instanceof me) {
            return ((me) m).e();
        }
        throw new RuntimeException("Custom run loops are not supported!");
    }

    private void v() {
        if (this.a == null) {
            this.a = q().a(this, this.g, null);
        }
    }

    private void w() {
        if (this.d == null) {
            this.d = this.m.b(this);
        }
    }

    private void x() {
        if (this.b == null) {
            this.b = q().a(this);
        }
    }

    private void y() {
        if (this.f == null) {
            this.f = c(q().c(this));
        }
    }

    private void z() {
        if (this.c == null) {
            this.c = q().a(u());
        }
    }

    public hr a(hp hpVar, hr.a aVar) {
        return q().a(this, i(), hpVar, aVar);
    }

    public ks a(String str) {
        return new ks(this.a, str);
    }

    public boolean a() {
        return this.k;
    }

    jp b(String str) {
        if (!this.h) {
            return new jo();
        }
        jp a = this.m.a(this, str);
        if (a != null) {
            return a;
        }
        throw new IllegalArgumentException("You have enabled persistence, but persistence is not supported on this platform.");
    }

    synchronized void b() {
        if (!this.k) {
            this.k = true;
            s();
        }
    }

    public void c() {
        if (this.l) {
            t();
            this.l = false;
        }
    }

    void d() {
        this.l = true;
        this.b.a();
        this.d.c();
    }

    protected void e() {
        if (a()) {
            throw new d("Modifications to DatabaseConfig objects must occur before they are in use");
        }
    }

    public List<String> f() {
        return null;
    }

    public a g() {
        return this.g;
    }

    public kt h() {
        return this.a;
    }

    public hn i() {
        return new hn(h(), a(p()), u(), j(), g.g(), n());
    }

    public boolean j() {
        return this.h;
    }

    public long k() {
        return this.i;
    }

    public ig l() {
        return this.b;
    }

    public ip m() {
        return this.d;
    }

    public String n() {
        return this.f;
    }

    public String o() {
        return this.e;
    }

    public hy p() {
        return this.c;
    }
}
