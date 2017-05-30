package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class SendMessageResponse extends AbstractSafeParcelable {
    public static final Creator<SendMessageResponse> CREATOR = new ak();
    public final int a;
    public final int b;
    public final int c;

    SendMessageResponse(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ak.a(this, parcel, i);
    }
}
