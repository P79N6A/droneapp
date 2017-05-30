package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class d implements Creator<FilterHolder> {
    static void a(FilterHolder filterHolder, Parcel parcel, int i) {
        int a = b.a(parcel);
        b.a(parcel, 1, filterHolder.b, i, false);
        b.a(parcel, 2, filterHolder.c, i, false);
        b.a(parcel, 3, filterHolder.d, i, false);
        b.a(parcel, 4, filterHolder.e, i, false);
        b.a(parcel, 5, filterHolder.f, i, false);
        b.a(parcel, 6, filterHolder.g, i, false);
        b.a(parcel, 7, filterHolder.h, i, false);
        b.a(parcel, 1000, filterHolder.a);
        b.a(parcel, 8, filterHolder.i, i, false);
        b.a(parcel, 9, filterHolder.j, i, false);
        b.a(parcel, a);
    }

    public FilterHolder a(Parcel parcel) {
        OwnedByMeFilter ownedByMeFilter = null;
        int b = a.b(parcel);
        int i = 0;
        FullTextSearchFilter fullTextSearchFilter = null;
        HasFilter hasFilter = null;
        MatchAllFilter matchAllFilter = null;
        InFilter inFilter = null;
        NotFilter notFilter = null;
        LogicalFilter logicalFilter = null;
        FieldOnlyFilter fieldOnlyFilter = null;
        ComparisonFilter comparisonFilter = null;
        while (parcel.dataPosition() < b) {
            int a = a.a(parcel);
            switch (a.a(a)) {
                case 1:
                    comparisonFilter = (ComparisonFilter) a.a(parcel, a, ComparisonFilter.CREATOR);
                    break;
                case 2:
                    fieldOnlyFilter = (FieldOnlyFilter) a.a(parcel, a, FieldOnlyFilter.CREATOR);
                    break;
                case 3:
                    logicalFilter = (LogicalFilter) a.a(parcel, a, LogicalFilter.CREATOR);
                    break;
                case 4:
                    notFilter = (NotFilter) a.a(parcel, a, NotFilter.CREATOR);
                    break;
                case 5:
                    inFilter = (InFilter) a.a(parcel, a, InFilter.CREATOR);
                    break;
                case 6:
                    matchAllFilter = (MatchAllFilter) a.a(parcel, a, MatchAllFilter.CREATOR);
                    break;
                case 7:
                    hasFilter = (HasFilter) a.a(parcel, a, HasFilter.CREATOR);
                    break;
                case 8:
                    fullTextSearchFilter = (FullTextSearchFilter) a.a(parcel, a, FullTextSearchFilter.CREATOR);
                    break;
                case 9:
                    ownedByMeFilter = (OwnedByMeFilter) a.a(parcel, a, OwnedByMeFilter.CREATOR);
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
            return new FilterHolder(i, comparisonFilter, fieldOnlyFilter, logicalFilter, notFilter, inFilter, matchAllFilter, hasFilter, fullTextSearchFilter, ownedByMeFilter);
        }
        throw new a.a("Overread allowed size end=" + b, parcel);
    }

    public FilterHolder[] a(int i) {
        return new FilterHolder[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return a(i);
    }
}
