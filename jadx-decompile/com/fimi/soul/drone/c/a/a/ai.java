package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class ai extends b {
    public static final int b = 193;
    public static final int c = 22;
    private static final long serialVersionUID = 193;
    public byte d;
    public byte e;
    public char f;
    public short g;
    public long h;
    public long i;
    public long j;
    public long k;

    public ai() {
        this.a = 193;
    }

    public ai(c cVar) {
        this.a = 193;
        a(cVar.d);
    }

    public c a() {
        c cVar = new c();
        cVar.b = 22;
        cVar.c = 193;
        cVar.d.b(this.d);
        cVar.d.b(this.e);
        cVar.d.a(this.f);
        cVar.d.a(this.g);
        cVar.d.a(this.h);
        cVar.d.a(this.i);
        cVar.d.a(this.j);
        cVar.d.a(this.k);
        return cVar;
    }

    public void a(d dVar) {
        dVar.c();
        this.d = dVar.d();
        this.e = dVar.d();
        this.f = dVar.l();
        this.g = dVar.e();
        this.h = dVar.m();
        this.i = dVar.m();
        this.j = dVar.m();
        this.k = dVar.m();
    }

    public String toString() {
        return "msg_FCAnswerDownlink{type=" + this.d + ", Model=" + this.e + ", FC_hardware_version=" + this.f + ", Software_version=" + this.g + ", IDA=" + this.h + ", IDB=" + this.i + ", IDC=" + this.j + ", reserve=" + this.k + '}';
    }
}
