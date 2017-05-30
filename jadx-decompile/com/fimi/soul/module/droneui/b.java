package com.fimi.soul.module.droneui;

public class b {
    static double a = 6378137.0d;
    static double b = 6356725.0d;
    double c;
    double d;
    double e;
    double f;
    double g;
    double h;
    double i;
    double j;
    double k;
    double l;
    double m = (b + (((a - b) * (90.0d - this.j)) / 90.0d));
    double n = (this.m * Math.cos(this.l));

    public b(double d, double d2) {
        this.c = (double) ((int) d);
        this.d = (double) ((int) ((d - this.c) * 60.0d));
        this.e = ((d - this.c) - (this.d / 60.0d)) * 3600.0d;
        this.f = (double) ((int) d2);
        this.g = (double) ((int) ((d2 - this.f) * 60.0d));
        this.h = ((d2 - this.f) - (this.g / 60.0d)) * 3600.0d;
        this.i = d;
        this.j = d2;
        this.k = (3.141592653589793d * d) / 180.0d;
        this.l = (3.141592653589793d * d2) / 180.0d;
    }

    public static double a(b bVar, b bVar2) {
        double atan = (Math.atan(Math.abs(((bVar2.k - bVar.k) * bVar.n) / ((bVar2.l - bVar.l) * bVar.m))) * 180.0d) / 3.141592653589793d;
        double d = bVar2.i - bVar.i;
        double d2 = bVar2.j - bVar.j;
        return (d <= 0.0d || d2 > 0.0d) ? (d > 0.0d || d2 >= 0.0d) ? (d >= 0.0d || d2 < 0.0d) ? atan : (90.0d - atan) + 270.0d : atan + 180.0d : (90.0d - atan) + 90.0d;
    }

    public static b a(double d, double d2, double d3, double d4) {
        return a(new b(d, d2), d3, d4);
    }

    public static b a(b bVar, double d, double d2) {
        return new b((((((d * 1000.0d) * Math.sin((d2 * 3.141592653589793d) / 180.0d)) / bVar.n) + bVar.k) * 180.0d) / 3.141592653589793d, (((((d * 1000.0d) * Math.cos((d2 * 3.141592653589793d) / 180.0d)) / bVar.m) + bVar.l) * 180.0d) / 3.141592653589793d);
    }
}
