package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class h implements Creator<GetInstrumentsResponse> {
    static void a(GetInstrumentsResponse getInstrumentsResponse, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, getInstrumentsResponse.a());
        b.a(parcel, 2, getInstrumentsResponse.a, false);
        b.a(parcel, 3, getInstrumentsResponse.b, false);
        b.a(parcel, a);
    }

    public GetInstrumentsResponse a(Parcel parcel) {
        byte[][] bArr = null;
        int b = a.b(parcel);
        int i = 0;
        String[] strArr = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    strArr = a.C(parcel, a);
                    break;
                case 3:
                    bArr = a.u(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GetInstrumentsResponse(i, strArr, bArr);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public GetInstrumentsResponse[] a(int i) {
        return new GetInstrumentsResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
