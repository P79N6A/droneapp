package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class ap extends b {
    public static final int b = 4;
    public static final int c = 16;
    private static final long serialVersionUID = 4;
    public float d;
    public float e;
    public float f;
    public byte g;
    public float h;
    public c i;
    public byte j;

    public ap() {
        this.a = 4;
    }

    public ap(c cVar) {
        this.a = 4;
        this.i = cVar;
        a(cVar.d);
    }

    public c a() {
        return null;
    }

    public void a(d dVar) {
        dVar.c();
        this.d = dVar.i();
        this.e = dVar.i();
        this.f = dVar.j();
        this.g = dVar.d();
        this.h = dVar.i();
        this.j = dVar.d();
    }

    public String toString() {
        return "msg_MessionState [HomeLongitude=" + this.d + ", HomeLatitude=" + this.e + ", HomeAltitude=" + this.f + ", CurrentWaypoint=" + this.g + "]";
    }
}
