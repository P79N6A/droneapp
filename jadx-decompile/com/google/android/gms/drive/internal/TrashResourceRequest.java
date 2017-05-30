package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;

public class TrashResourceRequest extends AbstractSafeParcelable {
    public static final Creator<TrashResourceRequest> CREATOR = new aw();
    final int a;
    final DriveId b;

    TrashResourceRequest(int i, DriveId driveId) {
        this.a = i;
        this.b = driveId;
    }

    public TrashResourceRequest(DriveId driveId) {
        this(1, driveId);
    }

    public void writeToParcel(Parcel parcel, int i) {
        aw.a(this, parcel, i);
    }
}
