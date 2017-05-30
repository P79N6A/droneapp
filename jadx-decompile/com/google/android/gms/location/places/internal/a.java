package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.location.places.internal.AutocompletePredictionEntity.SubstringEntity;
import java.util.List;

public class a implements Creator<AutocompletePredictionEntity> {
    static void a(AutocompletePredictionEntity autocompletePredictionEntity, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, autocompletePredictionEntity.b, false);
        b.a(parcel, 2, autocompletePredictionEntity.c, false);
        b.a(parcel, 3, autocompletePredictionEntity.d, false);
        b.c(parcel, 4, autocompletePredictionEntity.e, false);
        b.a(parcel, 5, autocompletePredictionEntity.f);
        b.a(parcel, 6, autocompletePredictionEntity.g, false);
        b.c(parcel, 7, autocompletePredictionEntity.h, false);
        b.a(parcel, 1000, autocompletePredictionEntity.a);
        b.a(parcel, 8, autocompletePredictionEntity.i, false);
        b.c(parcel, 9, autocompletePredictionEntity.j, false);
        b.a(parcel, a);
    }

    public AutocompletePredictionEntity a(Parcel parcel) {
        int i = 0;
        List list = null;
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        String str = null;
        List list2 = null;
        String str2 = null;
        List list3 = null;
        String str3 = null;
        List list4 = null;
        String str4 = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case 1:
                    str3 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    break;
                case 2:
                    str4 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    break;
                case 3:
                    list4 = com.google.android.gms.common.internal.safeparcel.a.D(parcel, a);
                    break;
                case 4:
                    list3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, SubstringEntity.CREATOR);
                    break;
                case 5:
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    break;
                case 6:
                    str2 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    break;
                case 7:
                    list2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, SubstringEntity.CREATOR);
                    break;
                case 8:
                    str = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    break;
                case 9:
                    list = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a, SubstringEntity.CREATOR);
                    break;
                case 1000:
                    i2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AutocompletePredictionEntity(i2, str4, list4, i, str3, list3, str2, list2, str, list);
        }
        throw new com.google.android.gms.common.internal.safeparcel.a.a("Overread allowed size end=" + b, parcel);
    }

    public AutocompletePredictionEntity[] a(int i) {
        return new AutocompletePredictionEntity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
