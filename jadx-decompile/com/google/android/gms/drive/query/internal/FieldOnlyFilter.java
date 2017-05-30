package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.drive.metadata.a;
import com.google.android.gms.drive.metadata.c;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class FieldOnlyFilter extends AbstractFilter {
    public static final Creator<FieldOnlyFilter> CREATOR = new b();
    final MetadataBundle a;
    final int b;
    private final a<?> c;

    FieldOnlyFilter(int i, MetadataBundle metadataBundle) {
        this.b = i;
        this.a = metadataBundle;
        this.c = e.a(metadataBundle);
    }

    public FieldOnlyFilter(c<?> cVar) {
        this(1, MetadataBundle.a(cVar, null));
    }

    public <T> T a(f<T> fVar) {
        return fVar.a(this.c);
    }

    public void writeToParcel(Parcel parcel, int i) {
        b.a(this, parcel, i);
    }
}
