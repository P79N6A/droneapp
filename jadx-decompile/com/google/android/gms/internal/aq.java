package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;

public class aq extends aqg {
    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        d.b(eaVarArr != null);
        boolean z = eaVarArr.length > 0 && eaVarArr.length <= 3;
        d.b(z);
        d.b(eaVarArr[0] instanceof ej);
        String str = (String) ((ej) eaVarArr[0]).b();
        int c = (int) aqf.c(eaVarArr.length < 2 ? ee.e : eaVarArr[1]);
        int length = str.length();
        if (eaVarArr.length == 3 && eaVarArr[2] != ee.e) {
            length = (int) aqf.c(ek.a(com_google_android_gms_internal_apr, eaVarArr[2]));
        }
        c = Math.min(Math.max(c, 0), str.length());
        length = Math.min(Math.max(length, 0), str.length());
        return new ej(str.substring(Math.min(c, length), Math.max(c, length)));
    }
}
