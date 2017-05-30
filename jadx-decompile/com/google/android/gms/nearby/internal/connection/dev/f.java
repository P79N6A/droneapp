package com.google.android.gms.nearby.internal.connection.dev;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.nearby.connection.dev.DiscoveryOptions;

public class f implements Creator<StartDiscoveryParams> {
    static void a(StartDiscoveryParams startDiscoveryParams, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, startDiscoveryParams.a(), false);
        b.a(parcel, 2, startDiscoveryParams.b(), false);
        b.a(parcel, 3, startDiscoveryParams.c(), false);
        b.a(parcel, 4, startDiscoveryParams.d());
        b.a(parcel, 5, startDiscoveryParams.e(), i, false);
        b.a(parcel, 1000, startDiscoveryParams.a);
        b.a(parcel, a);
    }

    public StartDiscoveryParams a(Parcel parcel) {
        DiscoveryOptions discoveryOptions = null;
        int b = a.b(parcel);
        int i = 0;
        long j = 0;
        String str = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    iBinder2 = a.r(parcel, a);
                    break;
                case 2:
                    iBinder = a.r(parcel, a);
                    break;
                case 3:
                    str = a.q(parcel, a);
                    break;
                case 4:
                    j = a.i(parcel, a);
                    break;
                case 5:
                    discoveryOptions = (DiscoveryOptions) a.a(parcel, a, DiscoveryOptions.CREATOR);
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
            return new StartDiscoveryParams(i, iBinder2, iBinder, str, j, discoveryOptions);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public StartDiscoveryParams[] a(int i) {
        return new StartDiscoveryParams[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
