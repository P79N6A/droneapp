package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.a;
import com.google.android.gms.drive.metadata.c;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class HasFilter<T> extends AbstractFilter {
    public static final i CREATOR = new i();
    final MetadataBundle a;
    final int b;
    final a<T> c;

    HasFilter(int i, MetadataBundle metadataBundle) {
        this.b = i;
        this.a = metadataBundle;
        this.c = e.a(metadataBundle);
    }

    public HasFilter(c<T> cVar, T t) {
        this(1, MetadataBundle.a(cVar, t));
    }

    public T a() {
        return this.a.a(this.c);
    }

    public <F> F a(f<F> fVar) {
        return fVar.a(this.c, a());
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.a(this, parcel, i);
    }
}
