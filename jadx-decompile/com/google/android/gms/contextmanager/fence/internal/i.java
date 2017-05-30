package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class i implements Creator<FenceStateImpl> {
    static void a(FenceStateImpl fenceStateImpl, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, fenceStateImpl.e());
        b.a(parcel, 2, fenceStateImpl.a());
        b.a(parcel, 3, fenceStateImpl.c());
        b.a(parcel, 4, fenceStateImpl.d(), false);
        b.a(parcel, 5, fenceStateImpl.b());
        b.a(parcel, a);
    }

    public FenceStateImpl a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        long j = 0;
        String str = null;
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
                    j = a.i(parcel, a);
                    break;
                case 4:
                    str = a.q(parcel, a);
                    break;
                case 5:
                    i = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new FenceStateImpl(i3, i2, j, str, i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public FenceStateImpl[] a(int i) {
        return new FenceStateImpl[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
