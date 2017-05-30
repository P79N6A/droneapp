package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class r extends b {
    public static final int b = 40;
    public static final int c = 19;
    private static final long serialVersionUID = 40;
    public byte d;
    public byte e;
    public short f;
    public short g;
    public short h;
    public short i;
    public short j;
    public short k;
    public c l;

    public r() {
        this.a = 40;
    }

    public r(c cVar) {
        this.a = 40;
        this.l = cVar;
        a(cVar.d);
    }

    public c a() {
        c cVar = new c();
        cVar.b = 19;
        cVar.c = 40;
        return cVar;
    }

    public void a(d dVar) {
        dVar.c();
        this.d = dVar.d();
        this.e = dVar.d();
        dVar.c(7);
        this.f = dVar.e();
        this.g = dVar.e();
        this.h = dVar.e();
        this.i = dVar.e();
        this.j = dVar.e();
        this.k = dVar.e();
    }

    public String toString() {
        return "IMUInfoDwonLink{gyroX=" + this.f + ", gyroY=" + this.g + ", gyroZ=" + this.h + ", accelX=" + this.i + ", accelY=" + this.j + ", accelZ=" + this.k + ", miLinkPacket=" + this.l + '}';
    }
}
