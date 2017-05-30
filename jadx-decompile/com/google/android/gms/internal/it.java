package com.google.android.gms.internal;

import com.google.android.gms.internal.kh.a;
import com.google.firebase.database.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class it {
    static final /* synthetic */ boolean a = (!it.class.desiredAssertionStatus());
    private final Map<kf, kh> b = new HashMap();
    private final jp c;

    public it(jp jpVar) {
        this.c = jpVar;
    }

    private List<kb> a(kh khVar, jh jhVar, jc jcVar, lh lhVar) {
        a a = khVar.a(jhVar, jcVar, lhVar);
        if (!khVar.a().e()) {
            Set hashSet = new HashSet();
            Set hashSet2 = new HashSet();
            for (ka kaVar : a.b) {
                kc.a b = kaVar.b();
                if (b == kc.a.CHILD_ADDED) {
                    hashSet2.add(kaVar.a());
                } else if (b == kc.a.CHILD_REMOVED) {
                    hashSet.add(kaVar.a());
                }
            }
            if (!(hashSet2.isEmpty() && hashSet.isEmpty())) {
                this.c.a(khVar.a(), hashSet2, hashSet);
            }
        }
        return a.a;
    }

    public kh a(kg kgVar) {
        return kgVar.e() ? d() : (kh) this.b.get(kgVar.b());
    }

    public lh a(ij ijVar) {
        for (kh khVar : this.b.values()) {
            if (khVar.a(ijVar) != null) {
                return khVar.a(ijVar);
            }
        }
        return null;
    }

    public mh<List<kg>, List<kc>> a(kg kgVar, ie ieVar, c cVar) {
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        boolean c = c();
        kh khVar;
        if (kgVar.d()) {
            Iterator it = this.b.entrySet().iterator();
            while (it.hasNext()) {
                khVar = (kh) ((Entry) it.next()).getValue();
                arrayList2.addAll(khVar.a(ieVar, cVar));
                if (khVar.d()) {
                    it.remove();
                    if (!khVar.a().e()) {
                        arrayList.add(khVar.a());
                    }
                }
            }
        } else {
            khVar = (kh) this.b.get(kgVar.b());
            if (khVar != null) {
                arrayList2.addAll(khVar.a(ieVar, cVar));
                if (khVar.d()) {
                    this.b.remove(kgVar.b());
                    if (!khVar.a().e()) {
                        arrayList.add(khVar.a());
                    }
                }
            }
        }
        if (c && !c()) {
            arrayList.add(kg.a(kgVar.a()));
        }
        return new mh(arrayList, arrayList2);
    }

    public List<kb> a(ie ieVar, jc jcVar, jy jyVar) {
        kg a = ieVar.a();
        kh khVar = (kh) this.b.get(a.b());
        if (khVar == null) {
            boolean z;
            lh a2 = jcVar.a(jyVar.a() ? jyVar.c() : null);
            if (a2 != null) {
                z = true;
            } else {
                a2 = jcVar.b(jyVar.c());
                z = false;
            }
            kh khVar2 = new kh(a, new ki(new jy(lc.a(a2, a.c()), z, false), jyVar));
            if (!a.e()) {
                Set hashSet = new HashSet();
                for (lg c : khVar2.c()) {
                    hashSet.add(c.c());
                }
                this.c.a(a, hashSet);
            }
            this.b.put(a.b(), khVar2);
            khVar = khVar2;
        }
        khVar.a(ieVar);
        return khVar.b(ieVar);
    }

    public List<kb> a(jh jhVar, jc jcVar, lh lhVar) {
        kf d = jhVar.d().d();
        if (d != null) {
            kh khVar = (kh) this.b.get(d);
            if (a || khVar != null) {
                return a(khVar, jhVar, jcVar, lhVar);
            }
            throw new AssertionError();
        }
        List<kb> arrayList = new ArrayList();
        for (Entry value : this.b.entrySet()) {
            arrayList.addAll(a((kh) value.getValue(), jhVar, jcVar, lhVar));
        }
        return arrayList;
    }

    public boolean a() {
        return this.b.isEmpty();
    }

    public List<kh> b() {
        List<kh> arrayList = new ArrayList();
        for (Entry value : this.b.entrySet()) {
            kh khVar = (kh) value.getValue();
            if (!khVar.a().e()) {
                arrayList.add(khVar);
            }
        }
        return arrayList;
    }

    public boolean b(kg kgVar) {
        return a(kgVar) != null;
    }

    public boolean c() {
        return d() != null;
    }

    public kh d() {
        for (Entry value : this.b.entrySet()) {
            kh khVar = (kh) value.getValue();
            if (khVar.a().e()) {
                return khVar;
            }
        }
        return null;
    }
}
