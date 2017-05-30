package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.query.internal.FieldWithSortOrder;
import java.util.List;

public class e implements Creator<SortOrder> {
    static void a(SortOrder sortOrder, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.c(parcel, 1, sortOrder.a, false);
        b.a(parcel, 2, sortOrder.b);
        b.a(parcel, 1000, sortOrder.c);
        b.a(parcel, a);
    }

    public SortOrder a(Parcel parcel) {
        boolean z = false;
        int b = a.b(parcel);
        List list = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    list = a.c(parcel, a, FieldWithSortOrder.CREATOR);
                    break;
                case 2:
                    z = a.c(parcel, a);
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
            return new SortOrder(i, list, z);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public SortOrder[] a(int i) {
        return new SortOrder[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
