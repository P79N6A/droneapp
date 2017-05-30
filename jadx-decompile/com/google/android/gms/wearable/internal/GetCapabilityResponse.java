package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class GetCapabilityResponse extends AbstractSafeParcelable {
    public static final Creator<GetCapabilityResponse> CREATOR = new j();
    public final int a;
    public final int b;
    public final CapabilityInfoParcelable c;

    GetCapabilityResponse(int i, int i2, CapabilityInfoParcelable capabilityInfoParcelable) {
        this.a = i;
        this.b = i2;
        this.c = capabilityInfoParcelable;
    }

    public void writeToParcel(Parcel parcel, int i) {
        j.a(this, parcel, i);
    }
}
