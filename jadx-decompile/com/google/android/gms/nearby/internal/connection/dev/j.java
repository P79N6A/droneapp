package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class j implements Creator<ClientDisconnectingParams> {
    static void a(ClientDisconnectingParams clientDisconnectingParams, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1000, clientDisconnectingParams.a);
        b.a(parcel, a);
    }

    public ClientDisconnectingParams a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1000:
                    i = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ClientDisconnectingParams(i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public ClientDisconnectingParams[] a(int i) {
        return new ClientDisconnectingParams[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
