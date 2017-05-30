package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class r implements Creator<Strategy> {
    static void a(Strategy strategy, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, strategy.m);
        b.a(parcel, 2, strategy.n);
        b.a(parcel, 3, strategy.o);
        b.a(parcel, 4, strategy.p);
        b.a(parcel, 5, strategy.a());
        b.a(parcel, 6, strategy.b());
        b.a(parcel, 1000, strategy.l);
        b.a(parcel, a);
    }

    public Strategy a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i5 = a.g(parcel, a);
                    break;
                case 2:
                    i4 = a.g(parcel, a);
                    break;
                case 3:
                    i3 = a.g(parcel, a);
                    break;
                case 4:
                    z = a.c(parcel, a);
                    break;
                case 5:
                    i2 = a.g(parcel, a);
                    break;
                case 6:
                    i = a.g(parcel, a);
                    break;
                case 1000:
                    i6 = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Strategy(i6, i5, i4, i3, z, i2, i);
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
