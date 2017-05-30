package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.List;

public class k implements Creator<RangeParcelable> {
    static void a(RangeParcelable rangeParcelable, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, rangeParcelable.a);
        b.b(parcel, 2, rangeParcelable.b, false);
        b.b(parcel, 3, rangeParcelable.c, false);
        b.a(parcel, a);
    }

    public RangeParcelable a(Parcel parcel) {
        List list = null;
        int b = a.b(parcel);
        int i = 0;
        List list2 = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    i = a.g(parcel, a);
                    break;
                case 2:
                    list2 = a.E(parcel, a);
                    break;
                case 3:
                    list = a.E(parcel, a);
                    break;
                default:
                    a.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new RangeParcelable(i, list2, list);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public RangeParcelable[] a(int i) {
        return new RangeParcelable[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
