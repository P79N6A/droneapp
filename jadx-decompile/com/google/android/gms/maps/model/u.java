package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class u implements Creator<PointOfInterest> {
    static void a(PointOfInterest pointOfInterest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, pointOfInterest.a());
        b.a(parcel, 2, pointOfInterest.a, i, false);
        b.a(parcel, 3, pointOfInterest.b, false);
        b.a(parcel, 4, pointOfInterest.c, false);
        b.a(parcel, a);
    }

    public PointOfInterest a(Parcel parcel) {
        String str = null;
        int b = a.b(parcel);
        int i = 0;
        String str2 = null;
        LatLng latLng = null;
        while (parcel.dataPosition() < b) {
            LatLng latLng2;
            int g;
            String str3;
            int a = a.a(parcel);
            String str4;
            switch (a.a(a)) {
                case 1:
                    str4 = str;
                    str = str2;
                    latLng2 = latLng;
                    g = a.g(parcel, a);
                    str3 = str4;
                    break;
                case 2:
                    g = i;
                    str4 = str2;
                    latLng2 = (LatLng) a.a(parcel, a, LatLng.CREATOR);
                    str3 = str;
                    str = str4;
                    break;
                case 3:
                    latLng2 = latLng;
                    g = i;
                    str4 = str;
                    str = a.q(parcel, a);
                    str3 = str4;
                    break;
                case 4:
                    str3 = a.q(parcel, a);
                    str = str2;
                    latLng2 = latLng;
                    g = i;
                    break;
                default:
                    a.b(parcel, a);
                    str3 = str;
                    str = str2;
                    latLng2 = latLng;
                    g = i;
                    break;
            }
            i = g;
            latLng = latLng2;
            str2 = str;
            str = str3;
        }
        if (parcel.dataPosition() == b) {
            return new PointOfInterest(i, latLng, str2, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public PointOfInterest[] a(int i) {
        return new PointOfInterest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
