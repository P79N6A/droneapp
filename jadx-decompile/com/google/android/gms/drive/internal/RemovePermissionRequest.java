package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;

public class RemovePermissionRequest extends AbstractSafeParcelable {
    public static final Creator<RemovePermissionRequest> CREATOR = new ap();
    final int a;
    final DriveId b;
    final String c;
    final boolean d;
    final String e;

    RemovePermissionRequest(int i, DriveId driveId, String str, boolean z, String str2) {
        this.a = i;
        this.b = driveId;
        this.c = str;
        this.d = z;
        this.e = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ap.a(this, parcel, i);
    }
}
