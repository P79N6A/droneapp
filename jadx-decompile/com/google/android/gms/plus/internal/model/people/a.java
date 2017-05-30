package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.plus.internal.model.people.PersonEntity.AgeRangeEntity;
import com.google.android.gms.plus.internal.model.people.PersonEntity.CoverEntity;
import com.google.android.gms.plus.internal.model.people.PersonEntity.ImageEntity;
import com.google.android.gms.plus.internal.model.people.PersonEntity.NameEntity;
import com.google.android.gms.plus.internal.model.people.PersonEntity.OrganizationsEntity;
import com.google.android.gms.plus.internal.model.people.PersonEntity.PlacesLivedEntity;
import com.google.android.gms.plus.internal.model.people.PersonEntity.UrlsEntity;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class a implements Creator<PersonEntity> {
    static void a(PersonEntity personEntity, Parcel parcel, int i) {
        int a = b.a(parcel);
        Set set = personEntity.a;
        if (set.contains(Integer.valueOf(1))) {
            b.a(parcel, 1, personEntity.b);
        }
        if (set.contains(Integer.valueOf(2))) {
            b.a(parcel, 2, personEntity.c, true);
        }
        if (set.contains(Integer.valueOf(3))) {
            b.a(parcel, 3, personEntity.d, i, true);
        }
        if (set.contains(Integer.valueOf(4))) {
            b.a(parcel, 4, personEntity.e, true);
        }
        if (set.contains(Integer.valueOf(5))) {
            b.a(parcel, 5, personEntity.f, true);
        }
        if (set.contains(Integer.valueOf(6))) {
            b.a(parcel, 6, personEntity.g);
        }
        if (set.contains(Integer.valueOf(7))) {
            b.a(parcel, 7, personEntity.h, i, true);
        }
        if (set.contains(Integer.valueOf(8))) {
            b.a(parcel, 8, personEntity.i, true);
        }
        if (set.contains(Integer.valueOf(9))) {
            b.a(parcel, 9, personEntity.j, true);
        }
        if (set.contains(Integer.valueOf(12))) {
            b.a(parcel, 12, personEntity.k);
        }
        if (set.contains(Integer.valueOf(14))) {
            b.a(parcel, 14, personEntity.l, true);
        }
        if (set.contains(Integer.valueOf(15))) {
            b.a(parcel, 15, personEntity.m, i, true);
        }
        if (set.contains(Integer.valueOf(16))) {
            b.a(parcel, 16, personEntity.n);
        }
        if (set.contains(Integer.valueOf(18))) {
            b.a(parcel, 18, personEntity.o, true);
        }
        if (set.contains(Integer.valueOf(19))) {
            b.a(parcel, 19, personEntity.p, i, true);
        }
        if (set.contains(Integer.valueOf(20))) {
            b.a(parcel, 20, personEntity.q, true);
        }
        if (set.contains(Integer.valueOf(21))) {
            b.a(parcel, 21, personEntity.r);
        }
        if (set.contains(Integer.valueOf(22))) {
            b.c(parcel, 22, personEntity.s, true);
        }
        if (set.contains(Integer.valueOf(23))) {
            b.c(parcel, 23, personEntity.t, true);
        }
        if (set.contains(Integer.valueOf(24))) {
            b.a(parcel, 24, personEntity.u);
        }
        if (set.contains(Integer.valueOf(25))) {
            b.a(parcel, 25, personEntity.v);
        }
        if (set.contains(Integer.valueOf(26))) {
            b.a(parcel, 26, personEntity.w, true);
        }
        if (set.contains(Integer.valueOf(27))) {
            b.a(parcel, 27, personEntity.x, true);
        }
        if (set.contains(Integer.valueOf(28))) {
            b.c(parcel, 28, personEntity.y, true);
        }
        if (set.contains(Integer.valueOf(29))) {
            b.a(parcel, 29, personEntity.z);
        }
        b.a(parcel, a);
    }

    public PersonEntity a(Parcel parcel) {
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        Set hashSet = new HashSet();
        int i = 0;
        String str = null;
        AgeRangeEntity ageRangeEntity = null;
        String str2 = null;
        String str3 = null;
        int i2 = 0;
        CoverEntity coverEntity = null;
        String str4 = null;
        String str5 = null;
        int i3 = 0;
        String str6 = null;
        ImageEntity imageEntity = null;
        boolean z = false;
        String str7 = null;
        NameEntity nameEntity = null;
        String str8 = null;
        int i4 = 0;
        List list = null;
        List list2 = null;
        int i5 = 0;
        int i6 = 0;
        String str9 = null;
        String str10 = null;
        List list3 = null;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case 1:
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case 2:
                    str = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    hashSet.add(Integer.valueOf(2));
                    break;
                case 3:
                    AgeRangeEntity ageRangeEntity2 = (AgeRangeEntity) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, AgeRangeEntity.CREATOR);
                    hashSet.add(Integer.valueOf(3));
                    ageRangeEntity = ageRangeEntity2;
                    break;
                case 4:
                    str2 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    hashSet.add(Integer.valueOf(4));
                    break;
                case 5:
                    str3 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    hashSet.add(Integer.valueOf(5));
                    break;
                case 6:
                    i2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    hashSet.add(Integer.valueOf(6));
                    break;
                case 7:
                    CoverEntity coverEntity2 = (CoverEntity) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, CoverEntity.CREATOR);
                    hashSet.add(Integer.valueOf(7));
                    coverEntity = coverEntity2;
                    break;
                case 8:
                    str4 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    hashSet.add(Integer.valueOf(8));
                    break;
                case 9:
                    str5 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    hashSet.add(Integer.valueOf(9));
                    break;
                case 12:
                    i3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    hashSet.add(Integer.valueOf(12));
                    break;
                case 14:
                    str6 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    hashSet.add(Integer.valueOf(14));
                    break;
                case 15:
                    ImageEntity imageEntity2 = (ImageEntity) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, ImageEntity.CREATOR);
                    hashSet.add(Integer.valueOf(15));
                    imageEntity = imageEntity2;
                    break;
                case 16:
                    z = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    hashSet.add(Integer.valueOf(16));
                    break;
                case 18:
                    str7 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    hashSet.add(Integer.valueOf(18));
                    break;
                case 19:
                    NameEntity nameEntity2 = (NameEntity) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, NameEntity.CREATOR);
                    hashSet.add(Integer.valueOf(19));
                    nameEntity = nameEntity2;
                    break;
                case 20:
                    str8 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    hashSet.add(Integer.valueOf(20));
                    break;
                case 21:
                    i4 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    hashSet.add(Integer.valueOf(21));
                    break;
                case 22:
                    list = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, OrganizationsEntity.CREATOR);
                    hashSet.add(Integer.valueOf(22));
                    break;
                case 23:
                    list2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, PlacesLivedEntity.CREATOR);
                    hashSet.add(Integer.valueOf(23));
                    break;
                case 24:
                    i5 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    hashSet.add(Integer.valueOf(24));
                    break;
                case 25:
                    i6 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    hashSet.add(Integer.valueOf(25));
                    break;
                case 26:
                    str9 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    hashSet.add(Integer.valueOf(26));
                    break;
                case 27:
                    str10 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    hashSet.add(Integer.valueOf(27));
                    break;
                case 28:
                    list3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, UrlsEntity.CREATOR);
                    hashSet.add(Integer.valueOf(28));
                    break;
                case 29:
                    z2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    hashSet.add(Integer.valueOf(29));
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PersonEntity(hashSet, i, str, ageRangeEntity, str2, str3, i2, coverEntity, str4, str5, i3, str6, imageEntity, z, str7, nameEntity, str8, i4, list, list2, i5, i6, str9, str10, list3, z2);
        }
        throw new com.google.android.gms.common.internal.safeparcel.a.a("Overread allowed size end=" + b, parcel);
    }

    public PersonEntity[] a(int i) {
        return new PersonEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
