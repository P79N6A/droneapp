package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.e;

public class x extends e {
    private byte b = (byte) 0;
    private short c = (short) 0;
    private byte d = (byte) 0;

    public x(a aVar) {
        super(aVar);
    }

    public byte a() {
        return this.b;
    }

    public void a(byte b) {
        this.b = b;
    }

    public void a(short s) {
        this.c = (short) (s & 255);
    }

    public short b() {
        return this.c;
    }

    public void b(byte b) {
        this.d = b;
    }

    public byte c() {
        return this.d;
    }

    public String toString() {
        return "GimbalVariable [pitch_angle=" + this.c;
    }
}
