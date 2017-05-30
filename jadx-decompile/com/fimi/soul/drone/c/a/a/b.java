package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class b extends com.fimi.soul.drone.c.a.b {
    public static final int b = 152;
    public static final int c = 4;
    private static final long serialVersionUID = 152;
    public short d;
    public byte e;
    public byte f;

    public b() {
        this.a = 152;
    }

    public b(c cVar) {
        this.a = 152;
        a(cVar.d);
    }

    public c a() {
        c cVar = new c();
        cVar.b = 4;
        cVar.c = 152;
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
        return "BeginFollowmeback{Packet_sequence=" + this.d + ", cmd=" + this.e + ", report=" + this.f + '}';
    }
}
