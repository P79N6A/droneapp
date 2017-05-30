package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.contextmanager.internal.TimeFilterImpl.Interval;

public class r implements Creator<Interval> {
    static void a(Interval interval, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, interval.a());
        b.a(parcel, 2, interval.b());
        b.a(parcel, 3, interval.c());
        b.a(parcel, a);
    }

    public Interval a(Parcel parcel) {
        long j = 0;
        int b = a.b(parcel);
        int i = 0;
        long j2 = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    j2 = a.i(parcel, a);
                    break;
                case 3:
                    j = a.i(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new Interval(i, j2, j);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public Interval[] a(int i) {
        return new Interval[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
