package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class bo extends b {
    public static final int b = 201;
    public static final int c = 4;
    private static final long serialVersionUID = 201;
    public byte d;
    public short e;
    public byte f;

    public bo() {
        this.a = 201;
    }

    public bo(c cVar) {
        this.a = 201;
        a(cVar.d);
    }

    public c a() {
        c cVar = new c();
        cVar.b = 4;
        cVar.c = 201;
        cVar.d.b(this.d);
        cVar.d.a(this.e);
        cVar.d.b(this.f);
        return cVar;
    }

    public void a(d dVar) {
        dVar.c();
        this.d = dVar.d();
        this.e = dVar.e();
        this.f = dVar.d();
    }

    public String toString() {
        return "updatedronebackreport [Packet_sequence=" + this.e + ", report=" + this.f + "]";
    }
}
