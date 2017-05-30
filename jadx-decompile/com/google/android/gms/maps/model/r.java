package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class r implements Creator<LatLng> {
    static void a(LatLng latLng, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, latLng.a());
        b.a(parcel, 2, latLng.a);
        b.a(parcel, 3, latLng.b);
        b.a(parcel, a);
    }

    public LatLng a(Parcel parcel) {
        double d = 0.0d;
        int b = a.b(parcel);
        int i = 0;
        double d2 = 0.0d;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    d2 = a.n(parcel, a);
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
            return new LatLng(i, d2, d);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public LatLng[] a(int i) {
        return new LatLng[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
