package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d;
import com.fimi.soul.drone.e;

public class an extends e {
    public int b;
    public int c;
    public int d;

    public an(a aVar) {
        super(aVar);
    }

    public int a() {
        return this.b;
    }

    public void a(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.a.a(d.a.RELEASECHAIN);
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public String toString() {
        return "ReleaseChainVariable{targetID=" + this.b + ", state=" + this.c + ", report=" + this.d + '}';
    }
}
