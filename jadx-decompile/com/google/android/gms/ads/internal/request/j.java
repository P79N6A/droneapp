package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class j implements Creator<CapabilityParcel> {
    static void a(CapabilityParcel capabilityParcel, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, capabilityParcel.a);
        b.a(parcel, 2, capabilityParcel.b);
        b.a(parcel, 3, capabilityParcel.c);
        b.a(parcel, 4, capabilityParcel.d);
        b.a(parcel, a);
    }

    public CapabilityParcel a(Parcel parcel) {
        boolean z = false;
        int b = a.b(parcel);
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    z3 = a.c(parcel, a);
                    break;
                case 3:
                    z2 = a.c(parcel, a);
                    break;
                case 4:
                    z = a.c(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new CapabilityParcel(i, z3, z2, z);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public CapabilityParcel[] a(int i) {
        return new CapabilityParcel[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
