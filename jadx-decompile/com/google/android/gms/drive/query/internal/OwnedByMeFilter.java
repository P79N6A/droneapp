package com.google.android.gms.drive.query.internal;

import android.os.Parcel;

public class OwnedByMeFilter extends AbstractFilter {
    public static final o CREATOR = new o();
    final int a;

    public OwnedByMeFilter() {
        this(1);
    }

    OwnedByMeFilter(int i) {
        this.a = i;
    }

    public <F> F a(f<F> fVar) {
        return fVar.b();
    }

    public void writeToParcel(Parcel parcel, int i) {
        o.a(this, parcel, i);
    }
}
