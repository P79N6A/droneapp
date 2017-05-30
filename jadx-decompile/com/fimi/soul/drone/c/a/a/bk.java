package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class bk extends b {
    public static final int b = 200;
    public static final int c = 6;
    private static final long serialVersionUID = 200;
    public byte d;
    public byte e;
    public int f;

    public bk() {
        this.a = 200;
    }

    public bk(c cVar) {
        this.a = 200;
        a(cVar.d);
    }

    public c a() {
        c cVar = new c();
        cVar.b = 6;
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
        this.f = dVar.f();
    }

    public String toString() {
        return "updateDroneOrder [Packet_sequence=" + this.d + ", target_ID=" + this.e + ", length=" + this.f + "]";
    }
}
