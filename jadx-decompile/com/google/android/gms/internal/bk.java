package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.internal.d;

public class bk implements aqe {
    private final Context a;

    public bk(Context context) {
        this.a = context;
    }

    public ea<?> a_(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        boolean z = true;
        d.b(eaVarArr != null);
        if (eaVarArr.length != 0) {
            z = false;
        }
        d.b(z);
        return new ej(this.a.getPackageName());
    }
}
