package com.google.android.gms.contextmanager;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

public class b implements Creator<ContextData> {
    static void a(ContextData contextData, Parcel parcel, int i) {
        int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, contextData.b());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, contextData.c(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, a);
    }

    public ContextData a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        byte[] bArr = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    bArr = a.t(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ContextData(i, bArr);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public ContextData[] a(int i) {
        return new ContextData[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
