package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class y implements Creator<OnConnectionResponseParams> {
    static void a(OnConnectionResponseParams onConnectionResponseParams, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, onConnectionResponseParams.a(), false);
        b.a(parcel, 2, onConnectionResponseParams.b());
        b.a(parcel, 3, onConnectionResponseParams.c(), false);
        b.a(parcel, 1000, onConnectionResponseParams.a);
        b.a(parcel, a);
    }

    public OnConnectionResponseParams a(Parcel parcel) {
        byte[] bArr = null;
        int i = 0;
        int b = a.b(parcel);
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    str = a.q(parcel, a);
                    break;
                case 2:
                    i = a.g(parcel, a);
                    break;
                case 3:
                    bArr = a.t(parcel, a);
                    break;
                case 1000:
                    i2 = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new OnConnectionResponseParams(i2, str, i, bArr);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public OnConnectionResponseParams[] a(int i) {
        return new OnConnectionResponseParams[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
