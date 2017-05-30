package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class a implements Creator<AppContentActionEntity> {
    static void a(AppContentActionEntity appContentActionEntity, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.c(parcel, 1, appContentActionEntity.d(), false);
        b.a(parcel, 2, appContentActionEntity.e(), false);
        b.a(parcel, 3, appContentActionEntity.f(), false);
        b.a(parcel, 6, appContentActionEntity.i(), false);
        b.a(parcel, 7, appContentActionEntity.g(), false);
        b.a(parcel, 1000, appContentActionEntity.j());
        b.a(parcel, 8, appContentActionEntity.c(), i, false);
        b.a(parcel, 9, appContentActionEntity.h(), false);
        b.a(parcel, a);
    }

    public AppContentActionEntity a(Parcel parcel) {
        String str = null;
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        AppContentAnnotationEntity appContentAnnotationEntity = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case 1:
                    arrayList = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, AppContentConditionEntity.CREATOR);
                    break;
                case 2:
                    str4 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    break;
                case 3:
                    bundle = com.google.android.gms.common.internal.safeparcel.a.s(parcel, a);
                    break;
                case 6:
                    str3 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    break;
                case 7:
                    str2 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    break;
                case 8:
                    appContentAnnotationEntity = (AppContentAnnotationEntity) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, AppContentAnnotationEntity.CREATOR);
                    break;
                case 9:
                    str = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    break;
                case 1000:
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AppContentActionEntity(i, arrayList, str4, bundle, str3, str2, appContentAnnotationEntity, str);
        }
        throw new com.google.android.gms.common.internal.safeparcel.a.a("Overread allowed size end=" + b, parcel);
    }

    public AppContentActionEntity[] a(int i) {
        return new AppContentActionEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
