package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class bb extends b {
    public static final int b = 131;
    public static final int c = 20;
    private static final long serialVersionUID = 131;
    public short d;
    public float e;
    public float f;
    public short g;
    public short h;
    public byte i;
    public byte j;
    public byte k;
    public short l;

    public bb() {
        this.a = 131;
    }

    public bb(c cVar) {
        this.a = 131;
        a(cVar.d);
    }

    public c a() {
        c cVar = new c();
        cVar.b = 20;
        cVar.c = 131;
        cVar.d.a(this.d);
        cVar.d.a(this.e);
        cVar.d.a(this.f);
        cVar.d.a(this.g);
        cVar.d.a(this.h);
        cVar.d.b(this.i);
        cVar.d.b(this.k);
        cVar.d.a(this.l);
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
        this.k = dVar.d();
        this.l = dVar.e();
    }

    public String toString() {
        return "msg_SettingWaypointUplink [number=" + this.d + ", Longitude=" + this.e + ", Latitude=" + this.f + ", Altitude=" + this.g + ", yaw_angle=" + this.h + ", hover_time=" + this.i + ", report=" + this.k + ", Number_to_be_transmited=" + this.l + "]";
    }
}
