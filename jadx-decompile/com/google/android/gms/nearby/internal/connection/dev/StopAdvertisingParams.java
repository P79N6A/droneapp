package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class StopAdvertisingParams extends AbstractSafeParcelable {
    public static final Creator<StopAdvertisingParams> CREATOR = new g();
    final int a;

    public StopAdvertisingParams() {
        this(1);
    }

    StopAdvertisingParams(int i) {
        this.a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopAdvertisingParams)) {
            return false;
        }
        return this.a == ((StopAdvertisingParams) obj).a;
    }

    public int hashCode() {
        return c.a(new Object[]{Integer.valueOf(this.a)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        g.a(this, parcel, i);
    }
}
