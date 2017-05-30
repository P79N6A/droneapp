package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.a;

public class BleSignalImpl extends AbstractSafeParcelable implements a {
    public static final Creator<BleSignalImpl> CREATOR = new a();
    final int b;
    public final int c;
    public final int d;

    BleSignalImpl(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        if (-128 >= i3 || i3 >= 128) {
            i3 = Integer.MIN_VALUE;
        }
        this.d = i3;
    }

    public int a() {
        return this.c;
    }

    public int b() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.c == aVar.a() && this.d == aVar.b();
    }

    public int hashCode() {
        return c.a(new Object[]{Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }

    public String toString() {
        int i = this.c;
        return "BleSignal{rssi=" + i + ", txPower=" + this.d + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        a.a(this, parcel, i);
    }
}
