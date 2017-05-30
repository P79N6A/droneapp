package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class x implements Creator<PlaceRequest> {
    static void a(PlaceRequest placeRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 2, placeRequest.a(), i, false);
        b.a(parcel, 3, placeRequest.b());
        b.a(parcel, 4, placeRequest.c());
        b.a(parcel, 5, placeRequest.d());
        b.a(parcel, 6, placeRequest.e());
        b.a(parcel, 7, placeRequest.f());
        b.a(parcel, 1000, placeRequest.a);
        b.a(parcel, a);
    }

    public PlaceRequest a(Parcel parcel) {
        boolean z = false;
        int b = a.b(parcel);
        PlaceFilter placeFilter = null;
        long j = -1;
        int i = -1;
        long j2 = Long.MAX_VALUE;
        boolean z2 = false;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 2:
                    placeFilter = (PlaceFilter) a.a(parcel, a, PlaceFilter.CREATOR);
                    break;
                case 3:
                    j = a.i(parcel, a);
                    break;
                case 4:
                    i = a.g(parcel, a);
                    break;
                case 5:
                    j2 = a.i(parcel, a);
                    break;
                case 6:
                    z2 = a.c(parcel, a);
                    break;
                case 7:
                    z = a.c(parcel, a);
                    break;
                case 1000:
                    i2 = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PlaceRequest(i2, placeFilter, j, i, j2, z2, z);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public PlaceRequest[] a(int i) {
        return new PlaceRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
