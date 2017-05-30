package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class t implements Creator<MarkerOptions> {
    static void a(MarkerOptions markerOptions, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, markerOptions.a());
        b.a(parcel, 2, markerOptions.c(), i, false);
        b.a(parcel, 3, markerOptions.d(), false);
        b.a(parcel, 4, markerOptions.e(), false);
        b.a(parcel, 5, markerOptions.b(), false);
        b.a(parcel, 6, markerOptions.g());
        b.a(parcel, 7, markerOptions.h());
        b.a(parcel, 8, markerOptions.i());
        b.a(parcel, 9, markerOptions.j());
        b.a(parcel, 10, markerOptions.k());
        b.a(parcel, 11, markerOptions.l());
        b.a(parcel, 12, markerOptions.m());
        b.a(parcel, 13, markerOptions.n());
        b.a(parcel, 14, markerOptions.o());
        b.a(parcel, 15, markerOptions.p());
        b.a(parcel, a);
    }

    public MarkerOptions a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f3 = 0.0f;
        float f4 = 0.5f;
        float f5 = 0.0f;
        float f6 = 1.0f;
        float f7 = 0.0f;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    latLng = (LatLng) a.a(parcel, a, LatLng.CREATOR);
                    break;
                case 3:
                    str = a.q(parcel, a);
                    break;
                case 4:
                    str2 = a.q(parcel, a);
                    break;
                case 5:
                    iBinder = a.r(parcel, a);
                    break;
                case 6:
                    f = a.l(parcel, a);
                    break;
                case 7:
                    f2 = a.l(parcel, a);
                    break;
                case 8:
                    z = a.c(parcel, a);
                    break;
                case 9:
                    z2 = a.c(parcel, a);
                    break;
                case 10:
                    z3 = a.c(parcel, a);
                    break;
                case 11:
                    f3 = a.l(parcel, a);
                    break;
                case 12:
                    f4 = a.l(parcel, a);
                    break;
                case 13:
                    f5 = a.l(parcel, a);
                    break;
                case 14:
                    f6 = a.l(parcel, a);
                    break;
                case 15:
                    f7 = a.l(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new MarkerOptions(i, latLng, str, str2, iBinder, f, f2, z, z2, z3, f3, f4, f5, f6, f7);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public MarkerOptions[] a(int i) {
        return new MarkerOptions[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
