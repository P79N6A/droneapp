package com.fimi.soul.utils;

import java.util.Locale;

public class ag {
    private double a;

    public ag(double d) {
        a(d);
    }

    public double a() {
        return this.a;
    }

    public void a(double d) {
        this.a = d;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ag) && this.a == ((ag) obj).a;
    }

    public String toString() {
        if (this.a >= 1000.0d) {
            return String.format(Locale.US, "%2.1f km", new Object[]{Double.valueOf(this.a / 1000.0d)});
        } else if (this.a >= 1.0d) {
            return String.format(Locale.US, "%2.1f m", new Object[]{Double.valueOf(this.a)});
        } else if (this.a < 0.001d) {
            return this.a + " m";
        } else {
            return String.format(Locale.US, "%2.1f mm", new Object[]{Double.valueOf(this.a * 1000.0d)});
        }
    }
}
