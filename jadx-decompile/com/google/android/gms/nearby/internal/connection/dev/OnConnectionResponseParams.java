package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class OnConnectionResponseParams extends AbstractSafeParcelable {
    public static final Creator<OnConnectionResponseParams> CREATOR = new y();
    final int a;
    private final String b;
    private final int c;
    @Nullable
    private final byte[] d;

    OnConnectionResponseParams(int i, String str, int i2, @Nullable byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = bArr;
    }

    public String a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    @Nullable
    public byte[] c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnConnectionResponseParams)) {
            return false;
        }
        OnConnectionResponseParams onConnectionResponseParams = (OnConnectionResponseParams) obj;
        return this.a == onConnectionResponseParams.a && c.a(this.b, onConnectionResponseParams.b) && c.a(Integer.valueOf(this.c), Integer.valueOf(onConnectionResponseParams.c)) && c.a(this.d, onConnectionResponseParams.d);
    }

    public int hashCode() {
        return c.a(new Object[]{Integer.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d});
    }

    public void writeToParcel(Parcel parcel, int i) {
        y.a(this, parcel, i);
    }
}
