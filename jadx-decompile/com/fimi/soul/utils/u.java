package com.fimi.soul.utils;

import java.io.Serializable;

public class u implements Serializable {
    private String a;
    private String b;
    private long c;
    private double d;

    public String a() {
        return this.a;
    }

    public void a(double d) {
        this.d = d;
    }

    public void a(long j) {
        this.c = j;
    }

    public void a(String str) {
        this.a = str;
    }

    public String b() {
        return this.b;
    }

    public void b(String str) {
        this.b = str;
    }

    public long c() {
        return this.c;
    }

    public double d() {
        return this.d;
    }

    public String toString() {
        return "FlyRecordEntity{user_id='" + this.a + '\'' + ", drone_id='" + this.b + '\'' + ", flyTime=" + this.c + ", flyDistance=" + this.d + '}';
    }
}
