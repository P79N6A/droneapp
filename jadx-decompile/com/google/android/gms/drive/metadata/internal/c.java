package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.metadata.CustomPropertyKey;

public class c implements Creator<CustomProperty> {
    static void a(CustomProperty customProperty, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, customProperty.a);
        b.a(parcel, 2, customProperty.b, i, false);
        b.a(parcel, 3, customProperty.c, false);
        b.a(parcel, a);
    }

    public CustomProperty a(Parcel parcel) {
        String str = null;
        int b = a.b(parcel);
        int i = 0;
        CustomPropertyKey customPropertyKey = null;
        while (parcel.dataPosition() < b) {
            CustomPropertyKey customPropertyKey2;
            int g;
            String str2;
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    String str3 = str;
                    customPropertyKey2 = customPropertyKey;
                    g = a.g(parcel, a);
                    str2 = str3;
                    break;
                case 2:
                    g = i;
                    CustomPropertyKey customPropertyKey3 = (CustomPropertyKey) a.a(parcel, a, CustomPropertyKey.CREATOR);
                    str2 = str;
                    customPropertyKey2 = customPropertyKey3;
                    break;
                case 3:
                    str2 = a.q(parcel, a);
                    customPropertyKey2 = customPropertyKey;
                    g = i;
                    break;
                default:
                    a.b(parcel, a);
                    str2 = str;
                    customPropertyKey2 = customPropertyKey;
                    g = i;
                    break;
            }
            i = g;
            customPropertyKey = customPropertyKey2;
            str = str2;
        }
        if (parcel.dataPosition() == b) {
            return new CustomProperty(i, customPropertyKey, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public CustomProperty[] a(int i) {
        return new CustomProperty[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
