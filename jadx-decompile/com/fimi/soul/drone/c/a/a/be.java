package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class be extends b {
    public static final int b = 132;
    public static final int c = 12;
    private static final long serialVersionUID = 132;
    public short d;
    public float e;
    public float f;
    public byte g;
    public byte h;

    public be() {
        this.a = 132;
    }

    public be(c cVar) {
        this.a = 132;
        a(cVar.d);
    }

    public c a() {
        c cVar = new c();
        cVar.b = 12;
        cVar.c = 132;
        cVar.d.a(this.d);
        cVar.d.a(this.e);
        cVar.d.a(this.f);
        cVar.d.b(this.g);
        cVar.d.b(this.h);
        return cVar;
    }

    public void a(d dVar) {
        dVar.c();
        this.d = dVar.e();
        this.e = dVar.i();
        this.f = dVar.i();
        this.g = dVar.d();
        this.h = dVar.d();
    }

    public String toString() {
        return "msg_forbiddenpointUplink{number=" + this.d + ", Longitude=" + this.e + ", Latitude=" + this.f + ", Altitude=" + this.g + ", Operation_code=" + this.h + '}';
    }
}
