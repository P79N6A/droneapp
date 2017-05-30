package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class f implements Creator<AppContentSectionEntity> {
    static void a(AppContentSectionEntity appContentSectionEntity, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.c(parcel, 1, appContentSectionEntity.c(), false);
        b.c(parcel, 3, appContentSectionEntity.e(), false);
        b.a(parcel, 4, appContentSectionEntity.g(), false);
        b.a(parcel, 5, appContentSectionEntity.h(), false);
        b.a(parcel, 6, appContentSectionEntity.j(), false);
        b.a(parcel, 7, appContentSectionEntity.k(), false);
        b.a(parcel, 1000, appContentSectionEntity.m());
        b.a(parcel, 8, appContentSectionEntity.l(), false);
        b.a(parcel, 9, appContentSectionEntity.i(), false);
        b.a(parcel, 10, appContentSectionEntity.f(), false);
        b.c(parcel, 14, appContentSectionEntity.d(), false);
        b.a(parcel, a);
    }

    public AppContentSectionEntity a(Parcel parcel) {
        ArrayList arrayList = null;
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Bundle bundle = null;
        String str6 = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    arrayList3 = a.c(parcel, a, AppContentActionEntity.CREATOR);
                    break;
                case 3:
                    arrayList2 = a.c(parcel, a, AppContentCardEntity.CREATOR);
                    break;
                case 4:
                    str6 = a.q(parcel, a);
                    break;
                case 5:
                    bundle = a.s(parcel, a);
                    break;
                case 6:
                    str5 = a.q(parcel, a);
                    break;
                case 7:
                    str4 = a.q(parcel, a);
                    break;
                case 8:
                    str3 = a.q(parcel, a);
                    break;
                case 9:
                    str2 = a.q(parcel, a);
                    break;
                case 10:
                    str = a.q(parcel, a);
                    break;
                case 14:
                    arrayList = a.c(parcel, a, AppContentAnnotationEntity.CREATOR);
                    break;
                case 1000:
                    i = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AppContentSectionEntity(i, arrayList3, arrayList2, str6, bundle, str5, str4, str3, str2, str, arrayList);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public AppContentSectionEntity[] a(int i) {
        return new AppContentSectionEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
