package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class m implements Creator<NotFilter> {
    static void a(NotFilter notFilter, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, notFilter.a, i, false);
        b.a(parcel, 1000, notFilter.b);
        b.a(parcel, a);
    }

    public NotFilter a(Parcel parcel) {
        int b = a.b(parcel);
        int i = 0;
        FilterHolder filterHolder = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    filterHolder = (FilterHolder) a.a(parcel, a, FilterHolder.CREATOR);
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
            return new NotFilter(i, filterHolder);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public NotFilter[] a(int i) {
        return new NotFilter[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
