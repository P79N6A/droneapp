package com.google.android.gms.drive.query.internal;

import android.os.Parcel;

public class FullTextSearchFilter extends AbstractFilter {
    public static final h CREATOR = new h();
    final String a;
    final int b;

    FullTextSearchFilter(int i, String str) {
        this.b = i;
        this.a = str;
    }

    public <F> F a(f<F> fVar) {
        return fVar.a(this.a);
    }

    public void writeToParcel(Parcel parcel, int i) {
        h.a(this, parcel, i);
    }
}
