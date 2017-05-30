package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class DriveFileRange extends AbstractSafeParcelable {
    public static final Creator<DriveFileRange> CREATOR = new r();
    final int a;
    final long b;
    final long c;

    DriveFileRange(int i, long j, long j2) {
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        r.a(this, parcel, i);
    }
}
