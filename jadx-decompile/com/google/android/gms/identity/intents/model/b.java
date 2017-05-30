package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

public class b implements Creator<UserAddress> {
    static void a(UserAddress userAddress, Parcel parcel, int i) {
        int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, userAddress.a());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, userAddress.a, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, userAddress.b, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 4, userAddress.c, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 5, userAddress.d, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 6, userAddress.e, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 7, userAddress.f, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 8, userAddress.g, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 9, userAddress.h, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 10, userAddress.i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 11, userAddress.j, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 12, userAddress.k, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 13, userAddress.l, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 14, userAddress.m);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 15, userAddress.n, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 16, userAddress.o, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, a);
    }

    public UserAddress a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        boolean z = false;
        String str13 = null;
        String str14 = null;
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
                    str2 = a.q(parcel, a);
                    break;
                case 4:
                    str3 = a.q(parcel, a);
                    break;
                case 5:
                    str4 = a.q(parcel, a);
                    break;
                case 6:
                    str5 = a.q(parcel, a);
                    break;
                case 7:
                    str6 = a.q(parcel, a);
                    break;
                case 8:
                    str7 = a.q(parcel, a);
                    break;
                case 9:
                    str8 = a.q(parcel, a);
                    break;
                case 10:
                    str9 = a.q(parcel, a);
                    break;
                case 11:
                    str10 = a.q(parcel, a);
                    break;
                case 12:
                    str11 = a.q(parcel, a);
                    break;
                case 13:
                    str12 = a.q(parcel, a);
                    break;
                case 14:
                    z = a.c(parcel, a);
                    break;
                case 15:
                    str13 = a.q(parcel, a);
                    break;
                case 16:
                    str14 = a.q(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new UserAddress(i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z, str13, str14);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public UserAddress[] a(int i) {
        return new UserAddress[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
