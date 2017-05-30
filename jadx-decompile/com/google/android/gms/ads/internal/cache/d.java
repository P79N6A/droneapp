package com.google.android.gms.ads.internal.cache;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class d implements Creator<CacheOffering> {
    static void a(CacheOffering cacheOffering, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, cacheOffering.a);
        b.a(parcel, 2, cacheOffering.b, false);
        b.a(parcel, 3, cacheOffering.c);
        b.a(parcel, 4, cacheOffering.d, false);
        b.a(parcel, 5, cacheOffering.e, false);
        b.a(parcel, 6, cacheOffering.f, false);
        b.a(parcel, 7, cacheOffering.g, false);
        b.a(parcel, 8, cacheOffering.h);
        b.a(parcel, a);
    }

    public CacheOffering a(Parcel parcel) {
        boolean z = false;
        Bundle bundle = null;
        int b = a.b(parcel);
        long j = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    str4 = a.q(parcel, a);
                    break;
                case 3:
                    j = a.i(parcel, a);
                    break;
                case 4:
                    str3 = a.q(parcel, a);
                    break;
                case 5:
                    str2 = a.q(parcel, a);
                    break;
                case 6:
                    str = a.q(parcel, a);
                    break;
                case 7:
                    bundle = a.s(parcel, a);
                    break;
                case 8:
                    z = a.c(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new CacheOffering(i, str4, j, str3, str2, str, bundle, z);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public CacheOffering[] a(int i) {
        return new CacheOffering[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
