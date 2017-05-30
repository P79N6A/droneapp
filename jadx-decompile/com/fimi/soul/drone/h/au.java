package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d;
import com.fimi.soul.drone.e;

public class au extends e {
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;
    private byte g;
    private double h;

    public au(a aVar) {
        super(aVar);
    }

    public byte a() {
        return this.g;
    }

    public void a(double d, double d2, double d3, double d4, double d5, byte b, double d6) {
        this.b = d;
        this.c = d2;
        this.d = d3;
        this.e = d4;
        this.f = d5;
        this.g = b;
        this.h = d6;
        this.a.a(d.a.GPS_FIX);
    }

    public double b() {
        return this.h;
    }

    public double c() {
        return this.b;
    }

    public double d() {
        return this.c;
    }

    public double e() {
        return this.d;
    }

    public double f() {
        return this.e;
    }

    public double g() {
        return this.f;
    }

    public String toString() {
        return "TelWaypoint [GPSLatitude=" + this.b + ", GPSLongitude=" + this.c + ", GPSAltitude=" + this.d + ", GPSSpeed=" + this.e + ", GPSBearing=" + this.f + ", number=" + this.g + ", accuracy=" + this.h + "]";
    }
}
