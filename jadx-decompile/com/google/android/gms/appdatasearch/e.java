package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class e implements Creator<Feature> {
    static void a(Feature feature, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, feature.b);
        b.a(parcel, 2, feature.c, false);
        b.a(parcel, 1000, feature.a);
        b.a(parcel, a);
    }

    public Feature a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        Bundle bundle = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    bundle = a.s(parcel, a);
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
            return new Feature(i2, i, bundle);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public Feature[] a(int i) {
        return new Feature[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
