package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.connection.dev.PayloadTransferUpdate;

public final class OnPayloadTransferUpdateParams extends AbstractSafeParcelable {
    public static final Creator<OnPayloadTransferUpdateParams> CREATOR = new ad();
    final int a;
    private final String b;
    private final PayloadTransferUpdate c;

    OnPayloadTransferUpdateParams(int i, String str, PayloadTransferUpdate payloadTransferUpdate) {
        this.a = i;
        this.b = str;
        this.c = payloadTransferUpdate;
    }

    public String a() {
        return this.b;
    }

    public PayloadTransferUpdate b() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnPayloadTransferUpdateParams)) {
            return false;
        }
        OnPayloadTransferUpdateParams onPayloadTransferUpdateParams = (OnPayloadTransferUpdateParams) obj;
        return this.a == onPayloadTransferUpdateParams.a && c.a(this.b, onPayloadTransferUpdateParams.b) && c.a(this.c, onPayloadTransferUpdateParams.c);
    }

    public int hashCode() {
        return c.a(new Object[]{Integer.valueOf(this.a), this.b, this.c});
    }

    public void writeToParcel(Parcel parcel, int i) {
        ad.a(this, parcel, i);
    }
}
