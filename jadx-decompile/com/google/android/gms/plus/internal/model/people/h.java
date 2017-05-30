package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.plus.internal.model.people.PersonEntity.OrganizationsEntity;
import java.util.HashSet;
import java.util.Set;

public class h implements Creator<OrganizationsEntity> {
    static void a(OrganizationsEntity organizationsEntity, Parcel parcel, int i) {
        int a = b.a(parcel);
        Set set = organizationsEntity.a;
        if (set.contains(Integer.valueOf(1))) {
            b.a(parcel, 1, organizationsEntity.b);
        }
        if (set.contains(Integer.valueOf(2))) {
            b.a(parcel, 2, organizationsEntity.c, true);
        }
        if (set.contains(Integer.valueOf(3))) {
            b.a(parcel, 3, organizationsEntity.d, true);
        }
        if (set.contains(Integer.valueOf(4))) {
            b.a(parcel, 4, organizationsEntity.e, true);
        }
        if (set.contains(Integer.valueOf(5))) {
            b.a(parcel, 5, organizationsEntity.f, true);
        }
        if (set.contains(Integer.valueOf(6))) {
            b.a(parcel, 6, organizationsEntity.g, true);
        }
        if (set.contains(Integer.valueOf(7))) {
            b.a(parcel, 7, organizationsEntity.h);
        }
        if (set.contains(Integer.valueOf(8))) {
            b.a(parcel, 8, organizationsEntity.i, true);
        }
        if (set.contains(Integer.valueOf(9))) {
            b.a(parcel, 9, organizationsEntity.j, true);
        }
        if (set.contains(Integer.valueOf(10))) {
            b.a(parcel, 10, organizationsEntity.k);
        }
        b.a(parcel, a);
    }

    public OrganizationsEntity a(Parcel parcel) {
        int i = 0;
        String str = null;
        int b = a.b(parcel);
        Set hashSet = new HashSet();
        String str2 = null;
        boolean z = false;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = a.g(parcel, a);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case 2:
                    str7 = a.q(parcel, a);
                    hashSet.add(Integer.valueOf(2));
                    break;
                case 3:
                    str6 = a.q(parcel, a);
                    hashSet.add(Integer.valueOf(3));
                    break;
                case 4:
                    str5 = a.q(parcel, a);
                    hashSet.add(Integer.valueOf(4));
                    break;
                case 5:
                    str4 = a.q(parcel, a);
                    hashSet.add(Integer.valueOf(5));
                    break;
                case 6:
                    str3 = a.q(parcel, a);
                    hashSet.add(Integer.valueOf(6));
                    break;
                case 7:
                    z = a.c(parcel, a);
                    hashSet.add(Integer.valueOf(7));
                    break;
                case 8:
                    str2 = a.q(parcel, a);
                    hashSet.add(Integer.valueOf(8));
                    break;
                case 9:
                    str = a.q(parcel, a);
                    hashSet.add(Integer.valueOf(9));
                    break;
                case 10:
                    i = a.g(parcel, a);
                    hashSet.add(Integer.valueOf(10));
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new OrganizationsEntity(hashSet, i2, str7, str6, str5, str4, str3, z, str2, str, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public OrganizationsEntity[] a(int i) {
        return new OrganizationsEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
