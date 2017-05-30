package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;

public class OpenContentsRequest extends AbstractSafeParcelable {
    public static final Creator<OpenContentsRequest> CREATOR = new aj();
    final int a;
    final DriveId b;
    final int c;
    final int d;

    OpenContentsRequest(int i, DriveId driveId, int i2, int i3) {
        this.a = i;
        this.b = driveId;
        this.c = i2;
        this.d = i3;
    }

    public OpenContentsRequest(DriveId driveId, int i, int i2) {
        this(1, driveId, i, i2);
    }

    public void writeToParcel(Parcel parcel, int i) {
        aj.a(this, parcel, i);
    }
}
