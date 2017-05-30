package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.b;

public class a implements Creator<BleSignalImpl> {
    static void a(BleSignalImpl bleSignalImpl, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, bleSignalImpl.b);
        b.a(parcel, 2, bleSignalImpl.c);
        b.a(parcel, 3, bleSignalImpl.d);
        b.a(parcel, a);
    }

    public BleSignalImpl a(Parcel parcel) {
        int i = 0;
        int b = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.a.a(a)) {
                case 1:
                    i3 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    break;
                case 2:
                    i2 = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    break;
                case 3:
                    i = com.google.android.gms.common.internal.safeparcel.a.g(parcel, a);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new BleSignalImpl(i3, i2, i);
        }
        throw new com.google.android.gms.common.internal.safeparcel.a.a("Overread allowed size end=" + b, parcel);
    }

    public BleSignalImpl[] a(int i) {
        return new BleSignalImpl[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
