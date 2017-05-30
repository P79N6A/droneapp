package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;

public class ControlProgressRequest extends AbstractSafeParcelable {
    public static final Creator<ControlProgressRequest> CREATOR = new bi();
    final int a;
    final int b;
    final int c;
    final DriveId d;
    final ParcelableTransferPreferences e;

    ControlProgressRequest(int i, int i2, int i3, DriveId driveId, ParcelableTransferPreferences parcelableTransferPreferences) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = driveId;
        this.e = parcelableTransferPreferences;
    }

    public void writeToParcel(Parcel parcel, int i) {
        bi.a(this, parcel, i);
    }
}
