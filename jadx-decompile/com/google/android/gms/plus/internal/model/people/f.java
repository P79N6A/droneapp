package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.plus.internal.model.people.PersonEntity.ImageEntity;
import java.util.HashSet;
import java.util.Set;

public class f implements Creator<ImageEntity> {
    static void a(ImageEntity imageEntity, Parcel parcel, int i) {
        int a = b.a(parcel);
        Set set = imageEntity.a;
        if (set.contains(Integer.valueOf(1))) {
            b.a(parcel, 1, imageEntity.b);
        }
        if (set.contains(Integer.valueOf(2))) {
            b.a(parcel, 2, imageEntity.c, true);
        }
        b.a(parcel, a);
    }

    public ImageEntity a(Parcel parcel) {
        int b = a.b(parcel);
        Set hashSet = new HashSet();
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case 2:
                    str = a.q(parcel, a);
                    hashSet.add(Integer.valueOf(2));
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ImageEntity(hashSet, i, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public ImageEntity[] a(int i) {
        return new ImageEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
