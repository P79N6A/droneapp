package com.fimi.soul.drone.h.a;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d;
import com.fimi.soul.entity.DroneModelType;

public class e extends com.fimi.soul.drone.e {
    private byte b;
    private byte c = (byte) 50;
    private byte d;
    private byte e = (byte) 90;
    private byte f;
    private byte g;
    private byte h;
    private DroneModelType i = new DroneModelType();

    public e(a aVar) {
        super(aVar);
    }

    public byte a() {
        return this.e;
    }

    public void a(byte b, byte b2, byte b3, byte b4, byte b5, byte b6, byte b7) {
        this.b = b;
        this.c = b2;
        this.i.setCtrlType(b);
        this.i.setCtrlMode(b2);
        this.e = b4;
        this.f = b5;
        this.g = b6;
        this.d = b3;
        this.h = b7;
        if (this.a != null) {
            this.a.a(d.a.NEWFRONEMODEL);
        }
    }

    public byte b() {
        return this.g;
    }

    public byte c() {
        return this.f;
    }

    public byte d() {
        return this.b;
    }

    public byte e() {
        return this.c;
    }

    public byte f() {
        return this.d;
    }

    public DroneModelType g() {
        return this.i;
    }

    public String toString() {
        return "NewDroneModel{CtrlType=" + this.b + ", CtrlMode=" + this.c + ", WP_STA=" + this.d + '}';
    }
}
