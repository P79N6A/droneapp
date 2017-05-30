package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;
import java.util.List;

public class v implements Creator<PolygonOptions> {
    static void a(PolygonOptions polygonOptions, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, polygonOptions.a());
        b.c(parcel, 2, polygonOptions.c(), false);
        b.d(parcel, 3, polygonOptions.b(), false);
        b.a(parcel, 4, polygonOptions.e());
        b.a(parcel, 5, polygonOptions.f());
        b.a(parcel, 6, polygonOptions.g());
        b.a(parcel, 7, polygonOptions.h());
        b.a(parcel, 8, polygonOptions.i());
        b.a(parcel, 9, polygonOptions.j());
        b.a(parcel, 10, polygonOptions.k());
        b.a(parcel, a);
    }

    public PolygonOptions a(Parcel parcel) {
        float f = 0.0f;
        boolean z = false;
        int b = a.b(parcel);
        List list = null;
        List arrayList = new ArrayList();
        boolean z2 = false;
        boolean z3 = false;
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
                    list = a.c(parcel, a, LatLng.CREATOR);
                    break;
                case 3:
                    a.a(parcel, a, arrayList, getClass().getClassLoader());
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
                    z3 = a.c(parcel, a);
                    break;
                case 9:
                    z2 = a.c(parcel, a);
                    break;
                case 10:
                    z = a.c(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PolygonOptions(i3, list, arrayList, f2, i2, i, f, z3, z2, z);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public PolygonOptions[] a(int i) {
        return new PolygonOptions[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
