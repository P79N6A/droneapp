package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class w extends b {
    public static final int b = 7;
    public static final int c = 11;
    private static final long serialVersionUID = 7;
    public byte d;
    public short e;
    public float f;
    public float g;
    public byte h;
    public short i;
    public byte j;
    public byte k;
    public byte l;
    public byte m;
    public byte n;

    public w() {
        this.a = 7;
    }

    public w(c cVar) {
        this.a = 7;
        a(cVar.d);
    }

    public c a() {
        c cVar = new c();
        cVar.b = 11;
        cVar.c = 7;
        cVar.d.a(this.e);
        cVar.d.a(this.f);
        cVar.d.a(this.g);
        cVar.d.b(this.h);
        return cVar;
    }

    public void a(d dVar) {
        dVar.c();
        this.d = dVar.d();
        this.e = dVar.e();
        this.f = dVar.i();
        this.g = dVar.i();
        this.h = dVar.d();
        this.i = dVar.e();
        this.j = dVar.d();
        this.k = dVar.d();
        this.l = dVar.d();
        this.m = dVar.d();
        this.n = dVar.d();
    }

    public String toString() {
        return "NoFlyArea{number=" + this.e + ", Forbiden_Longitude=" + this.f + ", Forbiden_Latitude=" + this.g + ", type=" + this.h + '}';
    }
}
