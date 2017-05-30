package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.plus.internal.model.people.PersonEntity.UrlsEntity;
import java.util.HashSet;
import java.util.Set;

public class j implements Creator<UrlsEntity> {
    static void a(UrlsEntity urlsEntity, Parcel parcel, int i) {
        int a = b.a(parcel);
        Set set = urlsEntity.a;
        if (set.contains(Integer.valueOf(1))) {
            b.a(parcel, 1, urlsEntity.b);
        }
        if (set.contains(Integer.valueOf(3))) {
            b.a(parcel, 3, urlsEntity.i());
        }
        if (set.contains(Integer.valueOf(4))) {
            b.a(parcel, 4, urlsEntity.e, true);
        }
        if (set.contains(Integer.valueOf(5))) {
            b.a(parcel, 5, urlsEntity.c, true);
        }
        if (set.contains(Integer.valueOf(6))) {
            b.a(parcel, 6, urlsEntity.d);
        }
        b.a(parcel, a);
    }

    public UrlsEntity a(Parcel parcel) {
        String str = null;
        int i = 0;
        int b = a.b(parcel);
        Set hashSet = new HashSet();
        int i2 = 0;
        String str2 = null;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i3 = a.g(parcel, a);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case 3:
                    i = a.g(parcel, a);
                    hashSet.add(Integer.valueOf(3));
                    break;
                case 4:
                    str = a.q(parcel, a);
                    hashSet.add(Integer.valueOf(4));
                    break;
                case 5:
                    str2 = a.q(parcel, a);
                    hashSet.add(Integer.valueOf(5));
                    break;
                case 6:
                    i2 = a.g(parcel, a);
                    hashSet.add(Integer.valueOf(6));
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new UrlsEntity(hashSet, i3, str2, i2, str, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public UrlsEntity[] a(int i) {
        return new UrlsEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
