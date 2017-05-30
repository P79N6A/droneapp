package com.fimi.kernel.a;

import com.xiaomi.mipush.sdk.Constants;

public class e {
    public double a;
    public double b;

    public e(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public boolean equals(Object obj) {
        e eVar = (e) obj;
        return this.a == eVar.a && this.b == eVar.b;
    }

    public int hashCode() {
        return ((int) (this.a * this.b)) ^ 8;
    }

    public String toString() {
        return "(" + this.a + Constants.ACCEPT_TIME_SEPARATOR_SP + this.b + ")";
    }
}
