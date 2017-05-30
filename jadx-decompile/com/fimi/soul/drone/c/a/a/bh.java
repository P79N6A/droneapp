package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class bh extends b {
    public static final int b = 100;
    public static final int c = 11;
    private static final long serialVersionUID = 100;
    public byte d;
    public byte e;
    public byte f;
    public byte g;
    public byte h;
    public byte i;
    public byte j;
    public byte k;
    public byte l;
    public byte m;
    public byte n;
    public c o;

    public bh() {
        this.a = 100;
    }

    public bh(c cVar) {
        this.o = cVar;
        this.a = 100;
        a(cVar.d);
    }

    public c a() {
        c cVar = new c();
        cVar.b = 11;
        cVar.c = 100;
        cVar.d.b(this.d);
        cVar.d.b(this.e);
        cVar.d.b(this.f);
        cVar.d.b(this.g);
        cVar.d.b(this.h);
        cVar.d.b(this.i);
        cVar.d.b(this.j);
        cVar.d.b(this.k);
        cVar.d.b(this.l);
        cVar.d.b(this.m);
        cVar.d.b(this.n);
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
        this.k = dVar.d();
        this.l = dVar.d();
        this.m = dVar.d();
        this.n = dVar.d();
    }

    public String toString() {
        return "msg_simulatorINfo [ADC0=" + this.d + ", ADC1=" + this.e + ", ADC2=" + this.f + ", ADC3=" + this.g + ", ADC4=" + this.h + ", ADC5=" + this.i + ", battery=" + this.j + ", switch1=" + this.k + ", switch2=" + this.l + ", left3=" + this.m + ", right3=" + this.n + "]";
    }
}
