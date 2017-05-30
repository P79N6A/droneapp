package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.TransferProgressOptions;

public class ao implements Creator<RemoveEventListenerRequest> {
    static void a(RemoveEventListenerRequest removeEventListenerRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, removeEventListenerRequest.a);
        b.a(parcel, 2, removeEventListenerRequest.b, i, false);
        b.a(parcel, 3, removeEventListenerRequest.c);
        b.a(parcel, 4, removeEventListenerRequest.d, i, false);
        b.a(parcel, a);
    }

    public RemoveEventListenerRequest a(Parcel parcel) {
        TransferProgressOptions transferProgressOptions = null;
        int i = 0;
        int b = a.b(parcel);
        DriveId driveId = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int i3;
            DriveId driveId2;
            int g;
            TransferProgressOptions transferProgressOptions2;
            int a = a.a(parcel);
            TransferProgressOptions transferProgressOptions3;
            switch (a.a(a)) {
                case 1:
                    transferProgressOptions3 = transferProgressOptions;
                    i3 = i;
                    driveId2 = driveId;
                    g = a.g(parcel, a);
                    transferProgressOptions2 = transferProgressOptions3;
                    break;
                case 2:
                    g = i2;
                    int i4 = i;
                    driveId2 = (DriveId) a.a(parcel, a, DriveId.CREATOR);
                    transferProgressOptions2 = transferProgressOptions;
                    i3 = i4;
                    break;
                case 3:
                    driveId2 = driveId;
                    g = i2;
                    transferProgressOptions3 = transferProgressOptions;
                    i3 = a.g(parcel, a);
                    transferProgressOptions2 = transferProgressOptions3;
                    break;
                case 4:
                    transferProgressOptions2 = (TransferProgressOptions) a.a(parcel, a, TransferProgressOptions.CREATOR);
                    i3 = i;
                    driveId2 = driveId;
                    g = i2;
                    break;
                default:
                    a.b(parcel, a);
                    transferProgressOptions2 = transferProgressOptions;
                    i3 = i;
                    driveId2 = driveId;
                    g = i2;
                    break;
            }
            i2 = g;
            driveId = driveId2;
            i = i3;
            transferProgressOptions = transferProgressOptions2;
        }
        if (parcel.dataPosition() == b) {
            return new RemoveEventListenerRequest(i2, driveId, i, transferProgressOptions);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public RemoveEventListenerRequest[] a(int i) {
        return new RemoveEventListenerRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
