package com.google.android.gms.games.a;

import com.google.android.gms.common.internal.c;
import com.google.android.gms.games.internal.b.h;
import com.google.android.gms.games.internal.b.x;

public final class k implements j {
    private final int j;
    private final int k;
    private final boolean l;
    private final long m;
    private final String n;
    private final long o;
    private final String p;
    private final String q;
    private final long r;
    private final String s;
    private final String t;
    private final String u;

    public k(j jVar) {
        this.j = jVar.c();
        this.k = jVar.d();
        this.l = jVar.e();
        this.m = jVar.f();
        this.n = jVar.g();
        this.o = jVar.h();
        this.p = jVar.i();
        this.q = jVar.j();
        this.r = jVar.k();
        this.s = jVar.l();
        this.t = jVar.m();
        this.u = jVar.n();
    }

    static int a(j jVar) {
        return c.a(new Object[]{Integer.valueOf(jVar.c()), Integer.valueOf(jVar.d()), Boolean.valueOf(jVar.e()), Long.valueOf(jVar.f()), jVar.g(), Long.valueOf(jVar.h()), jVar.i(), Long.valueOf(jVar.k()), jVar.l(), jVar.n(), jVar.m()});
    }

    static boolean a(j jVar, Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (jVar == obj) {
            return true;
        }
        j jVar2 = (j) obj;
        return c.a(Integer.valueOf(jVar2.c()), Integer.valueOf(jVar.c())) && c.a(Integer.valueOf(jVar2.d()), Integer.valueOf(jVar.d())) && c.a(Boolean.valueOf(jVar2.e()), Boolean.valueOf(jVar.e())) && c.a(Long.valueOf(jVar2.f()), Long.valueOf(jVar.f())) && c.a(jVar2.g(), jVar.g()) && c.a(Long.valueOf(jVar2.h()), Long.valueOf(jVar.h())) && c.a(jVar2.i(), jVar.i()) && c.a(Long.valueOf(jVar2.k()), Long.valueOf(jVar.k())) && c.a(jVar2.l(), jVar.l()) && c.a(jVar2.n(), jVar.n()) && c.a(jVar2.m(), jVar.m());
    }

    static String b(j jVar) {
        return c.a(jVar).a("TimeSpan", x.a(jVar.c())).a("Collection", h.a(jVar.d())).a("RawPlayerScore", jVar.e() ? Long.valueOf(jVar.f()) : "none").a("DisplayPlayerScore", jVar.e() ? jVar.g() : "none").a("PlayerRank", jVar.e() ? Long.valueOf(jVar.h()) : "none").a("DisplayPlayerRank", jVar.e() ? jVar.i() : "none").a("NumScores", Long.valueOf(jVar.k())).a("TopPageNextToken", jVar.l()).a("WindowPageNextToken", jVar.n()).a("WindowPagePrevToken", jVar.m()).toString();
    }

    public /* synthetic */ Object a() {
        return o();
    }

    public boolean b() {
        return true;
    }

    public int c() {
        return this.j;
    }

    public int d() {
        return this.k;
    }

    public boolean e() {
        return this.l;
    }

    public boolean equals(Object obj) {
        return a(this, obj);
    }

    public long f() {
        return this.m;
    }

    public String g() {
        return this.n;
    }

    public long h() {
        return this.o;
    }

    public int hashCode() {
        return a(this);
    }

    public String i() {
        return this.p;
    }

    public String j() {
        return this.q;
    }

    public long k() {
        return this.r;
    }

    public String l() {
        return this.s;
    }

    public String m() {
        return this.t;
    }

    public String n() {
        return this.u;
    }

    public j o() {
        return this;
    }

    public String toString() {
        return b(this);
    }
}
