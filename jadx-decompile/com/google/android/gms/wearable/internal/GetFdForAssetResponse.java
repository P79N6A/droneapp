package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class GetFdForAssetResponse extends AbstractSafeParcelable {
    public static final Creator<GetFdForAssetResponse> CREATOR = new t();
    public final int a;
    public final int b;
    public final ParcelFileDescriptor c;

    GetFdForAssetResponse(int i, int i2, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = i;
        this.b = i2;
        this.c = parcelFileDescriptor;
    }

    public void writeToParcel(Parcel parcel, int i) {
        t.a(this, parcel, i | 1);
    }
}
