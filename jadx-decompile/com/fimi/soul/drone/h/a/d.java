package com.fimi.soul.drone.h.a;

public abstract class d implements Comparable<d> {
    protected c a;

    public d(c cVar) {
        this.a = cVar;
    }

    public d(d dVar) {
        this(dVar.a);
    }

    public c a() {
        return this.a;
    }
}
