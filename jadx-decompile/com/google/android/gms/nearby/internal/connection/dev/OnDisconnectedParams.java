package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class OnDisconnectedParams extends AbstractSafeParcelable {
    public static final Creator<OnDisconnectedParams> CREATOR = new z();
    final int a;
    private final String b;

    OnDisconnectedParams(int i, String str) {
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
        if (!(obj instanceof OnDisconnectedParams)) {
            return false;
        }
        OnDisconnectedParams onDisconnectedParams = (OnDisconnectedParams) obj;
        return this.a == onDisconnectedParams.a && c.a(this.b, onDisconnectedParams.b);
    }

    public int hashCode() {
        return c.a(new Object[]{Integer.valueOf(this.a), this.b});
    }

    public void writeToParcel(Parcel parcel, int i) {
        z.a(this, parcel, i);
    }
}
