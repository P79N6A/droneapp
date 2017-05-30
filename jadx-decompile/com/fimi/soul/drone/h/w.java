package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d;
import com.fimi.soul.drone.e;

public class w extends e {
    private byte b;
    private byte c;
    private byte d;
    private byte e;

    public w(a aVar) {
        super(aVar);
    }

    public byte a() {
        return this.d;
    }

    public void a(byte b, byte b2, byte b3, byte b4) {
        this.b = b;
        this.c = b2;
        this.d = b3;
        this.e = b4;
        this.a.a(d.a.GimbalCalibration);
    }

    public byte b() {
        return this.e;
    }

    public byte c() {
        return this.b;
    }

    public byte d() {
        return this.c;
    }
}
