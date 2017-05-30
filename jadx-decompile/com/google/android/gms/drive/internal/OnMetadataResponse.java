package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class OnMetadataResponse extends AbstractSafeParcelable {
    public static final Creator<OnMetadataResponse> CREATOR = new ad();
    final int a;
    final MetadataBundle b;

    OnMetadataResponse(int i, MetadataBundle metadataBundle) {
        this.a = i;
        this.b = metadataBundle;
    }

    public MetadataBundle a() {
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ad.a(this, parcel, i);
    }
}
