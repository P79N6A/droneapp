package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class az extends b {
    public static final int b = 193;
    public static final int c = 3;
    private static final long serialVersionUID = 193;
    public byte d;
    public short e;

    public az() {
        this.a = 193;
    }

    public az(c cVar) {
        this.a = 193;
        a(cVar.d);
    }

    public c a() {
        c cVar = new c();
        cVar.b = 3;
        cVar.c = 193;
        cVar.d.b(this.d);
        cVar.d.a(this.e);
        return cVar;
    }

    public void a(d dVar) {
        dVar.c();
        this.d = dVar.d();
        this.e = dVar.e();
    }

    public String toString() {
        return "msg_RequestVersionUplink [Type=" + this.d + ", APP_version=" + this.e + "]";
    }
}
