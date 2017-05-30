package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class a extends b {
    public static final int b = 152;
    public static final int c = 3;
    private static final long serialVersionUID = 152;
    public short d;
    public byte e;

    public a() {
        this.a = 152;
    }

    public a(c cVar) {
        this.a = 152;
        a(cVar.d);
    }

    public c a() {
        c cVar = new c();
        cVar.b = 3;
        cVar.c = 152;
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
        return "BeginFollowme [Packet_sequence=" + this.d + ", Para1=" + this.e + "]";
    }
}
