package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;

public class e extends aqg {
    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        boolean z = true;
        d.b(eaVarArr != null);
        d.b(eaVarArr.length == 1);
        d.b(!(eaVarArr[0] instanceof ei));
        if (ek.d(eaVarArr[0])) {
            z = false;
        }
        d.b(z);
        ea<?> eaVar = eaVarArr[0];
        String str = "object";
        if (eaVar == ee.e) {
            str = "undefined";
        } else if (eaVar instanceof eb) {
            str = "boolean";
        } else if (eaVar instanceof ec) {
            str = "number";
        } else if (eaVar instanceof ej) {
            str = "string";
        } else if (eaVar instanceof ed) {
            str = "function";
        }
        return new ej(str);
    }
}
