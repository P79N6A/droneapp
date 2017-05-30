package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

public class b implements Creator<Flag> {
    static void a(Flag flag, Parcel parcel, int i) {
        int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, flag.a);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, flag.b, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, flag.c);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 4, flag.d);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 5, flag.e);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 6, flag.f, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 7, flag.g, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 8, flag.h);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 9, flag.i);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, a);
    }

    public Flag a(Parcel parcel) {
        byte[] bArr = null;
        int i = 0;
        int b = a.b(parcel);
        long j = 0;
        double d = 0.0d;
        int i2 = 0;
        String str = null;
        boolean z = false;
        String str2 = null;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i3 = a.g(parcel, a);
                    break;
                case 2:
                    str2 = a.q(parcel, a);
                    break;
                case 3:
                    j = a.i(parcel, a);
                    break;
                case 4:
                    z = a.c(parcel, a);
                    break;
                case 5:
                    d = a.n(parcel, a);
                    break;
                case 6:
                    str = a.q(parcel, a);
                    break;
                case 7:
                    bArr = a.t(parcel, a);
                    break;
                case 8:
                    i2 = a.g(parcel, a);
                    break;
                case 9:
                    i = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Flag(i3, str2, j, z, d, str, bArr, i2, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public Flag[] a(int i) {
        return new Flag[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
