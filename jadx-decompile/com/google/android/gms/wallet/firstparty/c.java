package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class c implements Creator<GetBuyFlowInitializationTokenRequest> {
    static void a(GetBuyFlowInitializationTokenRequest getBuyFlowInitializationTokenRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, getBuyFlowInitializationTokenRequest.a());
        b.a(parcel, 2, getBuyFlowInitializationTokenRequest.a, false);
        b.a(parcel, 3, getBuyFlowInitializationTokenRequest.b, false);
        b.a(parcel, a);
    }

    public GetBuyFlowInitializationTokenRequest a(Parcel parcel) {
        byte[] bArr = null;
        int b = a.b(parcel);
        int i = 0;
        byte[] bArr2 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    bArr2 = a.t(parcel, a);
                    break;
                case 3:
                    bArr = a.t(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GetBuyFlowInitializationTokenRequest(i, bArr2, bArr);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public GetBuyFlowInitializationTokenRequest[] a(int i) {
        return new GetBuyFlowInitializationTokenRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
