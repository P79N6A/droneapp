package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.plus.internal.model.people.PersonEntity.AgeRangeEntity;
import java.util.HashSet;
import java.util.Set;

public class b implements Creator<AgeRangeEntity> {
    static void a(AgeRangeEntity ageRangeEntity, Parcel parcel, int i) {
        int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        Set set = ageRangeEntity.a;
        if (set.contains(Integer.valueOf(1))) {
            com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, ageRangeEntity.b);
        }
        if (set.contains(Integer.valueOf(2))) {
            com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, ageRangeEntity.c);
        }
        if (set.contains(Integer.valueOf(3))) {
            com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, ageRangeEntity.d);
        }
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, a);
    }

    public AgeRangeEntity a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        Set hashSet = new HashSet();
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i3 = a.g(parcel, a);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case 2:
                    i2 = a.g(parcel, a);
                    hashSet.add(Integer.valueOf(2));
                    break;
                case 3:
                    i = a.g(parcel, a);
                    hashSet.add(Integer.valueOf(3));
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AgeRangeEntity(hashSet, i3, i2, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public AgeRangeEntity[] a(int i) {
        return new AgeRangeEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
