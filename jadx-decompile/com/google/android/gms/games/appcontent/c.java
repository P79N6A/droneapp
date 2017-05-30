package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class c implements Creator<AppContentCardEntity> {
    static void a(AppContentCardEntity appContentCardEntity, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.c(parcel, 1, appContentCardEntity.c(), false);
        b.c(parcel, 2, appContentCardEntity.d(), false);
        b.c(parcel, 3, appContentCardEntity.e(), false);
        b.a(parcel, 4, appContentCardEntity.f(), false);
        b.a(parcel, 5, appContentCardEntity.g());
        b.a(parcel, 6, appContentCardEntity.h(), false);
        b.a(parcel, 7, appContentCardEntity.i(), false);
        b.a(parcel, 1000, appContentCardEntity.o());
        b.a(parcel, 10, appContentCardEntity.k(), false);
        b.a(parcel, 11, appContentCardEntity.l(), false);
        b.a(parcel, 12, appContentCardEntity.m());
        b.a(parcel, 13, appContentCardEntity.n(), false);
        b.a(parcel, 14, appContentCardEntity.j(), false);
        b.a(parcel, a);
    }

    public AppContentCardEntity a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        String str = null;
        int i2 = 0;
        String str2 = null;
        Bundle bundle = null;
        String str3 = null;
        String str4 = null;
        int i3 = 0;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    arrayList = a.c(parcel, a, AppContentActionEntity.CREATOR);
                    break;
                case 2:
                    arrayList2 = a.c(parcel, a, AppContentAnnotationEntity.CREATOR);
                    break;
                case 3:
                    arrayList3 = a.c(parcel, a, AppContentConditionEntity.CREATOR);
                    break;
                case 4:
                    str = a.q(parcel, a);
                    break;
                case 5:
                    i2 = a.g(parcel, a);
                    break;
                case 6:
                    str2 = a.q(parcel, a);
                    break;
                case 7:
                    bundle = a.s(parcel, a);
                    break;
                case 10:
                    str3 = a.q(parcel, a);
                    break;
                case 11:
                    str4 = a.q(parcel, a);
                    break;
                case 12:
                    i3 = a.g(parcel, a);
                    break;
                case 13:
                    str5 = a.q(parcel, a);
                    break;
                case 14:
                    str6 = a.q(parcel, a);
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
            return new AppContentCardEntity(i, arrayList, arrayList2, arrayList3, str, i2, str2, bundle, str3, str4, i3, str5, str6);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public AppContentCardEntity[] a(int i) {
        return new AppContentCardEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
