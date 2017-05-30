package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.query.Filter;

public class FilterHolder extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<FilterHolder> CREATOR = new d();
    final int a;
    final ComparisonFilter<?> b;
    final FieldOnlyFilter c;
    final LogicalFilter d;
    final NotFilter e;
    final InFilter<?> f;
    final MatchAllFilter g;
    final HasFilter h;
    final FullTextSearchFilter i;
    final OwnedByMeFilter j;
    private final Filter k;

    FilterHolder(int i, ComparisonFilter<?> comparisonFilter, FieldOnlyFilter fieldOnlyFilter, LogicalFilter logicalFilter, NotFilter notFilter, InFilter<?> inFilter, MatchAllFilter matchAllFilter, HasFilter<?> hasFilter, FullTextSearchFilter fullTextSearchFilter, OwnedByMeFilter ownedByMeFilter) {
        this.a = i;
        this.b = comparisonFilter;
        this.c = fieldOnlyFilter;
        this.d = logicalFilter;
        this.e = notFilter;
        this.f = inFilter;
        this.g = matchAllFilter;
        this.h = hasFilter;
        this.i = fullTextSearchFilter;
        this.j = ownedByMeFilter;
        if (this.b != null) {
            this.k = this.b;
        } else if (this.c != null) {
            this.k = this.c;
        } else if (this.d != null) {
            this.k = this.d;
        } else if (this.e != null) {
            this.k = this.e;
        } else if (this.f != null) {
            this.k = this.f;
        } else if (this.g != null) {
            this.k = this.g;
        } else if (this.h != null) {
            this.k = this.h;
        } else if (this.i != null) {
            this.k = this.i;
        } else if (this.j != null) {
            this.k = this.j;
        } else {
            throw new IllegalArgumentException("At least one filter must be set.");
        }
    }

    public FilterHolder(Filter filter) {
        d.a(filter, "Null filter.");
        this.a = 2;
        this.b = filter instanceof ComparisonFilter ? (ComparisonFilter) filter : null;
        this.c = filter instanceof FieldOnlyFilter ? (FieldOnlyFilter) filter : null;
        this.d = filter instanceof LogicalFilter ? (LogicalFilter) filter : null;
        this.e = filter instanceof NotFilter ? (NotFilter) filter : null;
        this.f = filter instanceof InFilter ? (InFilter) filter : null;
        this.g = filter instanceof MatchAllFilter ? (MatchAllFilter) filter : null;
        this.h = filter instanceof HasFilter ? (HasFilter) filter : null;
        this.i = filter instanceof FullTextSearchFilter ? (FullTextSearchFilter) filter : null;
        this.j = filter instanceof OwnedByMeFilter ? (OwnedByMeFilter) filter : null;
        if (this.b == null && this.c == null && this.d == null && this.e == null && this.f == null && this.g == null && this.h == null && this.i == null && this.j == null) {
            throw new IllegalArgumentException("Invalid filter type.");
        }
        this.k = filter;
    }

    public Filter a() {
        return this.k;
    }

    public String toString() {
        return String.format("FilterHolder[%s]", new Object[]{this.k});
    }

    public void writeToParcel(Parcel parcel, int i) {
        d.a(this, parcel, i);
    }
}
