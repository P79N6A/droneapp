package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class x implements Creator<OnConnectionRequestParams> {
    static void a(OnConnectionRequestParams onConnectionRequestParams, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, onConnectionRequestParams.a(), false);
        b.a(parcel, 2, onConnectionRequestParams.b(), false);
        b.a(parcel, 3, onConnectionRequestParams.c(), false);
        b.a(parcel, 1000, onConnectionRequestParams.a);
        b.a(parcel, a);
    }

    public OnConnectionRequestParams a(Parcel parcel) {
        byte[] bArr = null;
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    str2 = a.q(parcel, a);
                    break;
                case 2:
                    str = a.q(parcel, a);
                    break;
                case 3:
                    bArr = a.t(parcel, a);
                    break;
                case 1000:
                    i = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new OnConnectionRequestParams(i, str2, str, bArr);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public OnConnectionRequestParams[] a(int i) {
        return new OnConnectionRequestParams[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
