package com.google.android.gms.nearby.connection.dev;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class g implements Creator<Strategy> {
    static void a(Strategy strategy, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, strategy.a());
        b.a(parcel, 2, strategy.b());
        b.a(parcel, 1000, strategy.c);
        b.a(parcel, a);
    }

    public Strategy a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = a.g(parcel, a);
                    break;
                case 2:
                    i = a.g(parcel, a);
                    break;
                case 1000:
                    i3 = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Strategy(i3, i2, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public Strategy[] a(int i) {
        return new Strategy[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
