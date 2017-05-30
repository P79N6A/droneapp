package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.plus.internal.model.people.PersonEntity.CoverEntity.CoverInfoEntity;
import java.util.HashSet;
import java.util.Set;

public class d implements Creator<CoverInfoEntity> {
    static void a(CoverInfoEntity coverInfoEntity, Parcel parcel, int i) {
        int a = b.a(parcel);
        Set set = coverInfoEntity.a;
        if (set.contains(Integer.valueOf(1))) {
            b.a(parcel, 1, coverInfoEntity.b);
        }
        if (set.contains(Integer.valueOf(2))) {
            b.a(parcel, 2, coverInfoEntity.c);
        }
        if (set.contains(Integer.valueOf(3))) {
            b.a(parcel, 3, coverInfoEntity.d);
        }
        b.a(parcel, a);
    }

    public CoverInfoEntity a(Parcel parcel) {
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
            return new CoverInfoEntity(hashSet, i3, i2, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public CoverInfoEntity[] a(int i) {
        return new CoverInfoEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
