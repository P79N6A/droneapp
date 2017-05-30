package com.google.android.gms.drive.query.internal;

import android.os.Parcel;

public class MatchAllFilter extends AbstractFilter {
    public static final l CREATOR = new l();
    final int a;

    public MatchAllFilter() {
        this(1);
    }

    MatchAllFilter(int i) {
        this.a = i;
    }

    public <F> F a(f<F> fVar) {
        return fVar.a();
    }

    public void writeToParcel(Parcel parcel, int i) {
        l.a(this, parcel, i);
    }
}
