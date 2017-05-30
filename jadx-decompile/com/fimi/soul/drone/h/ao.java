package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d;
import com.fimi.soul.drone.e;

public class ao extends e {
    private byte b;
    private byte c;
    private byte d;
    private byte e;
    private byte f;
    private byte g;

    public ao(a aVar) {
        super(aVar);
    }

    public byte a() {
        return this.b;
    }

    public void a(byte b) {
        this.b = b;
    }

    public void a(byte b, byte b2, byte b3, byte b4, byte b5, byte b6) {
        this.b = b;
        this.c = b2;
        this.d = b3;
        this.e = b4;
        this.f = b5;
        this.g = b6;
        if (this.a != null) {
            this.a.a(d.a.Remotecontrol);
        }
    }

    public byte b() {
        return this.c;
    }

    public void b(byte b) {
        this.g = b;
    }

    public byte c() {
        return this.d;
    }

    public byte d() {
        return this.e;
    }

    public byte e() {
        return this.f;
    }

    public byte f() {
        return this.g;
    }

    public boolean g() {
        return com.fimi.soul.utils.ao.a(this.f, Math.abs(0)) > 0;
    }

    public boolean h() {
        return com.fimi.soul.utils.ao.a(this.f, Math.abs(1)) > 0;
    }
}
