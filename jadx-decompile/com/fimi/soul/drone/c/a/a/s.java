package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class s extends b {
    public static final int b = 38;
    public static final int c = 11;
    private static final long serialVersionUID = 38;
    public byte d;
    public byte e;
    public byte f;
    public int g;
    public int h;
    public c i;

    public s() {
        this.a = 38;
    }

    public s(c cVar) {
        this.a = 38;
        this.i = cVar;
        a(cVar.d);
    }

    public c a() {
        c cVar = new c();
        cVar.b = 11;
        cVar.c = 38;
        return cVar;
    }

    public void a(d dVar) {
        dVar.c();
        this.d = dVar.d();
        this.e = dVar.d();
        this.f = dVar.d();
        this.g = dVar.f();
        this.h = dVar.f();
    }

    public String toString() {
        return "IMUWorkStateInfoDwonLink{ISCHECK=" + (this.f & 255) + "imuWorkState=" + (this.g & 255) + ", magWorkState=" + (this.h & 255) + ", miLinkPacket=" + this.i + '}';
    }
}
