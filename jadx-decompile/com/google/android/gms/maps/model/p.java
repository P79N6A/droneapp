package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class p implements Creator<GroundOverlayOptions> {
    static void a(GroundOverlayOptions groundOverlayOptions, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, groundOverlayOptions.b());
        b.a(parcel, 2, groundOverlayOptions.a(), false);
        b.a(parcel, 3, groundOverlayOptions.d(), i, false);
        b.a(parcel, 4, groundOverlayOptions.e());
        b.a(parcel, 5, groundOverlayOptions.f());
        b.a(parcel, 6, groundOverlayOptions.g(), i, false);
        b.a(parcel, 7, groundOverlayOptions.h());
        b.a(parcel, 8, groundOverlayOptions.i());
        b.a(parcel, 9, groundOverlayOptions.m());
        b.a(parcel, 10, groundOverlayOptions.j());
        b.a(parcel, 11, groundOverlayOptions.k());
        b.a(parcel, 12, groundOverlayOptions.l());
        b.a(parcel, 13, groundOverlayOptions.n());
        b.a(parcel, a);
    }

    public GroundOverlayOptions a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        IBinder iBinder = null;
        LatLng latLng = null;
        float f = 0.0f;
        float f2 = 0.0f;
        LatLngBounds latLngBounds = null;
        float f3 = 0.0f;
        float f4 = 0.0f;
        boolean z = false;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    iBinder = a.r(parcel, a);
                    break;
                case 3:
                    latLng = (LatLng) a.a(parcel, a, LatLng.CREATOR);
                    break;
                case 4:
                    f = a.l(parcel, a);
                    break;
                case 5:
                    f2 = a.l(parcel, a);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) a.a(parcel, a, LatLngBounds.CREATOR);
                    break;
                case 7:
                    f3 = a.l(parcel, a);
                    break;
                case 8:
                    f4 = a.l(parcel, a);
                    break;
                case 9:
                    z = a.c(parcel, a);
                    break;
                case 10:
                    f5 = a.l(parcel, a);
                    break;
                case 11:
                    f6 = a.l(parcel, a);
                    break;
                case 12:
                    f7 = a.l(parcel, a);
                    break;
                case 13:
                    z2 = a.c(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new GroundOverlayOptions(i, iBinder, latLng, f, f2, latLngBounds, f3, f4, z, f5, f6, f7, z2);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public GroundOverlayOptions[] a(int i) {
        return new GroundOverlayOptions[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
