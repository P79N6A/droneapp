package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class StopAllEndpointsParams extends AbstractSafeParcelable {
    public static final Creator<StopAllEndpointsParams> CREATOR = new h();
    final int a;

    public StopAllEndpointsParams() {
        this(1);
    }

    StopAllEndpointsParams(int i) {
        this.a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopAllEndpointsParams)) {
            return false;
        }
        return this.a == ((StopAllEndpointsParams) obj).a;
    }

    public int hashCode() {
        return c.a(new Object[]{Integer.valueOf(this.a)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        h.a(this, parcel, i);
    }
}
