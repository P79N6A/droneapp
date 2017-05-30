package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import java.util.ArrayList;

public class p implements Creator<LoyaltyWalletObject> {
    static void a(LoyaltyWalletObject loyaltyWalletObject, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, loyaltyWalletObject.a());
        b.a(parcel, 2, loyaltyWalletObject.a, false);
        b.a(parcel, 3, loyaltyWalletObject.b, false);
        b.a(parcel, 4, loyaltyWalletObject.c, false);
        b.a(parcel, 5, loyaltyWalletObject.d, false);
        b.a(parcel, 6, loyaltyWalletObject.e, false);
        b.a(parcel, 7, loyaltyWalletObject.f, false);
        b.a(parcel, 8, loyaltyWalletObject.g, false);
        b.a(parcel, 9, loyaltyWalletObject.h, false);
        b.a(parcel, 10, loyaltyWalletObject.i, false);
        b.a(parcel, 11, loyaltyWalletObject.j, false);
        b.a(parcel, 12, loyaltyWalletObject.k);
        b.c(parcel, 13, loyaltyWalletObject.l, false);
        b.a(parcel, 14, loyaltyWalletObject.m, i, false);
        b.c(parcel, 15, loyaltyWalletObject.n, false);
        b.a(parcel, 16, loyaltyWalletObject.o, false);
        b.a(parcel, 17, loyaltyWalletObject.p, false);
        b.c(parcel, 18, loyaltyWalletObject.q, false);
        b.a(parcel, 19, loyaltyWalletObject.r);
        b.c(parcel, 20, loyaltyWalletObject.s, false);
        b.c(parcel, 21, loyaltyWalletObject.t, false);
        b.c(parcel, 22, loyaltyWalletObject.u, false);
        b.a(parcel, 23, loyaltyWalletObject.v, i, false);
        b.a(parcel, a);
    }

    public LoyaltyWalletObject a(Parcel parcel) {
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
        int i2 = 0;
        ArrayList a = com.google.android.gms.common.util.b.a();
        TimeInterval timeInterval = null;
        ArrayList a2 = com.google.android.gms.common.util.b.a();
        String str11 = null;
        String str12 = null;
        ArrayList a3 = com.google.android.gms.common.util.b.a();
        boolean z = false;
        ArrayList a4 = com.google.android.gms.common.util.b.a();
        ArrayList a5 = com.google.android.gms.common.util.b.a();
        ArrayList a6 = com.google.android.gms.common.util.b.a();
        LoyaltyPoints loyaltyPoints = null;
        while (parcel.dataPosition() < b) {
            int a7 = a.a(parcel);
            switch (a.a(a7)) {
                case 1:
                    i = a.g(parcel, a7);
                    break;
                case 2:
                    str = a.q(parcel, a7);
                    break;
                case 3:
                    str2 = a.q(parcel, a7);
                    break;
                case 4:
                    str3 = a.q(parcel, a7);
                    break;
                case 5:
                    str4 = a.q(parcel, a7);
                    break;
                case 6:
                    str5 = a.q(parcel, a7);
                    break;
                case 7:
                    str6 = a.q(parcel, a7);
                    break;
                case 8:
                    str7 = a.q(parcel, a7);
                    break;
                case 9:
                    str8 = a.q(parcel, a7);
                    break;
                case 10:
                    str9 = a.q(parcel, a7);
                    break;
                case 11:
                    str10 = a.q(parcel, a7);
                    break;
                case 12:
                    i2 = a.g(parcel, a7);
                    break;
                case 13:
                    a = a.c(parcel, a7, WalletObjectMessage.CREATOR);
                    break;
                case 14:
                    timeInterval = (TimeInterval) a.a(parcel, a7, TimeInterval.CREATOR);
                    break;
                case 15:
                    a2 = a.c(parcel, a7, LatLng.CREATOR);
                    break;
                case 16:
                    str11 = a.q(parcel, a7);
                    break;
                case 17:
                    str12 = a.q(parcel, a7);
                    break;
                case 18:
                    a3 = a.c(parcel, a7, LabelValueRow.CREATOR);
                    break;
                case 19:
                    z = a.c(parcel, a7);
                    break;
                case 20:
                    a4 = a.c(parcel, a7, UriData.CREATOR);
                    break;
                case 21:
                    a5 = a.c(parcel, a7, TextModuleData.CREATOR);
                    break;
                case 22:
                    a6 = a.c(parcel, a7, UriData.CREATOR);
                    break;
                case 23:
                    loyaltyPoints = (LoyaltyPoints) a.a(parcel, a7, LoyaltyPoints.CREATOR);
                    break;
                default:
                    a.b(parcel, a7);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new LoyaltyWalletObject(i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, i2, a, timeInterval, a2, str11, str12, a3, z, a4, a5, a6, loyaltyPoints);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public LoyaltyWalletObject[] a(int i) {
        return new LoyaltyWalletObject[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
