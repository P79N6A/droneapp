package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class au extends b {
    public static final int b = 129;
    public static final int c = 19;
    private static final long serialVersionUID = 129;
    public byte d;
    public byte e;
    public float f;
    public float g;
    public short h;
    public short i;
    public byte j;
    public byte k;
    public byte l;
    public byte m;
    public byte n;

    public au() {
        this.a = 129;
    }

    public au(c cVar) {
        this.a = 129;
        a(cVar.d);
    }

    public c a() {
        c cVar = new c();
        cVar.b = 19;
        cVar.c = 129;
        return cVar;
    }

    public void a(d dVar) {
        dVar.c();
        this.d = dVar.d();
        this.e = dVar.d();
        this.f = dVar.i();
        this.g = dVar.i();
        this.h = dVar.e();
        this.i = dVar.e();
        this.j = dVar.d();
        this.k = dVar.d();
        this.l = dVar.d();
        this.m = dVar.d();
        this.n = dVar.d();
    }

    public String toString() {
        return "msg_PosionUplink_poi{PacketSequence=" + this.d + ", Opration_Code=" + this.e + ", POI_Longitude=" + this.f + ", POI_Latitude=" + this.g + ", POI_Altitude=" + this.h + ", Radius=" + this.i + ", speek=" + this.j + ", Start_Point_Pole_Angle=" + this.k + ", Paral=" + this.l + ", yaw_mode=" + this.m + ", report=" + this.n + '}';
    }
}
