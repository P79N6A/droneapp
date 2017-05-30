package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class z implements Creator<AdSizeParcel> {
    static void a(AdSizeParcel adSizeParcel, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, adSizeParcel.a);
        b.a(parcel, 2, adSizeParcel.b, false);
        b.a(parcel, 3, adSizeParcel.c);
        b.a(parcel, 4, adSizeParcel.d);
        b.a(parcel, 5, adSizeParcel.e);
        b.a(parcel, 6, adSizeParcel.f);
        b.a(parcel, 7, adSizeParcel.g);
        b.a(parcel, 8, adSizeParcel.h, i, false);
        b.a(parcel, 9, adSizeParcel.i);
        b.a(parcel, 10, adSizeParcel.j);
        b.a(parcel, 11, adSizeParcel.k);
        b.a(parcel, a);
    }

    public AdSizeParcel a(Parcel parcel) {
        AdSizeParcel[] adSizeParcelArr = null;
        boolean z = false;
        int b = a.b(parcel);
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        int i2 = 0;
        boolean z4 = false;
        int i3 = 0;
        int i4 = 0;
        String str = null;
        int i5 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i5 = a.g(parcel, a);
                    break;
                case 2:
                    str = a.q(parcel, a);
                    break;
                case 3:
                    i4 = a.g(parcel, a);
                    break;
                case 4:
                    i3 = a.g(parcel, a);
                    break;
                case 5:
                    z4 = a.c(parcel, a);
                    break;
                case 6:
                    i2 = a.g(parcel, a);
                    break;
                case 7:
                    i = a.g(parcel, a);
                    break;
                case 8:
                    adSizeParcelArr = (AdSizeParcel[]) a.b(parcel, a, AdSizeParcel.CREATOR);
                    break;
                case 9:
                    z3 = a.c(parcel, a);
                    break;
                case 10:
                    z2 = a.c(parcel, a);
                    break;
                case 11:
                    z = a.c(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AdSizeParcel(i5, str, i4, i3, z4, i2, i, adSizeParcelArr, z3, z2, z);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public AdSizeParcel[] a(int i) {
        return new AdSizeParcel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
