package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ChannelReceiveFileResponse extends AbstractSafeParcelable {
    public static final Creator<ChannelReceiveFileResponse> CREATOR = new bj();
    public final int a;
    public final int b;

    ChannelReceiveFileResponse(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        bj.a(this, parcel, i);
    }
}
