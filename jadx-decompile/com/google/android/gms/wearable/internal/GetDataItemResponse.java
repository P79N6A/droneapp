package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class GetDataItemResponse extends AbstractSafeParcelable {
    public static final Creator<GetDataItemResponse> CREATOR = new s();
    public final int a;
    public final int b;
    public final DataItemParcelable c;

    GetDataItemResponse(int i, int i2, DataItemParcelable dataItemParcelable) {
        this.a = i;
        this.b = i2;
        this.c = dataItemParcelable;
    }

    public void writeToParcel(Parcel parcel, int i) {
        s.a(this, parcel, i);
    }
}
