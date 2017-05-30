package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class x implements Creator<StreetViewPanoramaCamera> {
    static void a(StreetViewPanoramaCamera streetViewPanoramaCamera, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, streetViewPanoramaCamera.a());
        b.a(parcel, 2, streetViewPanoramaCamera.a);
        b.a(parcel, 3, streetViewPanoramaCamera.b);
        b.a(parcel, 4, streetViewPanoramaCamera.c);
        b.a(parcel, a);
    }

    public StreetViewPanoramaCamera a(Parcel parcel) {
        float f = 0.0f;
        int b = a.b(parcel);
        float f2 = 0.0f;
        int i = 0;
        float f3 = 0.0f;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    f2 = a.l(parcel, a);
                    break;
                case 3:
                    f3 = a.l(parcel, a);
                    break;
                case 4:
                    f = a.l(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new StreetViewPanoramaCamera(i, f2, f3, f);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public StreetViewPanoramaCamera[] a(int i) {
        return new StreetViewPanoramaCamera[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
