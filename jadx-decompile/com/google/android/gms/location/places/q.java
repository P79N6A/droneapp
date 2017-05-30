package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.List;

public class q implements Creator<NearbyAlertFilter> {
    static void a(NearbyAlertFilter nearbyAlertFilter, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.b(parcel, 1, nearbyAlertFilter.b, false);
        b.a(parcel, 2, nearbyAlertFilter.c, false);
        b.c(parcel, 3, nearbyAlertFilter.d, false);
        b.a(parcel, 4, nearbyAlertFilter.e, false);
        b.a(parcel, 5, nearbyAlertFilter.f);
        b.a(parcel, 1000, nearbyAlertFilter.a);
        b.a(parcel, a);
    }

    public NearbyAlertFilter a(Parcel parcel) {
        boolean z = false;
        String str = null;
        int b = a.b(parcel);
        List list = null;
        List list2 = null;
        List list3 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    list3 = a.E(parcel, a);
                    break;
                case 2:
                    list2 = a.D(parcel, a);
                    break;
                case 3:
                    list = a.c(parcel, a, UserDataType.CREATOR);
                    break;
                case 4:
                    str = a.q(parcel, a);
                    break;
                case 5:
                    z = a.c(parcel, a);
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
            return new NearbyAlertFilter(i, list3, list2, list, str, z);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public NearbyAlertFilter[] a(int i) {
        return new NearbyAlertFilter[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
