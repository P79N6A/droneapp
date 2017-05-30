package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d;
import com.fimi.soul.drone.e;

public class ah extends e {
    private byte b;
    private byte c;
    private byte d;

    public ah(a aVar) {
        super(aVar);
    }

    public byte a() {
        return this.b;
    }

    public void a(byte b, byte b2, byte b3) {
        this.b = b;
        this.d = b2;
        this.c = b3;
        this.a.a(d.a.PowerBatteryProgress);
    }

    public byte b() {
        return this.c;
    }

    public byte c() {
        return this.d;
    }
}
