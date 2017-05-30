package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.awareness.state.b;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.sw;
import com.xiaomi.mipush.sdk.Constants;

public class WeatherImpl extends AbstractSafeParcelable implements b {
    public static final Creator<WeatherImpl> CREATOR = new o();
    private final int m;
    private final float n;
    private final float o;
    private final float p;
    private final int q;
    private final int[] r;

    WeatherImpl(int i, float f, float f2, float f3, int i2, int[] iArr) {
        this.m = i;
        this.n = f;
        this.o = f2;
        this.p = f3;
        this.q = i2;
        this.r = iArr;
    }

    private static float a(float f) {
        return (5.0f * (f - 32.0f)) / 9.0f;
    }

    static float a(int i, float f) {
        switch (i) {
            case 1:
                return f;
            case 2:
                return a(f);
            default:
                sw.a("WeatherImpl", "Invalid temperature unit %s", Integer.valueOf(i));
                throw new IllegalArgumentException("Invalid temperature unit");
        }
    }

    public float a(int i) {
        return a(i, this.p);
    }

    int a() {
        return this.m;
    }

    public float b() {
        return this.p;
    }

    public float b(int i) {
        return a(i, this.o);
    }

    public float c() {
        return this.o;
    }

    public float c(int i) {
        return a(i, this.n);
    }

    public float d() {
        return this.n;
    }

    public int e() {
        return this.q;
    }

    public int[] f() {
        return this.r;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Temp=").append(c(1)).append("F/").append(c(2)).append("C, Feels=").append(b(1)).append("F/").append(b(2)).append("C, Dew=").append(a(1)).append("F/").append(a(2)).append("C, Humidity=").append(e()).append(", Condition=");
        if (f() == null) {
            stringBuilder.append("unknown");
        } else {
            stringBuilder.append("[");
            int[] f = f();
            int length = f.length;
            int i = 1;
            int i2 = 0;
            while (i2 < length) {
                int i3 = f[i2];
                if (i == 0) {
                    stringBuilder.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                }
                stringBuilder.append(i3);
                i2++;
                i = 0;
            }
            stringBuilder.append("]");
        }
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        o.a(this, parcel, i);
    }
}
