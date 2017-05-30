package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;

public class UntrashResourceRequest extends AbstractSafeParcelable {
    public static final Creator<UntrashResourceRequest> CREATOR = new ay();
    final int a;
    final DriveId b;

    UntrashResourceRequest(int i, DriveId driveId) {
        this.a = i;
        this.b = driveId;
    }

    public UntrashResourceRequest(DriveId driveId) {
        this(1, driveId);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ay.a(this, parcel, i);
    }
}
