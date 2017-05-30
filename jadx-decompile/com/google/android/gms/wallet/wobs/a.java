package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

public class a implements Creator<CommonWalletObject> {
    static void a(CommonWalletObject commonWalletObject, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, commonWalletObject.b());
        b.a(parcel, 2, commonWalletObject.a, false);
        b.a(parcel, 3, commonWalletObject.b, false);
        b.a(parcel, 4, commonWalletObject.c, false);
        b.a(parcel, 5, commonWalletObject.d, false);
        b.a(parcel, 6, commonWalletObject.e, false);
        b.a(parcel, 7, commonWalletObject.f, false);
        b.a(parcel, 8, commonWalletObject.g, false);
        b.a(parcel, 9, commonWalletObject.h, false);
        b.a(parcel, 10, commonWalletObject.i);
        b.c(parcel, 11, commonWalletObject.j, false);
        b.a(parcel, 12, commonWalletObject.k, i, false);
        b.c(parcel, 13, commonWalletObject.l, false);
        b.a(parcel, 14, commonWalletObject.m, false);
        b.a(parcel, 15, commonWalletObject.n, false);
        b.c(parcel, 16, commonWalletObject.o, false);
        b.a(parcel, 17, commonWalletObject.p);
        b.c(parcel, 18, commonWalletObject.q, false);
        b.c(parcel, 19, commonWalletObject.r, false);
        b.c(parcel, 20, commonWalletObject.s, false);
        b.a(parcel, a);
    }

    public CommonWalletObject a(Parcel parcel) {
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        int i2 = 0;
        ArrayList a = com.google.android.gms.common.util.b.a();
        TimeInterval timeInterval = null;
        ArrayList a2 = com.google.android.gms.common.util.b.a();
        String str9 = null;
        String str10 = null;
        ArrayList a3 = com.google.android.gms.common.util.b.a();
        boolean z = false;
        ArrayList a4 = com.google.android.gms.common.util.b.a();
        ArrayList a5 = com.google.android.gms.common.util.b.a();
        ArrayList a6 = com.google.android.gms.common.util.b.a();
        while (parcel.dataPosition() < b) {
            int a7 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a7)) {
                case 1:
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a7);
                    break;
                case 2:
                    str = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a7);
                    break;
                case 3:
                    str2 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a7);
                    break;
                case 4:
                    str3 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a7);
                    break;
                case 5:
                    str4 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a7);
                    break;
                case 6:
                    str5 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a7);
                    break;
                case 7:
                    str6 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a7);
                    break;
                case 8:
                    str7 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a7);
                    break;
                case 9:
                    str8 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a7);
                    break;
                case 10:
                    i2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a7);
                    break;
                case 11:
                    a = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a7, WalletObjectMessage.CREATOR);
                    break;
                case 12:
                    timeInterval = (TimeInterval) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a7, TimeInterval.CREATOR);
                    break;
                case 13:
                    a2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a7, LatLng.CREATOR);
                    break;
                case 14:
                    str9 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a7);
                    break;
                case 15:
                    str10 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a7);
                    break;
                case 16:
                    a3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a7, LabelValueRow.CREATOR);
                    break;
                case 17:
                    z = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a7);
                    break;
                case 18:
                    a4 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a7, UriData.CREATOR);
                    break;
                case 19:
                    a5 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a7, TextModuleData.CREATOR);
                    break;
                case 20:
                    a6 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a7, UriData.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a7);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new CommonWalletObject(i, str, str2, str3, str4, str5, str6, str7, str8, i2, a, timeInterval, a2, str9, str10, a3, z, a4, a5, a6);
        }
        throw new com.google.android.gms.common.internal.safeparcel.a.a("Overread allowed size end=" + b, parcel);
    }

    public CommonWalletObject[] a(int i) {
        return new CommonWalletObject[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
