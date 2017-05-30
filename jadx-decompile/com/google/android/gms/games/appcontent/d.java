package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class d implements Creator<AppContentConditionEntity> {
    static void a(AppContentConditionEntity appContentConditionEntity, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, appContentConditionEntity.c(), false);
        b.a(parcel, 2, appContentConditionEntity.d(), false);
        b.a(parcel, 3, appContentConditionEntity.e(), false);
        b.a(parcel, 4, appContentConditionEntity.f(), false);
        b.a(parcel, 1000, appContentConditionEntity.g());
        b.a(parcel, a);
    }

    public AppContentConditionEntity a(Parcel parcel) {
        Bundle bundle = null;
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    str3 = a.q(parcel, a);
                    break;
                case 2:
                    str2 = a.q(parcel, a);
                    break;
                case 3:
                    str = a.q(parcel, a);
                    break;
                case 4:
                    bundle = a.s(parcel, a);
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
            return new AppContentConditionEntity(i, str3, str2, str, bundle);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public AppContentConditionEntity[] a(int i) {
        return new AppContentConditionEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
