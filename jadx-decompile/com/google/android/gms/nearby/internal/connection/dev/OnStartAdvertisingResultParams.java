package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class OnStartAdvertisingResultParams extends AbstractSafeParcelable {
    public static final Creator<OnStartAdvertisingResultParams> CREATOR = new ae();
    final int a;
    private final int b;
    private final String c;

    OnStartAdvertisingResultParams(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public int a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnStartAdvertisingResultParams)) {
            return false;
        }
        OnStartAdvertisingResultParams onStartAdvertisingResultParams = (OnStartAdvertisingResultParams) obj;
        return this.a == onStartAdvertisingResultParams.a && c.a(Integer.valueOf(this.b), Integer.valueOf(onStartAdvertisingResultParams.b)) && c.a(this.c, onStartAdvertisingResultParams.c);
    }

    public int hashCode() {
        return c.a(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), this.c});
    }

    public void writeToParcel(Parcel parcel, int i) {
        ae.a(this, parcel, i);
    }
}
