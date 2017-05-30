package com.b.a.a.b.a;

import android.graphics.Bitmap;
import com.b.a.a.b.c;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class e implements c {
    private final c a;
    private final long b;
    private final Map<String, Long> c = Collections.synchronizedMap(new HashMap());

    public e(c cVar, long j) {
        this.a = cVar;
        this.b = 1000 * j;
    }

    public Bitmap a(String str) {
        Long l = (Long) this.c.get(str);
        if (l != null && System.currentTimeMillis() - l.longValue() > this.b) {
            this.a.b(str);
            this.c.remove(str);
        }
        return this.a.a(str);
    }

    public Collection<String> a() {
        return this.a.a();
    }

    public boolean a(String str, Bitmap bitmap) {
        boolean a = this.a.a(str, bitmap);
        if (a) {
            this.c.put(str, Long.valueOf(System.currentTimeMillis()));
        }
        return a;
    }

    public Bitmap b(String str) {
        this.c.remove(str);
        return this.a.b(str);
    }

    public void b() {
        this.a.b();
        this.c.clear();
    }
}
