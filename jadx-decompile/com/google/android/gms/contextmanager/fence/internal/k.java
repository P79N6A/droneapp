package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class k implements Creator<FenceTriggerInfoImpl> {
    static void a(FenceTriggerInfoImpl fenceTriggerInfoImpl, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, fenceTriggerInfoImpl.a());
        b.a(parcel, 2, fenceTriggerInfoImpl.b());
        b.a(parcel, 3, fenceTriggerInfoImpl.c(), false);
        b.a(parcel, a);
    }

    public FenceTriggerInfoImpl a(Parcel parcel) {
        boolean z = false;
        int b = a.b(parcel);
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    z = a.c(parcel, a);
                    break;
                case 3:
                    str = a.q(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new FenceTriggerInfoImpl(i, z, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public FenceTriggerInfoImpl[] a(int i) {
        return new FenceTriggerInfoImpl[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
