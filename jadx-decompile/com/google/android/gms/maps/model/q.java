package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class q implements Creator<LatLngBounds> {
    static void a(LatLngBounds latLngBounds, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, latLngBounds.a());
        b.a(parcel, 2, latLngBounds.a, i, false);
        b.a(parcel, 3, latLngBounds.b, i, false);
        b.a(parcel, a);
    }

    public LatLngBounds a(Parcel parcel) {
        LatLng latLng = null;
        int b = a.b(parcel);
        int i = 0;
        LatLng latLng2 = null;
        while (parcel.dataPosition() < b) {
            int g;
            LatLng latLng3;
            int a = a.a(parcel);
            LatLng latLng4;
            switch (a.a(a)) {
                case 1:
                    latLng4 = latLng;
                    latLng = latLng2;
                    g = a.g(parcel, a);
                    latLng3 = latLng4;
                    break;
                case 2:
                    g = i;
                    latLng4 = (LatLng) a.a(parcel, a, LatLng.CREATOR);
                    latLng3 = latLng;
                    latLng = latLng4;
                    break;
                case 3:
                    latLng3 = (LatLng) a.a(parcel, a, LatLng.CREATOR);
                    latLng = latLng2;
                    g = i;
                    break;
                default:
                    a.b(parcel, a);
                    latLng3 = latLng;
                    latLng = latLng2;
                    g = i;
                    break;
            }
            i = g;
            latLng2 = latLng;
            latLng = latLng3;
        }
        if (parcel.dataPosition() == b) {
            return new LatLngBounds(i, latLng2, latLng);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public LatLngBounds[] a(int i) {
        return new LatLngBounds[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
