package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.data.DataHolder;

public abstract class aht implements k, m {
    protected final Status b;
    protected final DataHolder c;

    protected aht(DataHolder dataHolder, Status status) {
        this.b = status;
        this.c = dataHolder;
    }

    public Status a() {
        return this.b;
    }

    public void b() {
        if (this.c != null) {
            this.c.close();
        }
    }
}
