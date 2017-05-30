package com.google.android.gms.internal;

import com.google.android.gms.internal.he.a;
import com.google.android.gms.internal.he.b;
import java.util.Comparator;

public class hd<K, V> implements he<K, V> {
    private static final hd a = new hd();

    private hd() {
    }

    public static <K, V> hd<K, V> a() {
        return a;
    }

    public he<K, V> a(K k, V v, a aVar, he<K, V> heVar, he<K, V> heVar2) {
        return this;
    }

    public he<K, V> a(K k, V v, Comparator<K> comparator) {
        return new hf(k, v);
    }

    public he<K, V> a(K k, Comparator<K> comparator) {
        return this;
    }

    public void a(b<K, V> bVar) {
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return true;
    }

    public K d() {
        return null;
    }

    public V e() {
        return null;
    }

    public he<K, V> f() {
        return this;
    }

    public he<K, V> g() {
        return this;
    }

    public he<K, V> h() {
        return this;
    }

    public he<K, V> i() {
        return this;
    }

    public int j() {
        return 0;
    }
}
