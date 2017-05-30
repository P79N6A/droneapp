package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class bq extends b {
    public static final int b = 203;
    public static final int c = 2;
    private static final long serialVersionUID = 203;
    public byte d;
    public byte e;

    public bq() {
        this.a = 203;
    }

    public bq(c cVar) {
        this.a = 203;
        a(cVar.d);
    }

    public c a() {
        c cVar = new c();
        cVar.b = 2;
        cVar.c = 203;
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
        return "updatedronefinishCRC [target_ID=" + this.d + ", report=" + this.e + "]";
    }
}
