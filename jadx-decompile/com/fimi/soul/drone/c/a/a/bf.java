package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class bf extends b {
    public static final int b = 98;
    public static final int c = 3;
    private static final long serialVersionUID = 98;
    public byte d;
    public byte e;
    public byte f;
    public c g;

    public bf() {
        this.a = 98;
    }

    public bf(c cVar) {
        this.a = 98;
        this.g = cVar;
        a(cVar.d);
    }

    public c a() {
        c cVar = new c();
        cVar.b = 3;
        cVar.c = 98;
        cVar.d.b(this.d);
        cVar.d.b(this.e);
        cVar.d.b(this.f);
        return cVar;
    }

    public void a(d dVar) {
        dVar.c();
        this.d = dVar.d();
        this.e = dVar.d();
        this.f = dVar.d();
    }

    public String toString() {
        return "msg_sendinfocontrol [model=" + this.d + ", status=" + this.e + ", msgid=" + this.a + ", pack()=" + a() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }
}
