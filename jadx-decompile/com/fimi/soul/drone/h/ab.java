package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d;
import com.fimi.soul.drone.e;

public class ab extends e {
    public int b;
    public int c;
    public byte d;

    public ab(a aVar) {
        super(aVar);
    }

    public int a() {
        return this.b;
    }

    public void a(int i, int i2, byte b) {
        this.b = i;
        this.c = i2;
        this.d = b;
        if (this.a != null) {
            this.a.a(d.a.IMU_WORKSTATE);
        }
    }

    public byte b() {
        return this.d;
    }

    public int c() {
        return this.c;
    }

    public String toString() {
        return "IMUWorkStateInfo{isCheck=" + (this.d & 255) + "imuWorkState=" + (this.b & 255) + ", magWorkState=" + (this.c & 255) + "}";
    }
}
