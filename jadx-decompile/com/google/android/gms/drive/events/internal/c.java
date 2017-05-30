package com.google.android.gms.drive.events.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.DriveId;

public class c implements Creator<TransferProgressData> {
    static void a(TransferProgressData transferProgressData, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, transferProgressData.a);
        b.a(parcel, 2, transferProgressData.b);
        b.a(parcel, 3, transferProgressData.c, i, false);
        b.a(parcel, 4, transferProgressData.d);
        b.a(parcel, 5, transferProgressData.e);
        b.a(parcel, 6, transferProgressData.f);
        b.a(parcel, a);
    }

    public TransferProgressData a(Parcel parcel) {
        long j = 0;
        int i = 0;
        int b = a.b(parcel);
        DriveId driveId = null;
        long j2 = 0;
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
                    driveId = (DriveId) a.a(parcel, a, DriveId.CREATOR);
                    break;
                case 4:
                    i = a.g(parcel, a);
                    break;
                case 5:
                    j2 = a.i(parcel, a);
                    break;
                case 6:
                    j = a.i(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new TransferProgressData(i3, i2, driveId, i, j2, j);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public TransferProgressData[] a(int i) {
        return new TransferProgressData[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
