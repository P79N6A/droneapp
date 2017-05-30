package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.ChangesAvailableOptions;
import com.google.android.gms.drive.events.TransferProgressOptions;
import com.google.android.gms.drive.events.TransferStateOptions;

public class a implements Creator<AddEventListenerRequest> {
    static void a(AddEventListenerRequest addEventListenerRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, addEventListenerRequest.a);
        b.a(parcel, 2, addEventListenerRequest.b, i, false);
        b.a(parcel, 3, addEventListenerRequest.c);
        b.a(parcel, 4, addEventListenerRequest.d, i, false);
        b.a(parcel, 5, addEventListenerRequest.e, i, false);
        b.a(parcel, 6, addEventListenerRequest.f, i, false);
        b.a(parcel, a);
    }

    public AddEventListenerRequest a(Parcel parcel) {
        int i = 0;
        TransferProgressOptions transferProgressOptions = null;
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        TransferStateOptions transferStateOptions = null;
        ChangesAvailableOptions changesAvailableOptions = null;
        DriveId driveId = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case 1:
                    i2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    break;
                case 2:
                    driveId = (DriveId) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, DriveId.CREATOR);
                    break;
                case 3:
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    break;
                case 4:
                    changesAvailableOptions = (ChangesAvailableOptions) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, ChangesAvailableOptions.CREATOR);
                    break;
                case 5:
                    transferStateOptions = (TransferStateOptions) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, TransferStateOptions.CREATOR);
                    break;
                case 6:
                    transferProgressOptions = (TransferProgressOptions) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, TransferProgressOptions.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AddEventListenerRequest(i2, driveId, i, changesAvailableOptions, transferStateOptions, transferProgressOptions);
        }
        throw new com.google.android.gms.common.internal.safeparcel.a.a("Overread allowed size end=" + b, parcel);
    }

    public AddEventListenerRequest[] a(int i) {
        return new AddEventListenerRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
