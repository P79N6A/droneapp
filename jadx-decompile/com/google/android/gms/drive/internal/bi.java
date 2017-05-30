package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.DriveId;

public class bi implements Creator<ControlProgressRequest> {
    static void a(ControlProgressRequest controlProgressRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, controlProgressRequest.a);
        b.a(parcel, 2, controlProgressRequest.b);
        b.a(parcel, 3, controlProgressRequest.c);
        b.a(parcel, 4, controlProgressRequest.d, i, false);
        b.a(parcel, 5, controlProgressRequest.e, i, false);
        b.a(parcel, a);
    }

    public ControlProgressRequest a(Parcel parcel) {
        ParcelableTransferPreferences parcelableTransferPreferences = null;
        int i = 0;
        int b = a.b(parcel);
        DriveId driveId = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i3 = a.g(parcel, a);
                    break;
                case 2:
                    i2 = a.g(parcel, a);
                    break;
                case 3:
                    i = a.g(parcel, a);
                    break;
                case 4:
                    driveId = (DriveId) a.a(parcel, a, DriveId.CREATOR);
                    break;
                case 5:
                    parcelableTransferPreferences = (ParcelableTransferPreferences) a.a(parcel, a, ParcelableTransferPreferences.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ControlProgressRequest(i3, i2, i, driveId, parcelableTransferPreferences);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public ControlProgressRequest[] a(int i) {
        return new ControlProgressRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
