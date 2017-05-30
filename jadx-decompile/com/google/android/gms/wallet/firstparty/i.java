package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class i implements Creator<InitializeBuyFlowRequest> {
    static void a(InitializeBuyFlowRequest initializeBuyFlowRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, initializeBuyFlowRequest.a());
        b.a(parcel, 2, initializeBuyFlowRequest.a, false);
        b.a(parcel, a);
    }

    public InitializeBuyFlowRequest a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        byte[][] bArr = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    bArr = a.u(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new InitializeBuyFlowRequest(i, bArr);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public InitializeBuyFlowRequest[] a(int i) {
        return new InitializeBuyFlowRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
