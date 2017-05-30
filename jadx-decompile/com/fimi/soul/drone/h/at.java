package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d;
import com.fimi.soul.drone.e;

public class at extends e {
    public byte b;
    public byte c;
    public byte d;
    public byte e;
    public byte f;
    public byte g;
    public byte h;
    public byte i;
    public byte j;
    public byte k;
    public byte l;

    public at(a aVar) {
        super(aVar);
    }

    public byte a() {
        return this.b;
    }

    public void a(byte b) {
        this.b = b;
    }

    public void a(byte b, byte b2, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11) {
        this.b = b;
        this.c = b2;
        this.d = b3;
        this.e = b4;
        this.f = b5;
        this.g = b6;
        this.h = b7;
        this.i = b8;
        this.j = b9;
        this.k = b10;
        this.l = b11;
        this.a.a(d.a.SIMULATORINFO);
    }

    public byte b() {
        return this.c;
    }

    public void b(byte b) {
        this.c = b;
    }

    public byte c() {
        return this.d;
    }

    public void c(byte b) {
        this.d = b;
    }

    public byte d() {
        return this.e;
    }

    public void d(byte b) {
        this.e = b;
    }

    public byte e() {
        return this.f;
    }

    public void e(byte b) {
        this.f = b;
    }

    public byte f() {
        return this.g;
    }

    public void f(byte b) {
        this.g = b;
    }

    public byte g() {
        return this.h;
    }

    public void g(byte b) {
        this.h = b;
    }

    public byte h() {
        return this.i;
    }

    public void h(byte b) {
        this.i = b;
    }

    public byte i() {
        return this.j;
    }

    public void i(byte b) {
        this.j = b;
    }

    public byte j() {
        return this.k;
    }

    public void j(byte b) {
        this.k = b;
    }

    public byte k() {
        return this.l;
    }

    public void k(byte b) {
        this.l = b;
    }

    public String toString() {
        return "SimulatorInfo [ADC0=" + this.b + ", ADC1=" + this.c + ", ADC2=" + this.d + ", ADC3=" + this.e + ", ADC4=" + this.f + ", ADC5=" + this.g + ", battery=" + this.h + ", switch1=" + this.i + ", switch2=" + this.j + ", left3=" + this.k + ", right3=" + this.l + "]";
    }
}
