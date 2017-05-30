package com.google.android.gms.wallet.firstparty;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class j implements Creator<WalletCustomTheme> {
    static void a(WalletCustomTheme walletCustomTheme, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, walletCustomTheme.a);
        b.a(parcel, 2, walletCustomTheme.b);
        b.a(parcel, 3, walletCustomTheme.c, false);
        b.a(parcel, 4, walletCustomTheme.d, false);
        b.a(parcel, a);
    }

    public WalletCustomTheme a(Parcel parcel) {
        String str = null;
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
                    i = a.g(parcel, a);
                    break;
                case 3:
                    bundle = a.s(parcel, a);
                    break;
                case 4:
                    str = a.q(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new WalletCustomTheme(i2, i, bundle, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public WalletCustomTheme[] a(int i) {
        return new WalletCustomTheme[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
