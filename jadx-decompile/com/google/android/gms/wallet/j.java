package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.identity.intents.model.UserAddress;

public class j implements Creator<FullWallet> {
    static void a(FullWallet fullWallet, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, fullWallet.a());
        b.a(parcel, 2, fullWallet.a, false);
        b.a(parcel, 3, fullWallet.b, false);
        b.a(parcel, 4, fullWallet.c, i, false);
        b.a(parcel, 5, fullWallet.d, false);
        b.a(parcel, 6, fullWallet.e, i, false);
        b.a(parcel, 7, fullWallet.f, i, false);
        b.a(parcel, 8, fullWallet.g, false);
        b.a(parcel, 9, fullWallet.h, i, false);
        b.a(parcel, 10, fullWallet.i, i, false);
        b.a(parcel, 11, fullWallet.j, i, false);
        b.a(parcel, 12, fullWallet.k, i, false);
        b.a(parcel, a);
    }

    public FullWallet a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        ProxyCard proxyCard = null;
        String str3 = null;
        Address address = null;
        Address address2 = null;
        String[] strArr = null;
        UserAddress userAddress = null;
        UserAddress userAddress2 = null;
        InstrumentInfo[] instrumentInfoArr = null;
        PaymentMethodToken paymentMethodToken = null;
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
                    proxyCard = (ProxyCard) a.a(parcel, a, ProxyCard.CREATOR);
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
                    strArr = a.C(parcel, a);
                    break;
                case 9:
                    userAddress = (UserAddress) a.a(parcel, a, UserAddress.CREATOR);
                    break;
                case 10:
                    userAddress2 = (UserAddress) a.a(parcel, a, UserAddress.CREATOR);
                    break;
                case 11:
                    instrumentInfoArr = (InstrumentInfo[]) a.b(parcel, a, InstrumentInfo.CREATOR);
                    break;
                case 12:
                    paymentMethodToken = (PaymentMethodToken) a.a(parcel, a, PaymentMethodToken.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new FullWallet(i, str, str2, proxyCard, str3, address, address2, strArr, userAddress, userAddress2, instrumentInfoArr, paymentMethodToken);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public FullWallet[] a(int i) {
        return new FullWallet[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
