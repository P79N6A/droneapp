package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class q implements Creator<Contents> {
    static void a(Contents contents, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, contents.a);
        b.a(parcel, 2, contents.b, i, false);
        b.a(parcel, 3, contents.c);
        b.a(parcel, 4, contents.d);
        b.a(parcel, 5, contents.e, i, false);
        b.a(parcel, 7, contents.f);
        b.a(parcel, 8, contents.g, false);
        b.a(parcel, a);
    }

    public Contents a(Parcel parcel) {
        String str = null;
        boolean z = false;
        int b = a.b(parcel);
        DriveId driveId = null;
        int i = 0;
        int i2 = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i3 = a.g(parcel, a);
                    break;
                case 2:
                    parcelFileDescriptor = (ParcelFileDescriptor) a.a(parcel, a, ParcelFileDescriptor.CREATOR);
                    break;
                case 3:
                    i2 = a.g(parcel, a);
                    break;
                case 4:
                    i = a.g(parcel, a);
                    break;
                case 5:
                    driveId = (DriveId) a.a(parcel, a, DriveId.CREATOR);
                    break;
                case 7:
                    z = a.c(parcel, a);
                    break;
                case 8:
                    str = a.q(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Contents(i3, parcelFileDescriptor, i2, i, driveId, z, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public Contents[] a(int i) {
        return new Contents[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
