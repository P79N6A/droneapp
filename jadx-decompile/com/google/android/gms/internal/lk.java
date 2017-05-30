package com.google.android.gms.internal;

public class lk extends lb {
    private static final lk a = new lk();

    private lk() {
    }

    public static lk d() {
        return a;
    }

    public int a(lg lgVar, lg lgVar2) {
        return li.a(lgVar.c(), lgVar.d().f(), lgVar2.c(), lgVar2.d().f());
    }

    public lg a(kv kvVar, lh lhVar) {
        return new lg(kvVar, new lo("[PRIORITY-POST]", lhVar));
    }

    public boolean a(lh lhVar) {
        return !lhVar.f().b();
    }

    public lg b() {
        return a(kv.b(), lh.d);
    }

    public String c() {
        throw new IllegalArgumentException("Can't get query definition on priority index!");
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return a((lg) obj, (lg) obj2);
    }

    public boolean equals(Object obj) {
        return obj instanceof lk;
    }

    public int hashCode() {
        return 3155577;
    }

    public String toString() {
        return "PriorityIndex";
    }
}
