package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d;
import com.fimi.soul.drone.e;
import com.fimi.soul.utils.af;
import com.fimi.soul.utils.z;

public class al extends e {
    public volatile int b;
    public double c;
    public double d;
    public double e;
    public double f;
    public double g;
    public double h;
    public double i;
    private byte j;

    public al(a aVar) {
        super(aVar);
    }

    public int a() {
        return this.b;
    }

    public void a(int i, float f, float f2, double d, double d2, double d3, double d4, double d5, byte b) {
        if (com.fimi.soul.biz.n.a.a().b()) {
            this.c = (double) f;
            this.d = (double) f2;
        } else {
            af a = z.a((double) f2, (double) f);
            this.c = a.b();
            this.d = a.a();
        }
        this.b = i;
        this.e = d;
        this.f = d2;
        this.g = d3;
        this.h = d4;
        this.i = d5;
        this.j = b;
        this.a.a(d.a.RECEIVERWAYPOINTS);
    }

    public double b() {
        return this.c;
    }

    public double c() {
        return this.d;
    }

    public double d() {
        return this.e;
    }

    public double e() {
        return this.f;
    }

    public double f() {
        return this.g;
    }

    public double g() {
        return this.h;
    }

    public double h() {
        return this.i;
    }

    public byte i() {
        return this.j;
    }

    public String toString() {
        return "Receivepoint [number=" + this.b + ", Longitude=" + this.c + ", Latitude=" + this.d + ", Altitude=" + this.e + ", yaw_angle=" + this.f + ", hover_time=" + this.g + ", report=" + this.h + ", Number_to_be_transmited=" + this.i + "]";
    }
}
