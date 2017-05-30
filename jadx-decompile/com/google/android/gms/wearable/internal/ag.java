package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class ag implements Creator<PackageStorageInfo> {
    static void a(PackageStorageInfo packageStorageInfo, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, packageStorageInfo.a);
        b.a(parcel, 2, packageStorageInfo.b, false);
        b.a(parcel, 3, packageStorageInfo.c, false);
        b.a(parcel, 4, packageStorageInfo.d);
        b.a(parcel, a);
    }

    public PackageStorageInfo a(Parcel parcel) {
        String str = null;
        int b = a.b(parcel);
        int i = 0;
        long j = 0;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    str2 = a.q(parcel, a);
                    break;
                case 3:
                    str = a.q(parcel, a);
                    break;
                case 4:
                    j = a.i(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PackageStorageInfo(i, str2, str, j);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public PackageStorageInfo[] a(int i) {
        return new PackageStorageInfo[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
