package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class ChannelSendFileResponse extends AbstractSafeParcelable {
    public static final Creator<ChannelSendFileResponse> CREATOR = new bk();
    public final int a;
    public final int b;

    ChannelSendFileResponse(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        bk.a(this, parcel, i);
    }
}
