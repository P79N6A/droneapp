package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class lm {
    static final /* synthetic */ boolean a = (!lm.class.desiredAssertionStatus());
    private final ij b;
    private final ij c;
    private final lh d;

    public lm(ht htVar) {
        ij ijVar = null;
        List a = htVar.a();
        this.b = a != null ? new ij(a) : null;
        List b = htVar.b();
        if (b != null) {
            ijVar = new ij(b);
        }
        this.c = ijVar;
        this.d = li.a(htVar.c());
    }

    private lh a(ij ijVar, lh lhVar, lh lhVar2) {
        Object obj = 1;
        int c = this.b == null ? 1 : ijVar.c(this.b);
        int c2 = this.c == null ? -1 : ijVar.c(this.c);
        Object obj2 = (this.b == null || !ijVar.b(this.b)) ? null : 1;
        if (this.c == null || !ijVar.b(this.c)) {
            obj = null;
        }
        if (c > 0 && c2 < 0 && r1 == null) {
            return lhVar2;
        }
        if (c > 0 && r1 != null && lhVar2.e()) {
            return lhVar2;
        }
        if (c <= 0 || c2 != 0) {
            if (obj2 != null || r1 != null) {
                Collection hashSet = new HashSet();
                for (lg c3 : lhVar) {
                    hashSet.add(c3.c());
                }
                for (lg c32 : lhVar2) {
                    hashSet.add(c32.c());
                }
                List<kv> arrayList = new ArrayList(hashSet.size() + 1);
                arrayList.addAll(hashSet);
                if (!(lhVar2.f().b() && lhVar.f().b())) {
                    arrayList.add(kv.c());
                }
                lh lhVar3 = lhVar;
                for (kv kvVar : arrayList) {
                    lh c4 = lhVar.c(kvVar);
                    lh a = a(ijVar.a(kvVar), lhVar.c(kvVar), lhVar2.c(kvVar));
                    lhVar3 = a != c4 ? lhVar3.a(kvVar, a) : lhVar3;
                }
                return lhVar3;
            } else if (a || c2 > 0 || c <= 0) {
                return lhVar;
            } else {
                throw new AssertionError();
            }
        } else if (!a && r1 == null) {
            throw new AssertionError();
        } else if (a || !lhVar2.e()) {
            return lhVar.e() ? la.j() : lhVar;
        } else {
            throw new AssertionError();
        }
    }

    public lh a(lh lhVar) {
        return a(ij.a(), lhVar, this.d);
    }

    public String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        return new StringBuilder(((String.valueOf(valueOf).length() + 55) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("RangeMerge{optExclusiveStart=").append(valueOf).append(", optInclusiveEnd=").append(valueOf2).append(", snap=").append(valueOf3).append("}").toString();
    }
}
