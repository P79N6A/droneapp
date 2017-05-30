package com.google.android.gms.internal;

import com.google.android.gms.internal.ju.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ia implements Iterable<Entry<ij, lh>> {
    static final /* synthetic */ boolean a = (!ia.class.desiredAssertionStatus());
    private static final ia b = new ia(new ju(null));
    private final ju<lh> c;

    private ia(ju<lh> juVar) {
        this.c = juVar;
    }

    public static ia a() {
        return b;
    }

    public static ia a(Map<String, Object> map) {
        ju a = ju.a();
        ju juVar = a;
        for (Entry entry : map.entrySet()) {
            juVar = juVar.a(new ij((String) entry.getKey()), new ju(li.a(entry.getValue())));
        }
        return new ia(juVar);
    }

    private lh a(ij ijVar, ju<lh> juVar, lh lhVar) {
        if (juVar.b() != null) {
            return lhVar.a(ijVar, (lh) juVar.b());
        }
        lh lhVar2 = null;
        Iterator it = juVar.c().iterator();
        lh lhVar3 = lhVar;
        while (it.hasNext()) {
            lh a;
            lh lhVar4;
            Entry entry = (Entry) it.next();
            ju juVar2 = (ju) entry.getValue();
            kv kvVar = (kv) entry.getKey();
            if (!kvVar.f()) {
                a = a(ijVar.a(kvVar), juVar2, lhVar3);
                lhVar4 = lhVar2;
            } else if (a || juVar2.b() != null) {
                lhVar4 = (lh) juVar2.b();
                a = lhVar3;
            } else {
                throw new AssertionError("Priority writes must always be leaf nodes");
            }
            lhVar2 = lhVar4;
            lhVar3 = a;
        }
        return (lhVar3.a(ijVar).b() || lhVar2 == null) ? lhVar3 : lhVar3.a(ijVar.a(kv.c()), lhVar2);
    }

    public static ia b(Map<ij, lh> map) {
        ju a = ju.a();
        ju juVar = a;
        for (Entry entry : map.entrySet()) {
            juVar = juVar.a((ij) entry.getKey(), new ju((lh) entry.getValue()));
        }
        return new ia(juVar);
    }

    public ia a(ij ijVar) {
        return ijVar.h() ? b : new ia(this.c.a(ijVar, ju.a()));
    }

    public ia a(final ij ijVar, ia iaVar) {
        return (ia) iaVar.c.a((Object) this, new a<lh, ia>(this) {
            final /* synthetic */ ia b;

            public ia a(ij ijVar, lh lhVar, ia iaVar) {
                return iaVar.a(ijVar.a(ijVar), lhVar);
            }
        });
    }

    public ia a(ij ijVar, lh lhVar) {
        if (ijVar.h()) {
            return new ia(new ju(lhVar));
        }
        ij a = this.c.a(ijVar);
        if (a != null) {
            ij a2 = ij.a(a, ijVar);
            lh lhVar2 = (lh) this.c.e(a);
            kv g = a2.g();
            if (g != null && g.f() && lhVar2.a(a2.f()).b()) {
                return this;
            }
            return new ia(this.c.a(a, lhVar2.a(a2, lhVar)));
        }
        return new ia(this.c.a(ijVar, new ju(lhVar)));
    }

    public ia a(kv kvVar, lh lhVar) {
        return a(new ij(kvVar), lhVar);
    }

    public lh a(lh lhVar) {
        return a(ij.a(), this.c, lhVar);
    }

    public Map<String, Object> a(final boolean z) {
        final Map<String, Object> hashMap = new HashMap();
        this.c.a(new a<lh, Void>(this) {
            final /* synthetic */ ia c;

            public Void a(ij ijVar, lh lhVar, Void voidR) {
                hashMap.put(ijVar.b(), lhVar.a(z));
                return null;
            }
        });
        return hashMap;
    }

    public lh b() {
        return (lh) this.c.b();
    }

    public boolean b(ij ijVar) {
        return c(ijVar) != null;
    }

    public lh c(ij ijVar) {
        ij a = this.c.a(ijVar);
        return a != null ? ((lh) this.c.e(a)).a(ij.a(a, ijVar)) : null;
    }

    public List<lg> c() {
        List<lg> arrayList = new ArrayList();
        if (this.c.b() != null) {
            for (lg lgVar : (lh) this.c.b()) {
                arrayList.add(new lg(lgVar.c(), lgVar.d()));
            }
        } else {
            Iterator it = this.c.c().iterator();
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                ju juVar = (ju) entry.getValue();
                if (juVar.b() != null) {
                    arrayList.add(new lg((kv) entry.getKey(), (lh) juVar.b()));
                }
            }
        }
        return arrayList;
    }

    public ia d(ij ijVar) {
        if (ijVar.h()) {
            return this;
        }
        lh c = c(ijVar);
        return c != null ? new ia(new ju(c)) : new ia(this.c.c(ijVar));
    }

    public Map<kv, ia> d() {
        Map<kv, ia> hashMap = new HashMap();
        Iterator it = this.c.c().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            hashMap.put((kv) entry.getKey(), new ia((ju) entry.getValue()));
        }
        return hashMap;
    }

    public boolean e() {
        return this.c.d();
    }

    public boolean equals(Object obj) {
        return obj == this ? true : (obj == null || obj.getClass() != getClass()) ? false : ((ia) obj).a(true).equals(a(true));
    }

    public int hashCode() {
        return a(true).hashCode();
    }

    public Iterator<Entry<ij, lh>> iterator() {
        return this.c.iterator();
    }

    public String toString() {
        String valueOf = String.valueOf(a(true).toString());
        return new StringBuilder(String.valueOf(valueOf).length() + 15).append("CompoundWrite{").append(valueOf).append("}").toString();
    }
}
