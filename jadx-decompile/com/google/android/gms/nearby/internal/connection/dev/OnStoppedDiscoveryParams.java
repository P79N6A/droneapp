package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class OnStoppedDiscoveryParams extends AbstractSafeParcelable {
    public static final Creator<OnStoppedDiscoveryParams> CREATOR = new ag();
    final int a;
    private final int b;

    OnStoppedDiscoveryParams(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public int a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnStoppedDiscoveryParams)) {
            return false;
        }
        OnStoppedDiscoveryParams onStoppedDiscoveryParams = (OnStoppedDiscoveryParams) obj;
        return this.a == onStoppedDiscoveryParams.a && c.a(Integer.valueOf(this.b), Integer.valueOf(onStoppedDiscoveryParams.b));
    }

    public int hashCode() {
        return c.a(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        ag.a(this, parcel, i);
    }
}
