package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;

public class ListParentsRequest extends AbstractSafeParcelable {
    public static final Creator<ListParentsRequest> CREATOR = new r();
    final int a;
    final DriveId b;

    ListParentsRequest(int i, DriveId driveId) {
        this.a = i;
        this.b = driveId;
    }

    public ListParentsRequest(DriveId driveId) {
        this(1, driveId);
    }

    public void writeToParcel(Parcel parcel, int i) {
        r.a(this, parcel, i);
    }
}
