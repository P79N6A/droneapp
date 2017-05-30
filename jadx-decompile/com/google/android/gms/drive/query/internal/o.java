package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class o implements Creator<OwnedByMeFilter> {
    static void a(OwnedByMeFilter ownedByMeFilter, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1000, ownedByMeFilter.a);
        b.a(parcel, a);
    }

    public OwnedByMeFilter a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1000:
                    i = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new OwnedByMeFilter(i);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public OwnedByMeFilter[] a(int i) {
        return new OwnedByMeFilter[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
