package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class AddLocalCapabilityResponse extends AbstractSafeParcelable {
    public static final Creator<AddLocalCapabilityResponse> CREATOR = new av();
    public final int a;
    public final int b;

    AddLocalCapabilityResponse(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        av.a(this, parcel, i);
    }
}
