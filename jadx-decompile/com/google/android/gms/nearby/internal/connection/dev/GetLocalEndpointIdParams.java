package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class GetLocalEndpointIdParams extends AbstractSafeParcelable {
    public static final Creator<GetLocalEndpointIdParams> CREATOR = new o();
    final int a;

    public GetLocalEndpointIdParams() {
        this(1);
    }

    GetLocalEndpointIdParams(int i) {
        this.a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetLocalEndpointIdParams)) {
            return false;
        }
        return this.a == ((GetLocalEndpointIdParams) obj).a;
    }

    public int hashCode() {
        return c.a(new Object[]{Integer.valueOf(this.a)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        o.a(this, parcel, i);
    }
}
