package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

public class t implements Creator<OfferWalletObject> {
    static void a(OfferWalletObject offerWalletObject, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, offerWalletObject.a());
        b.a(parcel, 2, offerWalletObject.a, false);
        b.a(parcel, 3, offerWalletObject.b, false);
        b.a(parcel, 4, offerWalletObject.c, i, false);
        b.a(parcel, a);
    }

    public OfferWalletObject a(Parcel parcel) {
        CommonWalletObject commonWalletObject = null;
        int b = a.b(parcel);
        int i = 0;
        String str = null;
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
                    commonWalletObject = (CommonWalletObject) a.a(parcel, a, CommonWalletObject.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new OfferWalletObject(i, str2, str, commonWalletObject);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public OfferWalletObject[] a(int i) {
        return new OfferWalletObject[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
