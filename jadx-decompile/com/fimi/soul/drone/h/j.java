package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d;
import com.fimi.soul.drone.e;

public class j extends e {
    private byte b;
    private byte c;
    private byte d;
    private byte e;
    private byte f;

    public j(a aVar) {
        super(aVar);
    }

    public byte a() {
        return this.b;
    }

    public void a(byte b) {
        this.b = b;
    }

    public void a(byte b, byte b2, byte b3, byte b4, byte b5) {
        this.b = b;
        this.c = b2;
        this.d = b3;
        this.e = b4;
        this.f = b5;
        this.a.a(d.a.CaliCompass);
    }

    public byte b() {
        return this.f;
    }

    public void b(byte b) {
        this.f = b;
    }

    public byte c() {
        return this.e;
    }

    public void c(byte b) {
        this.e = b;
    }

    public byte d() {
        return this.d;
    }

    public void d(byte b) {
        this.d = b;
    }

    public byte e() {
        return this.c;
    }

    public void e(byte b) {
        this.c = b;
    }

    public String toString() {
        return "Compass{packetSeq=" + this.b + ", caliType=" + this.c + ", caliStep=" + this.d + ", caliStepStatus=" + this.e + ", report=" + this.f + '}';
    }
}
