package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.ac;
import it.a.a.e;

public final class d {
    public static final int a = -1;
    public static final int b = -2;
    public static final d c = new d(320, 50, "320x50_mb");
    public static final d d = new d(468, 60, "468x60_as");
    public static final d e = new d(320, 100, "320x100_as");
    public static final d f = new d(728, 90, "728x90_as");
    public static final d g = new d(300, e.G, "300x250_as");
    public static final d h = new d(160, 600, "160x600_as");
    public static final d i = new d(-1, -2, "smart_banner");
    public static final d j = new d(-3, -4, "fluid");
    public static final d k = new d(-3, 0, "search_v2");
    private final int l;
    private final int m;
    private final String n;

    public d(int i, int i2) {
        String valueOf = i == -1 ? "FULL" : String.valueOf(i);
        String valueOf2 = i2 == -2 ? "AUTO" : String.valueOf(i2);
        String valueOf3 = String.valueOf("_as");
        this(i, i2, new StringBuilder(((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append(valueOf).append("x").append(valueOf2).append(valueOf3).toString());
    }

    d(int i, int i2, String str) {
        if (i < 0 && i != -1 && i != -3) {
            throw new IllegalArgumentException("Invalid width for AdSize: " + i);
        } else if (i2 >= 0 || i2 == -2 || i2 == -4) {
            this.l = i;
            this.m = i2;
            this.n = str;
        } else {
            throw new IllegalArgumentException("Invalid height for AdSize: " + i2);
        }
    }

    public int a() {
        return this.m;
    }

    public int a(Context context) {
        switch (this.m) {
            case -4:
            case -3:
                return -1;
            case -2:
                return AdSizeParcel.b(context.getResources().getDisplayMetrics());
            default:
                return ac.a().a(context, this.m);
        }
    }

    public int b() {
        return this.l;
    }

    public int b(Context context) {
        switch (this.l) {
            case -4:
            case -3:
                return -1;
            case -1:
                return AdSizeParcel.a(context.getResources().getDisplayMetrics());
            default:
                return ac.a().a(context, this.l);
        }
    }

    public boolean c() {
        return this.m == -2;
    }

    public boolean d() {
        return this.l == -1;
    }

    public boolean e() {
        return this.l == -3 && this.m == -4;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.l == dVar.l && this.m == dVar.m && this.n.equals(dVar.n);
    }

    public int hashCode() {
        return this.n.hashCode();
    }

    public String toString() {
        return this.n;
    }
}
