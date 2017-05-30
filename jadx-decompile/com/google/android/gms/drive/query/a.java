package com.google.android.gms.drive.query;

import com.google.android.gms.common.internal.d;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.drive.metadata.b;
import com.google.android.gms.drive.metadata.c;
import com.google.android.gms.drive.query.internal.ComparisonFilter;
import com.google.android.gms.drive.query.internal.FieldOnlyFilter;
import com.google.android.gms.drive.query.internal.HasFilter;
import com.google.android.gms.drive.query.internal.InFilter;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import com.google.android.gms.drive.query.internal.NotFilter;
import com.google.android.gms.drive.query.internal.Operator;
import com.google.android.gms.drive.query.internal.OwnedByMeFilter;

public class a {
    public static Filter a() {
        return new FieldOnlyFilter(b.e);
    }

    public static Filter a(CustomPropertyKey customPropertyKey, String str) {
        d.b(str != null, "Custom property value may not be null.");
        return new HasFilter(b.j, new com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.a().a(customPropertyKey, str).a());
    }

    public static <T> Filter a(b<T> bVar, T t) {
        return new InFilter((b) bVar, (Object) t);
    }

    public static <T> Filter a(c<T> cVar, T t) {
        return new ComparisonFilter(Operator.a, (c) cVar, (Object) t);
    }

    public static Filter a(c<String> cVar, String str) {
        return new ComparisonFilter(Operator.i, (c) cVar, (Object) str);
    }

    public static <T extends Comparable<T>> Filter a(com.google.android.gms.drive.metadata.d<T> dVar, T t) {
        return new ComparisonFilter(Operator.b, (c) dVar, (Object) t);
    }

    public static Filter a(Filter filter) {
        return new NotFilter(filter);
    }

    public static Filter a(Filter filter, Filter... filterArr) {
        return new LogicalFilter(Operator.f, filter, filterArr);
    }

    public static Filter a(Iterable<Filter> iterable) {
        return new LogicalFilter(Operator.f, iterable);
    }

    public static Filter b() {
        return new FieldOnlyFilter(b.h);
    }

    public static <T extends Comparable<T>> Filter b(com.google.android.gms.drive.metadata.d<T> dVar, T t) {
        return new ComparisonFilter(Operator.d, (c) dVar, (Object) t);
    }

    public static Filter b(Filter filter, Filter... filterArr) {
        return new LogicalFilter(Operator.g, filter, filterArr);
    }

    public static Filter b(Iterable<Filter> iterable) {
        return new LogicalFilter(Operator.g, iterable);
    }

    public static Filter c() {
        return new OwnedByMeFilter();
    }

    public static <T extends Comparable<T>> Filter c(com.google.android.gms.drive.metadata.d<T> dVar, T t) {
        return new ComparisonFilter(Operator.c, (c) dVar, (Object) t);
    }

    public static <T extends Comparable<T>> Filter d(com.google.android.gms.drive.metadata.d<T> dVar, T t) {
        return new ComparisonFilter(Operator.e, (c) dVar, (Object) t);
    }
}
