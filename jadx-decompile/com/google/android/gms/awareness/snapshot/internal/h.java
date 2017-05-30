package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class h implements Creator<PowerStateImpl> {
    static void a(PowerStateImpl powerStateImpl, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, powerStateImpl.c());
        b.a(parcel, 2, powerStateImpl.a());
        b.a(parcel, 3, powerStateImpl.b());
        b.a(parcel, a);
    }

    public PowerStateImpl a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        double d = 0.0d;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i2 = a.g(parcel, a);
                    break;
                case 2:
                    i = a.g(parcel, a);
                    break;
                case 3:
                    d = a.n(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PowerStateImpl(i2, i, d);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public PowerStateImpl[] a(int i) {
        return new PowerStateImpl[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
