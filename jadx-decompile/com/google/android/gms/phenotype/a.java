package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public class a implements Creator<Configuration> {
    static void a(Configuration configuration, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, configuration.a);
        b.a(parcel, 2, configuration.b);
        b.a(parcel, 3, configuration.c, i, false);
        b.a(parcel, 4, configuration.d, false);
        b.a(parcel, a);
    }

    public Configuration a(Parcel parcel) {
        String[] strArr = null;
        int i = 0;
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        Flag[] flagArr = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            Flag[] flagArr2;
            int i3;
            String[] strArr2;
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            String[] strArr3;
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case 1:
                    strArr3 = strArr;
                    flagArr2 = flagArr;
                    i3 = i;
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    strArr2 = strArr3;
                    break;
                case 2:
                    i = i2;
                    Flag[] flagArr3 = flagArr;
                    i3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    strArr2 = strArr;
                    flagArr2 = flagArr3;
                    break;
                case 3:
                    i3 = i;
                    i = i2;
                    strArr3 = strArr;
                    flagArr2 = (Flag[]) com.google.android.gms.common.internal.safeparcel.a.b(parcel, a, Flag.CREATOR);
                    strArr2 = strArr3;
                    break;
                case 4:
                    strArr2 = com.google.android.gms.common.internal.safeparcel.a.C(parcel, a);
                    flagArr2 = flagArr;
                    i3 = i;
                    i = i2;
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    strArr2 = strArr;
                    flagArr2 = flagArr;
                    i3 = i;
                    i = i2;
                    break;
            }
            i2 = i;
            i = i3;
            flagArr = flagArr2;
            strArr = strArr2;
        }
        if (parcel.dataPosition() == b) {
            return new Configuration(i2, i, flagArr, strArr);
        }
        throw new com.google.android.gms.common.internal.safeparcel.a.a("Overread allowed size end=" + b, parcel);
    }

    public Configuration[] a(int i) {
        return new Configuration[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
