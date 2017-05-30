package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.plus.internal.model.people.PersonEntity.CoverEntity;
import com.google.android.gms.plus.internal.model.people.PersonEntity.CoverEntity.CoverInfoEntity;
import com.google.android.gms.plus.internal.model.people.PersonEntity.CoverEntity.CoverPhotoEntity;
import java.util.HashSet;
import java.util.Set;

public class c implements Creator<CoverEntity> {
    static void a(CoverEntity coverEntity, Parcel parcel, int i) {
        int a = b.a(parcel);
        Set set = coverEntity.a;
        if (set.contains(Integer.valueOf(1))) {
            b.a(parcel, 1, coverEntity.b);
        }
        if (set.contains(Integer.valueOf(2))) {
            b.a(parcel, 2, coverEntity.c, i, true);
        }
        if (set.contains(Integer.valueOf(3))) {
            b.a(parcel, 3, coverEntity.d, i, true);
        }
        if (set.contains(Integer.valueOf(4))) {
            b.a(parcel, 4, coverEntity.e);
        }
        b.a(parcel, a);
    }

    public CoverEntity a(Parcel parcel) {
        CoverPhotoEntity coverPhotoEntity = null;
        int i = 0;
        int b = a.b(parcel);
        Set hashSet = new HashSet();
        CoverInfoEntity coverInfoEntity = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = a.g(parcel, a);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case 2:
                    CoverInfoEntity coverInfoEntity2 = (CoverInfoEntity) a.a(parcel, a, CoverInfoEntity.CREATOR);
                    hashSet.add(Integer.valueOf(2));
                    coverInfoEntity = coverInfoEntity2;
                    break;
                case 3:
                    CoverPhotoEntity coverPhotoEntity2 = (CoverPhotoEntity) a.a(parcel, a, CoverPhotoEntity.CREATOR);
                    hashSet.add(Integer.valueOf(3));
                    coverPhotoEntity = coverPhotoEntity2;
                    break;
                case 4:
                    i = a.g(parcel, a);
                    hashSet.add(Integer.valueOf(4));
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new CoverEntity(hashSet, i2, coverInfoEntity, coverPhotoEntity, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public CoverEntity[] a(int i) {
        return new CoverEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
