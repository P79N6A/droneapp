package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class aa implements Creator<StreetViewPanoramaOrientation> {
    static void a(StreetViewPanoramaOrientation streetViewPanoramaOrientation, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, streetViewPanoramaOrientation.a());
        b.a(parcel, 2, streetViewPanoramaOrientation.a);
        b.a(parcel, 3, streetViewPanoramaOrientation.b);
        b.a(parcel, a);
    }

    public StreetViewPanoramaOrientation a(Parcel parcel) {
        float f = 0.0f;
        int b = a.b(parcel);
        int i = 0;
        float f2 = 0.0f;
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
                    f = a.l(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new StreetViewPanoramaOrientation(i, f2, f);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public StreetViewPanoramaOrientation[] a(int i) {
        return new StreetViewPanoramaOrientation[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
