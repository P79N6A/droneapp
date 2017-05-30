package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class OnFetchThumbnailResponse extends AbstractSafeParcelable {
    public static final Creator<OnFetchThumbnailResponse> CREATOR = new z();
    final int a;
    final ParcelFileDescriptor b;

    OnFetchThumbnailResponse(int i, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = i;
        this.b = parcelFileDescriptor;
    }

    public void writeToParcel(Parcel parcel, int i) {
        z.a(this, parcel, i | 1);
    }
}
