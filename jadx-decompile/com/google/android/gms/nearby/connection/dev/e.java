package com.google.android.gms.nearby.connection.dev;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class e implements Creator<DiscoveryOptions> {
    static void a(DiscoveryOptions discoveryOptions, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, discoveryOptions.a(), i, false);
        b.a(parcel, 1000, discoveryOptions.a);
        b.a(parcel, a);
    }

    public DiscoveryOptions a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        Strategy strategy = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    strategy = (Strategy) a.a(parcel, a, Strategy.CREATOR);
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
            return new DiscoveryOptions(i, strategy);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public DiscoveryOptions[] a(int i) {
        return new DiscoveryOptions[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
