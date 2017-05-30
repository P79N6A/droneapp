package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class bd extends b {
    public static final int b = 6;
    public static final int c = 18;
    private static final long serialVersionUID = 6;
    public float d;
    public float e;
    public float f;
    public short g;
    public short h;
    public byte i;
    public short j;

    public bd() {
        this.a = 6;
    }

    public bd(c cVar) {
        this.a = 6;
        a(cVar.d);
    }

    public c a() {
        c cVar = new c();
        cVar.b = 18;
        cVar.c = 6;
        cVar.d.a(this.d);
        cVar.d.a(this.e);
        cVar.d.a((int) this.f);
        cVar.d.a(this.g);
        cVar.d.a(this.h);
        cVar.d.b(this.i);
        cVar.d.a(this.j);
        return cVar;
    }

    public void a(d dVar) {
        dVar.c();
    }

    public String toString() {
        return "msg_followme [Packet_Sequence=Packet_Sequence, GCSLongitude=" + this.d + ", GCSLatitude=" + this.e + ", HomeAltitude=" + this.f + ", ground_speed=" + this.g + ", ground_course=" + this.h + ", SatelliteNumber=" + this.i + ", accuracy=" + this.j + "]";
    }
}
