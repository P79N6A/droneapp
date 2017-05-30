package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d;
import com.fimi.soul.drone.e;
import com.fimi.soul.utils.af;
import com.fimi.soul.utils.z;

public class ag extends e {
    private double b;
    private byte c;
    private double d;
    private double e;
    private double f;
    private double g;
    private byte h;

    public ag(a aVar) {
        super(aVar);
    }

    public byte a() {
        return this.h;
    }

    public void a(double d, byte b, float f, float f2, double d2, double d3, byte b2) {
        this.b = d;
        this.c = b;
        if (com.fimi.soul.biz.n.a.a().b()) {
            this.d = (double) f;
            this.e = (double) f2;
        } else {
            af a = z.a((double) f2, (double) f);
            this.d = a.b();
            this.e = a.a();
        }
        this.g = d3;
        this.h = b2;
        this.f = d2;
        if (this.a != null) {
            this.a.a(d.a.HEARDDAY);
        }
    }

    public double b() {
        return this.b;
    }

    public byte c() {
        return this.c;
    }

    public double d() {
        return this.d;
    }

    public double e() {
        return this.e;
    }

    public double f() {
        return this.f;
    }

    public double g() {
        return this.g;
    }

    public String toString() {
        return "Pert{flighttime=" + this.b + ", SatelliteNumber=" + this.c + ", CurrentLongitude=" + this.d + ", CurrentLatitude=" + this.e + ", Height=" + this.f + ", Distance=" + this.g + ", RFsignalstrength=" + this.h + '}';
    }
}
