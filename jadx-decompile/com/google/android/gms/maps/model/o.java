package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class o implements Creator<CircleOptions> {
    static void a(CircleOptions circleOptions, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, circleOptions.a());
        b.a(parcel, 2, circleOptions.b(), i, false);
        b.a(parcel, 3, circleOptions.c());
        b.a(parcel, 4, circleOptions.d());
        b.a(parcel, 5, circleOptions.e());
        b.a(parcel, 6, circleOptions.f());
        b.a(parcel, 7, circleOptions.g());
        b.a(parcel, 8, circleOptions.h());
        b.a(parcel, 9, circleOptions.i());
        b.a(parcel, a);
    }

    public CircleOptions a(Parcel parcel) {
        float f = 0.0f;
        boolean z = false;
        int b = a.b(parcel);
        LatLng latLng = null;
        double d = 0.0d;
        boolean z2 = false;
        int i = 0;
        int i2 = 0;
        float f2 = 0.0f;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i3 = a.g(parcel, a);
                    break;
                case 2:
                    latLng = (LatLng) a.a(parcel, a, LatLng.CREATOR);
                    break;
                case 3:
                    d = a.n(parcel, a);
                    break;
                case 4:
                    f2 = a.l(parcel, a);
                    break;
                case 5:
                    i2 = a.g(parcel, a);
                    break;
                case 6:
                    i = a.g(parcel, a);
                    break;
                case 7:
                    f = a.l(parcel, a);
                    break;
                case 8:
                    z2 = a.c(parcel, a);
                    break;
                case 9:
                    z = a.c(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new CircleOptions(i3, latLng, d, f2, i2, i, f, z2, z);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public CircleOptions[] a(int i) {
        return new CircleOptions[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
