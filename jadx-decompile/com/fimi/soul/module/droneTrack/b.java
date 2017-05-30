package com.fimi.soul.module.droneTrack;

import java.io.Serializable;

public class b implements Serializable {
    private int a;
    private int b;

    public int a() {
        return this.a;
    }

    public void a(int i) {
        this.a = i;
    }

    public void a(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public int b() {
        return this.b;
    }

    public void b(int i) {
        this.b = i;
    }

    public String toString() {
        return this.a + ",           " + this.b + ",           ";
    }
}
