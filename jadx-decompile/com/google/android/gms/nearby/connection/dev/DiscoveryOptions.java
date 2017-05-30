package com.google.android.gms.nearby.connection.dev;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class DiscoveryOptions extends AbstractSafeParcelable {
    public static final Creator<DiscoveryOptions> CREATOR = new e();
    final int a;
    private final Strategy b;

    DiscoveryOptions(int i, Strategy strategy) {
        this.a = i;
        this.b = strategy;
    }

    public Strategy a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscoveryOptions)) {
            return false;
        }
        DiscoveryOptions discoveryOptions = (DiscoveryOptions) obj;
        return this.a == discoveryOptions.a && c.a(this.b, discoveryOptions.b);
    }

    public int hashCode() {
        return c.a(new Object[]{Integer.valueOf(this.a), this.b});
    }

    public void writeToParcel(Parcel parcel, int i) {
        e.a(this, parcel, i);
    }
}
