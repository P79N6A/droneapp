package com.fimi.soul.drone.c.a.a;

import com.fimi.soul.drone.c.a.b;
import com.fimi.soul.drone.c.a.c;
import com.fimi.soul.drone.c.a.d;

public class e extends b {
    public static final int b = 5;
    public static final int c = 16;
    private static final long serialVersionUID = 5;
    public byte d;
    public byte e;
    public byte f;
    public byte g;
    public byte h;
    public byte i;
    public short j;
    public short k;
    public byte l;
    public byte m;
    public byte n;
    public byte o;
    public byte p;
    public byte q;
    public c r;

    public e() {
        this.a = 5;
    }

    public e(c cVar) {
        this.a = 5;
        this.r = cVar;
        a(cVar.d);
    }

    public c a() {
        c cVar = new c();
        cVar.b = 16;
        cVar.c = 5;
        return null;
    }

    public void a(d dVar) {
        dVar.c();
        this.d = dVar.d();
        this.e = dVar.d();
        this.f = dVar.d();
        this.g = dVar.d();
        this.h = dVar.d();
        this.i = dVar.d();
        this.j = dVar.e();
        this.k = dVar.e();
        this.l = dVar.d();
        this.m = dVar.d();
        this.n = dVar.d();
        this.o = dVar.d();
        this.p = dVar.d();
        this.q = dVar.d();
    }

    public String toString() {
        return "CellDwonLink{Cell_1_Voltage=" + this.d + ", Cell_2_Voltage=" + this.e + ", Cell_3_Voltage=" + this.f + ", Cell_4_Voltage=" + this.g + ", Cell_5_Voltage=" + this.h + ", Cell_6_Voltage=" + this.i + ", Current_Capacity=" + this.j + ", Current=" + this.k + ", battery_temperature=" + this.l + ", battery_temperature1=" + this.m + ", batteryLevel=" + this.n + ", battery_param_err=" + this.o + ", battery_over_discharge=" + this.p + ", RCNoUpdateCnt=" + this.q + ", miLinkPacket=" + this.r + '}';
    }
}
