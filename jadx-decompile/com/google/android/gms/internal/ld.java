package com.google.android.gms.internal;

public class ld extends lb {
    static final /* synthetic */ boolean a = (!ld.class.desiredAssertionStatus());
    private static final ld b = new ld();

    private ld() {
    }

    public static ld d() {
        return b;
    }

    public int a(lg lgVar, lg lgVar2) {
        return lgVar.c().a(lgVar2.c());
    }

    public lg a(kv kvVar, lh lhVar) {
        if (a || (lhVar instanceof lo)) {
            return new lg(kv.a((String) lhVar.a()), la.j());
        }
        throw new AssertionError();
    }

    public boolean a(lh lhVar) {
        return true;
    }

    public lg b() {
        return lg.b();
    }

    public String c() {
        return ".key";
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return a((lg) obj, (lg) obj2);
    }

    public boolean equals(Object obj) {
        return obj instanceof ld;
    }

    public int hashCode() {
        return 37;
    }

    public String toString() {
        return "KeyIndex";
    }
}
