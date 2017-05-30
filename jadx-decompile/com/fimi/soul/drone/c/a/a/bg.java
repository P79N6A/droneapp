package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class bg extends b {
    public static final int b = 99;
    public static final int c = 5;
    private static final long serialVersionUID = 99;
    public byte d;
    public byte e;
    public byte f;
    public byte g;
    public byte h;
    public byte i;

    public bg() {
        this.a = 99;
    }

    public bg(c cVar) {
        this.a = 99;
        a(cVar.d);
    }

    public c a() {
        c cVar = new c();
        cVar.b = 5;
        cVar.c = 99;
        cVar.d.b(this.d);
        cVar.d.b(this.e);
        cVar.d.b(this.f);
        cVar.d.b(this.g);
        cVar.d.b(this.h);
        return cVar;
    }

    public void a(d dVar) {
        dVar.c();
        this.d = dVar.d();
        this.e = dVar.d();
        this.f = dVar.d();
        this.g = dVar.d();
        this.h = dVar.d();
        this.i = dVar.d();
    }

    public String toString() {
        return "msg_remotecontrol [ number1=" + this.d + ", number2=" + this.e + ", number3=" + this.f + ", number4=" + this.g + ", number5=" + this.h + "]";
    }
}
