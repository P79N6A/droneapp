package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class OnEndpointLostParams extends AbstractSafeParcelable {
    public static final Creator<OnEndpointLostParams> CREATOR = new ab();
    final int a;
    private final String b;

    OnEndpointLostParams(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public String a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnEndpointLostParams)) {
            return false;
        }
        OnEndpointLostParams onEndpointLostParams = (OnEndpointLostParams) obj;
        return this.a == onEndpointLostParams.a && c.a(this.b, onEndpointLostParams.b);
    }

    public int hashCode() {
        return c.a(new Object[]{Integer.valueOf(this.a), this.b});
    }

    public void writeToParcel(Parcel parcel, int i) {
        ab.a(this, parcel, i);
    }
}
