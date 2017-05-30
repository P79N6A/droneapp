package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.e;
import com.fimi.soul.utils.ao;

public class ad extends e {
    private byte b;
    private short c;
    private short d;
    private short e;
    private short f;
    private short g;
    private short h;
    private short i;
    private volatile short j;
    private byte k;

    public ad(a aVar) {
        super(aVar);
    }

    public int a(int i, int i2) {
        return ((1 << i2) & i) >> i2;
    }

    public void a(byte b) {
        this.b = b;
    }

    public void a(short s) {
        this.j = s;
    }

    public boolean a() {
        return 1 == a(this.j, 4);
    }

    public short b() {
        return this.j;
    }

    public void b(byte b) {
        this.k = b;
    }

    public void b(short s) {
        this.i = s;
    }

    public short c() {
        return this.i;
    }

    public void c(short s) {
        this.h = s;
    }

    public short d() {
        return this.h;
    }

    public void d(short s) {
        this.g = s;
    }

    public short e() {
        return this.g;
    }

    public void e(short s) {
        this.f = s;
    }

    public short f() {
        return this.f;
    }

    public void f(short s) {
        this.e = s;
    }

    public short g() {
        return this.e;
    }

    public void g(short s) {
        this.d = s;
    }

    public short h() {
        return this.d;
    }

    public void h(short s) {
        this.c = s;
    }

    public short i() {
        return this.c;
    }

    public byte j() {
        return this.b;
    }

    public boolean k() {
        return ao.a(this.j, 4) == 0;
    }

    public byte l() {
        return this.k;
    }

    public boolean m() {
        return ao.a(this.k, Math.abs(0)) > 0;
    }

    public boolean n() {
        return ao.a(this.k, Math.abs(1)) > 0;
    }

    public String toString() {
        return "NewRemoteMode{type=" + this.b + ", AD_Value0=" + this.c + ", AD_Value1=" + this.d + ", AD_Value2=" + this.e + ", AD_Value3=" + this.f + ", AD_Value4=" + this.g + ", AD_Value5=" + this.h + ", battery_voltage=" + this.i + ", statuts=" + this.j + '}';
    }
}
