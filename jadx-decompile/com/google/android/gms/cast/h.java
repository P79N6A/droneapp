package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class h implements Creator<AdBreakInfo> {
    static void a(AdBreakInfo adBreakInfo, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, adBreakInfo.a());
        b.a(parcel, 2, adBreakInfo.b());
        b.a(parcel, a);
    }

    public AdBreakInfo a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        long j = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    j = a.i(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AdBreakInfo(i, j);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public AdBreakInfo[] a(int i) {
        return new AdBreakInfo[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
