package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class am extends b {
    public static final int b = 2;
    public static final int c = 19;
    private static final long serialVersionUID = 2;
    public c d;
    public byte e;
    public byte f;
    public byte g;
    public byte h;
    public byte i;
    public short j;
    public short k;
    public short l;
    public byte m;
    public byte n;
    public short o;
    public short p;
    public byte q;
    public byte r;

    public am() {
        this.a = 2;
    }

    public am(c cVar) {
        this.a = 2;
        this.d = cVar;
        a(cVar.d);
    }

    public c a() {
        c cVar = new c();
        cVar.b = 19;
        cVar.c = 2;
        cVar.d.b(this.e);
        cVar.d.b(this.f);
        cVar.d.b(this.g);
        cVar.d.b(this.h);
        cVar.d.b(this.i);
        cVar.d.a(this.j);
        cVar.d.a(this.k);
        cVar.d.a(this.l);
        cVar.d.b(this.m);
        cVar.d.b(this.n);
        cVar.d.a(this.o);
        cVar.d.a(this.p);
        cVar.d.b(this.q);
        cVar.d.b(this.r);
        return cVar;
    }

    public void a(d dVar) {
        dVar.c();
        this.e = dVar.d();
        this.f = dVar.d();
        this.g = dVar.d();
        this.h = dVar.d();
        this.i = dVar.d();
        this.j = dVar.e();
        this.k = dVar.e();
        this.l = dVar.e();
        this.m = dVar.d();
        this.n = dVar.d();
        this.o = dVar.e();
        this.p = dVar.e();
        this.q = dVar.d();
        this.r = dVar.d();
    }

    public String toString() {
        return "msg_Heartbeat{Heartbeat=" + this.e + ", ThrottleStick=" + this.f + ", RollStick=" + this.g + ", PitchStick=" + this.h + ", YawStick=" + this.i + ", RollAngle=" + this.j + ", PitchAngle=" + this.k + ", HeadingAngle=" + this.l + ", DisarmCount=" + this.m + ", FlightMode=" + this.n + ", GroundSpeed=" + this.o + ", DownVelocity=" + this.p + ", rcReceiver=" + this.q + ", takeoffTag=" + this.r + '}';
    }
}
