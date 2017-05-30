package com.google.android.gms.wearable;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.m;
import com.google.android.gms.wearable.internal.g;

public class j extends m<h> implements com.google.android.gms.common.api.m {
    private final Status b;

    public j(DataHolder dataHolder) {
        super(dataHolder);
        this.b = new Status(dataHolder.e());
    }

    public Status a() {
        return this.b;
    }

    protected /* synthetic */ Object a(int i, int i2) {
        return b(i, i2);
    }

    protected h b(int i, int i2) {
        return new g(this.a, i, i2);
    }

    protected String h() {
        return "path";
    }
}
