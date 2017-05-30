package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class DeviceStatus extends AbstractSafeParcelable {
    public static final Creator<DeviceStatus> CREATOR = new g();
    private final int a;
    private double b;
    private boolean c;
    private int d;
    private ApplicationMetadata e;
    private int f;

    public DeviceStatus() {
        this(3, Double.NaN, false, -1, null, -1);
    }

    DeviceStatus(int i, double d, boolean z, int i2, ApplicationMetadata applicationMetadata, int i3) {
        this.a = i;
        this.b = d;
        this.c = z;
        this.d = i2;
        this.e = applicationMetadata;
        this.f = i3;
    }

    public int a() {
        return this.a;
    }

    public double b() {
        return this.b;
    }

    public boolean c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public int e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DeviceStatus)) {
            return false;
        }
        DeviceStatus deviceStatus = (DeviceStatus) obj;
        return this.b == deviceStatus.b && this.c == deviceStatus.c && this.d == deviceStatus.d && f.a(this.e, deviceStatus.e) && this.f == deviceStatus.f;
    }

    public ApplicationMetadata f() {
        return this.e;
    }

    public int hashCode() {
        return c.a(Double.valueOf(this.b), Boolean.valueOf(this.c), Integer.valueOf(this.d), this.e, Integer.valueOf(this.f));
    }

    public void writeToParcel(Parcel parcel, int i) {
        g.a(this, parcel, i);
    }
}
