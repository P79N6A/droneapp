package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.ArrayList;
import java.util.List;

public class b implements Creator<AliasedPlacesResult> {
    static void a(AliasedPlacesResult aliasedPlacesResult, Parcel parcel, int i) {
        int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, aliasedPlacesResult.a(), i, false);
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 2, aliasedPlacesResult.b(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1000, aliasedPlacesResult.a);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, a);
    }

    public AliasedPlacesResult a(Parcel parcel) {
        List list = null;
        int b = a.b(parcel);
        int i = 0;
        Status status = null;
        while (parcel.dataPosition() < b) {
            int i2;
            Status status2;
            ArrayList c;
            int a = a.a(parcel);
            List list2;
            switch (a.a(a)) {
                case 1:
                    i2 = i;
                    Status status3 = (Status) a.a(parcel, a, Status.CREATOR);
                    list2 = list;
                    status2 = status3;
                    break;
                case 2:
                    c = a.c(parcel, a, AliasedPlace.CREATOR);
                    status2 = status;
                    i2 = i;
                    break;
                case 1000:
                    List list3 = list;
                    status2 = status;
                    i2 = a.g(parcel, a);
                    list2 = list3;
                    break;
                default:
                    a.b(parcel, a);
                    c = list;
                    status2 = status;
                    i2 = i;
                    break;
            }
            i = i2;
            status = status2;
            Object obj = c;
        }
        if (parcel.dataPosition() == b) {
            return new AliasedPlacesResult(i, status, list);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public AliasedPlacesResult[] a(int i) {
        return new AliasedPlacesResult[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
