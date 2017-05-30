package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;

public class f extends com.google.android.gms.drive.metadata.f<Integer> {
    public f(String str, int i) {
        super(str, i);
    }

    protected void a(Bundle bundle, Integer num) {
        bundle.putInt(a(), num.intValue());
    }

    protected Integer b(Bundle bundle) {
        return Integer.valueOf(bundle.getInt(a()));
    }

    protected /* synthetic */ Object c(Bundle bundle) {
        return b(bundle);
    }

    protected /* synthetic */ Object c(DataHolder dataHolder, int i, int i2) {
        return c_(dataHolder, i, i2);
    }

    protected Integer c_(DataHolder dataHolder, int i, int i2) {
        return Integer.valueOf(dataHolder.b(a(), i, i2));
    }
}
