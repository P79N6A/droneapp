package org.c.b.a;

import java.util.Arrays;
import org.c.e.l;
import org.c.f.a.h;

public class a extends h {
    private final boolean a;

    public a(boolean z) {
        this.a = z;
    }

    protected f a() {
        return new f();
    }

    public l a(Class<?> cls) {
        for (h c : Arrays.asList(new h[]{d(), c(), e(), b(), a()})) {
            l c2 = c.c(cls);
            if (c2 != null) {
                return c2;
            }
        }
        return null;
    }

    protected e b() {
        return new e();
    }

    protected b c() {
        return new b(this);
    }

    protected c d() {
        return new c();
    }

    protected h e() {
        return this.a ? new h() : new g();
    }
}
