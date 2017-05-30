package com.google.android.gms.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public abstract class le<T extends le> implements lh {
    static final /* synthetic */ boolean c = (!le.class.desiredAssertionStatus());
    private String a;
    protected final lh b;

    protected enum a {
        DeferredValue,
        Boolean,
        Number,
        String
    }

    le(lh lhVar) {
        this.b = lhVar;
    }

    private static int a(lf lfVar, kz kzVar) {
        return Double.valueOf((double) ((Long) lfVar.a()).longValue()).compareTo((Double) kzVar.a());
    }

    protected abstract int a(T t);

    public lh a(ij ijVar) {
        return ijVar.h() ? this : ijVar.d().f() ? this.b : la.j();
    }

    public lh a(ij ijVar, lh lhVar) {
        kv d = ijVar.d();
        if (d == null) {
            return lhVar;
        }
        if (lhVar.b() && !d.f()) {
            return this;
        }
        if (c || !ijVar.d().f() || ijVar.i() == 1) {
            return a(d, la.j().a(ijVar.e(), lhVar));
        }
        throw new AssertionError();
    }

    public lh a(kv kvVar, lh lhVar) {
        return kvVar.f() ? b(lhVar) : !lhVar.b() ? la.j().a(kvVar, lhVar).b(this.b) : this;
    }

    public Object a(boolean z) {
        if (!z || this.b.b()) {
            return a();
        }
        Map hashMap = new HashMap();
        hashMap.put(".value", a());
        hashMap.put(".priority", this.b.a());
        return hashMap;
    }

    public boolean a(kv kvVar) {
        return false;
    }

    protected int b(le<?> leVar) {
        a p_ = p_();
        Enum p_2 = leVar.p_();
        return p_.equals(p_2) ? a((le) leVar) : p_.compareTo(p_2);
    }

    public kv b(kv kvVar) {
        return null;
    }

    protected String b(com.google.android.gms.internal.lh.a aVar) {
        switch (aVar) {
            case V1:
            case V2:
                if (this.b.b()) {
                    return "";
                }
                String valueOf = String.valueOf(this.b.a(aVar));
                return new StringBuilder(String.valueOf(valueOf).length() + 10).append("priority:").append(valueOf).append(":").toString();
            default:
                String valueOf2 = String.valueOf(aVar);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf2).length() + 22).append("Unknown hash version: ").append(valueOf2).toString());
        }
    }

    public boolean b() {
        return false;
    }

    public int c() {
        return 0;
    }

    public int c(lh lhVar) {
        if (lhVar.b()) {
            return 1;
        }
        if (lhVar instanceof kw) {
            return -1;
        }
        if (c || lhVar.e()) {
            return ((this instanceof lf) && (lhVar instanceof kz)) ? a((lf) this, (kz) lhVar) : ((this instanceof kz) && (lhVar instanceof lf)) ? a((lf) lhVar, (kz) this) * -1 : b((le) lhVar);
        } else {
            throw new AssertionError("Node is not leaf node!");
        }
    }

    public lh c(kv kvVar) {
        return kvVar.f() ? this.b : la.j();
    }

    public /* synthetic */ int compareTo(Object obj) {
        return c((lh) obj);
    }

    public String d() {
        if (this.a == null) {
            this.a = mk.b(a(com.google.android.gms.internal.lh.a.V1));
        }
        return this.a;
    }

    public boolean e() {
        return true;
    }

    public lh f() {
        return this.b;
    }

    public Iterator<lg> i() {
        return Collections.emptyList().iterator();
    }

    public Iterator<lg> iterator() {
        return Collections.emptyList().iterator();
    }

    protected abstract a p_();

    public String toString() {
        String obj = a(true).toString();
        return obj.length() <= 100 ? obj : String.valueOf(obj.substring(0, 100)).concat("...");
    }
}
