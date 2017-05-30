package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.List;

public class o implements Creator<PlaceLocalization> {
    static void a(PlaceLocalization placeLocalization, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, placeLocalization.b, false);
        b.a(parcel, 2, placeLocalization.c, false);
        b.a(parcel, 3, placeLocalization.d, false);
        b.a(parcel, 4, placeLocalization.e, false);
        b.b(parcel, 5, placeLocalization.f, false);
        b.a(parcel, 1000, placeLocalization.a);
        b.a(parcel, a);
    }

    public PlaceLocalization a(Parcel parcel) {
        List list = null;
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
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
                case 5:
                    list = a.E(parcel, a);
                    break;
                case 1000:
                    i = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PlaceLocalization(i, str4, str3, str2, str, list);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public PlaceLocalization[] a(int i) {
        return new PlaceLocalization[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
