package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class j extends b {
    public static final int b = 134;
    public static final int c = 7;
    private static final long serialVersionUID = 134;
    public byte d;
    public byte e;
    public float f;
    public byte g;

    public j() {
        this.a = 134;
    }

    public j(c cVar) {
        this.a = 134;
        a(cVar.d);
    }

    public c a() {
        c cVar = new c();
        cVar.b = 7;
        cVar.c = 134;
        cVar.d.b(this.d);
        cVar.d.b(this.e);
        cVar.d.a(this.f);
        cVar.d.b(this.g);
        return cVar;
    }

    public void a(d dVar) {
        dVar.c();
        this.d = dVar.d();
        this.e = dVar.d();
        this.f = dVar.i();
        this.g = dVar.d();
    }

    public String toString() {
        return "DroneRTHMessage{Packet_sequence=" + this.d + ", cmdID=" + this.e + ", height=" + this.f + ", report=" + this.g + '}';
    }
}
