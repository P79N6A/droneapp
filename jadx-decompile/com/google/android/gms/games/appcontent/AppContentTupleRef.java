package com.google.android.gms.games.appcontent;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.j;

public final class AppContentTupleRef extends j implements AppContentTuple {
    AppContentTupleRef(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    public /* synthetic */ Object a() {
        return e();
    }

    public String c() {
        return e("tuple_name");
    }

    public String d() {
        return e("tuple_value");
    }

    public int describeContents() {
        return 0;
    }

    public AppContentTuple e() {
        return new AppContentTupleEntity(this);
    }

    public boolean equals(Object obj) {
        return AppContentTupleEntity.a(this, obj);
    }

    public int hashCode() {
        return AppContentTupleEntity.a(this);
    }

    public String toString() {
        return AppContentTupleEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        ((AppContentTupleEntity) ((AppContentTuple) a())).writeToParcel(parcel, i);
    }
}
