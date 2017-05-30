package com.google.android.gms.gass.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class d implements Creator<GassResponseParcel> {
    static void a(GassResponseParcel gassResponseParcel, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, gassResponseParcel.a);
        b.a(parcel, 2, gassResponseParcel.a(), false);
        b.a(parcel, a);
    }

    public GassResponseParcel a(Parcel parcel) {
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
            return new GassResponseParcel(i, bArr);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public GassResponseParcel[] a(int i) {
        return new GassResponseParcel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
