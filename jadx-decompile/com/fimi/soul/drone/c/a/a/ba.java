package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class ba extends b {
    public static final int b = 198;
    public static final int c = 2;
    private static final long serialVersionUID = 198;
    public byte d;
    public byte e;

    public ba() {
        this.a = 198;
    }

    public ba(c cVar) {
        this.a = 198;
        a(cVar.d);
    }

    public c a() {
        c cVar = new c();
        cVar.b = 2;
        cVar.c = 198;
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
        return "msg_RequestbatteryDownlink [MILINK_MSG_ID_RCDATA=198+APP_version=" + this.d + ", reserve=" + this.e + "]";
    }
}
