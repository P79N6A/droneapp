package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.identity.intents.model.UserAddress;

public class q implements Creator<MaskedWallet> {
    static void a(MaskedWallet maskedWallet, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, maskedWallet.b());
        b.a(parcel, 2, maskedWallet.a, false);
        b.a(parcel, 3, maskedWallet.b, false);
        b.a(parcel, 4, maskedWallet.c, false);
        b.a(parcel, 5, maskedWallet.d, false);
        b.a(parcel, 6, maskedWallet.e, i, false);
        b.a(parcel, 7, maskedWallet.f, i, false);
        b.a(parcel, 8, maskedWallet.g, i, false);
        b.a(parcel, 9, maskedWallet.h, i, false);
        b.a(parcel, 10, maskedWallet.i, i, false);
        b.a(parcel, 11, maskedWallet.j, i, false);
        b.a(parcel, 12, maskedWallet.k, i, false);
        b.a(parcel, a);
    }

    public MaskedWallet a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String[] strArr = null;
        String str3 = null;
        Address address = null;
        Address address2 = null;
        LoyaltyWalletObject[] loyaltyWalletObjectArr = null;
        OfferWalletObject[] offerWalletObjectArr = null;
        UserAddress userAddress = null;
        UserAddress userAddress2 = null;
        InstrumentInfo[] instrumentInfoArr = null;
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
                    strArr = a.C(parcel, a);
                    break;
                case 5:
                    str3 = a.q(parcel, a);
                    break;
                case 6:
                    address = (Address) a.a(parcel, a, Address.CREATOR);
                    break;
                case 7:
                    address2 = (Address) a.a(parcel, a, Address.CREATOR);
                    break;
                case 8:
                    loyaltyWalletObjectArr = (LoyaltyWalletObject[]) a.b(parcel, a, LoyaltyWalletObject.CREATOR);
                    break;
                case 9:
                    offerWalletObjectArr = (OfferWalletObject[]) a.b(parcel, a, OfferWalletObject.CREATOR);
                    break;
                case 10:
                    userAddress = (UserAddress) a.a(parcel, a, UserAddress.CREATOR);
                    break;
                case 11:
                    userAddress2 = (UserAddress) a.a(parcel, a, UserAddress.CREATOR);
                    break;
                case 12:
                    instrumentInfoArr = (InstrumentInfo[]) a.b(parcel, a, InstrumentInfo.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new MaskedWallet(i, str, str2, strArr, str3, address, address2, loyaltyWalletObjectArr, offerWalletObjectArr, userAddress, userAddress2, instrumentInfoArr);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public MaskedWallet[] a(int i) {
        return new MaskedWallet[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
