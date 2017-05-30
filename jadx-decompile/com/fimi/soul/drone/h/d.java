package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.e;

public class d extends e {
    public byte b;
    public byte c;
    public byte d;
    public byte e;
    public byte f;
    public byte g;
    public short h;
    public short i;
    public byte j;
    public byte k;
    public byte l;
    public byte m;
    public byte n;

    public d(a aVar) {
        super(aVar);
    }

    public int a() {
        return this.b & 255;
    }

    public void a(byte b, byte b2, byte b3, byte b4, byte b5, byte b6, short s, short s2, byte b7, byte b8, byte b9, byte b10, byte b11) {
        this.b = b;
        this.c = b2;
        this.d = b3;
        this.e = b4;
        this.f = b5;
        this.g = b6;
        this.h = s;
        this.i = s2;
        this.j = b7;
        this.k = b8;
        this.l = b9;
        this.m = b10;
        this.n = b11;
        if (this.a != null) {
            this.a.a(com.fimi.soul.drone.d.a.BATTERY);
        }
    }

    public int b() {
        return this.c & 255;
    }

    public int c() {
        return this.d & 255;
    }

    public int d() {
        return this.e & 255;
    }

    public byte e() {
        return this.f;
    }

    public byte f() {
        return this.g;
    }

    public short g() {
        return this.h;
    }

    public short h() {
        return this.i;
    }

    public int i() {
        return this.j & 255;
    }

    public short j() {
        return (short) this.k;
    }

    public byte k() {
        return this.l;
    }

    public byte l() {
        return this.m;
    }

    public byte m() {
        return this.n;
    }

    public String toString() {
        return "Battery{Cell_1_Voltage=" + this.b + ", Cell_2_Voltage=" + this.c + ", Cell_3_Voltage=" + this.d + ", Cell_4_Voltage=" + this.e + ", Cell_5_Voltage=" + this.f + ", Cell_6_Voltage=" + this.g + ", Current_Capacity=" + this.h + ", Current=" + this.i + ", battery_temperature=" + this.j + ", batteryLevel=" + this.k + ", battery_parameter_err=" + this.l + ", battery_over_discharge=" + this.m + ", RCNoUpdateCnt=" + this.n + '}';
    }
}
