package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.server.response.FieldMappingDictionary.Entry;
import java.util.ArrayList;

public class c implements Creator<FieldMappingDictionary> {
    static void a(FieldMappingDictionary fieldMappingDictionary, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, fieldMappingDictionary.b());
        b.c(parcel, 2, fieldMappingDictionary.c(), false);
        b.a(parcel, 3, fieldMappingDictionary.d(), false);
        b.a(parcel, a);
    }

    public FieldMappingDictionary a(Parcel parcel) {
        String str = null;
        int b = a.b(parcel);
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    arrayList = a.c(parcel, a, Entry.CREATOR);
                    break;
                case 3:
                    str = a.q(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new FieldMappingDictionary(i, arrayList, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public FieldMappingDictionary[] a(int i) {
        return new FieldMappingDictionary[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
