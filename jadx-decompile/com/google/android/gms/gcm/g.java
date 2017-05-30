package com.google.android.gms.gcm;

import android.os.Bundle;

public class g {
    public static final g a = new g(0, 30, 3600);
    public static final g b = new g(1, 30, 3600);
    private final int c;
    private final int d;
    private final int e;

    private g(int i, int i2, int i3) {
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public int a() {
        return this.c;
    }

    public Bundle a(Bundle bundle) {
        bundle.putInt("retry_policy", this.c);
        bundle.putInt("initial_backoff_seconds", this.d);
        bundle.putInt("maximum_backoff_seconds", this.e);
        return bundle;
    }

    public int b() {
        return this.d;
    }

    public int c() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return gVar.c == this.c && gVar.d == this.d && gVar.e == this.e;
    }

    public int hashCode() {
        return (((((this.c + 1) ^ 1000003) * 1000003) ^ this.d) * 1000003) ^ this.e;
    }

    public String toString() {
        int i = this.c;
        int i2 = this.d;
        return "policy=" + i + " initial_backoff=" + i2 + " maximum_backoff=" + this.e;
    }
}
