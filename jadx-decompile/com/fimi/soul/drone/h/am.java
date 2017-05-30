package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d;
import com.fimi.soul.drone.e;
import com.fimi.soul.utils.af;
import com.fimi.soul.utils.z;

public class am extends e {
    public int b;
    public double c;
    public double d;
    public double e;
    public double f;
    public double g;
    public double h;
    public int i = 0;

    public am(a aVar) {
        super(aVar);
    }

    public int a() {
        return this.b;
    }

    public void a(int i, float f, float f2, double d, double d2, double d3, double d4, int i2) {
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
        this.i = i2;
        this.a.a(d.a.RECEIVERPOINTS);
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

    public int h() {
        return this.i;
    }

    public String toString() {
        return "Receivepoints [number=" + this.b + ", Longitude=" + this.c + ", Latitude=" + this.d + ", Altitude=" + this.e + ", yaw_angle=" + this.f + ", hover_time=" + this.g + ", speed=" + this.h + ", Number_to_be_transmited=" + this.i + "]";
    }
}
