package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class DisconnectFromEndpointParams extends AbstractSafeParcelable {
    public static final Creator<DisconnectFromEndpointParams> CREATOR = new m();
    final int a;
    private final String b;

    DisconnectFromEndpointParams(int i, String str) {
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
        if (!(obj instanceof DisconnectFromEndpointParams)) {
            return false;
        }
        DisconnectFromEndpointParams disconnectFromEndpointParams = (DisconnectFromEndpointParams) obj;
        return this.a == disconnectFromEndpointParams.a && c.a(this.b, disconnectFromEndpointParams.b);
    }

    public int hashCode() {
        return c.a(new Object[]{Integer.valueOf(this.a), this.b});
    }

    public void writeToParcel(Parcel parcel, int i) {
        m.a(this, parcel, i);
    }
}
