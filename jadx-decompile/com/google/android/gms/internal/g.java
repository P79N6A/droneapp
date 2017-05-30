package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;

public class g extends aqg {
    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        d.b(eaVarArr != null);
        d.b(eaVarArr.length == 2);
        d.b(eaVarArr[0] instanceof ej);
        String str = (String) ((ej) eaVarArr[0]).b();
        if (com_google_android_gms_internal_apr.a(str)) {
            com_google_android_gms_internal_apr.b(str, eaVarArr[1]);
            return eaVarArr[1];
        }
        String str2 = "Attempting to assign to undefined variable ";
        str = String.valueOf(str);
        throw new IllegalStateException(str.length() != 0 ? str2.concat(str) : new String(str2));
    }
}
