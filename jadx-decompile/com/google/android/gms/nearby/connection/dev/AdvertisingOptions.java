package com.google.android.gms.nearby.connection.dev;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class AdvertisingOptions extends AbstractSafeParcelable {
    public static final Creator<AdvertisingOptions> CREATOR = new a();
    final int a;
    private final Strategy b;
    @Nullable
    private final String c;

    AdvertisingOptions(int i, Strategy strategy, @Nullable String str) {
        this.a = i;
        this.b = strategy;
        this.c = str;
    }

    public Strategy a() {
        return this.b;
    }

    @Nullable
    public String b() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertisingOptions)) {
            return false;
        }
        AdvertisingOptions advertisingOptions = (AdvertisingOptions) obj;
        return this.a == advertisingOptions.a && c.a(this.b, advertisingOptions.b) && c.a(this.c, advertisingOptions.c);
    }

    public int hashCode() {
        return c.a(new Object[]{Integer.valueOf(this.a), this.b, this.c});
    }

    public void writeToParcel(Parcel parcel, int i) {
        a.a(this, parcel, i);
    }
}
