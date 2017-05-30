package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class m implements Creator<PlaceLikelihoodEntity> {
    static void a(PlaceLikelihoodEntity placeLikelihoodEntity, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, placeLikelihoodEntity.b, i, false);
        b.a(parcel, 2, placeLikelihoodEntity.c);
        b.a(parcel, 1000, placeLikelihoodEntity.a);
        b.a(parcel, a);
    }

    public PlaceLikelihoodEntity a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        PlaceEntity placeEntity = null;
        float f = 0.0f;
        while (parcel.dataPosition() < b) {
            int i2;
            float f2;
            PlaceEntity placeEntity2;
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = i;
                    PlaceEntity placeEntity3 = (PlaceEntity) a.a(parcel, a, PlaceEntity.CREATOR);
                    f2 = f;
                    placeEntity2 = placeEntity3;
                    break;
                case 2:
                    f2 = a.l(parcel, a);
                    placeEntity2 = placeEntity;
                    i2 = i;
                    break;
                case 1000:
                    float f3 = f;
                    placeEntity2 = placeEntity;
                    i2 = a.g(parcel, a);
                    f2 = f3;
                    break;
                default:
                    a.b(parcel, a);
                    f2 = f;
                    placeEntity2 = placeEntity;
                    i2 = i;
                    break;
            }
            i = i2;
            placeEntity = placeEntity2;
            f = f2;
        }
        if (parcel.dataPosition() == b) {
            return new PlaceLikelihoodEntity(i, placeEntity, f);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public PlaceLikelihoodEntity[] a(int i) {
        return new PlaceLikelihoodEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
