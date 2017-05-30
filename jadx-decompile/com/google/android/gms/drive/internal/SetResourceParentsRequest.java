package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.List;

public class SetResourceParentsRequest extends AbstractSafeParcelable {
    public static final Creator<SetResourceParentsRequest> CREATOR = new as();
    final int a;
    final DriveId b;
    final List<DriveId> c;

    SetResourceParentsRequest(int i, DriveId driveId, List<DriveId> list) {
        this.a = i;
        this.b = driveId;
        this.c = list;
    }

    public SetResourceParentsRequest(DriveId driveId, List<DriveId> list) {
        this(1, driveId, list);
    }

    public void writeToParcel(Parcel parcel, int i) {
        as.a(this, parcel, i);
    }
}
