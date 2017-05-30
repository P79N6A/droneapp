package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d;
import com.fimi.soul.drone.e;
import com.fimi.soul.utils.af;

public class z extends e {
    private double b;
    private double c;
    private double d;
    private int e;
    private float f;
    private byte g;

    public z(a aVar) {
        super(aVar);
    }

    public float a() {
        return this.f;
    }

    public void a(double d) {
        this.b = d;
    }

    public void a(double d, double d2, double d3, int i, byte b, byte b2, byte b3, byte b4, byte b5) {
        if (com.fimi.soul.biz.n.a.a().b()) {
            this.c = d;
            this.b = d2;
        } else {
            af a = com.fimi.soul.utils.z.a(d2, d);
            this.c = a.b();
            this.b = a.a();
        }
        this.d = d3;
        this.e = i;
        this.g = b5;
    }

    public void a(double d, double d2, double d3, int i, float f, byte b) {
        if (com.fimi.soul.biz.n.a.a().b()) {
            this.c = d;
            this.b = d2;
        } else {
            af a = com.fimi.soul.utils.z.a(d2, d);
            this.c = a.b();
            this.b = a.a();
        }
        this.d = d3;
        this.e = i;
        this.f = f;
        this.g = b;
        this.a.a(d.a.HOMEPOINT);
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

    public int e() {
        return this.e;
    }

    public boolean f() {
        return (this.g & 15) == 1;
    }

    public boolean g() {
        return ((this.g & 240) >> 4) == 1;
    }
}
