package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.a;
import com.google.android.gms.drive.metadata.c;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class ComparisonFilter<T> extends AbstractFilter {
    public static final a CREATOR = new a();
    final Operator a;
    final MetadataBundle b;
    final int c;
    final a<T> d;

    ComparisonFilter(int i, Operator operator, MetadataBundle metadataBundle) {
        this.c = i;
        this.a = operator;
        this.b = metadataBundle;
        this.d = e.a(metadataBundle);
    }

    public ComparisonFilter(Operator operator, c<T> cVar, T t) {
        this(1, operator, MetadataBundle.a(cVar, t));
    }

    public T a() {
        return this.b.a(this.d);
    }

    public <F> F a(f<F> fVar) {
        return fVar.a(this.a, this.d, a());
    }

    public void writeToParcel(Parcel parcel, int i) {
        a.a(this, parcel, i);
    }
}
