package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class n implements Creator<PartialDriveId> {
    static void a(PartialDriveId partialDriveId, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, partialDriveId.a);
        b.a(parcel, 2, partialDriveId.b, false);
        b.a(parcel, 3, partialDriveId.c);
        b.a(parcel, 4, partialDriveId.d);
        b.a(parcel, a);
    }

    public PartialDriveId a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        long j = 0;
        int i2 = -1;
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
                    j = a.i(parcel, a);
                    break;
                case 4:
                    i2 = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PartialDriveId(i, str, j, i2);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public PartialDriveId[] a(int i) {
        return new PartialDriveId[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
