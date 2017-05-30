package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

public class g implements Creator<WalletFragmentInitParams> {
    static void a(WalletFragmentInitParams walletFragmentInitParams, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, walletFragmentInitParams.a);
        b.a(parcel, 2, walletFragmentInitParams.b(), false);
        b.a(parcel, 3, walletFragmentInitParams.c(), i, false);
        b.a(parcel, 4, walletFragmentInitParams.d());
        b.a(parcel, 5, walletFragmentInitParams.e(), i, false);
        b.a(parcel, a);
    }

    public WalletFragmentInitParams a(Parcel parcel) {
        MaskedWallet maskedWallet = null;
        int b = a.b(parcel);
        int i = 0;
        int i2 = -1;
        MaskedWalletRequest maskedWalletRequest = null;
        String str = null;
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
                    maskedWalletRequest = (MaskedWalletRequest) a.a(parcel, a, MaskedWalletRequest.CREATOR);
                    break;
                case 4:
                    i2 = a.g(parcel, a);
                    break;
                case 5:
                    maskedWallet = (MaskedWallet) a.a(parcel, a, MaskedWallet.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new WalletFragmentInitParams(i, str, maskedWalletRequest, i2, maskedWallet);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public WalletFragmentInitParams[] a(int i) {
        return new WalletFragmentInitParams[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
