package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class ClientDisconnectingParams extends AbstractSafeParcelable {
    public static final Creator<ClientDisconnectingParams> CREATOR = new j();
    final int a;

    public ClientDisconnectingParams() {
        this(1);
    }

    ClientDisconnectingParams(int i) {
        this.a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientDisconnectingParams)) {
            return false;
        }
        return this.a == ((ClientDisconnectingParams) obj).a;
    }

    public int hashCode() {
        return c.a(new Object[]{Integer.valueOf(this.a)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        j.a(this, parcel, i);
    }
}
