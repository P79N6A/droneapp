package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d;
import com.fimi.soul.drone.e;
import com.fimi.soul.utils.af;
import com.fimi.soul.utils.z;

public class ak extends e {
    public double b;
    public int c;
    public double d;
    public double e;
    public double f;
    public short g;
    public int h;
    public int i;
    public byte j;
    public byte k;
    public byte l;

    public ak(a aVar) {
        super(aVar);
    }

    public byte a() {
        return this.l;
    }

    public void a(double d, int i, float f, float f2, double d2, short s, int i2, int i3, byte b, byte b2, byte b3) {
        if (com.fimi.soul.biz.n.a.a().b()) {
            this.d = (double) f;
            this.e = (double) f2;
        } else {
            af a = z.a((double) f2, (double) f);
            this.d = a.b();
            this.e = a.a();
        }
        this.b = d;
        this.c = i;
        this.f = d2;
        this.g = s;
        this.h = i2 & 255;
        this.i = i3 & 255;
        this.j = b;
        this.k = b2;
        this.l = b3;
        this.a.a(d.a.RETURNINTERESTWAYPOIT);
    }

    public byte b() {
        return this.k;
    }

    public byte c() {
        return this.j;
    }

    public int d() {
        return this.i;
    }

    public int e() {
        return this.h;
    }

    public short f() {
        return this.g;
    }

    public double g() {
        return this.f;
    }

    public double h() {
        return this.e;
    }

    public double i() {
        return this.d;
    }

    public int j() {
        return this.c;
    }

    public double k() {
        return this.b;
    }

    public String toString() {
        return "ReceiveSettingPoint{PacketSequence=" + this.b + ", Opration_Code=" + this.c + ", POI_Longitude=" + this.d + ", POI_Latitude=" + this.e + ", POI_Altitude=" + this.f + ", Radius=" + this.g + ", speek=" + this.h + ", Start_Point_Pole_Angle=" + this.i + ", Paral=" + this.j + ", yaw_mode=" + this.k + ", report=" + this.l + '}';
    }
}
