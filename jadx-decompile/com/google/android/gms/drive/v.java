package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class v implements Creator<DriveSpace> {
    static void a(DriveSpace driveSpace, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, driveSpace.f);
        b.a(parcel, 2, driveSpace.a(), false);
        b.a(parcel, a);
    }

    public DriveSpace a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    str = a.q(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new DriveSpace(i, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public DriveSpace[] a(int i) {
        return new DriveSpace[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
