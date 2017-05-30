package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class n implements Creator<QueryFilterParameters> {
    static void a(QueryFilterParameters queryFilterParameters, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, queryFilterParameters.a());
        b.a(parcel, 2, queryFilterParameters.b());
        b.a(parcel, 3, queryFilterParameters.c());
        b.a(parcel, 4, queryFilterParameters.d(), false);
        b.a(parcel, a);
    }

    public QueryFilterParameters a(Parcel parcel) {
        int i = 0;
        int b = a.b(parcel);
        int[] iArr = null;
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
                    iArr = a.w(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new QueryFilterParameters(i3, i2, i, iArr);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public QueryFilterParameters[] a(int i) {
        return new QueryFilterParameters[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
