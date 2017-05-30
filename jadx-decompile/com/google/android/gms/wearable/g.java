package com.google.android.gms.wearable;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.m;
import com.google.android.gms.wearable.internal.br;

public class g extends m<f> implements com.google.android.gms.common.api.m {
    private final Status b;

    public g(DataHolder dataHolder) {
        super(dataHolder);
        this.b = new Status(dataHolder.e());
    }

    public Status a() {
        return this.b;
    }

    protected /* synthetic */ Object a(int i, int i2) {
        return b(i, i2);
    }

    protected f b(int i, int i2) {
        return new br(this.a, i, i2);
    }

    protected String h() {
        return "path";
    }
}
