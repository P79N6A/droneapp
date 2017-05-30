package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.List;

public class a implements Creator<AliasedPlace> {
    static void a(AliasedPlace aliasedPlace, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, aliasedPlace.a(), false);
        b.b(parcel, 2, aliasedPlace.b(), false);
        b.a(parcel, 1000, aliasedPlace.a);
        b.a(parcel, a);
    }

    public AliasedPlace a(Parcel parcel) {
        List list = null;
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case 1:
                    str = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    break;
                case 2:
                    list = com.google.android.gms.common.internal.safeparcel.a.E(parcel, a);
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
            return new AliasedPlace(i, str, list);
        }
        throw new com.google.android.gms.common.internal.safeparcel.a.a("Overread allowed size end=" + b, parcel);
    }

    public AliasedPlace[] a(int i) {
        return new AliasedPlace[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
