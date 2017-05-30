package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class y implements Creator<StreetViewPanoramaLink> {
    static void a(StreetViewPanoramaLink streetViewPanoramaLink, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, streetViewPanoramaLink.a());
        b.a(parcel, 2, streetViewPanoramaLink.a, false);
        b.a(parcel, 3, streetViewPanoramaLink.b);
        b.a(parcel, a);
    }

    public StreetViewPanoramaLink a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        float f = 0.0f;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    str = a.q(parcel, a);
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
            return new StreetViewPanoramaLink(i, str, f);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public StreetViewPanoramaLink[] a(int i) {
        return new StreetViewPanoramaLink[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
