package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class ad implements Creator<VisibleRegion> {
    static void a(VisibleRegion visibleRegion, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, visibleRegion.a());
        b.a(parcel, 2, visibleRegion.a, i, false);
        b.a(parcel, 3, visibleRegion.b, i, false);
        b.a(parcel, 4, visibleRegion.c, i, false);
        b.a(parcel, 5, visibleRegion.d, i, false);
        b.a(parcel, 6, visibleRegion.e, i, false);
        b.a(parcel, a);
    }

    public VisibleRegion a(Parcel parcel) {
        LatLngBounds latLngBounds = null;
        int b = a.b(parcel);
        int i = 0;
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    latLng4 = (LatLng) a.a(parcel, a, LatLng.CREATOR);
                    break;
                case 3:
                    latLng3 = (LatLng) a.a(parcel, a, LatLng.CREATOR);
                    break;
                case 4:
                    latLng2 = (LatLng) a.a(parcel, a, LatLng.CREATOR);
                    break;
                case 5:
                    latLng = (LatLng) a.a(parcel, a, LatLng.CREATOR);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) a.a(parcel, a, LatLngBounds.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new VisibleRegion(i, latLng4, latLng3, latLng2, latLng, latLngBounds);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public VisibleRegion[] a(int i) {
        return new VisibleRegion[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
