package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class DeleteDataItemsResponse extends AbstractSafeParcelable {
    public static final Creator<DeleteDataItemsResponse> CREATOR = new h();
    public final int a;
    public final int b;
    public final int c;

    DeleteDataItemsResponse(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        h.a(this, parcel, i);
    }
}
