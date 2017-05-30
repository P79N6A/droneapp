package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;
import com.fimi.soul.drone.h.x;

public class aj extends b {
    public static final int b = 16;
    public static final int c = 112;
    public static final int d = 113;
    private static final int g = 3;
    public c e;
    private x f;

    public aj(int i) {
        this.a = i;
    }

    public aj(c cVar, int i) {
        this.a = i;
        this.e = cVar;
        a(cVar.d);
    }

    public c a() {
        c cVar = new c();
        cVar.b = 3;
        cVar.c = this.a;
        cVar.d.b(this.f.a());
        cVar.d.b((byte) this.f.b());
        cVar.d.b(this.f.c());
        return cVar;
    }

    public void a(d dVar) {
        this.f = new x(null);
        dVar.c();
        dVar.d();
        this.f.a(dVar.d());
        this.f.a((short) dVar.d());
        this.f.b(dVar.d());
    }

    public void a(x xVar) {
        this.f = xVar;
    }

    public x b() {
        return this.f;
    }
}
