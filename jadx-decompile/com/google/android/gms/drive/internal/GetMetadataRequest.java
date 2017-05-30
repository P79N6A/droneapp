package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;

public class GetMetadataRequest extends AbstractSafeParcelable {
    public static final Creator<GetMetadataRequest> CREATOR = new k();
    final int a;
    final DriveId b;
    final boolean c;

    GetMetadataRequest(int i, DriveId driveId, boolean z) {
        this.a = i;
        this.b = driveId;
        this.c = z;
    }

    public GetMetadataRequest(DriveId driveId, boolean z) {
        this(1, driveId, z);
    }

    public void writeToParcel(Parcel parcel, int i) {
        k.a(this, parcel, i);
    }
}
