package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.List;

public class f implements Creator<PlaceUserData> {
    static void a(PlaceUserData placeUserData, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, placeUserData.a(), false);
        b.a(parcel, 2, placeUserData.b(), false);
        b.c(parcel, 6, placeUserData.c(), false);
        b.a(parcel, 1000, placeUserData.a);
        b.a(parcel, a);
    }

    public PlaceUserData a(Parcel parcel) {
        List list = null;
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    str2 = a.q(parcel, a);
                    break;
                case 2:
                    str = a.q(parcel, a);
                    break;
                case 6:
                    list = a.c(parcel, a, PlaceAlias.CREATOR);
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
            return new PlaceUserData(i, str2, str, list);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public PlaceUserData[] a(int i) {
        return new PlaceUserData[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
