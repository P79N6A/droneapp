package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class av extends b {
    public static final int b = 1;
    public static final int c = 10;
    private static final long serialVersionUID = 1;
    public short d;
    public short e;
    public short f;
    public short g;
    public short h;

    public av() {
        this.a = 1;
    }

    public av(c cVar) {
        this.a = 1;
        a(cVar.d);
    }

    public c a() {
        c cVar = new c();
        cVar.b = 10;
        cVar.c = 1;
        cVar.d.a(this.d);
        cVar.d.a(this.e);
        cVar.d.a(this.f);
        cVar.d.a(this.g);
        cVar.d.a(this.h);
        return cVar;
    }

    public void a(d dVar) {
        dVar.c();
        this.d = dVar.e();
        this.e = dVar.e();
        this.f = dVar.e();
        this.g = dVar.e();
        this.h = dVar.e();
    }

    public String toString() {
        return "MILINK_MSG_ID_RCDATA - rc1:" + this.d + " rc2:" + this.e + " rc3:" + this.f + " rc4:" + this.g + " rc5:" + this.h + "";
    }
}
