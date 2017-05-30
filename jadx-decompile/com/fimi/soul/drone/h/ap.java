package com.fimi.soul.drone.h;

import com.fimi.soul.drone.a;
import com.fimi.soul.drone.d;
import com.fimi.soul.drone.e;

public class ap extends e {
    public int b;

    public ap(a aVar) {
        super(aVar);
    }

    public int a() {
        return this.b;
    }

    public void a(int i) {
        this.b = i;
        this.a.a(d.a.RESETRC);
    }

    public String toString() {
        return "RestVariable{targetID=" + this.b + '}';
    }
}
