package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;

public class GetPermissionsRequest extends AbstractSafeParcelable {
    public static final Creator<GetPermissionsRequest> CREATOR = new l();
    final int a;
    final DriveId b;

    GetPermissionsRequest(int i, DriveId driveId) {
        this.a = i;
        this.b = driveId;
    }

    public void writeToParcel(Parcel parcel, int i) {
        l.a(this, parcel, i);
    }
}
