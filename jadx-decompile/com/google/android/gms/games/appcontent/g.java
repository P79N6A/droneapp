package com.google.android.gms.games.appcontent;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class g implements Creator<AppContentTupleEntity> {
    static void a(AppContentTupleEntity appContentTupleEntity, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, appContentTupleEntity.c(), false);
        b.a(parcel, 2, appContentTupleEntity.d(), false);
        b.a(parcel, 1000, appContentTupleEntity.e());
        b.a(parcel, a);
    }

    public AppContentTupleEntity a(Parcel parcel) {
        String str = null;
        int b = a.b(parcel);
        int i = 0;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    str2 = a.q(parcel, a);
                    break;
                case 2:
                    str = a.q(parcel, a);
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
            return new AppContentTupleEntity(i, str2, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public AppContentTupleEntity[] a(int i) {
        return new AppContentTupleEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
