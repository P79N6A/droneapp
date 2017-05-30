package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class i implements Creator<WalletObjectMessage> {
    static void a(WalletObjectMessage walletObjectMessage, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, walletObjectMessage.a());
        b.a(parcel, 2, walletObjectMessage.a, false);
        b.a(parcel, 3, walletObjectMessage.b, false);
        b.a(parcel, 4, walletObjectMessage.c, i, false);
        b.a(parcel, 5, walletObjectMessage.d, i, false);
        b.a(parcel, 6, walletObjectMessage.e, i, false);
        b.a(parcel, a);
    }

    public WalletObjectMessage a(Parcel parcel) {
        UriData uriData = null;
        int b = a.b(parcel);
        int i = 0;
        UriData uriData2 = null;
        TimeInterval timeInterval = null;
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
                    timeInterval = (TimeInterval) a.a(parcel, a, TimeInterval.CREATOR);
                    break;
                case 5:
                    uriData2 = (UriData) a.a(parcel, a, UriData.CREATOR);
                    break;
                case 6:
                    uriData = (UriData) a.a(parcel, a, UriData.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new WalletObjectMessage(i, str2, str, timeInterval, uriData2, uriData);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public WalletObjectMessage[] a(int i) {
        return new WalletObjectMessage[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
