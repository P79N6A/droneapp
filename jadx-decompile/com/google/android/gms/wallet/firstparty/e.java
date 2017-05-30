package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class e implements Creator<GetClientTokenRequest> {
    static void a(GetClientTokenRequest getClientTokenRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, getClientTokenRequest.a());
        b.a(parcel, 2, getClientTokenRequest.a, i, false);
        b.a(parcel, a);
    }

    public GetClientTokenRequest a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        WalletCustomTheme walletCustomTheme = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    walletCustomTheme = (WalletCustomTheme) a.a(parcel, a, WalletCustomTheme.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GetClientTokenRequest(i, walletCustomTheme);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public GetClientTokenRequest[] a(int i) {
        return new GetClientTokenRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
