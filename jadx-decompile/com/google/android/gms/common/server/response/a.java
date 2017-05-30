package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.server.converter.ConverterWrapper;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;

public class a implements Creator<Field> {
    static void a(Field field, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, field.a());
        b.a(parcel, 2, field.b());
        b.a(parcel, 3, field.c());
        b.a(parcel, 4, field.d());
        b.a(parcel, 5, field.e());
        b.a(parcel, 6, field.f(), false);
        b.a(parcel, 7, field.g());
        b.a(parcel, 8, field.i(), false);
        b.a(parcel, 9, field.k(), i, false);
        b.a(parcel, a);
    }

    public Field a(Parcel parcel) {
        ConverterWrapper converterWrapper = null;
        int i = 0;
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        String str = null;
        String str2 = null;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case 1:
                    i4 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    break;
                case 2:
                    i3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    break;
                case 3:
                    z2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    break;
                case 4:
                    i2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    break;
                case 5:
                    z = com.google.android.gms.common.internal.safeparcel.a.c(parcel, a);
                    break;
                case 6:
                    str2 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    break;
                case 7:
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    break;
                case 8:
                    str = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    break;
                case 9:
                    converterWrapper = (ConverterWrapper) com.google.android.gms.common.internal.safeparcel.a.a(parcel, a, ConverterWrapper.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Field(i4, i3, z2, i2, z, str2, i, str, converterWrapper);
        }
        throw new com.google.android.gms.common.internal.safeparcel.a.a("Overread allowed size end=" + b, parcel);
    }

    public Field[] a(int i) {
        return new Field[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
