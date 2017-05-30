package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class s implements Creator<PlacesParams> {
    static void a(PlacesParams placesParams, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, placesParams.c, false);
        b.a(parcel, 2, placesParams.d, false);
        b.a(parcel, 3, placesParams.e, false);
        b.a(parcel, 4, placesParams.f, false);
        b.a(parcel, 6, placesParams.g);
        b.a(parcel, 7, placesParams.h);
        b.a(parcel, 1000, placesParams.b);
        b.a(parcel, a);
    }

    public PlacesParams a(Parcel parcel) {
        int i = 0;
        String str = null;
        int b = a.b(parcel);
        int i2 = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    str4 = a.q(parcel, a);
                    break;
                case 2:
                    str3 = a.q(parcel, a);
                    break;
                case 3:
                    str2 = a.q(parcel, a);
                    break;
                case 4:
                    str = a.q(parcel, a);
                    break;
                case 6:
                    i2 = a.g(parcel, a);
                    break;
                case 7:
                    i = a.g(parcel, a);
                    break;
                case 1000:
                    i3 = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PlacesParams(i3, str4, str3, str2, str, i2, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public PlacesParams[] a(int i) {
        return new PlacesParams[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
