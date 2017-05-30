package com.google.android.gms.contextmanager;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.k;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class f extends k<Relation> {
    public f(DataHolder dataHolder) {
        super(dataHolder, Relation.CREATOR);
    }

    public /* synthetic */ Object a(int i) {
        return c(i);
    }

    public /* synthetic */ SafeParcelable b(int i) {
        return (Relation) a(i);
    }

    public Relation c(int i) {
        return (Relation) super.b(i);
    }
}
