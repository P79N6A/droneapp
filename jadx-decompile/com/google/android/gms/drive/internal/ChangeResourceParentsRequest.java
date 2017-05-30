package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.List;

public class ChangeResourceParentsRequest extends AbstractSafeParcelable {
    public static final Creator<ChangeResourceParentsRequest> CREATOR = new be();
    final int a;
    final DriveId b;
    final List<DriveId> c;
    final List<DriveId> d;

    ChangeResourceParentsRequest(int i, DriveId driveId, List<DriveId> list, List<DriveId> list2) {
        this.a = i;
        this.b = driveId;
        this.c = list;
        this.d = list2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        be.a(this, parcel, i);
    }
}
