package com.google.android.gms.location.internal;

import android.annotation.SuppressLint;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.f;
import java.util.Locale;

public class ParcelableGeofence extends AbstractSafeParcelable implements f {
    public static final o CREATOR = new o();
    private final int e;
    private final String f;
    private final long g;
    private final short h;
    private final double i;
    private final double j;
    private final float k;
    private final int l;
    private final int m;
    private final int n;

    public ParcelableGeofence(int i, String str, int i2, short s, double d, double d2, float f, long j, int i3, int i4) {
        a(str);
        a(f);
        a(d, d2);
        int a = a(i2);
        this.e = i;
        this.h = s;
        this.f = str;
        this.i = d;
        this.j = d2;
        this.k = f;
        this.g = j;
        this.l = a;
        this.m = i3;
        this.n = i4;
    }

    public ParcelableGeofence(String str, int i, short s, double d, double d2, float f, long j, int i2, int i3) {
        this(1, str, i, s, d, d2, f, j, i2, i3);
    }

    private static int a(int i) {
        int i2 = i & 7;
        if (i2 != 0) {
            return i2;
        }
        throw new IllegalArgumentException("No supported transition specified: " + i);
    }

    public static ParcelableGeofence a(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        ParcelableGeofence parcelableGeofence = (ParcelableGeofence) CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return parcelableGeofence;
    }

    private static void a(double d, double d2) {
        if (d > 90.0d || d < -90.0d) {
            throw new IllegalArgumentException("invalid latitude: " + d);
        } else if (d2 > 180.0d || d2 < -180.0d) {
            throw new IllegalArgumentException("invalid longitude: " + d2);
        }
    }

    private static void a(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("invalid radius: " + f);
        }
    }

    private static void a(String str) {
        if (str == null || str.length() > 100) {
            String str2 = "requestId is null or too long: ";
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }

    @SuppressLint({"DefaultLocale"})
    private static String b(int i) {
        switch (i) {
            case 1:
                return "CIRCLE";
            default:
                return null;
        }
    }

    public String a() {
        return this.f;
    }

    public int b() {
        return this.e;
    }

    public short c() {
        return this.h;
    }

    public double d() {
        return this.i;
    }

    public double e() {
        return this.j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof ParcelableGeofence)) {
            return false;
        }
        ParcelableGeofence parcelableGeofence = (ParcelableGeofence) obj;
        return this.k != parcelableGeofence.k ? false : this.i != parcelableGeofence.i ? false : this.j != parcelableGeofence.j ? false : this.h == parcelableGeofence.h;
    }

    public float f() {
        return this.k;
    }

    public long g() {
        return this.g;
    }

    public int h() {
        return this.l;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.i);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.j);
        return (((((((i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.k)) * 31) + this.h) * 31) + this.l;
    }

    public int i() {
        return this.m;
    }

    public int j() {
        return this.n;
    }

    public String toString() {
        return String.format(Locale.US, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", new Object[]{b(this.h), this.f, Integer.valueOf(this.l), Double.valueOf(this.i), Double.valueOf(this.j), Float.valueOf(this.k), Integer.valueOf(this.m / 1000), Integer.valueOf(this.n), Long.valueOf(this.g)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        o oVar = CREATOR;
        o.a(this, parcel, i);
    }
}
