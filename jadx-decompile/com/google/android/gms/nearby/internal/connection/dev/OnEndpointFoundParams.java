package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class OnEndpointFoundParams extends AbstractSafeParcelable {
    public static final Creator<OnEndpointFoundParams> CREATOR = new aa();
    final int a;
    private final String b;
    private final String c;
    private final String d;

    OnEndpointFoundParams(int i, String str, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnEndpointFoundParams)) {
            return false;
        }
        OnEndpointFoundParams onEndpointFoundParams = (OnEndpointFoundParams) obj;
        return this.a == onEndpointFoundParams.a && c.a(this.b, onEndpointFoundParams.b) && c.a(this.c, onEndpointFoundParams.c) && c.a(this.d, onEndpointFoundParams.d);
    }

    public int hashCode() {
        return c.a(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d});
    }

    public void writeToParcel(Parcel parcel, int i) {
        aa.a(this, parcel, i);
    }
}
