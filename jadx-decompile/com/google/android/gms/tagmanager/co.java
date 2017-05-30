package com.google.android.gms.tagmanager;

import com.google.android.gms.tagmanager.dj.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

class co<K, V> implements di<K, V> {
    private final Map<K, V> a = new HashMap();
    private final int b;
    private final a<K, V> c;
    private int d;

    co(int i, a<K, V> aVar) {
        this.b = i;
        this.c = aVar;
    }

    public synchronized V a(K k) {
        return this.a.get(k);
    }

    public synchronized void a(K k, V v) {
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        this.d += this.c.a(k, v);
        if (this.d > this.b) {
            Iterator it = this.a.entrySet().iterator();
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                this.d -= this.c.a(entry.getKey(), entry.getValue());
                it.remove();
                if (this.d <= this.b) {
                    break;
                }
            }
        }
        this.a.put(k, v);
    }
}
