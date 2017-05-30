package com.fimi.soul.module.update.a;

import java.io.Serializable;

public class e implements Serializable {
    private int a;
    private int b;
    private String c;
    private int d;
    private long e;
    private long f;
    private long g;
    private long h;
    private String i;

    public e(int i, int i2, int i3, String str, long j, long j2, long j3, long j4) {
        this.a = i2;
        this.b = i3;
        this.c = str;
        this.d = i;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
        if (i == 5) {
            this.i = Long.toString((((65535 & j) << 32) | ((65535 & j2) << 16)) | (65535 & j3));
        } else {
            this.i = String.valueOf(j) + String.valueOf(j2) + String.valueOf(j3) + String.valueOf(j4);
        }
    }

    public e(String str, int i, int i2) {
        this.c = str;
        this.d = i;
        this.b = i2;
    }

    public int a() {
        return this.a;
    }

    public void a(int i) {
        this.a = i;
    }

    public void a(long j) {
        this.e = j;
    }

    public void a(String str) {
        this.c = str;
    }

    public int b() {
        return this.b;
    }

    public void b(int i) {
        this.b = i;
    }

    public void b(long j) {
        this.f = j;
    }

    public void b(String str) {
        this.i = str;
    }

    public String c() {
        return this.c;
    }

    public void c(int i) {
        this.d = i;
    }

    public void c(long j) {
        this.g = j;
    }

    public int d() {
        return this.d;
    }

    public void d(long j) {
        this.h = j;
    }

    public long e() {
        return this.e;
    }

    public long f() {
        return this.f;
    }

    public long g() {
        return this.g;
    }

    public long h() {
        return this.h;
    }

    public String i() {
        return this.i;
    }
}
