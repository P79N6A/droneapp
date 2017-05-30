package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class o extends b {
    public static final int b = 138;
    public static final int c = 14;
    private static final long serialVersionUID = 138;
    public short d;
    public short e;
    public short f;
    public short g;
    public short h;
    public short i;
    public short j;

    public o() {
        this.a = 138;
    }

    public o(c cVar) {
        this.a = 138;
        a(cVar.d);
    }

    public c a() {
        c cVar = new c();
        cVar.b = 14;
        cVar.c = 138;
        cVar.d.a(this.d);
        cVar.d.a(this.e);
        cVar.d.a(this.f);
        cVar.d.a(this.g);
        cVar.d.a(this.h);
        cVar.d.a(this.i);
        cVar.d.a(this.j);
        return cVar;
    }

    public void a(d dVar) {
        dVar.c();
        this.d = dVar.e();
        this.e = dVar.e();
        this.f = dVar.e();
        this.g = dVar.e();
        this.h = dVar.e();
        this.i = dVar.e();
        this.j = dVar.e();
    }

    public String toString() {
        return "FlyControlParamter{roll_gain=" + this.d + ", pitch_gain=" + this.e + ", yaw_gain=" + this.f + ", altitude_gain=" + this.g + ", safety_type=" + this.h + ", RTL_climb_height=" + this.i + ", vehicle_type=" + this.j + '}';
    }
}
