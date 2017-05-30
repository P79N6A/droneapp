package com.google.android.gms.internal;

import com.google.firebase.database.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class kh {
    static final /* synthetic */ boolean a = (!kh.class.desiredAssertionStatus());
    private final kg b;
    private final kj c;
    private ki d;
    private final List<ie> e = new ArrayList();
    private final kd f;

    public static class a {
        public final List<kb> a;
        public final List<ka> b;

        public a(List<kb> list, List<ka> list2) {
            this.a = list;
            this.b = list2;
        }
    }

    public kh(kg kgVar, ki kiVar) {
        this.b = kgVar;
        kl klVar = new kl(kgVar.c());
        ko q = kgVar.b().q();
        this.c = new kj(q);
        jy c = kiVar.c();
        jy a = kiVar.a();
        lc a2 = lc.a(la.j(), kgVar.c());
        lc a3 = klVar.a(a2, c.d(), null);
        a2 = q.a(a2, a.d(), null);
        this.d = new ki(new jy(a2, a.a(), q.c()), new jy(a3, c.a(), klVar.c()));
        this.f = new kd(kgVar);
    }

    private List<kb> a(List<ka> list, lc lcVar, ie ieVar) {
        List list2;
        if (ieVar == null) {
            list2 = this.e;
        } else {
            list2 = Arrays.asList(new ie[]{ieVar});
        }
        return this.f.a((List) list, lcVar, list2);
    }

    public kg a() {
        return this.b;
    }

    public a a(jh jhVar, jc jcVar, lh lhVar) {
        if (jhVar.e() == com.google.android.gms.internal.jh.a.Merge && jhVar.d().d() != null) {
            if (!a && this.d.d() == null) {
                throw new AssertionError("We should always have a full cache before handling merges");
            } else if (!a && this.d.b() == null) {
                throw new AssertionError("Missing event cache, even though we have a server cache");
            }
        }
        ki kiVar = this.d;
        com.google.android.gms.internal.kj.a a = this.c.a(kiVar, jhVar, jcVar, lhVar);
        if (a || a.a.c().a() || !kiVar.c().a()) {
            this.d = a.a;
            return new a(a(a.b, a.a.a().d(), null), a.b);
        }
        throw new AssertionError("Once a server snap is complete, it should never go back");
    }

    public lh a(ij ijVar) {
        lh d = this.d.d();
        return (d == null || (!this.b.e() && (ijVar.h() || d.c(ijVar.d()).b()))) ? null : d.a(ijVar);
    }

    public List<kc> a(ie ieVar, c cVar) {
        List<kc> list;
        if (cVar != null) {
            List<kc> arrayList = new ArrayList();
            if (a || ieVar == null) {
                ij a = this.b.a();
                for (ie jzVar : this.e) {
                    ie jzVar2;
                    arrayList.add(new jz(jzVar2, cVar, a));
                }
                list = arrayList;
            } else {
                throw new AssertionError("A cancel should cancel all event registrations");
            }
        }
        list = Collections.emptyList();
        if (ieVar != null) {
            int i = 0;
            int i2 = -1;
            while (i < this.e.size()) {
                jzVar2 = (ie) this.e.get(i);
                if (jzVar2.a(ieVar)) {
                    if (jzVar2.c()) {
                        break;
                    }
                    i2 = i;
                }
                i++;
            }
            i = i2;
            if (i != -1) {
                jzVar2 = (ie) this.e.get(i);
                this.e.remove(i);
                jzVar2.b();
            }
        } else {
            for (ie jzVar22 : this.e) {
                jzVar22.b();
            }
            this.e.clear();
        }
        return list;
    }

    public void a(ie ieVar) {
        this.e.add(ieVar);
    }

    public lh b() {
        return this.d.c().c();
    }

    public List<kb> b(ie ieVar) {
        jy a = this.d.a();
        List arrayList = new ArrayList();
        for (lg lgVar : a.c()) {
            arrayList.add(ka.a(lgVar.c(), lgVar.d()));
        }
        if (a.a()) {
            arrayList.add(ka.a(a.d()));
        }
        return a(arrayList, a.d(), ieVar);
    }

    public lh c() {
        return this.d.a().c();
    }

    public boolean d() {
        return this.e.isEmpty();
    }
}
