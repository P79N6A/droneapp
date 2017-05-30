package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class g implements Creator<TimeInterval> {
    static void a(TimeInterval timeInterval, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, timeInterval.a());
        b.a(parcel, 2, timeInterval.a);
        b.a(parcel, 3, timeInterval.b);
        b.a(parcel, a);
    }

    public TimeInterval a(Parcel parcel) {
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
            return new TimeInterval(i, j2, j);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public TimeInterval[] a(int i) {
        return new TimeInterval[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
