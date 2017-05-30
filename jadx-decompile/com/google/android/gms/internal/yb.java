package com.google.android.gms.internal;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.internal.formats.c;
import com.google.android.gms.ads.mediation.k;
import com.google.android.gms.c.e;
import com.google.android.gms.c.f;
import com.google.android.gms.internal.xv.a;
import java.util.ArrayList;
import java.util.List;

@aaa
public class yb extends a {
    private final k a;

    public yb(k kVar) {
        this.a = kVar;
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

    public String f() {
        return this.a.j();
    }

    public void g() {
        this.a.d();
    }

    public boolean h() {
        return this.a.a();
    }

    public boolean i() {
        return this.a.b();
    }

    public Bundle j() {
        return this.a.c();
    }
}
