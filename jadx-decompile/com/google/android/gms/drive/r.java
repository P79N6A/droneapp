package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class r implements Creator<DriveFileRange> {
    static void a(DriveFileRange driveFileRange, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, driveFileRange.a);
        b.a(parcel, 2, driveFileRange.b);
        b.a(parcel, 3, driveFileRange.c);
        b.a(parcel, a);
    }

    public DriveFileRange a(Parcel parcel) {
        long j = 0;
        int b = a.b(parcel);
        int i = 0;
        long j2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    j2 = a.i(parcel, a);
                    break;
                case 3:
                    j = a.i(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new DriveFileRange(i, j2, j);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public DriveFileRange[] a(int i) {
        return new DriveFileRange[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
