package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import java.util.List;

public class d implements Creator<Query> {
    static void a(Query query, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, query.a, i, false);
        b.a(parcel, 3, query.b, false);
        b.a(parcel, 4, query.c, i, false);
        b.b(parcel, 5, query.d, false);
        b.a(parcel, 6, query.e);
        b.c(parcel, 7, query.f, false);
        b.a(parcel, 8, query.g);
        b.a(parcel, 1000, query.h);
        b.a(parcel, a);
    }

    public Query a(Parcel parcel) {
        boolean z = false;
        List list = null;
        int b = a.b(parcel);
        boolean z2 = false;
        List list2 = null;
        SortOrder sortOrder = null;
        String str = null;
        LogicalFilter logicalFilter = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    logicalFilter = (LogicalFilter) a.a(parcel, a, LogicalFilter.CREATOR);
                    break;
                case 3:
                    str = a.q(parcel, a);
                    break;
                case 4:
                    sortOrder = (SortOrder) a.a(parcel, a, SortOrder.CREATOR);
                    break;
                case 5:
                    list2 = a.E(parcel, a);
                    break;
                case 6:
                    z2 = a.c(parcel, a);
                    break;
                case 7:
                    list = a.c(parcel, a, DriveSpace.CREATOR);
                    break;
                case 8:
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
            return new Query(i, logicalFilter, str, sortOrder, list2, z2, list, z);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public Query[] a(int i) {
        return new Query[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
