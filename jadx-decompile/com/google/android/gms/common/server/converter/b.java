package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.server.converter.StringToIntConverter.Entry;
import java.util.ArrayList;

public class b implements Creator<StringToIntConverter> {
    static void a(StringToIntConverter stringToIntConverter, Parcel parcel, int i) {
        int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, stringToIntConverter.a());
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 2, stringToIntConverter.b(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, a);
    }

    public StringToIntConverter a(Parcel parcel) {
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
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new StringToIntConverter(i, arrayList);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public StringToIntConverter[] a(int i) {
        return new StringToIntConverter[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
