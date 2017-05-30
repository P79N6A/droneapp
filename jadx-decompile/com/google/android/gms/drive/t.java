package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class t implements Creator<DriveId> {
    static void a(DriveId driveId, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, driveId.d);
        b.a(parcel, 2, driveId.e, false);
        b.a(parcel, 3, driveId.f);
        b.a(parcel, 4, driveId.g);
        b.a(parcel, 5, driveId.h);
        b.a(parcel, a);
    }

    public DriveId a(Parcel parcel) {
        long j = 0;
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        int i2 = -1;
        long j2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    str = a.q(parcel, a);
                    break;
                case 3:
                    j2 = a.i(parcel, a);
                    break;
                case 4:
                    j = a.i(parcel, a);
                    break;
                case 5:
                    i2 = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new DriveId(i, str, j2, j, i2);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public DriveId[] a(int i) {
        return new DriveId[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
