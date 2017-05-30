package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;

public class ai extends aqg {
    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        int i = 1;
        d.b(eaVarArr != null);
        d.b(eaVarArr.length > 0);
        d.b(eaVarArr[0] instanceof ej);
        StringBuilder stringBuilder = new StringBuilder((String) ((ej) eaVarArr[0]).b());
        while (i < eaVarArr.length) {
            stringBuilder.append(aqf.d(eaVarArr[i]));
            i++;
        }
        return new ej(stringBuilder.toString());
    }
}
