package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.awareness.snapshot.internal.BeaconStateImpl.BeaconInfoImpl;
import com.google.android.gms.common.internal.safeparcel.b;

public class a implements Creator<BeaconInfoImpl> {
    static void a(BeaconInfoImpl beaconInfoImpl, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, beaconInfoImpl.d());
        b.a(parcel, 2, beaconInfoImpl.a(), false);
        b.a(parcel, 3, beaconInfoImpl.b(), false);
        b.a(parcel, 4, beaconInfoImpl.c(), false);
        b.a(parcel, a);
    }

    public BeaconInfoImpl a(Parcel parcel) {
        byte[] bArr = null;
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case 1:
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    break;
                case 2:
                    str2 = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    break;
                case 3:
                    str = com.google.android.gms.common.internal.safeparcel.a.q(parcel, a);
                    break;
                case 4:
                    bArr = com.google.android.gms.common.internal.safeparcel.a.t(parcel, a);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new BeaconInfoImpl(i, str2, str, bArr);
        }
        throw new com.google.android.gms.common.internal.safeparcel.a.a("Overread allowed size end=" + b, parcel);
    }

    public BeaconInfoImpl[] a(int i) {
        return new BeaconInfoImpl[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
