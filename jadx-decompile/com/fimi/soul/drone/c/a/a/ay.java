package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class ay extends b {
    public static final int b = 197;
    public static final int c = 6;
    private static final long serialVersionUID = 197;
    public byte d;
    public byte e;
    public byte f;
    public byte g;
    public byte h;

    public ay() {
        this.a = 197;
    }

    public ay(c cVar) {
        this.a = 197;
        a(cVar.d);
    }

    public c a() {
        c cVar = new c();
        cVar.b = 6;
        cVar.c = 197;
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
    }

    public String toString() {
        return "msg_ReportAnswerFlightDownlink [Battery_hardware_version=" + this.d + ", Battery_software_version=" + this.e + ", Gimbal_hardware_version=" + this.f + ", Gimbal_software_version=" + this.g + ", Other_equipment_vesion=" + this.h + "]";
    }
}
