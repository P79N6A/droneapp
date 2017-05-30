package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class h implements Creator<FullTextSearchFilter> {
    static void a(FullTextSearchFilter fullTextSearchFilter, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, fullTextSearchFilter.a, false);
        b.a(parcel, 1000, fullTextSearchFilter.b);
        b.a(parcel, a);
    }

    public FullTextSearchFilter a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    str = a.q(parcel, a);
                    break;
                case 1000:
                    i = a.g(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new FullTextSearchFilter(i, str);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public FullTextSearchFilter[] a(int i) {
        return new FullTextSearchFilter[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
