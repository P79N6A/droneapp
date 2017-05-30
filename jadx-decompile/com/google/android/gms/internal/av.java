package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;
import java.util.Locale;

public class av extends aqg {
    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        boolean z = true;
        d.b(eaVarArr != null);
        if (eaVarArr.length != 1) {
            z = false;
        }
        d.b(z);
        d.b(eaVarArr[0] instanceof ej);
        return new ej(((String) ((ej) eaVarArr[0]).b()).toUpperCase(Locale.ENGLISH));
    }
}
