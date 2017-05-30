package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class aw extends b {
    public static final int b = 130;
    public static final int c = 2;
    private static final long serialVersionUID = 130;
    public short d;

    public aw() {
        this.a = 130;
    }

    public aw(c cVar) {
        this.a = 130;
        a(cVar.d);
    }

    public c a() {
        c cVar = new c();
        cVar.b = 2;
        cVar.c = 130;
        cVar.d.a(this.d);
        return cVar;
    }

    public void a(d dVar) {
        dVar.c();
        this.d = dVar.e();
    }

    public String toString() {
        return "msg_NumberUplink [MILINK_MSG_ID_RCDATA=130+number=" + this.d + "]";
    }
}
