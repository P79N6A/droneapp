package com.fimi.soul.module.setting;

import java.io.Serializable;

public class f implements Serializable {
    String a = "";
    String b = "";
    int c = 0;
    String d = "0 k";
    long e;
    int f = 0;
    boolean g = false;
    boolean h;
    private boolean i;

    public void a(int i) {
        this.c = i;
    }

    public void a(long j) {
        this.e = j;
    }

    public void a(String str) {
        this.a = str;
    }

    public void a(boolean z) {
        this.g = z;
    }

    public boolean a() {
        return this.g;
    }

    public String b() {
        return this.a;
    }

    public void b(int i) {
        this.f = i;
    }

    public void b(String str) {
        this.b = str;
    }

    public void b(boolean z) {
        this.i = z;
    }

    public String c() {
        return this.b;
    }

    public void c(String str) {
        this.d = str;
    }

    public void c(boolean z) {
        this.h = z;
    }

    public int d() {
        return this.c;
    }

    public String e() {
        return this.d;
    }

    public long f() {
        return this.e;
    }

    public int g() {
        return this.f;
    }

    public boolean h() {
        return this.i;
    }

    public boolean i() {
        return this.h;
    }

    public String toString() {
        return "LogFileEntity{fileName='" + this.a + '\'' + ", path='" + this.b + '\'' + ", hasSync=" + this.c + ", fileSize='" + this.d + '\'' + ", createDate=" + this.e + ", percent=" + this.f + ", iselect=" + this.g + ", isTitleItem=" + this.i + '}';
    }
}
