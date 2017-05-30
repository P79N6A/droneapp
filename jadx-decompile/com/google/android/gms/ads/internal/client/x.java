package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.List;

public class x implements Creator<AdRequestParcel> {
    static void a(AdRequestParcel adRequestParcel, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, adRequestParcel.a);
        b.a(parcel, 2, adRequestParcel.b);
        b.a(parcel, 3, adRequestParcel.c, false);
        b.a(parcel, 4, adRequestParcel.d);
        b.b(parcel, 5, adRequestParcel.e, false);
        b.a(parcel, 6, adRequestParcel.f);
        b.a(parcel, 7, adRequestParcel.g);
        b.a(parcel, 8, adRequestParcel.h);
        b.a(parcel, 9, adRequestParcel.i, false);
        b.a(parcel, 10, adRequestParcel.j, i, false);
        b.a(parcel, 11, adRequestParcel.k, i, false);
        b.a(parcel, 12, adRequestParcel.l, false);
        b.a(parcel, 13, adRequestParcel.m, false);
        b.a(parcel, 14, adRequestParcel.n, false);
        b.b(parcel, 15, adRequestParcel.o, false);
        b.a(parcel, 16, adRequestParcel.p, false);
        b.a(parcel, 17, adRequestParcel.q, false);
        b.a(parcel, 18, adRequestParcel.r);
        b.a(parcel, a);
    }

    public AdRequestParcel a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        long j = 0;
        Bundle bundle = null;
        int i2 = 0;
        List list = null;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        String str = null;
        SearchAdRequestParcel searchAdRequestParcel = null;
        Location location = null;
        String str2 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        List list2 = null;
        String str3 = null;
        String str4 = null;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    j = a.i(parcel, a);
                    break;
                case 3:
                    bundle = a.s(parcel, a);
                    break;
                case 4:
                    i2 = a.g(parcel, a);
                    break;
                case 5:
                    list = a.E(parcel, a);
                    break;
                case 6:
                    z = a.c(parcel, a);
                    break;
                case 7:
                    i3 = a.g(parcel, a);
                    break;
                case 8:
                    z2 = a.c(parcel, a);
                    break;
                case 9:
                    str = a.q(parcel, a);
                    break;
                case 10:
                    searchAdRequestParcel = (SearchAdRequestParcel) a.a(parcel, a, SearchAdRequestParcel.CREATOR);
                    break;
                case 11:
                    location = (Location) a.a(parcel, a, Location.CREATOR);
                    break;
                case 12:
                    str2 = a.q(parcel, a);
                    break;
                case 13:
                    bundle2 = a.s(parcel, a);
                    break;
                case 14:
                    bundle3 = a.s(parcel, a);
                    break;
                case 15:
                    list2 = a.E(parcel, a);
                    break;
                case 16:
                    str3 = a.q(parcel, a);
                    break;
                case 17:
                    str4 = a.q(parcel, a);
                    break;
                case 18:
                    z3 = a.c(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AdRequestParcel(i, j, bundle, i2, list, z, i3, z2, str, searchAdRequestParcel, location, str2, bundle2, bundle3, list2, str3, str4, z3);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public AdRequestParcel[] a(int i) {
        return new AdRequestParcel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
