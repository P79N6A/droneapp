package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class ag extends b {
    public static final int b = 148;
    public static final int c = 3;
    private static final long serialVersionUID = 148;
    public short d;
    public byte e;

    public ag() {
        this.a = 148;
    }

    public ag(c cVar) {
        this.a = 148;
        a(cVar.d);
    }

    public c a() {
        c cVar = new c();
        cVar.b = 3;
        cVar.c = 148;
        cVar.d.a(this.d);
        cVar.d.b(this.e);
        return cVar;
    }

    public void a(d dVar) {
        dVar.c();
        this.d = dVar.e();
        this.e = dVar.d();
    }

    public String toString() {
        return "msg_Gohome [Packet_sequence=" + this.d + "]";
    }
}
