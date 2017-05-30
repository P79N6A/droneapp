package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class h implements Creator<WalletFragmentOptions> {
    static void a(WalletFragmentOptions walletFragmentOptions, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, walletFragmentOptions.a);
        b.a(parcel, 2, walletFragmentOptions.b());
        b.a(parcel, 3, walletFragmentOptions.c());
        b.a(parcel, 4, walletFragmentOptions.d(), i, false);
        b.a(parcel, 5, walletFragmentOptions.e());
        b.a(parcel, a);
    }

    public WalletFragmentOptions a(Parcel parcel) {
        int i = 1;
        int i2 = 0;
        int b = a.b(parcel);
        WalletFragmentStyle walletFragmentStyle = null;
        int i3 = 1;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i4 = a.g(parcel, a);
                    break;
                case 2:
                    i3 = a.g(parcel, a);
                    break;
                case 3:
                    i2 = a.g(parcel, a);
                    break;
                case 4:
                    walletFragmentStyle = (WalletFragmentStyle) a.a(parcel, a, WalletFragmentStyle.CREATOR);
                    break;
                case 5:
                    i = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new WalletFragmentOptions(i4, i3, i2, walletFragmentStyle, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public WalletFragmentOptions[] a(int i) {
        return new WalletFragmentOptions[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
