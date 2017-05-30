package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class UpdateMetadataRequest extends AbstractSafeParcelable {
    public static final Creator<UpdateMetadataRequest> CREATOR = new az();
    final int a;
    final DriveId b;
    final MetadataBundle c;

    UpdateMetadataRequest(int i, DriveId driveId, MetadataBundle metadataBundle) {
        this.a = i;
        this.b = driveId;
        this.c = metadataBundle;
    }

    public UpdateMetadataRequest(DriveId driveId, MetadataBundle metadataBundle) {
        this(1, driveId, metadataBundle);
    }

    public void writeToParcel(Parcel parcel, int i) {
        az.a(this, parcel, i);
    }
}
