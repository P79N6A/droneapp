package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

public class l implements Creator<GiftCardWalletObject> {
    static void a(GiftCardWalletObject giftCardWalletObject, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, giftCardWalletObject.a());
        b.a(parcel, 2, giftCardWalletObject.b, i, false);
        b.a(parcel, 3, giftCardWalletObject.c, false);
        b.a(parcel, 4, giftCardWalletObject.d, false);
        b.a(parcel, 5, giftCardWalletObject.e, false);
        b.a(parcel, 6, giftCardWalletObject.f);
        b.a(parcel, 7, giftCardWalletObject.g, false);
        b.a(parcel, 8, giftCardWalletObject.h);
        b.a(parcel, 9, giftCardWalletObject.i, false);
        b.a(parcel, a);
    }

    public GiftCardWalletObject a(Parcel parcel) {
        long j = 0;
        String str = null;
        int b = a.b(parcel);
        int i = 0;
        String str2 = null;
        long j2 = 0;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        CommonWalletObject commonWalletObject = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    commonWalletObject = (CommonWalletObject) a.a(parcel, a, CommonWalletObject.CREATOR);
                    break;
                case 3:
                    str5 = a.q(parcel, a);
                    break;
                case 4:
                    str4 = a.q(parcel, a);
                    break;
                case 5:
                    str3 = a.q(parcel, a);
                    break;
                case 6:
                    j2 = a.i(parcel, a);
                    break;
                case 7:
                    str2 = a.q(parcel, a);
                    break;
                case 8:
                    j = a.i(parcel, a);
                    break;
                case 9:
                    str = a.q(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GiftCardWalletObject(i, commonWalletObject, str5, str4, str3, j2, str2, j, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public GiftCardWalletObject[] a(int i) {
        return new GiftCardWalletObject[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
