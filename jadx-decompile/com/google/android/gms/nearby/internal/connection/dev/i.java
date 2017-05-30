package com.google.android.gms.nearby.internal.connection.dev;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class i implements Creator<StopDiscoveryParams> {
    static void a(StopDiscoveryParams stopDiscoveryParams, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1000, stopDiscoveryParams.a);
        b.a(parcel, a);
    }

    public StopDiscoveryParams a(Parcel parcel) {
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
            return new StopDiscoveryParams(i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public StopDiscoveryParams[] a(int i) {
        return new StopDiscoveryParams[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
