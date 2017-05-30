package com.google.android.gms.nearby.messages.devices;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class NearbyDevice extends AbstractSafeParcelable {
    public static final Creator<NearbyDevice> CREATOR = new a();
    public static final NearbyDevice a = new NearbyDevice("", g, h);
    private static final NearbyDeviceId[] g = new NearbyDeviceId[0];
    private static final String[] h = new String[0];
    final int b;
    @Deprecated
    final NearbyDeviceId c;
    @Nullable
    @Deprecated
    final String d;
    @Deprecated
    final NearbyDeviceId[] e;
    @Deprecated
    final String[] f;
    private final String i;

    NearbyDevice(int i, @Nullable NearbyDeviceId nearbyDeviceId, @Nullable String str, @Nullable String str2, @Nullable NearbyDeviceId[] nearbyDeviceIdArr, @Nullable String[] strArr) {
        this.b = ((Integer) d.a(Integer.valueOf(i))).intValue();
        if (str2 == null) {
            str2 = "";
        }
        this.i = str2;
        if (nearbyDeviceIdArr == null) {
            nearbyDeviceIdArr = g;
        }
        this.e = nearbyDeviceIdArr;
        if (strArr == null) {
            strArr = h;
        }
        this.f = strArr;
        this.c = this.e.length == 0 ? NearbyDeviceId.a : this.e[0];
        this.d = this.f.length == 0 ? null : this.f[0];
    }

    @Deprecated
    public NearbyDevice(String str, NearbyDeviceId[] nearbyDeviceIdArr, String[] strArr) {
        this(1, null, null, str, nearbyDeviceIdArr, strArr);
    }

    public String a() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyDevice)) {
            return false;
        }
        return c.a(this.i, ((NearbyDevice) obj).i);
    }

    public int hashCode() {
        return c.a(this.i);
    }

    public String toString() {
        String str = this.i;
        return new StringBuilder(String.valueOf(str).length() + 21).append("NearbyDevice{handle=").append(str).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        a.a(this, parcel, i);
    }
}
