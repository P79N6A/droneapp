package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class OnConnectionRequestParams extends AbstractSafeParcelable {
    public static final Creator<OnConnectionRequestParams> CREATOR = new x();
    final int a;
    private final String b;
    private final String c;
    @Nullable
    private final byte[] d;

    OnConnectionRequestParams(int i, String str, String str2, @Nullable byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = bArr;
    }

    public String a() {
        return this.b;
    }

    public String b() {
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
        if (!(obj instanceof OnConnectionRequestParams)) {
            return false;
        }
        OnConnectionRequestParams onConnectionRequestParams = (OnConnectionRequestParams) obj;
        return this.a == onConnectionRequestParams.a && c.a(this.b, onConnectionRequestParams.b) && c.a(this.c, onConnectionRequestParams.c) && c.a(this.d, onConnectionRequestParams.d);
    }

    public int hashCode() {
        return c.a(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d});
    }

    public void writeToParcel(Parcel parcel, int i) {
        x.a(this, parcel, i);
    }
}
