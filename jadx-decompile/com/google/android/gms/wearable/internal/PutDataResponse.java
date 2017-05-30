package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class PutDataResponse extends AbstractSafeParcelable {
    public static final Creator<PutDataResponse> CREATOR = new ah();
    public final int a;
    public final int b;
    public final DataItemParcelable c;

    PutDataResponse(int i, int i2, DataItemParcelable dataItemParcelable) {
        this.a = i;
        this.b = i2;
        this.c = dataItemParcelable;
    }

    public PutDataResponse(int i, DataItemParcelable dataItemParcelable) {
        this(1, i, dataItemParcelable);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ah.a(this, parcel, i);
    }
}
