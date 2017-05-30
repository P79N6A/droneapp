package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.contextmanager.internal.TimeFilterImpl.Interval;
import java.util.ArrayList;

public class q implements Creator<TimeFilterImpl> {
    static void a(TimeFilterImpl timeFilterImpl, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, timeFilterImpl.a());
        b.c(parcel, 2, timeFilterImpl.b(), false);
        b.a(parcel, 3, timeFilterImpl.c(), false);
        b.a(parcel, a);
    }

    public TimeFilterImpl a(Parcel parcel) {
        int[] iArr = null;
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
                    arrayList = a.c(parcel, a, Interval.CREATOR);
                    break;
                case 3:
                    iArr = a.w(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new TimeFilterImpl(i, arrayList, iArr);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public TimeFilterImpl[] a(int i) {
        return new TimeFilterImpl[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
