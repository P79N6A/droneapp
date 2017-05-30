package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.common.server.response.FieldMappingDictionary.FieldMapPair;

public class b implements Creator<FieldMapPair> {
    static void a(FieldMapPair fieldMapPair, Parcel parcel, int i) {
        int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, fieldMapPair.a);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, fieldMapPair.b, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, fieldMapPair.c, i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, a);
    }

    public FieldMapPair a(Parcel parcel) {
        Field field = null;
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    str = a.q(parcel, a);
                    break;
                case 3:
                    field = (Field) a.a(parcel, a, Field.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new FieldMapPair(i, str, field);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public FieldMapPair[] a(int i) {
        return new FieldMapPair[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
