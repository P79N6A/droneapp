package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class an extends b {
    public static final int b = 147;
    public static final int c = 4;
    private static final long serialVersionUID = 147;
    public short d;
    public byte e;
    public byte f;

    public an() {
        this.a = 147;
    }

    public an(c cVar) {
        this.a = 147;
        a(cVar.d);
    }

    public c a() {
        c cVar = new c();
        cVar.b = 4;
        cVar.c = 147;
        cVar.d.a(this.d);
        cVar.d.b(this.e);
        cVar.d.b(this.f);
        return cVar;
    }

    public void a(d dVar) {
        dVar.c();
        this.d = dVar.e();
        this.e = dVar.d();
        this.f = dVar.d();
    }

    public String toString() {
        return "msg_Gohome [Packet_sequence=" + this.d + "]" + "";
    }
}
