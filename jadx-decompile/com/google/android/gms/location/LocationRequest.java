package com.google.android.gms.location;

import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.tencent.mm.sdk.platformtools.LocaleUtil;
import com.tencent.mm.sdk.platformtools.Util;

public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final m CREATOR = new m();
    public static final int a = 100;
    public static final int b = 102;
    public static final int c = 104;
    public static final int d = 105;
    int e;
    long f;
    long g;
    boolean h;
    long i;
    int j;
    float k;
    long l;
    private final int m;

    public LocationRequest() {
        this.m = 1;
        this.e = 102;
        this.f = Util.MILLSECONDS_OF_HOUR;
        this.g = 600000;
        this.h = false;
        this.i = Long.MAX_VALUE;
        this.j = Integer.MAX_VALUE;
        this.k = 0.0f;
        this.l = 0;
    }

    LocationRequest(int i, int i2, long j, long j2, boolean z, long j3, int i3, float f, long j4) {
        this.m = i;
        this.e = i2;
        this.f = j;
        this.g = j2;
        this.h = z;
        this.i = j3;
        this.j = i3;
        this.k = f;
        this.l = j4;
    }

    public static LocationRequest a() {
        return new LocationRequest();
    }

    private static void b(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("invalid displacement: " + f);
        }
    }

    public static String c(int i) {
        switch (i) {
            case 100:
                return "PRIORITY_HIGH_ACCURACY";
            case 102:
                return "PRIORITY_BALANCED_POWER_ACCURACY";
            case 104:
                return "PRIORITY_LOW_POWER";
            case 105:
                return "PRIORITY_NO_POWER";
            default:
                return "???";
        }
    }

    private static void d(int i) {
        switch (i) {
            case 100:
            case 102:
            case 104:
            case 105:
                return;
            default:
                throw new IllegalArgumentException("invalid quality: " + i);
        }
    }

    private static void f(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("invalid interval: " + j);
        }
    }

    public LocationRequest a(float f) {
        b(f);
        this.k = f;
        return this;
    }

    public LocationRequest a(int i) {
        d(i);
        this.e = i;
        return this;
    }

    public LocationRequest a(long j) {
        f(j);
        this.f = j;
        if (!this.h) {
            this.g = (long) (((double) this.f) / 6.0d);
        }
        return this;
    }

    public int b() {
        return this.e;
    }

    public LocationRequest b(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("invalid numUpdates: " + i);
        }
        this.j = i;
        return this;
    }

    public LocationRequest b(long j) {
        f(j);
        this.l = j;
        return this;
    }

    public long c() {
        return this.f;
    }

    public LocationRequest c(long j) {
        f(j);
        this.h = true;
        this.g = j;
        return this;
    }

    public long d() {
        long j = this.l;
        return j < this.f ? this.f : j;
    }

    public LocationRequest d(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (j > Long.MAX_VALUE - elapsedRealtime) {
            this.i = Long.MAX_VALUE;
        } else {
            this.i = elapsedRealtime + j;
        }
        if (this.i < 0) {
            this.i = 0;
        }
        return this;
    }

    public long e() {
        return this.g;
    }

    public LocationRequest e(long j) {
        this.i = j;
        if (this.i < 0) {
            this.i = 0;
        }
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        return this.e == locationRequest.e && this.f == locationRequest.f && this.g == locationRequest.g && this.h == locationRequest.h && this.i == locationRequest.i && this.j == locationRequest.j && this.k == locationRequest.k;
    }

    public long f() {
        return this.i;
    }

    public int g() {
        return this.j;
    }

    public float h() {
        return this.k;
    }

    public int hashCode() {
        return c.a(new Object[]{Integer.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Boolean.valueOf(this.h), Long.valueOf(this.i), Integer.valueOf(this.j), Float.valueOf(this.k)});
    }

    int i() {
        return this.m;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Request[").append(c(this.e));
        if (this.e != 105) {
            stringBuilder.append(" requested=");
            stringBuilder.append(this.f).append(LocaleUtil.MALAY);
        }
        stringBuilder.append(" fastest=");
        stringBuilder.append(this.g).append(LocaleUtil.MALAY);
        if (this.l > this.f) {
            stringBuilder.append(" maxWait=");
            stringBuilder.append(this.l).append(LocaleUtil.MALAY);
        }
        if (this.i != Long.MAX_VALUE) {
            long elapsedRealtime = this.i - SystemClock.elapsedRealtime();
            stringBuilder.append(" expireIn=");
            stringBuilder.append(elapsedRealtime).append(LocaleUtil.MALAY);
        }
        if (this.j != Integer.MAX_VALUE) {
            stringBuilder.append(" num=").append(this.j);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        m.a(this, parcel, i);
    }
}
