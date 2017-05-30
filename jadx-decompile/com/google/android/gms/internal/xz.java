package com.google.android.gms.internal;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.internal.formats.c;
import com.google.android.gms.ads.mediation.j;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;
import com.google.android.gms.internal.xu.a;
import java.util.ArrayList;
import java.util.List;

@aaa
public class xz extends a {
    private final j a;

    public xz(j jVar) {
        this.a = jVar;
    }

    public String a() {
        return this.a.e();
    }

    public void a(e eVar) {
        this.a.c((View) f.a(eVar));
    }

    public List b() {
        List<com.google.android.gms.ads.formats.a.a> f = this.a.f();
        if (f == null) {
            return null;
        }
        List arrayList = new ArrayList();
        for (com.google.android.gms.ads.formats.a.a aVar : f) {
            arrayList.add(new c(aVar.a(), aVar.b(), aVar.c()));
        }
        return arrayList;
    }

    public void b(e eVar) {
        this.a.a((View) f.a(eVar));
    }

    public String c() {
        return this.a.g();
    }

    public void c(e eVar) {
        this.a.b((View) f.a(eVar));
    }

    public uu d() {
        com.google.android.gms.ads.formats.a.a h = this.a.h();
        return h != null ? new c(h.a(), h.b(), h.c()) : null;
    }

    public String e() {
        return this.a.i();
    }

    public double f() {
        return this.a.j();
    }

    public String g() {
        return this.a.k();
    }

    public String h() {
        return this.a.l();
    }

    public void i() {
        this.a.d();
    }

    public boolean j() {
        return this.a.a();
    }

    public boolean k() {
        return this.a.b();
    }

    public Bundle l() {
        return this.a.c();
    }

    public com.google.android.gms.ads.internal.client.c m() {
        return this.a.m() != null ? this.a.m().a() : null;
    }
}
