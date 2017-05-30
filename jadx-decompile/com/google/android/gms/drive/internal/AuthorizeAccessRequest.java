package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;

public class AuthorizeAccessRequest extends AbstractSafeParcelable {
    public static final Creator<AuthorizeAccessRequest> CREATOR = new bb();
    final int a;
    final long b;
    final DriveId c;

    AuthorizeAccessRequest(int i, long j, DriveId driveId) {
        this.a = i;
        this.b = j;
        this.c = driveId;
    }

    public void writeToParcel(Parcel parcel, int i) {
        bb.a(this, parcel, i);
    }
}
