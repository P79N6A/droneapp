package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class u extends b {
    public static final int b = 11;
    public static final int c = 3;
    private static final long serialVersionUID = 11;
    public byte d;
    public byte e;
    public byte f;
    public byte g;
    public byte h;
    public byte i;
    public byte j;

    public u() {
        this.a = 11;
    }

    public u(c cVar) {
        this.a = 11;
        a(cVar.d);
    }

    public c a() {
        c cVar = new c();
        cVar.b = 3;
        cVar.c = 11;
        return cVar;
    }

    public void a(d dVar) {
        dVar.c();
        this.d = dVar.d();
        this.e = dVar.d();
        this.f = dVar.d();
        this.g = dVar.d();
        this.h = dVar.d();
        this.i = dVar.d();
        this.j = dVar.d();
    }

    public String toString() {
        return "NewDroneModel{CtrlType=" + this.d + ", CtrlMode=" + this.e + ", WP_SPA=" + this.f + '}';
    }
}
