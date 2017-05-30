package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl.Inclusion;

public class b implements Creator<Inclusion> {
    static void a(Inclusion inclusion, Parcel parcel, int i) {
        int a = com.google.android.gms.common.internal.safeparcel.b.a(parcel);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 1, inclusion.a());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 2, inclusion.b());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 3, inclusion.c());
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 4, inclusion.d(), i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, 5, inclusion.e(), i, false);
        com.google.android.gms.common.internal.safeparcel.b.a(parcel, a);
    }

    public Inclusion a(Parcel parcel) {
        KeyFilterImpl keyFilterImpl = null;
        int i = 0;
        int b = a.b(parcel);
        TimeFilterImpl timeFilterImpl = null;
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
                case 4:
                    timeFilterImpl = (TimeFilterImpl) a.a(parcel, a, TimeFilterImpl.CREATOR);
                    break;
                case 5:
                    keyFilterImpl = (KeyFilterImpl) a.a(parcel, a, KeyFilterImpl.CREATOR);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Inclusion(i3, i2, i, timeFilterImpl, keyFilterImpl);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public Inclusion[] a(int i) {
        return new Inclusion[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
