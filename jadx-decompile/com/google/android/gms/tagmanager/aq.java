package com.google.android.gms.tagmanager;

import android.annotation.TargetApi;
import android.util.LruCache;
import com.google.android.gms.tagmanager.dj.a;

@TargetApi(12)
class aq<K, V> implements di<K, V> {
    private LruCache<K, V> a;

    aq(int i, final a<K, V> aVar) {
        this.a = new LruCache<K, V>(this, i) {
            final /* synthetic */ aq b;

            protected int sizeOf(K k, V v) {
                return aVar.a(k, v);
            }
        };
    }

    public V a(K k) {
        return this.a.get(k);
    }

    public void a(K k, V v) {
        this.a.put(k, v);
    }
}
