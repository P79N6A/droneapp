package com.google.android.gms.internal;

import com.google.android.gms.internal.ko.a;
import java.util.Iterator;

public class kp implements ko {
    private final kl a;
    private final lb b;
    private final lg c;
    private final lg d;

    public kp(kf kfVar) {
        this.a = new kl(kfVar.j());
        this.b = kfVar.j();
        this.c = a(kfVar);
        this.d = b(kfVar);
    }

    private static lg a(kf kfVar) {
        if (!kfVar.a()) {
            return kfVar.j().a();
        }
        return kfVar.j().a(kfVar.c(), kfVar.b());
    }

    private static lg b(kf kfVar) {
        if (!kfVar.d()) {
            return kfVar.j().b();
        }
        return kfVar.j().a(kfVar.f(), kfVar.e());
    }

    public ko a() {
        return this.a;
    }

    public lc a(lc lcVar, kv kvVar, lh lhVar, ij ijVar, a aVar, kk kkVar) {
        return this.a.a(lcVar, kvVar, !a(new lg(kvVar, lhVar)) ? la.j() : lhVar, ijVar, aVar, kkVar);
    }

    public lc a(lc lcVar, lc lcVar2, kk kkVar) {
        lc a;
        if (lcVar2.a().e()) {
            a = lc.a(la.j(), this.b);
        } else {
            lc b = lcVar2.b(ll.a());
            Iterator it = lcVar2.iterator();
            a = b;
            while (it.hasNext()) {
                lg lgVar = (lg) it.next();
                a = !a(lgVar) ? a.a(lgVar.c(), la.j()) : a;
            }
        }
        return this.a.a(lcVar, a, kkVar);
    }

    public lc a(lc lcVar, lh lhVar) {
        return lcVar;
    }

    public boolean a(lg lgVar) {
        return this.b.compare(d(), lgVar) <= 0 && this.b.compare(lgVar, e()) <= 0;
    }

    public lb b() {
        return this.b;
    }

    public boolean c() {
        return true;
    }

    public lg d() {
        return this.c;
    }

    public lg e() {
        return this.d;
    }
}
