package com.google.android.gms.internal;

public class lp extends lb {
    private static final lp a = new lp();

    private lp() {
    }

    public static lp d() {
        return a;
    }

    public int a(lg lgVar, lg lgVar2) {
        int compareTo = lgVar.d().compareTo(lgVar2.d());
        return compareTo == 0 ? lgVar.c().a(lgVar2.c()) : compareTo;
    }

    public lg a(kv kvVar, lh lhVar) {
        return new lg(kvVar, lhVar);
    }

    public boolean a(lh lhVar) {
        return true;
    }

    public lg b() {
        return new lg(kv.b(), lh.d);
    }

    public String c() {
        return ".value";
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return a((lg) obj, (lg) obj2);
    }

    public boolean equals(Object obj) {
        return obj instanceof lp;
    }

    public int hashCode() {
        return 4;
    }

    public String toString() {
        return "ValueIndex";
    }
}
