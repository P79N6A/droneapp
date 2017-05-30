package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public class a implements Creator<ConverterWrapper> {
    static void a(ConverterWrapper converterWrapper, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, converterWrapper.a());
        b.a(parcel, 2, converterWrapper.b(), i, false);
        b.a(parcel, a);
    }

    public ConverterWrapper a(Parcel parcel) {
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        StringToIntConverter stringToIntConverter = null;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case 1:
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    break;
                case 2:
                    stringToIntConverter = (StringToIntConverter) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, StringToIntConverter.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ConverterWrapper(i, stringToIntConverter);
        }
        throw new com.google.android.gms.common.internal.safeparcel.a.a("Overread allowed size end=" + b, parcel);
    }

    public ConverterWrapper[] a(int i) {
        return new ConverterWrapper[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
