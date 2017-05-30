package com.google.android.gms.internal;

import com.google.android.gms.internal.he.a;

public class hc<K, V> extends hg<K, V> {
    hc(K k, V v, he<K, V> heVar, he<K, V> heVar2) {
        super(k, v, heVar, heVar2);
    }

    protected a a() {
        return a.BLACK;
    }

    protected hg<K, V> a(K k, V v, he<K, V> heVar, he<K, V> heVar2) {
        Object d;
        Object e;
        he f;
        he g;
        if (k == null) {
            d = d();
        }
        if (v == null) {
            e = e();
        }
        if (heVar == null) {
            f = f();
        }
        if (heVar2 == null) {
            g = g();
        }
        return new hc(d, e, f, g);
    }

    public boolean b() {
        return false;
    }
}
