package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d;
import com.fimi.soul.drone.e;

public class az extends e {
    public byte b;
    public short c;
    public byte d;

    public az(a aVar) {
        super(aVar);
    }

    public short a() {
        return this.c;
    }

    public void a(byte b, short s, byte b2) {
        this.b = b;
        this.c = s;
        this.d = b2;
        this.a.a(d.a.UPDATEDRONEREPORT);
    }

    public byte b() {
        return this.d;
    }

    public byte c() {
        return this.b;
    }

    public String toString() {
        return "UpdateDronerepory{target_ID=" + this.b + ", Packet_sequence=" + this.c + ", report=" + this.d + '}';
    }
}
