package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.ChangesAvailableOptions;
import com.google.android.gms.drive.events.TransferProgressOptions;
import com.google.android.gms.drive.events.TransferStateOptions;

public class AddEventListenerRequest extends AbstractSafeParcelable {
    public static final Creator<AddEventListenerRequest> CREATOR = new a();
    final int a;
    final DriveId b;
    final int c;
    final ChangesAvailableOptions d;
    final TransferStateOptions e;
    final TransferProgressOptions f;

    public AddEventListenerRequest(int i, DriveId driveId) {
        this(1, (DriveId) d.a(driveId), i, null, null, null);
    }

    AddEventListenerRequest(int i, DriveId driveId, int i2, ChangesAvailableOptions changesAvailableOptions, TransferStateOptions transferStateOptions, TransferProgressOptions transferProgressOptions) {
        this.a = i;
        this.b = driveId;
        this.c = i2;
        this.d = changesAvailableOptions;
        this.e = transferStateOptions;
        this.f = transferProgressOptions;
    }

    public DriveId a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        a.a(this, parcel, i);
    }
}
