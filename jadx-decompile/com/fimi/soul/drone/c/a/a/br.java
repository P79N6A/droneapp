package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class br extends b {
    public static final int b = 202;
    public static final int c = 2;
    private static final long serialVersionUID = 202;
    public byte d;
    public byte e;

    public br() {
        this.a = 202;
    }

    public br(c cVar) {
        this.a = 202;
        a(cVar.d);
    }

    public c a() {
        c cVar = new c();
        cVar.b = 2;
        cVar.c = 202;
        cVar.d.b(this.d);
        cVar.d.b(this.e);
        return cVar;
    }

    public void a(d dVar) {
        dVar.c();
        this.d = dVar.d();
        this.e = dVar.d();
    }

    public String toString() {
        return "updatedronefinishback [report=" + this.e + "]";
    }
}
