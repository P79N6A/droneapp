package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.f;

public class p extends f<String> {
    public p(String str, int i) {
        super(str, i);
    }

    protected /* synthetic */ void a(Bundle bundle, Object obj) {
        a(bundle, (String) obj);
    }

    protected void a(Bundle bundle, String str) {
        bundle.putString(a(), str);
    }

    protected String b(Bundle bundle) {
        return bundle.getString(a());
    }

    protected /* synthetic */ Object c(Bundle bundle) {
        return b(bundle);
    }

    protected /* synthetic */ Object c(DataHolder dataHolder, int i, int i2) {
        return f_(dataHolder, i, i2);
    }

    protected String f_(DataHolder dataHolder, int i, int i2) {
        return dataHolder.c(a(), i, i2);
    }
}
