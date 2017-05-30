package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d;
import com.fimi.soul.drone.e;
import java.io.Serializable;

public class y extends e implements Serializable {
    private double b;
    private double c;
    private byte d;
    private byte e;
    private int f;
    private byte g;
    private byte h;
    private double i;
    private double j;
    private double k;
    private double l;
    private double m;
    private double n;
    private double o;

    public y(a aVar) {
        super(aVar);
    }

    public double a() {
        return this.b;
    }

    public void a(byte b) {
        this.d = b;
    }

    public void a(byte b, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13) {
        this.d = (byte) (b & 255);
        this.i = d;
        this.o = d2;
        this.n = d3;
        this.m = d4;
        this.j = d5;
        this.k = d6;
        this.l = d7;
        this.e = (byte) ((int) d8);
        this.f = (int) d9;
        this.b = d10;
        this.c = d11;
        this.g = (byte) ((int) d12);
        this.h = (byte) ((int) d13);
    }

    public void a(double d) {
        this.b = d;
    }

    public void a(double d, double d2, double d3, double d4, double d5, double d6, double d7, byte b, byte b2, int i, byte b3, byte b4, double d8, double d9) {
        this.i = d2;
        this.n = d;
        this.j = d3;
        this.k = d4;
        this.l = d5;
        this.m = d6;
        this.o = d7;
        this.b = d8;
        this.c = d9;
        this.d = b;
        this.e = b2;
        this.f = i;
        this.g = b3;
        this.h = b4;
        this.a.a(d.a.HEARDATA);
    }

    public void a(int i) {
        this.f = i;
    }

    public double b() {
        return this.c;
    }

    public void b(byte b) {
        this.e = b;
    }

    public void b(double d) {
        this.c = d;
    }

    public byte c() {
        return this.d;
    }

    public void c(double d) {
        this.i = d;
    }

    public byte d() {
        return this.e;
    }

    public void d(double d) {
        this.j = d;
    }

    public int e() {
        return this.f;
    }

    public void e(double d) {
        this.k = d;
    }

    public byte f() {
        return this.g;
    }

    public void f(double d) {
        this.l = d;
    }

    public byte g() {
        return this.h;
    }

    public void g(double d) {
        this.m = d;
    }

    public double h() {
        return this.i;
    }

    public void h(double d) {
        this.n = d;
    }

    public double i() {
        return this.j;
    }

    public void i(double d) {
        this.o = d;
    }

    public double j() {
        return this.k;
    }

    public double k() {
        return this.l;
    }

    public double l() {
        return this.m;
    }

    public double m() {
        return this.n;
    }

    public double n() {
        return this.o;
    }

    public String toString() {
        return "HeardData{GroundSpeed=" + this.b + ", DownVelocity=" + this.c + ", Heartbeat=" + this.d + ", Disarm_count=" + this.e + ", FlightMode=" + this.f + ", rcReceiver=" + this.g + ", takeoffTag=" + this.h + ", ThrottleStick=" + this.i + ", rollangle=" + this.j + ", pitchangle=" + this.k + ", Headingangle=" + this.l + ", YawStick=" + this.m + ", PitchStick=" + this.n + ", RollStick=" + this.o + '}';
    }
}
