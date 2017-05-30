package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class at extends b {
    public static final int b = 128;
    public static final int c = 13;
    private static final long serialVersionUID = 128;
    public byte d;
    public double e;
    public double f;
    public short g;
    public byte h;
    public byte i;

    public at() {
        this.a = 128;
    }

    public at(c cVar) {
        this.a = 128;
        a(cVar.d);
    }

    public c a() {
        c cVar = new c();
        cVar.b = 13;
        cVar.c = 128;
        cVar.d.b(this.d);
        cVar.d.a(this.e);
        cVar.d.a(this.f);
        cVar.d.a(this.g);
        cVar.d.b(this.h);
        cVar.d.b(this.i);
        return cVar;
    }

    public void a(d dVar) {
        dVar.c();
        this.d = dVar.d();
        this.e = (double) dVar.i();
        this.f = (double) dVar.i();
        this.g = dVar.e();
        this.h = dVar.d();
        this.i = dVar.d();
    }

    public String toString() {
        return "msg_PosionUplink_home [MILINK_MSG_ID_RCDATA=128+PacketSequence=" + this.d + ", HomeLongitude=" + this.e + ", HomeLatitude=" + this.f + ", HomeAltitude=" + this.g + ", reserve=" + this.h + ", reserve2=" + this.i + "]";
    }
}
