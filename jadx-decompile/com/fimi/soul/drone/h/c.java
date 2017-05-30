package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d;
import com.fimi.soul.drone.e;

public class c extends e {
    public byte b;
    public byte c;
    public byte d;

    public c(a aVar) {
        super(aVar);
    }

    public byte a() {
        return this.d;
    }

    public void a(byte b, byte b2, byte b3) {
        this.b = b;
        this.c = b2;
        this.d = b3;
        if (this.a != null) {
            this.a.a(d.a.backControl);
        }
    }

    public byte b() {
        return this.b;
    }

    public byte c() {
        return this.c;
    }

    public byte d() {
        return this.d;
    }

    public String toString() {
        return "BackControl [model=" + this.b + ", status=" + this.c + ", action=" + this.d + "]";
    }
}
