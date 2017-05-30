package com.google.android.gms.tagmanager;

import android.os.Build.VERSION;

class dj<K, V> {
    final a<K, V> a = new a<K, V>(this) {
        final /* synthetic */ dj a;

        {
            this.a = r1;
        }

        public int a(K k, V v) {
            return 1;
        }
    };

    public interface a<K, V> {
        int a(K k, V v);
    }

    int a() {
        return VERSION.SDK_INT;
    }

    public di<K, V> a(int i, a<K, V> aVar) {
        if (i > 0) {
            return a() < 12 ? new co(i, aVar) : new aq(i, aVar);
        } else {
            throw new IllegalArgumentException("maxSize <= 0");
        }
    }
}
