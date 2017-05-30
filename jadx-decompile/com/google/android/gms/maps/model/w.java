package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.List;

public class w implements Creator<PolylineOptions> {
    static void a(PolylineOptions polylineOptions, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, polylineOptions.a());
        b.c(parcel, 2, polylineOptions.b(), false);
        b.a(parcel, 3, polylineOptions.c());
        b.a(parcel, 4, polylineOptions.d());
        b.a(parcel, 5, polylineOptions.e());
        b.a(parcel, 6, polylineOptions.f());
        b.a(parcel, 7, polylineOptions.g());
        b.a(parcel, 8, polylineOptions.h());
        b.a(parcel, a);
    }

    public PolylineOptions a(Parcel parcel) {
        float f = 0.0f;
        boolean z = false;
        int b = a.b(parcel);
        List list = null;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        float f2 = 0.0f;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = a.g(parcel, a);
                    break;
                case 2:
                    list = a.c(parcel, a, LatLng.CREATOR);
                    break;
                case 3:
                    f2 = a.l(parcel, a);
                    break;
                case 4:
                    i = a.g(parcel, a);
                    break;
                case 5:
                    f = a.l(parcel, a);
                    break;
                case 6:
                    z3 = a.c(parcel, a);
                    break;
                case 7:
                    z2 = a.c(parcel, a);
                    break;
                case 8:
                    z = a.c(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PolylineOptions(i2, list, f2, i, f, z3, z2, z);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public PolylineOptions[] a(int i) {
        return new PolylineOptions[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
