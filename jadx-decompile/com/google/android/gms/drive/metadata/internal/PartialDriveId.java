package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;

public class PartialDriveId extends AbstractSafeParcelable {
    public static final Creator<PartialDriveId> CREATOR = new n();
    final int a;
    final String b;
    final long c;
    final int d;

    PartialDriveId(int i, String str, long j, int i2) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = i2;
    }

    public PartialDriveId(String str, long j, int i) {
        this(1, str, j, i);
    }

    public DriveId a(long j) {
        return new DriveId(this.b, this.c, j, this.d);
    }

    public void writeToParcel(Parcel parcel, int i) {
        n.a(this, parcel, i);
    }
}
