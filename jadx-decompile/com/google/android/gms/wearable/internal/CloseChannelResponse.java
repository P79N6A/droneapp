package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class CloseChannelResponse extends AbstractSafeParcelable {
    public static final Creator<CloseChannelResponse> CREATOR = new bn();
    public final int a;
    public final int b;

    CloseChannelResponse(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        bn.a(this, parcel, i);
    }
}
