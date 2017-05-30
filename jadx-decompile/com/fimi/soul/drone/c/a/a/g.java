package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a;
import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class g<T extends a> extends b {
    private static final long serialVersionUID = 1;
    private T b;

    public g(T t) {
        this.b = t;
    }

    @Deprecated
    public c a() {
        return null;
    }

    public void a(d dVar) {
        if (this.b != null) {
            this.b.a(dVar);
        }
    }

    public void a(T t) {
        this.b = t;
    }

    public T b() {
        return this.b;
    }
}
