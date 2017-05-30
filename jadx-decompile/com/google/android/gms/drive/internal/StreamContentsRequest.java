package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;

public class StreamContentsRequest extends AbstractSafeParcelable {
    public static final Creator<StreamContentsRequest> CREATOR = new au();
    final int a;
    final DriveId b;

    StreamContentsRequest(int i, DriveId driveId) {
        this.a = i;
        this.b = driveId;
    }

    public void writeToParcel(Parcel parcel, int i) {
        au.a(this, parcel, i);
    }
}
