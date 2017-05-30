package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d;
import com.fimi.soul.drone.e;

public class n extends e {
    public byte b;
    public byte c;
    public float d;
    public byte e;

    public n(a aVar) {
        super(aVar);
    }

    public byte a() {
        return this.b;
    }

    public void a(byte b) {
        this.b = b;
    }

    public void a(byte b, byte b2, float f, byte b3) {
        this.b = b;
        this.c = b2;
        this.d = f;
        this.e = b3;
        this.a.a(d.a.RETURN_HEIGHT);
    }

    public void a(float f) {
        this.d = f;
    }

    public byte b() {
        return this.c;
    }

    public void b(byte b) {
        this.c = b;
    }

    public float c() {
        return this.d;
    }

    public void c(byte b) {
        this.e = b;
    }

    public byte d() {
        return this.e;
    }

    public String toString() {
        return "DroneRTHVariable{packPacketSequence=" + this.b + ", cmdID=" + this.c + ", height=" + this.d + ", report=" + this.e + '}';
    }
}
