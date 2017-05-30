package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public class GetAllCapabilitiesResponse extends AbstractSafeParcelable {
    public static final Creator<GetAllCapabilitiesResponse> CREATOR = new i();
    public final int a;
    public final int b;
    public final List<CapabilityInfoParcelable> c;

    GetAllCapabilitiesResponse(int i, int i2, List<CapabilityInfoParcelable> list) {
        this.a = i;
        this.b = i2;
        this.c = list;
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.a(this, parcel, i);
    }
}
