package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d;
import com.fimi.soul.drone.e;

public class ai extends e {
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public ai(a aVar) {
        super(aVar);
    }

    public double a() {
        return this.b;
    }

    public void a(double d, double d2, double d3, double d4, double d5) {
        this.b = d;
        this.c = d2;
        this.d = d3;
        this.e = d4;
        this.f = d5;
        this.a.a(d.a.RC_IN);
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

    public String toString() {
        return "RC [rc1=" + this.b + ", rc2=" + this.c + ", rc3=" + this.d + ", rc4=" + this.e + ", rc5=" + this.f + "]";
    }
}
