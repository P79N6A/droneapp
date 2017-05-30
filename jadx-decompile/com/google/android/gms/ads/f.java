package com.google.android.gms.ads;

import android.content.Context;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.ads.b.c;
import com.google.android.gms.ads.internal.client.a;
import com.google.android.gms.ads.internal.client.g;
import com.google.android.gms.ads.purchase.b;
import com.google.android.gms.ads.purchase.d;

public final class f {
    private final g a;

    public f(Context context) {
        this.a = new g(context);
    }

    public a a() {
        return this.a.a();
    }

    public void a(a aVar) {
        this.a.a(aVar);
        if (aVar != null && (aVar instanceof a)) {
            this.a.a((a) aVar);
        } else if (aVar == null) {
            this.a.a(null);
        }
    }

    public void a(c cVar) {
        this.a.a(cVar);
    }

    @RequiresPermission("android.permission.INTERNET")
    public void a(c cVar) {
        this.a.a(cVar.f());
    }

    public void a(b bVar) {
        this.a.a(bVar);
    }

    public void a(d dVar, String str) {
        this.a.a(dVar, str);
    }

    public void a(String str) {
        this.a.a(str);
    }

    public void a(boolean z) {
        this.a.a(z);
    }

    public String b() {
        return this.a.b();
    }

    public b c() {
        return this.a.d();
    }

    public boolean d() {
        return this.a.f();
    }

    public boolean e() {
        return this.a.g();
    }

    public String f() {
        return this.a.h();
    }

    public void g() {
        this.a.i();
    }
}
