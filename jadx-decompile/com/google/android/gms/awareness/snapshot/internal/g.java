package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.location.places.internal.PlaceLikelihoodEntity;
import java.util.ArrayList;

public class g implements Creator<PlacesData> {
    static void a(PlacesData placesData, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, placesData.c());
        b.c(parcel, 2, placesData.b(), false);
        b.a(parcel, a);
    }

    public PlacesData a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    arrayList = a.c(parcel, a, PlaceLikelihoodEntity.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PlacesData(i, arrayList);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public PlacesData[] a(int i) {
        return new PlacesData[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
