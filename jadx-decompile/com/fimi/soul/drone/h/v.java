package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d;
import com.fimi.soul.drone.e;
import com.fimi.soul.utils.af;
import com.fimi.soul.utils.z;

public class v extends e {
    private double b;
    private double c;
    private double d;
    private double e;
    private byte f;
    private double g;
    private double h;

    public v(a aVar) {
        super(aVar);
    }

    public double a() {
        return this.h;
    }

    public void a(double d, double d2, double d3, double d4, double d5, byte b, double d6) {
        if (com.fimi.soul.biz.n.a.a().b()) {
            this.b = d;
            this.c = d2;
        } else {
            af a = z.a(d2, d);
            this.b = a.b();
            this.c = a.a();
        }
        this.d = d3;
        this.e = d4;
        this.f = b;
        this.g = d5;
        this.h = d6;
        this.a.a(d.a.GPS);
    }

    public double b() {
        return this.b;
    }

    public double c() {
        return this.c;
    }

    public double d() {
        return this.d;
    }

    public double e() {
        return this.e;
    }

    public byte f() {
        return this.f;
    }

    public double g() {
        return this.g;
    }
}
