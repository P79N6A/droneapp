package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;

public class ah extends aqg {
    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        int i = 0;
        d.b(eaVarArr != null);
        boolean z = eaVarArr.length == 1 || eaVarArr.length == 2;
        d.b(z);
        d.b(eaVarArr[0] instanceof ej);
        String str = (String) ((ej) eaVarArr[0]).b();
        if (eaVarArr.length == 2) {
            i = (int) aqf.c(eaVarArr[1]);
        }
        return (i < 0 || i >= str.length()) ? new ej("") : new ej(String.valueOf(str.charAt(i)));
    }
}
