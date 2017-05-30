package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class GetLocalDeviceIdParams extends AbstractSafeParcelable {
    public static final Creator<GetLocalDeviceIdParams> CREATOR = new n();
    final int a;

    public GetLocalDeviceIdParams() {
        this(1);
    }

    GetLocalDeviceIdParams(int i) {
        this.a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetLocalDeviceIdParams)) {
            return false;
        }
        return this.a == ((GetLocalDeviceIdParams) obj).a;
    }

    public int hashCode() {
        return c.a(new Object[]{Integer.valueOf(this.a)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        n.a(this, parcel, i);
    }
}
