package com.google.android.gms.config.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class k implements Creator<PackageConfigTable> {
    static void a(PackageConfigTable packageConfigTable, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, packageConfigTable.a());
        b.a(parcel, 2, packageConfigTable.b(), false);
        b.a(parcel, a);
    }

    public PackageConfigTable a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        Bundle bundle = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    bundle = a.s(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PackageConfigTable(i, bundle);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public PackageConfigTable[] a(int i) {
        return new PackageConfigTable[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}