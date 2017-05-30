package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;

public class UpdatePermissionRequest extends AbstractSafeParcelable {
    public static final Creator<UpdatePermissionRequest> CREATOR = new ba();
    final int a;
    final DriveId b;
    final String c;
    final int d;
    final boolean e;
    final String f;

    UpdatePermissionRequest(int i, DriveId driveId, String str, int i2, boolean z, String str2) {
        this.a = i;
        this.b = driveId;
        this.c = str;
        this.d = i2;
        this.e = z;
        this.f = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ba.a(this, parcel, i);
    }
}
