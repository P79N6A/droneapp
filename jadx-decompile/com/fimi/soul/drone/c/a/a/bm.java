package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class bm extends b {
    public static final int b = 199;
    public static final int c = 2;
    private static final long serialVersionUID = 199;
    public byte d;
    public byte e;

    public bm() {
        this.a = 199;
    }

    public bm(c cVar) {
        this.a = 199;
        a(cVar.d);
    }

    public c a() {
        c cVar = new c();
        cVar.b = 2;
        cVar.c = 199;
        cVar.d.b(this.d);
        cVar.d.b(this.e);
        return cVar;
    }

    public void a(d dVar) {
        dVar.c();
        this.d = dVar.d();
        this.e = dVar.d();
    }

    public String toString() {
        return "updateOrderbackreport [Packet_sequence=, target_ID=" + this.d + ", report=" + this.e + "]";
    }
}
