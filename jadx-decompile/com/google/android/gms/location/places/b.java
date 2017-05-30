package com.google.android.gms.location.places;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.a;
import com.google.android.gms.common.internal.c;

public class b extends a<a> implements m {
    public b(DataHolder dataHolder) {
        super(dataHolder);
    }

    public Status a() {
        return n.c(this.a.e());
    }

    public /* synthetic */ Object a(int i) {
        return b(i);
    }

    public a b(int i) {
        return new com.google.android.gms.location.places.internal.b(this.a, i);
    }

    public String toString() {
        return c.a(this).a("status", a()).toString();
    }
}
