package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.plus.internal.model.people.PersonEntity.CoverEntity.CoverPhotoEntity;
import java.util.HashSet;
import java.util.Set;

public class e implements Creator<CoverPhotoEntity> {
    static void a(CoverPhotoEntity coverPhotoEntity, Parcel parcel, int i) {
        int a = b.a(parcel);
        Set set = coverPhotoEntity.a;
        if (set.contains(Integer.valueOf(1))) {
            b.a(parcel, 1, coverPhotoEntity.b);
        }
        if (set.contains(Integer.valueOf(2))) {
            b.a(parcel, 2, coverPhotoEntity.c);
        }
        if (set.contains(Integer.valueOf(3))) {
            b.a(parcel, 3, coverPhotoEntity.d, true);
        }
        if (set.contains(Integer.valueOf(4))) {
            b.a(parcel, 4, coverPhotoEntity.e);
        }
        b.a(parcel, a);
    }

    public CoverPhotoEntity a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        Set hashSet = new HashSet();
        String str = null;
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
                    str = a.q(parcel, a);
                    hashSet.add(Integer.valueOf(3));
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
            return new CoverPhotoEntity(hashSet, i3, i2, str, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public CoverPhotoEntity[] a(int i) {
        return new CoverPhotoEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
