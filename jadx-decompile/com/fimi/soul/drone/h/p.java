package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.e;

public class p extends e {
    private byte b;
    private byte c;
    private byte d;
    private byte e;
    private byte f;

    public p(a aVar) {
        super(aVar);
    }

    public byte a() {
        return this.b;
    }

    public void a(byte b) {
        this.b = b;
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

    public String toString() {
        return "EVLightMode{msg_id=" + this.b + ", cmd_id=" + this.c + ", type=" + this.d + ", ev_hight=" + this.e + ", ev_low=" + this.f + '}';
    }
}
