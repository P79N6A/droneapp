package com.google.android.gms.internal;

public class lj extends lb {
    private final ij a;

    public lj(ij ijVar) {
        if (ijVar.i() == 1 && ijVar.d().f()) {
            throw new IllegalArgumentException("Can't create PathIndex with '.priority' as key. Please use PriorityIndex instead!");
        }
        this.a = ijVar;
    }

    public int a(lg lgVar, lg lgVar2) {
        int compareTo = lgVar.d().a(this.a).compareTo(lgVar2.d().a(this.a));
        return compareTo == 0 ? lgVar.c().a(lgVar2.c()) : compareTo;
    }

    public lg a(kv kvVar, lh lhVar) {
        return new lg(kvVar, la.j().a(this.a, lhVar));
    }

    public boolean a(lh lhVar) {
        return !lhVar.a(this.a).b();
    }

    public lg b() {
        return new lg(kv.b(), la.j().a(this.a, lh.d));
    }

    public String c() {
        return this.a.b();
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return a((lg) obj, (lg) obj2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((lj) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
