package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class as extends b {
    public static final int b = 129;
    public static final int c = 11;
    private static final long serialVersionUID = 129;
    public byte d;
    public int e;
    public int f;
    public short g;

    public as() {
        this.a = 129;
    }

    public as(c cVar) {
        this.a = 129;
        a(cVar.d);
    }

    public c a() {
        c cVar = new c();
        cVar.b = 11;
        cVar.c = 129;
        cVar.d.b(this.d);
        cVar.d.b(this.e);
        cVar.d.b(this.f);
        cVar.d.a(this.g);
        return cVar;
    }

    public void a(d dVar) {
        dVar.c();
        this.d = dVar.d();
        this.e = dVar.f();
        this.f = dVar.f();
        this.g = dVar.e();
    }

    public String toString() {
        return "msg_PosionUpLink [MILINK_MSG_ID_RCDATA=129+PacketSequence=" + this.d + ", HomeLongitude=" + this.e + ", HomeLatitude=" + this.f + ", HomeAltitude=" + this.g + "]";
    }
}
