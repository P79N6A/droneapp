package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.DriveId;

public class bp implements Creator<DeleteResourceRequest> {
    static void a(DeleteResourceRequest deleteResourceRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, deleteResourceRequest.a);
        b.a(parcel, 2, deleteResourceRequest.b, i, false);
        b.a(parcel, a);
    }

    public DeleteResourceRequest a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        DriveId driveId = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    driveId = (DriveId) a.a(parcel, a, DriveId.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new DeleteResourceRequest(i, driveId);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public DeleteResourceRequest[] a(int i) {
        return new DeleteResourceRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
