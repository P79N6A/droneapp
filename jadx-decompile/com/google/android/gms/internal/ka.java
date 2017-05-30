package com.google.android.gms.internal;

import com.google.android.gms.internal.kc.a;

public class ka {
    private final a a;
    private final lc b;
    private final lc c;
    private final kv d;
    private final kv e;

    private ka(a aVar, lc lcVar, kv kvVar, kv kvVar2, lc lcVar2) {
        this.a = aVar;
        this.b = lcVar;
        this.d = kvVar;
        this.e = kvVar2;
        this.c = lcVar2;
    }

    public static ka a(kv kvVar, lc lcVar) {
        return new ka(a.CHILD_ADDED, lcVar, kvVar, null, null);
    }

    public static ka a(kv kvVar, lc lcVar, lc lcVar2) {
        return new ka(a.CHILD_CHANGED, lcVar, kvVar, null, lcVar2);
    }

    public static ka a(kv kvVar, lh lhVar) {
        return a(kvVar, lc.a(lhVar));
    }

    public static ka a(kv kvVar, lh lhVar, lh lhVar2) {
        return a(kvVar, lc.a(lhVar), lc.a(lhVar2));
    }

    public static ka a(lc lcVar) {
        return new ka(a.VALUE, lcVar, null, null, null);
    }

    public static ka b(kv kvVar, lc lcVar) {
        return new ka(a.CHILD_REMOVED, lcVar, kvVar, null, null);
    }

    public static ka b(kv kvVar, lh lhVar) {
        return b(kvVar, lc.a(lhVar));
    }

    public static ka c(kv kvVar, lc lcVar) {
        return new ka(a.CHILD_MOVED, lcVar, kvVar, null, null);
    }

    public ka a(kv kvVar) {
        return new ka(this.a, this.b, this.d, kvVar, this.c);
    }

    public kv a() {
        return this.d;
    }

    public a b() {
        return this.a;
    }

    public lc c() {
        return this.b;
    }

    public kv d() {
        return this.e;
    }

    public lc e() {
        return this.c;
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.d);
        return new StringBuilder((String.valueOf(valueOf).length() + 9) + String.valueOf(valueOf2).length()).append("Change: ").append(valueOf).append(" ").append(valueOf2).toString();
    }
}
