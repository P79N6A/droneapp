package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class aq extends b {
    public static final int b = 149;
    public static final int c = 3;
    private static final long serialVersionUID = 149;
    public short d;
    public byte e;

    public aq() {
        this.a = 149;
    }

    public aq(c cVar) {
        this.a = 149;
        a(cVar.d);
    }

    public c a() {
        c cVar = new c();
        cVar.b = 3;
        cVar.c = 149;
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
