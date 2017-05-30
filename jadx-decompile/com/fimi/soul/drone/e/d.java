package com.fimi.soul.drone.e;

import java.io.Serializable;

public class d implements Serializable {
    private double a;
    private double b;

    public double a() {
        return this.a;
    }

    public void a(double d) {
        this.a = d;
    }

    public double b() {
        return this.b;
    }

    public void b(double d) {
        this.b = d;
    }

    public String toString() {
        return "GPSBean [lat=" + this.a + ", lon=" + this.b + "]";
    }
}
