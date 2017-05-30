package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.awareness.snapshot.internal.BeaconStateImpl.BeaconInfoImpl;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.ArrayList;

public class b implements Creator<BeaconStateImpl> {
    static void a(BeaconStateImpl beaconStateImpl, Parcel parcel, int i) {
        int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, beaconStateImpl.b());
        com.google.android.gms.common.internal.safeparcel.b.c(parcel, 2, beaconStateImpl.c(), false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, a);
    }

    public BeaconStateImpl a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    arrayList = a.c(parcel, a, BeaconInfoImpl.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new BeaconStateImpl(i, arrayList);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public BeaconStateImpl[] a(int i) {
        return new BeaconStateImpl[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
