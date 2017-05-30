package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class e implements Creator<DistanceImpl> {
    static void a(DistanceImpl distanceImpl, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, distanceImpl.b);
        b.a(parcel, 2, distanceImpl.c);
        b.a(parcel, 3, distanceImpl.d);
        b.a(parcel, a);
    }

    public DistanceImpl a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        double d = 0.0d;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = a.g(parcel, a);
                    break;
                case 2:
                    i = a.g(parcel, a);
                    break;
                case 3:
                    d = a.n(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new DistanceImpl(i2, i, d);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public DistanceImpl[] a(int i) {
        return new DistanceImpl[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
