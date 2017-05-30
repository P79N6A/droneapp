package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class CreateFolderRequest extends AbstractSafeParcelable {
    public static final Creator<CreateFolderRequest> CREATOR = new bn();
    final int a;
    final DriveId b;
    final MetadataBundle c;

    CreateFolderRequest(int i, DriveId driveId, MetadataBundle metadataBundle) {
        this.a = i;
        this.b = (DriveId) d.a(driveId);
        this.c = (MetadataBundle) d.a(metadataBundle);
    }

    public CreateFolderRequest(DriveId driveId, MetadataBundle metadataBundle) {
        this(1, driveId, metadataBundle);
    }

    public void writeToParcel(Parcel parcel, int i) {
        bn.a(this, parcel, i);
    }
}
