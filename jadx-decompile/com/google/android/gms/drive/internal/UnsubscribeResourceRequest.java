package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;

public class UnsubscribeResourceRequest extends AbstractSafeParcelable {
    public static final Creator<UnsubscribeResourceRequest> CREATOR = new ax();
    final int a;
    final DriveId b;

    UnsubscribeResourceRequest(int i, DriveId driveId) {
        this.a = i;
        this.b = driveId;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ax.a(this, parcel, i);
    }
}
