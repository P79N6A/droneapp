package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d;
import com.fimi.soul.drone.e;
import com.fimi.soul.utils.af;

public class as extends e {
    public double b;
    public byte c;
    public double d;
    public double e;
    public double f;
    public byte g;
    public int h;
    public double i;
    public double j;

    public as(a aVar) {
        super(aVar);
    }

    public double a() {
        return this.b;
    }

    public void a(double d) {
        this.b = d;
    }

    public void a(double d, float f, float f2, double d2, byte b, double d3, double d4, double d5, byte b2) {
        if (com.fimi.soul.biz.n.a.a().b()) {
            this.d = (double) f;
            this.e = (double) f2;
        } else {
            af afVar = new af((double) f2, (double) f);
            this.d = afVar.b();
            this.e = afVar.a();
        }
        this.b = d;
        this.f = d2;
        this.g = b;
        this.h = ((int) d3) & 255;
        this.i = d4;
        this.j = d5;
        this.c = b2;
        this.a.a(d.a.RETURNASSIGNWAYPOINT);
    }

    public void a(float f) {
        this.e = (double) f;
    }

    public double b() {
        return this.d;
    }

    public void b(double d) {
        this.f = d;
    }

    public void b(float f) {
        this.d = (double) f;
    }

    public double c() {
        return this.f;
    }

    public void c(double d) {
        this.i = d;
    }

    public byte d() {
        return this.g;
    }

    public void d(double d) {
        this.j = d;
    }

    public int e() {
        return this.h;
    }

    public double f() {
        return this.i;
    }

    public double g() {
        return this.j;
    }

    public double h() {
        return this.e;
    }

    public byte i() {
        return this.c;
    }
}
