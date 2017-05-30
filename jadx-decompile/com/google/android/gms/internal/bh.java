package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.internal.d;

public class bh implements aqe {
    private final aoo a;

    public bh(Context context) {
        this(aoo.a(context));
    }

    bh(aoo com_google_android_gms_internal_aoo) {
        this.a = com_google_android_gms_internal_aoo;
    }

    public ea<?> a_(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        boolean z = true;
        d.b(eaVarArr != null);
        if (eaVarArr.length != 0) {
            z = false;
        }
        d.b(z);
        String a = this.a.a();
        return a == null ? ee.e : new ej(a);
    }
}
