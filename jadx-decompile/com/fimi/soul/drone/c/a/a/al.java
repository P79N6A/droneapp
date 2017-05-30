package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class al extends b {
    public static final int b = 192;
    public static final int c = 2;
    private static final long serialVersionUID = 192;
    public byte d;
    public byte e;

    public al() {
        this.a = 192;
    }

    public al(c cVar) {
        this.a = 192;
        a(cVar.d);
    }

    public c a() {
        c cVar = new c();
        cVar.b = 2;
        cVar.c = 192;
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
        return "msg_GoupOrderUplink [MILINK_MSG_ID_RCDATA=192+Packet_sequence=" + this.d + ", target_ID=" + this.e + "]";
    }
}
