package com.b.a.a.b;

import android.graphics.Bitmap;
import com.b.a.c.d;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class b extends a {
    private static final int a = 16;
    private static final int b = 16777216;
    private final int c;
    private final AtomicInteger d;
    private final List<Bitmap> e = Collections.synchronizedList(new LinkedList());

    public b(int i) {
        this.c = i;
        this.d = new AtomicInteger();
        if (i > 16777216) {
            d.c("You set too large memory cache size (more than %1$d Mb)", Integer.valueOf(16));
        }
    }

    public boolean a(String str, Bitmap bitmap) {
        boolean z = false;
        int b = b(bitmap);
        int c = c();
        int i = this.d.get();
        if (b < c) {
            int i2 = i;
            while (i2 + b > c) {
                Bitmap d = d();
                if (this.e.remove(d)) {
                    i2 = this.d.addAndGet(-b(d));
                }
            }
            this.e.add(bitmap);
            this.d.addAndGet(b);
            z = true;
        }
        super.a(str, bitmap);
        return z;
    }

    protected abstract int b(Bitmap bitmap);

    public Bitmap b(String str) {
        Bitmap a = super.a(str);
        if (a != null && this.e.remove(a)) {
            this.d.addAndGet(-b(a));
        }
        return super.b(str);
    }

    public void b() {
        this.e.clear();
        this.d.set(0);
        super.b();
    }

    protected int c() {
        return this.c;
    }

    protected abstract Bitmap d();
}
