package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;

public class OnDriveIdResponse extends AbstractSafeParcelable {
    public static final Creator<OnDriveIdResponse> CREATOR = new x();
    final int a;
    DriveId b;

    OnDriveIdResponse(int i, DriveId driveId) {
        this.a = i;
        this.b = driveId;
    }

    public DriveId a() {
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        x.a(this, parcel, i);
    }
}
