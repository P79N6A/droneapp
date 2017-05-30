package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.Permission;

public class AddPermissionRequest extends AbstractSafeParcelable {
    public static final Creator<AddPermissionRequest> CREATOR = new ab();
    final int a;
    final DriveId b;
    final Permission c;
    final boolean d;
    final String e;
    final boolean f;
    final String g;

    AddPermissionRequest(int i, DriveId driveId, Permission permission, boolean z, String str, boolean z2, String str2) {
        this.a = i;
        this.b = driveId;
        this.c = permission;
        this.d = z;
        this.e = str;
        this.f = z2;
        this.g = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ab.a(this, parcel, i);
    }
}
