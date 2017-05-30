package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

public class l implements Creator<StreetViewPanoramaOptions> {
    static void a(StreetViewPanoramaOptions streetViewPanoramaOptions, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, streetViewPanoramaOptions.a());
        b.a(parcel, 2, streetViewPanoramaOptions.g(), i, false);
        b.a(parcel, 3, streetViewPanoramaOptions.j(), false);
        b.a(parcel, 4, streetViewPanoramaOptions.h(), i, false);
        b.a(parcel, 5, streetViewPanoramaOptions.i(), false);
        b.a(parcel, 6, streetViewPanoramaOptions.b());
        b.a(parcel, 7, streetViewPanoramaOptions.c());
        b.a(parcel, 8, streetViewPanoramaOptions.d());
        b.a(parcel, 9, streetViewPanoramaOptions.e());
        b.a(parcel, 10, streetViewPanoramaOptions.f());
        b.a(parcel, a);
    }

    public StreetViewPanoramaOptions a(Parcel parcel) {
        Integer num = null;
        byte b = (byte) 0;
        int b2 = a.b(parcel);
        byte b3 = (byte) 0;
        byte b4 = (byte) 0;
        byte b5 = (byte) 0;
        byte b6 = (byte) 0;
        LatLng latLng = null;
        String str = null;
        StreetViewPanoramaCamera streetViewPanoramaCamera = null;
        int i = 0;
        while (parcel.dataPosition() < b2) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    streetViewPanoramaCamera = (StreetViewPanoramaCamera) a.a(parcel, a, StreetViewPanoramaCamera.CREATOR);
                    break;
                case 3:
                    str = a.q(parcel, a);
                    break;
                case 4:
                    latLng = (LatLng) a.a(parcel, a, LatLng.CREATOR);
                    break;
                case 5:
                    num = a.h(parcel, a);
                    break;
                case 6:
                    b6 = a.e(parcel, a);
                    break;
                case 7:
                    b5 = a.e(parcel, a);
                    break;
                case 8:
                    b4 = a.e(parcel, a);
                    break;
                case 9:
                    b3 = a.e(parcel, a);
                    break;
                case 10:
                    b = a.e(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b2) {
            return new StreetViewPanoramaOptions(i, streetViewPanoramaCamera, str, latLng, num, b6, b5, b4, b3, b);
        }
        throw new a.a("Overread allowed size end=" + b2, parcel);
    }

    public StreetViewPanoramaOptions[] a(int i) {
        return new StreetViewPanoramaOptions[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
