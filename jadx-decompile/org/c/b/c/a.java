package org.c.b.c;

import org.c.e.i;
import org.c.e.l;

public class a extends i {
    private final Object a;
    private final Class<?> b;
    private final boolean c;
    private volatile l d;

    public a(Class<?> cls) {
        this(cls, true);
    }

    public a(Class<?> cls, boolean z) {
        this.a = new Object();
        this.b = cls;
        this.c = z;
    }

    public l a() {
        if (this.d == null) {
            synchronized (this.a) {
                if (this.d == null) {
                    this.d = new org.c.b.a.a(this.c).c(this.b);
                }
            }
        }
        return this.d;
    }
}
