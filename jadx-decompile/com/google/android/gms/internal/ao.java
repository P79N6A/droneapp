package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;

public class ao extends aqg {
    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        d.b(eaVarArr != null);
        boolean z = eaVarArr.length > 0 && eaVarArr.length <= 3;
        d.b(z);
        d.b(eaVarArr[0] instanceof ej);
        String str = (String) ((ej) eaVarArr[0]).b();
        double c = eaVarArr.length < 2 ? 0.0d : aqf.c(eaVarArr[1]);
        double length = (double) str.length();
        if (eaVarArr.length == 3 && eaVarArr[2] != ee.e) {
            length = aqf.c(eaVarArr[2]);
        }
        int max = c < 0.0d ? (int) Math.max(c + ((double) str.length()), 0.0d) : (int) Math.min(c, (double) str.length());
        return new ej(str.substring(max, Math.max(0, (length < 0.0d ? (int) Math.max(((double) str.length()) + length, 0.0d) : (int) Math.min(length, (double) str.length())) - max) + max));
    }
}
