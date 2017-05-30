package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.f;

public class g extends f<Long> {
    public g(String str, int i) {
        super(str, i);
    }

    protected void a(Bundle bundle, Long l) {
        bundle.putLong(a(), l.longValue());
    }

    protected Long b(Bundle bundle) {
        return Long.valueOf(bundle.getLong(a()));
    }

    protected /* synthetic */ Object c(Bundle bundle) {
        return b(bundle);
    }

    protected /* synthetic */ Object c(DataHolder dataHolder, int i, int i2) {
        return d_(dataHolder, i, i2);
    }

    protected Long d_(DataHolder dataHolder, int i, int i2) {
        return Long.valueOf(dataHolder.a(a(), i, i2));
    }
}
