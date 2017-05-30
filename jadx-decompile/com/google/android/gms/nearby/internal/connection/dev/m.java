package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class m implements Creator<DisconnectFromEndpointParams> {
    static void a(DisconnectFromEndpointParams disconnectFromEndpointParams, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, disconnectFromEndpointParams.a(), false);
        b.a(parcel, 1000, disconnectFromEndpointParams.a);
        b.a(parcel, a);
    }

    public DisconnectFromEndpointParams a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    str = a.q(parcel, a);
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
            return new DisconnectFromEndpointParams(i, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public DisconnectFromEndpointParams[] a(int i) {
        return new DisconnectFromEndpointParams[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
