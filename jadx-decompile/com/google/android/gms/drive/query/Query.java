package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import com.google.android.gms.drive.query.internal.MatchAllFilter;
import com.google.android.gms.drive.query.internal.Operator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class Query extends AbstractSafeParcelable {
    public static final Creator<Query> CREATOR = new d();
    final LogicalFilter a;
    final String b;
    final SortOrder c;
    final List<String> d;
    final boolean e;
    final List<DriveSpace> f;
    final boolean g;
    final int h;
    private final Set<DriveSpace> i;

    public static class a {
        private final List<Filter> a = new ArrayList();
        private String b;
        private SortOrder c;
        private List<String> d;
        private boolean e;
        private Set<DriveSpace> f;
        private boolean g;

        public a(Query query) {
            this.a.add(query.a());
            this.b = query.b();
            this.c = query.c();
            this.d = query.d();
            this.e = query.e();
            this.f = query.f();
            this.g = query.g();
        }

        public a a(Filter filter) {
            if (!(filter instanceof MatchAllFilter)) {
                this.a.add(filter);
            }
            return this;
        }

        public a a(SortOrder sortOrder) {
            this.c = sortOrder;
            return this;
        }

        @Deprecated
        public a a(String str) {
            this.b = str;
            return this;
        }

        public Query a() {
            return new Query(new LogicalFilter(Operator.f, this.a), this.b, this.c, this.d, this.e, this.f, this.g);
        }
    }

    private Query(int i, LogicalFilter logicalFilter, String str, SortOrder sortOrder, List<String> list, boolean z, List<DriveSpace> list2, Set<DriveSpace> set, boolean z2) {
        this.h = i;
        this.a = logicalFilter;
        this.b = str;
        this.c = sortOrder;
        this.d = list;
        this.e = z;
        this.f = list2;
        this.i = set;
        this.g = z2;
    }

    Query(int i, LogicalFilter logicalFilter, String str, SortOrder sortOrder, List<String> list, boolean z, List<DriveSpace> list2, boolean z2) {
        this(i, logicalFilter, str, sortOrder, list, z, list2, list2 == null ? null : new HashSet(list2), z2);
    }

    private Query(LogicalFilter logicalFilter, String str, SortOrder sortOrder, List<String> list, boolean z, Set<DriveSpace> set, boolean z2) {
        this(1, logicalFilter, str, sortOrder, list, z, set == null ? null : new ArrayList(set), set, z2);
    }

    public Filter a() {
        return this.a;
    }

    @Deprecated
    public String b() {
        return this.b;
    }

    public SortOrder c() {
        return this.c;
    }

    public List<String> d() {
        return this.d;
    }

    public boolean e() {
        return this.e;
    }

    public Set<DriveSpace> f() {
        return this.i;
    }

    public boolean g() {
        return this.g;
    }

    public String toString() {
        return String.format(Locale.US, "Query[%s,%s,PageToken=%s,Spaces=%s]", new Object[]{this.a, this.c, this.b, this.f});
    }

    public void writeToParcel(Parcel parcel, int i) {
        d.a(this, parcel, i);
    }
}
