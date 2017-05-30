package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class StopDiscoveryParams extends AbstractSafeParcelable {
    public static final Creator<StopDiscoveryParams> CREATOR = new i();
    final int a;

    public StopDiscoveryParams() {
        this(1);
    }

    StopDiscoveryParams(int i) {
        this.a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopDiscoveryParams)) {
            return false;
        }
        return this.a == ((StopDiscoveryParams) obj).a;
    }

    public int hashCode() {
        return c.a(new Object[]{Integer.valueOf(this.a)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.a(this, parcel, i);
    }
}
