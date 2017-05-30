package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.contextmanager.internal.RelationFilterImpl.Inclusion;

public class p implements Creator<Inclusion> {
    static void a(Inclusion inclusion, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, inclusion.a());
        b.a(parcel, 2, inclusion.b());
        b.a(parcel, 3, inclusion.c(), i, false);
        b.a(parcel, 4, inclusion.d(), i, false);
        b.a(parcel, a);
    }

    public Inclusion a(Parcel parcel) {
        KeyFilterImpl keyFilterImpl = null;
        int i = 0;
        int b = a.b(parcel);
        TimeFilterImpl timeFilterImpl = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            TimeFilterImpl timeFilterImpl2;
            int i3;
            KeyFilterImpl keyFilterImpl2;
            int a = a.a(parcel);
            KeyFilterImpl keyFilterImpl3;
            switch (a.a(a)) {
                case 1:
                    keyFilterImpl3 = keyFilterImpl;
                    timeFilterImpl2 = timeFilterImpl;
                    i3 = i;
                    i = a.g(parcel, a);
                    keyFilterImpl2 = keyFilterImpl3;
                    break;
                case 2:
                    i = i2;
                    TimeFilterImpl timeFilterImpl3 = timeFilterImpl;
                    i3 = a.g(parcel, a);
                    keyFilterImpl2 = keyFilterImpl;
                    timeFilterImpl2 = timeFilterImpl3;
                    break;
                case 3:
                    i3 = i;
                    i = i2;
                    keyFilterImpl3 = keyFilterImpl;
                    timeFilterImpl2 = (TimeFilterImpl) a.a(parcel, a, TimeFilterImpl.CREATOR);
                    keyFilterImpl2 = keyFilterImpl3;
                    break;
                case 4:
                    keyFilterImpl2 = (KeyFilterImpl) a.a(parcel, a, KeyFilterImpl.CREATOR);
                    timeFilterImpl2 = timeFilterImpl;
                    i3 = i;
                    i = i2;
                    break;
                default:
                    a.b(parcel, a);
                    keyFilterImpl2 = keyFilterImpl;
                    timeFilterImpl2 = timeFilterImpl;
                    i3 = i;
                    i = i2;
                    break;
            }
            i2 = i;
            i = i3;
            timeFilterImpl = timeFilterImpl2;
            keyFilterImpl = keyFilterImpl2;
        }
        if (parcel.dataPosition() == b) {
            return new Inclusion(i2, i, timeFilterImpl, keyFilterImpl);
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
