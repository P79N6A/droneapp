package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.f;
import java.util.Collection;

public class b extends f<Boolean> {
    public b(String str, int i) {
        super(str, i);
    }

    public b(String str, Collection<String> collection, Collection<String> collection2, int i) {
        super(str, collection, collection2, i);
    }

    protected void a(Bundle bundle, Boolean bool) {
        bundle.putBoolean(a(), bool.booleanValue());
    }

    protected Boolean a_(DataHolder dataHolder, int i, int i2) {
        return Boolean.valueOf(dataHolder.d(a(), i, i2));
    }

    protected Boolean b(Bundle bundle) {
        return Boolean.valueOf(bundle.getBoolean(a()));
    }

    protected /* synthetic */ Object c(Bundle bundle) {
        return b(bundle);
    }

    protected /* synthetic */ Object c(DataHolder dataHolder, int i, int i2) {
        return a_(dataHolder, i, i2);
    }
}
