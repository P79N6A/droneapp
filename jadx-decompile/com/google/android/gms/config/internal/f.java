package com.google.android.gms.config.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class f implements Creator<CustomVariable> {
    static void a(CustomVariable customVariable, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, customVariable.a());
        b.a(parcel, 2, customVariable.b(), false);
        b.a(parcel, 3, customVariable.c(), false);
        b.a(parcel, a);
    }

    public CustomVariable a(Parcel parcel) {
        String str = null;
        int b = a.b(parcel);
        int i = 0;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    str2 = a.q(parcel, a);
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
            return new CustomVariable(i, str2, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public CustomVariable[] a(int i) {
        return new CustomVariable[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}