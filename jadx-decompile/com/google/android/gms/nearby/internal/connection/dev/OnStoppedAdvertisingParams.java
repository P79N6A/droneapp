package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class OnStoppedAdvertisingParams extends AbstractSafeParcelable {
    public static final Creator<OnStoppedAdvertisingParams> CREATOR = new af();
    final int a;
    private final int b;

    OnStoppedAdvertisingParams(int i, int i2) {
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
        if (!(obj instanceof OnStoppedAdvertisingParams)) {
            return false;
        }
        OnStoppedAdvertisingParams onStoppedAdvertisingParams = (OnStoppedAdvertisingParams) obj;
        return this.a == onStoppedAdvertisingParams.a && c.a(Integer.valueOf(this.b), Integer.valueOf(onStoppedAdvertisingParams.b));
    }

    public int hashCode() {
        return c.a(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        af.a(this, parcel, i);
    }
}
