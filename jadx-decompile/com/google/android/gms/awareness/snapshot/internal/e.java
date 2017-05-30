package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class e implements Creator<NetworkStateImpl> {
    static void a(NetworkStateImpl networkStateImpl, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, networkStateImpl.b());
        b.a(parcel, 2, networkStateImpl.a());
        b.a(parcel, 3, networkStateImpl.c());
        b.a(parcel, a);
    }

    public NetworkStateImpl a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i3 = a.g(parcel, a);
                    break;
                case 2:
                    i2 = a.g(parcel, a);
                    break;
                case 3:
                    i = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new NetworkStateImpl(i3, i2, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public NetworkStateImpl[] a(int i) {
        return new NetworkStateImpl[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
