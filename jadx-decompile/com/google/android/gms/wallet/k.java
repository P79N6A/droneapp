package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class k implements Creator<FullWalletRequest> {
    static void a(FullWalletRequest fullWalletRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, fullWalletRequest.b());
        b.a(parcel, 2, fullWalletRequest.a, false);
        b.a(parcel, 3, fullWalletRequest.b, false);
        b.a(parcel, 4, fullWalletRequest.c, i, false);
        b.a(parcel, a);
    }

    public FullWalletRequest a(Parcel parcel) {
        Cart cart = null;
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
                    cart = (Cart) a.a(parcel, a, Cart.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new FullWalletRequest(i, str2, str, cart);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public FullWalletRequest[] a(int i) {
        return new FullWalletRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
