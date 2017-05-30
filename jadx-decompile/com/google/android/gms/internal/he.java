package com.google.android.gms.internal;

import java.util.Comparator;

public interface he<K, V> {

    public enum a {
        RED,
        BLACK
    }

    public static abstract class b<K, V> {
        public abstract void a(K k, V v);
    }

    he<K, V> a(K k, V v, a aVar, he<K, V> heVar, he<K, V> heVar2);

    he<K, V> a(K k, V v, Comparator<K> comparator);

    he<K, V> a(K k, Comparator<K> comparator);

    void a(b<K, V> bVar);

    boolean b();

    boolean c();

    K d();

    V e();

    he<K, V> f();

    he<K, V> g();

    he<K, V> h();

    he<K, V> i();

    int j();
}
