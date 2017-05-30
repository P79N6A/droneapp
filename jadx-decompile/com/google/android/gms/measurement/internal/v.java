package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class v implements Creator<EventParams> {
    static void a(EventParams eventParams, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, eventParams.a);
        b.a(parcel, 2, eventParams.b(), false);
        b.a(parcel, a);
    }

    public EventParams a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        Bundle bundle = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    bundle = a.s(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new EventParams(i, bundle);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public EventParams[] a(int i) {
        return new EventParams[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
