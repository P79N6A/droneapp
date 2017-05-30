package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class z implements Creator<StreetViewPanoramaLocation> {
    static void a(StreetViewPanoramaLocation streetViewPanoramaLocation, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, streetViewPanoramaLocation.a());
        b.a(parcel, 2, streetViewPanoramaLocation.a, i, false);
        b.a(parcel, 3, streetViewPanoramaLocation.b, i, false);
        b.a(parcel, 4, streetViewPanoramaLocation.c, false);
        b.a(parcel, a);
    }

    public StreetViewPanoramaLocation a(Parcel parcel) {
        String str = null;
        int b = a.b(parcel);
        int i = 0;
        LatLng latLng = null;
        StreetViewPanoramaLink[] streetViewPanoramaLinkArr = null;
        while (parcel.dataPosition() < b) {
            LatLng latLng2;
            StreetViewPanoramaLink[] streetViewPanoramaLinkArr2;
            int g;
            String str2;
            int a = a.a(parcel);
            String str3;
            switch (a.a(a)) {
                case 1:
                    str3 = str;
                    latLng2 = latLng;
                    streetViewPanoramaLinkArr2 = streetViewPanoramaLinkArr;
                    g = a.g(parcel, a);
                    str2 = str3;
                    break;
                case 2:
                    g = i;
                    LatLng latLng3 = latLng;
                    streetViewPanoramaLinkArr2 = (StreetViewPanoramaLink[]) a.b(parcel, a, StreetViewPanoramaLink.CREATOR);
                    str2 = str;
                    latLng2 = latLng3;
                    break;
                case 3:
                    streetViewPanoramaLinkArr2 = streetViewPanoramaLinkArr;
                    g = i;
                    str3 = str;
                    latLng2 = (LatLng) a.a(parcel, a, LatLng.CREATOR);
                    str2 = str3;
                    break;
                case 4:
                    str2 = a.q(parcel, a);
                    latLng2 = latLng;
                    streetViewPanoramaLinkArr2 = streetViewPanoramaLinkArr;
                    g = i;
                    break;
                default:
                    a.b(parcel, a);
                    str2 = str;
                    latLng2 = latLng;
                    streetViewPanoramaLinkArr2 = streetViewPanoramaLinkArr;
                    g = i;
                    break;
            }
            i = g;
            streetViewPanoramaLinkArr = streetViewPanoramaLinkArr2;
            latLng = latLng2;
            str = str2;
        }
        if (parcel.dataPosition() == b) {
            return new StreetViewPanoramaLocation(i, streetViewPanoramaLinkArr, latLng, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public StreetViewPanoramaLocation[] a(int i) {
        return new StreetViewPanoramaLocation[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
