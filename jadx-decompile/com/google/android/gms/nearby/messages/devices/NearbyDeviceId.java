package com.google.android.gms.nearby.messages.devices;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.c;
import com.google.android.gms.nearby.messages.d;

public class NearbyDeviceId extends AbstractSafeParcelable {
    public static final Creator<NearbyDeviceId> CREATOR = new c();
    public static final NearbyDeviceId a = new NearbyDeviceId();
    final int b;
    final byte[] c;
    private final int d;
    private final c e;
    private final d f;

    private NearbyDeviceId() {
        this(1, 1, null);
    }

    NearbyDeviceId(int i, int i2, byte[] bArr) {
        d dVar = null;
        this.b = i;
        this.d = i2;
        this.c = bArr;
        this.e = i2 == 2 ? new c(bArr) : null;
        if (i2 == 3) {
            dVar = new d(bArr);
        }
        this.f = dVar;
    }

    public int a() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyDeviceId)) {
            return false;
        }
        NearbyDeviceId nearbyDeviceId = (NearbyDeviceId) obj;
        return com.google.android.gms.common.internal.c.a(Integer.valueOf(this.d), Integer.valueOf(nearbyDeviceId.d)) && com.google.android.gms.common.internal.c.a(this.c, nearbyDeviceId.c);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.c.a(new Object[]{Integer.valueOf(this.d), this.c});
    }

    public String toString() {
        StringBuilder append = new StringBuilder().append("NearbyDeviceId{");
        switch (this.d) {
            case 1:
                append.append("UNKNOWN");
                break;
            case 2:
                append.append("eddystoneUid=").append(this.e);
                break;
            case 3:
                append.append("iBeaconId=").append(this.f);
                break;
        }
        append.append("}");
        return append.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        c.a(this, parcel, i);
    }
}
