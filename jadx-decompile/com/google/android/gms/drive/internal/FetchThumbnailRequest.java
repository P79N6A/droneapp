package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;

public class FetchThumbnailRequest extends AbstractSafeParcelable {
    public static final Creator<FetchThumbnailRequest> CREATOR = new g();
    final int a;
    final DriveId b;

    FetchThumbnailRequest(int i, DriveId driveId) {
        this.a = i;
        this.b = driveId;
    }

    public void writeToParcel(Parcel parcel, int i) {
        g.a(this, parcel, i);
    }
}
