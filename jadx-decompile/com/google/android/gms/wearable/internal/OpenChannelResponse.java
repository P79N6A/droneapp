package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class OpenChannelResponse extends AbstractSafeParcelable {
    public static final Creator<OpenChannelResponse> CREATOR = new af();
    public final int a;
    public final int b;
    public final ChannelImpl c;

    OpenChannelResponse(int i, int i2, ChannelImpl channelImpl) {
        this.a = i;
        this.b = i2;
        this.c = channelImpl;
    }

    public void writeToParcel(Parcel parcel, int i) {
        af.a(this, parcel, i);
    }
}