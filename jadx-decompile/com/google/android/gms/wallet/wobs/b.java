package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

public class b implements Creator<LabelValue> {
    static void a(LabelValue labelValue, Parcel parcel, int i) {
        int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, labelValue.a());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, labelValue.a, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, labelValue.b, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, a);
    }

    public LabelValue a(Parcel parcel) {
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
            return new LabelValue(i, str2, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public LabelValue[] a(int i) {
        return new LabelValue[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
