package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;

public class bb extends aqg {
    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        boolean z = true;
        d.b(eaVarArr != null);
        if (eaVarArr.length != 1) {
            z = false;
        }
        d.b(z);
        return new eb(Boolean.valueOf(eaVarArr[0] instanceof ef));
    }
}
