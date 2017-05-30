package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class af extends b {
    public static final int b = 198;
    public static final int c = 10;
    private static final long serialVersionUID = 198;
    public short d;
    public short e;
    public short f;
    public short g;
    public short h;
    public c i;

    public af() {
        this.a = 198;
    }

    public af(c cVar) {
        this.a = 198;
        this.i = cVar;
        a(cVar.d);
    }

    public c a() {
        c cVar = new c();
        cVar.b = 10;
        cVar.c = 198;
        cVar.d.a(this.d);
        cVar.d.a(this.e);
        cVar.d.a(this.g);
        cVar.d.a(this.h);
        cVar.d.a(this.f);
        return cVar;
    }

    public void a(d dVar) {
        dVar.c();
        this.d = dVar.e();
        this.e = dVar.e();
        this.g = dVar.e();
        this.h = dVar.e();
        this.f = dVar.e();
    }

    public String toString() {
        return "msg_BatteryAnswerUplink [Battery_IDA=" + this.d + ", Battery_IDB=" + this.e + ", Cycle_count=" + this.f + ", Design_capacity=" + this.g + ", Full_charge_capacity=" + this.h + "]";
    }
}
