package com.google.android.gms.internal;

import java.util.Iterator;

public interface lh extends Comparable<lh>, Iterable<lg> {
    public static final kw d = new kw() {
        public int a(lh lhVar) {
            return lhVar == this ? 0 : 1;
        }

        public boolean a(kv kvVar) {
            return false;
        }

        public boolean b() {
            return false;
        }

        public lh c(kv kvVar) {
            return kvVar.f() ? f() : la.j();
        }

        public /* synthetic */ int compareTo(Object obj) {
            return a((lh) obj);
        }

        public boolean equals(Object obj) {
            return obj == this;
        }

        public lh f() {
            return this;
        }

        public String toString() {
            return "<Max Node>";
        }
    };

    public enum a {
        V1,
        V2
    }

    lh a(ij ijVar);

    lh a(ij ijVar, lh lhVar);

    lh a(kv kvVar, lh lhVar);

    Object a();

    Object a(boolean z);

    String a(a aVar);

    boolean a(kv kvVar);

    kv b(kv kvVar);

    lh b(lh lhVar);

    boolean b();

    int c();

    lh c(kv kvVar);

    String d();

    boolean e();

    lh f();

    Iterator<lg> i();
}
