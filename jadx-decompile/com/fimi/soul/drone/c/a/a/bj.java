package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class bj extends b {
    public static final int b = 200;
    public static final int c = 3;
    private static final long serialVersionUID = 200;
    public byte d;
    public byte e;
    public byte f;

    public bj() {
        this.a = 200;
    }

    public bj(c cVar) {
        this.a = 200;
        a(cVar.d);
    }

    public c a() {
        c cVar = new c();
        cVar.b = 3;
        cVar.c = 200;
        cVar.d.b(this.d);
        cVar.d.b(this.e);
        cVar.d.b(this.f);
        return cVar;
    }

    public void a(d dVar) {
        dVar.c();
        this.d = dVar.d();
        this.e = dVar.d();
        this.f = dVar.d();
    }

    public String toString() {
        return "updateOrderbackreport [Packet_sequence=" + this.d + ", target_ID=" + this.e + ", report=" + this.f + "]";
    }
}
