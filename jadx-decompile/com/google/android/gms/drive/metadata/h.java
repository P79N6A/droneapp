package com.google.android.gms.drive.metadata;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class h implements Creator<CustomPropertyKey> {
    static void a(CustomPropertyKey customPropertyKey, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, customPropertyKey.c);
        b.a(parcel, 2, customPropertyKey.d, false);
        b.a(parcel, 3, customPropertyKey.e);
        b.a(parcel, a);
    }

    public CustomPropertyKey a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = a.g(parcel, a);
                    break;
                case 2:
                    str = a.q(parcel, a);
                    break;
                case 3:
                    i = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new CustomPropertyKey(i2, str, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public CustomPropertyKey[] a(int i) {
        return new CustomPropertyKey[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
