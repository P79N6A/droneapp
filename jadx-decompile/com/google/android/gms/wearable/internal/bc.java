package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.List;

public class bc implements Creator<CapabilityInfoParcelable> {
    static void a(CapabilityInfoParcelable capabilityInfoParcelable, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, capabilityInfoParcelable.a);
        b.a(parcel, 2, capabilityInfoParcelable.a(), false);
        b.c(parcel, 3, capabilityInfoParcelable.c(), false);
        b.a(parcel, a);
    }

    public CapabilityInfoParcelable a(Parcel parcel) {
        List list = null;
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    str = a.q(parcel, a);
                    break;
                case 3:
                    list = a.c(parcel, a, NodeParcelable.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new CapabilityInfoParcelable(i, str, list);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public CapabilityInfoParcelable[] a(int i) {
        return new CapabilityInfoParcelable[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
