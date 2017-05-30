package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.drive.query.Filter;

public class NotFilter extends AbstractFilter {
    public static final Creator<NotFilter> CREATOR = new m();
    final FilterHolder a;
    final int b;

    NotFilter(int i, FilterHolder filterHolder) {
        this.b = i;
        this.a = filterHolder;
    }

    public NotFilter(Filter filter) {
        this(1, new FilterHolder(filter));
    }

    public <T> T a(f<T> fVar) {
        return fVar.a(this.a.a().a(fVar));
    }

    public void writeToParcel(Parcel parcel, int i) {
        m.a(this, parcel, i);
    }
}
