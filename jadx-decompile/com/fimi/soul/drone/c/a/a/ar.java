package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class ar extends b {
    public static final int b = 3;
    public static final int c = 19;
    private static final long serialVersionUID = 3;
    public short d;
    public byte e;
    public float f;
    public float g;
    public float h;
    public float i;
    public byte j;
    public c k;

    public ar() {
        this.a = 3;
    }

    public ar(c cVar) {
        this.a = 3;
        this.k = cVar;
        a(cVar.d);
    }

    public c a() {
        return null;
    }

    public void a(d dVar) {
        dVar.c();
        this.d = dVar.e();
        this.e = dVar.d();
        this.f = dVar.i();
        this.g = dVar.i();
        this.h = dVar.j();
        this.i = dVar.i();
        this.j = dVar.d();
    }

    public String toString() {
        return "msg_PosionDownlink{flightTime=" + this.d + ", SatelliteNumber=" + this.e + ", CurrentLongitude=" + this.f + ", CurrentLatitude=" + this.g + ", Height=" + this.h + ", Distance=" + this.i + ", RFsignalstrength=" + this.j + '}';
    }
}
