package com.google.android.gms.wallet.fragment;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class i implements Creator<WalletFragmentStyle> {
    static void a(WalletFragmentStyle walletFragmentStyle, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, walletFragmentStyle.a);
        b.a(parcel, 2, walletFragmentStyle.b, false);
        b.a(parcel, 3, walletFragmentStyle.c);
        b.a(parcel, a);
    }

    public WalletFragmentStyle a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        Bundle bundle = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = a.g(parcel, a);
                    break;
                case 2:
                    bundle = a.s(parcel, a);
                    break;
                case 3:
                    i = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new WalletFragmentStyle(i2, bundle, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public WalletFragmentStyle[] a(int i) {
        return new WalletFragmentStyle[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
