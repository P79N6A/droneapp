package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class ae extends b {
    public static final int b = 130;
    public static final int c = 19;
    private static final long serialVersionUID = 130;
    public short d;
    public float e;
    public float f;
    public short g;
    public short h;
    public byte i;
    public byte j;
    public short k;
    private volatile c l;

    public ae() {
        this.a = 130;
    }

    public ae(c cVar) {
        this.l = cVar;
        this.a = 130;
        a(cVar.d);
    }

    public c a() {
        c cVar = new c();
        cVar.b = 19;
        cVar.c = 130;
        cVar.d.a(this.d);
        cVar.d.a(this.e);
        cVar.d.a(this.f);
        cVar.d.a(this.g);
        cVar.d.a(this.h);
        cVar.d.a((short) this.i);
        cVar.d.b(this.j);
        cVar.d.a(this.k);
        return cVar;
    }

    public void a(d dVar) {
        dVar.c();
        this.d = dVar.e();
        this.e = dVar.i();
        this.f = dVar.i();
        this.g = dVar.e();
        this.h = dVar.e();
        this.i = dVar.d();
        this.j = dVar.d();
        this.k = dVar.e();
    }

    public c b() {
        return this.l;
    }

    public String toString() {
        return "msg_SettingWaypointUplink [number=" + this.d + ", Longitude=" + this.e + ", Latitude=" + this.f + ", Altitude=" + this.g + ", yaw_angle=" + this.h + ", hover_time=" + this.i + ", speed=" + this.j + ", Number_to_be_transmited=" + this.k + "]";
    }
}
