package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class bl extends b {
    public static final int b = 199;
    public static final int c = 3;
    private static final long serialVersionUID = 199;
    public byte d;
    public byte e;
    public byte f;

    public bl() {
        this.a = 199;
    }

    public bl(c cVar) {
        this.a = 199;
        a(cVar.d);
    }

    public c a() {
        c cVar = new c();
        cVar.b = 3;
        cVar.c = 199;
        cVar.d.b(this.d);
        cVar.d.b(this.e);
        cVar.d.b(this.f);
        return cVar;
    }

    public void a(d dVar) {
        dVar.c();
    }

    public String toString() {
        return "updateOrder [Packet_sequence=, target_ID=" + this.d + "]";
    }
}
