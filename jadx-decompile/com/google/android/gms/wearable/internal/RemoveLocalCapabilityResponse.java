package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class RemoveLocalCapabilityResponse extends AbstractSafeParcelable {
    public static final Creator<RemoveLocalCapabilityResponse> CREATOR = new aj();
    public final int a;
    public final int b;

    RemoveLocalCapabilityResponse(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        aj.a(this, parcel, i);
    }
}
