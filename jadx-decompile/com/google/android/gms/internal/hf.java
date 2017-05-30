package com.google.android.gms.internal;

import com.google.android.gms.internal.he.a;

public class hf<K, V> extends hg<K, V> {
    hf(K k, V v) {
        super(k, v, hd.a(), hd.a());
    }

    hf(K k, V v, he<K, V> heVar, he<K, V> heVar2) {
        super(k, v, heVar, heVar2);
    }

    protected a a() {
        return a.RED;
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
        return new hf(d, e, f, g);
    }

    public boolean b() {
        return true;
    }
}
