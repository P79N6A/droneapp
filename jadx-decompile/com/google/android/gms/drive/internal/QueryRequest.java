package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.query.Query;

public class QueryRequest extends AbstractSafeParcelable {
    public static final Creator<QueryRequest> CREATOR = new an();
    final int a;
    final Query b;

    QueryRequest(int i, Query query) {
        this.a = i;
        this.b = query;
    }

    public QueryRequest(Query query) {
        this(1, query);
    }

    public void writeToParcel(Parcel parcel, int i) {
        an.a(this, parcel, i);
    }
}
