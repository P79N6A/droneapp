package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d;
import com.fimi.soul.drone.e;
import java.text.DecimalFormat;

public class k extends e {
    public short b;
    public short c;
    public short d;
    public short e;
    public short f;
    public short g;

    public k(a aVar) {
        super(aVar);
    }

    public double a(float f, float f2, float f3) {
        return Math.sqrt((StrictMath.pow((double) f, 2.0d) + StrictMath.pow((double) f2, 2.0d)) + StrictMath.pow((double) f3, 2.0d));
    }

    public float a() {
        return ((float) (Math.round((float) (this.b * 100)) / 100)) / 100.0f;
    }

    public void a(short s, short s2, short s3, short s4, short s5, short s6) {
        this.b = s;
        this.c = s2;
        this.d = s3;
        this.e = s4;
        this.f = s5;
        this.g = s6;
        if (this.a != null) {
            this.a.a(d.a.IMU_COMPASS);
        }
    }

    public float b() {
        return ((float) (Math.round((float) (this.c * 100)) / 100)) / 100.0f;
    }

    public float c() {
        return ((float) (Math.round((float) (this.d * 100)) / 100)) / 100.0f;
    }

    public String d() {
        return new DecimalFormat("##0.00").format(a(a(), b(), c()));
    }

    public float e() {
        return ((float) (Math.round((float) (this.e * 100)) / 100)) / 100.0f;
    }

    public float f() {
        return ((float) (Math.round((float) (this.f * 100)) / 100)) / 100.0f;
    }

    public float g() {
        return ((float) (Math.round((float) (this.g * 100)) / 100)) / 100.0f;
    }

    public String h() {
        return new DecimalFormat("##0.00").format(a(e(), f(), g()));
    }

    public String toString() {
        return "CompassInfo{compassOneX=" + this.b + ", compassOneY=" + this.c + ", compassOneZ=" + this.d + ", compassTwoX=" + this.e + ", compassTwoY=" + this.f + ", compassTwoZ=" + this.g + '}';
    }
}
