package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.TransferProgressOptions;

public class RemoveEventListenerRequest extends AbstractSafeParcelable {
    public static final Creator<RemoveEventListenerRequest> CREATOR = new ao();
    final int a;
    final DriveId b;
    final int c;
    final TransferProgressOptions d;

    RemoveEventListenerRequest(int i, DriveId driveId, int i2, TransferProgressOptions transferProgressOptions) {
        this.a = i;
        this.b = driveId;
        this.c = i2;
        this.d = transferProgressOptions;
    }

    public RemoveEventListenerRequest(DriveId driveId, int i) {
        this(driveId, i, null);
    }

    RemoveEventListenerRequest(DriveId driveId, int i, TransferProgressOptions transferProgressOptions) {
        this(1, driveId, i, transferProgressOptions);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ao.a(this, parcel, i);
    }
}
