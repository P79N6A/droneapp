package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.b;
import com.google.android.gms.drive.metadata.g;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Collection;
import java.util.Collections;

public class InFilter<T> extends AbstractFilter {
    public static final j CREATOR = new j();
    final MetadataBundle a;
    final int b;
    private final g<T> c;

    InFilter(int i, MetadataBundle metadataBundle) {
        this.b = i;
        this.a = metadataBundle;
        this.c = (g) e.a(metadataBundle);
    }

    public InFilter(b<T> bVar, T t) {
        this(1, MetadataBundle.a(bVar, Collections.singleton(t)));
    }

    public T a() {
        return ((Collection) this.a.a(this.c)).iterator().next();
    }

    public <F> F a(f<F> fVar) {
        return fVar.a(this.c, a());
    }

    public void writeToParcel(Parcel parcel, int i) {
        j.a(this, parcel, i);
    }
}
