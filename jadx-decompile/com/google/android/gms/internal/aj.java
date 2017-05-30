package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;

public class aj extends aqg {
    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        d.b(eaVarArr != null);
        boolean z = eaVarArr.length == 2 || eaVarArr.length == 3;
        d.b(z);
        d.b(eaVarArr[0] instanceof ej);
        String str = (String) ((ej) eaVarArr[0]).b();
        return new ec(Double.valueOf((double) str.indexOf(aqf.d(eaVarArr[1]), (int) Math.min(Math.max(eaVarArr.length < 3 ? 0.0d : aqf.c(eaVarArr[2]), 0.0d), (double) str.length()))));
    }
}
