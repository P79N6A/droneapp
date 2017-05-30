package com.google.android.gms.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.ail.c;

public abstract class ahs<L> implements c<L> {
    private final DataHolder a;

    protected ahs(DataHolder dataHolder) {
        this.a = dataHolder;
    }

    public void a() {
        if (this.a != null) {
            this.a.close();
        }
    }

    public final void a(L l) {
        a(l, this.a);
    }

    protected abstract void a(L l, DataHolder dataHolder);
}
