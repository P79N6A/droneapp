package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.plus.internal.model.people.PersonEntity.PlacesLivedEntity;
import java.util.HashSet;
import java.util.Set;

public class i implements Creator<PlacesLivedEntity> {
    static void a(PlacesLivedEntity placesLivedEntity, Parcel parcel, int i) {
        int a = b.a(parcel);
        Set set = placesLivedEntity.a;
        if (set.contains(Integer.valueOf(1))) {
            b.a(parcel, 1, placesLivedEntity.b);
        }
        if (set.contains(Integer.valueOf(2))) {
            b.a(parcel, 2, placesLivedEntity.c);
        }
        if (set.contains(Integer.valueOf(3))) {
            b.a(parcel, 3, placesLivedEntity.d, true);
        }
        b.a(parcel, a);
    }

    public PlacesLivedEntity a(Parcel parcel) {
        boolean z = false;
        int b = a.b(parcel);
        Set hashSet = new HashSet();
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case 2:
                    z = a.c(parcel, a);
                    hashSet.add(Integer.valueOf(2));
                    break;
                case 3:
                    str = a.q(parcel, a);
                    hashSet.add(Integer.valueOf(3));
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PlacesLivedEntity(hashSet, i, z, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public PlacesLivedEntity[] a(int i) {
        return new PlacesLivedEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
