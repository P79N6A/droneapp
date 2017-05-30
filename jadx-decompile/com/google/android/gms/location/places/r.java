package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class r implements Creator<NearbyAlertRequest> {
    static void a(NearbyAlertRequest nearbyAlertRequest, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, nearbyAlertRequest.b());
        b.a(parcel, 2, nearbyAlertRequest.c());
        b.a(parcel, 3, nearbyAlertRequest.d(), i, false);
        b.a(parcel, 4, nearbyAlertRequest.e(), i, false);
        b.a(parcel, 5, nearbyAlertRequest.f());
        b.a(parcel, 6, nearbyAlertRequest.g());
        b.a(parcel, 7, nearbyAlertRequest.h());
        b.a(parcel, 1000, nearbyAlertRequest.a());
        b.a(parcel, a);
    }

    public NearbyAlertRequest a(Parcel parcel) {
        NearbyAlertFilter nearbyAlertFilter = null;
        int i = 0;
        int b = a.b(parcel);
        int i2 = -1;
        int i3 = 110;
        boolean z = false;
        PlaceFilter placeFilter = null;
        int i4 = 0;
        int i5 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i4 = a.g(parcel, a);
                    break;
                case 2:
                    i2 = a.g(parcel, a);
                    break;
                case 3:
                    placeFilter = (PlaceFilter) a.a(parcel, a, PlaceFilter.CREATOR);
                    break;
                case 4:
                    nearbyAlertFilter = (NearbyAlertFilter) a.a(parcel, a, NearbyAlertFilter.CREATOR);
                    break;
                case 5:
                    z = a.c(parcel, a);
                    break;
                case 6:
                    i = a.g(parcel, a);
                    break;
                case 7:
                    i3 = a.g(parcel, a);
                    break;
                case 1000:
                    i5 = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new NearbyAlertRequest(i5, i4, i2, placeFilter, nearbyAlertFilter, z, i, i3);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public NearbyAlertRequest[] a(int i) {
        return new NearbyAlertRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
