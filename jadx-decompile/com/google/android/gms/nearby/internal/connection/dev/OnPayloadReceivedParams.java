package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class OnPayloadReceivedParams extends AbstractSafeParcelable {
    public static final Creator<OnPayloadReceivedParams> CREATOR = new ac();
    final int a;
    private final String b;
    private final ParcelablePayload c;
    private final boolean d;

    OnPayloadReceivedParams(int i, String str, ParcelablePayload parcelablePayload, boolean z) {
        this.a = i;
        this.b = str;
        this.c = parcelablePayload;
        this.d = z;
    }

    public String a() {
        return this.b;
    }

    public ParcelablePayload b() {
        return this.c;
    }

    public boolean c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnPayloadReceivedParams)) {
            return false;
        }
        OnPayloadReceivedParams onPayloadReceivedParams = (OnPayloadReceivedParams) obj;
        return this.a == onPayloadReceivedParams.a && c.a(this.b, onPayloadReceivedParams.b) && c.a(this.c, onPayloadReceivedParams.c) && c.a(Boolean.valueOf(this.d), Boolean.valueOf(onPayloadReceivedParams.d));
    }

    public int hashCode() {
        return c.a(new Object[]{Integer.valueOf(this.a), this.b, this.c, Boolean.valueOf(this.d)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        ac.a(this, parcel, i);
    }
}
