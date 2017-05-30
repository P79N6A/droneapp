package com.fimi.soul.drone.c.a;

public class a {
    private static final int a = 0;
    private int b;

    public a() {
        a();
    }

    public void a() {
        this.b = 0;
    }

    public void a(int i) {
        this.b = ((i & 255) + this.b) % 65535;
    }

    public int b() {
        return (this.b >> 8) & 255;
    }

    public void b(int i) {
        int i2 = (i & 255) ^ (this.b & 255);
        i2 ^= (i2 << 4) & 255;
        this.b = ((i2 >> 4) & 15) ^ ((((this.b >> 8) & 255) ^ (i2 << 8)) ^ (i2 << 3));
    }

    public int c() {
        return this.b & 255;
    }
}
