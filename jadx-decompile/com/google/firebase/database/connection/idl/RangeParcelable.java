package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.ht;
import java.util.List;

class RangeParcelable extends AbstractSafeParcelable {
    public static final k CREATOR = new k();
    final int a;
    final List<String> b;
    final List<String> c;

    public RangeParcelable(int i, List<String> list, List<String> list2) {
        this.a = i;
        this.b = list;
        this.c = list2;
    }

    public static ht a(RangeParcelable rangeParcelable, Object obj) {
        return new ht(rangeParcelable.b, rangeParcelable.c, obj);
    }

    public static RangeParcelable a(ht htVar) {
        return new RangeParcelable(1, htVar.a(), htVar.b());
    }

    public void writeToParcel(Parcel parcel, int i) {
        k.a(this, parcel, i);
    }
}
