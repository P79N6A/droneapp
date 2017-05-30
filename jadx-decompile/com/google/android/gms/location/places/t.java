package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.List;

public class t implements Creator<PlaceFilter> {
    static void a(PlaceFilter placeFilter, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, placeFilter.b, false);
        b.a(parcel, 3, placeFilter.c);
        b.c(parcel, 4, placeFilter.d, false);
        b.b(parcel, 6, placeFilter.e, false);
        b.a(parcel, 1000, placeFilter.a);
        b.a(parcel, a);
    }

    public PlaceFilter a(Parcel parcel) {
        boolean z = false;
        List list = null;
        int b = a.b(parcel);
        List list2 = null;
        List list3 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    list3 = a.D(parcel, a);
                    break;
                case 3:
                    z = a.c(parcel, a);
                    break;
                case 4:
                    list = a.c(parcel, a, UserDataType.CREATOR);
                    break;
                case 6:
                    list2 = a.E(parcel, a);
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
            return new PlaceFilter(i, list3, z, list2, list);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public PlaceFilter[] a(int i) {
        return new PlaceFilter[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
