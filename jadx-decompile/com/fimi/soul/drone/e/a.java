package com.fimi.soul.drone.e;

import java.io.Serializable;

public class a implements Serializable {
    private int a;
    private int b;
    private int c;
    private long d;
    private long e;
    private long f;
    private long g;
    private char h;

    public a(int i, int i2, int i3, char c, long j, long j2, long j3, long j4) {
        this.c = i;
        this.a = i2;
        this.b = i3;
        this.h = c;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
    }

    public int a() {
        return this.a;
    }

    public void a(char c) {
        this.h = c;
    }

    public void a(int i) {
        this.a = i;
    }

    public void a(long j) {
        this.d = j;
    }

    public void a(short s) {
        this.b = s;
    }

    public int b() {
        return this.c;
    }

    public void b(int i) {
        this.c = i;
    }

    public void b(long j) {
        this.e = j;
    }

    public int c() {
        return this.b;
    }

    public void c(long j) {
        this.g = j;
    }

    public long d() {
        return this.d;
    }

    public void d(long j) {
        this.f = j;
    }

    public long e() {
        return this.e;
    }

    public long f() {
        return this.g;
    }

    public long g() {
        return this.f;
    }

    public long h() {
        return Long.valueOf((long) this.h).longValue();
    }

    public String toString() {
        return "DroneUpdateInfo{model=" + this.a + ", version=" + this.b + ", type=" + this.c + ", IDA=" + this.d + ", IDB=" + this.e + ", IDC=" + this.f + ", IDD=" + this.g + ", hwVersion=" + this.h + '}';
    }
}
