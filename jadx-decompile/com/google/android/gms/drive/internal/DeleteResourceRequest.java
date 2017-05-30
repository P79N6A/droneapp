package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;

public class DeleteResourceRequest extends AbstractSafeParcelable {
    public static final Creator<DeleteResourceRequest> CREATOR = new bp();
    final int a;
    final DriveId b;

    DeleteResourceRequest(int i, DriveId driveId) {
        this.a = i;
        this.b = driveId;
    }

    public DeleteResourceRequest(DriveId driveId) {
        this(1, driveId);
    }

    public void writeToParcel(Parcel parcel, int i) {
        bp.a(this, parcel, i);
    }
}
