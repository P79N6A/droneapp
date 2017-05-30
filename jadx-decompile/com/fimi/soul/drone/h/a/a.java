package com.fimi.soul.drone.h.a;

import com.fimi.soul.drone.e;
import com.fimi.soul.utils.af;
import com.fimi.soul.utils.z;

public class a extends e {
    public byte b;
    public byte c;
    public byte d;
    public short e;
    public short f;
    public short g;
    public short h;
    public float i;
    public float j;
    public byte k;

    public a(com.fimi.soul.drone.a aVar) {
        super(aVar);
    }

    public byte a() {
        return this.b;
    }

    public void a(byte b, byte b2, byte b3, short s, short s2, short s3, short s4, float f, float f2, byte b4) {
        if (com.fimi.soul.biz.n.a.a().b()) {
            this.i = f;
            this.j = f2;
        } else {
            af a = z.a((double) f2, (double) f);
            this.i = (float) a.b();
            this.j = (float) a.a();
        }
        this.b = b;
        this.c = b2;
        this.d = b3;
        this.e = s;
        this.f = s2;
        this.g = s3;
        this.h = s4;
        this.k = b4;
        this.a.a(com.fimi.soul.drone.d.a.TAKEPHOTOBACKDATA);
    }

    public byte b() {
        return this.k;
    }

    public float c() {
        return this.j;
    }

    public short d() {
        return this.h;
    }

    public float e() {
        return this.i;
    }

    public short f() {
        return this.f;
    }

    public short g() {
        return this.g;
    }

    public short h() {
        return this.e;
    }

    public byte i() {
        return this.d;
    }

    public byte j() {
        return this.c;
    }

    public String toString() {
        return "DroneTakePhotoBean{packPacket_sequence=" + this.b + ", CMD_ID=" + this.c + ", Mode=" + this.d + ", Route_Length=" + this.e + ", Climb_Angle=" + this.f + ", Route_Speed=" + this.g + ", Start_point_Altitude=" + this.h + ", Start_point_Longitude=" + this.i + ", Start_point_Latitude=" + this.j + ", report=" + this.k + '}';
    }
}
