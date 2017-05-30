package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class GetChannelInputStreamResponse extends AbstractSafeParcelable {
    public static final Creator<GetChannelInputStreamResponse> CREATOR = new k();
    public final int a;
    public final int b;
    public final ParcelFileDescriptor c;

    GetChannelInputStreamResponse(int i, int i2, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = i;
        this.b = i2;
        this.c = parcelFileDescriptor;
    }

    public void writeToParcel(Parcel parcel, int i) {
        k.a(this, parcel, i);
    }
}
