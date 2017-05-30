package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;

public class z implements aqe {
    public ea<?> a_(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        boolean z = true;
        int i = 0;
        d.b(eaVarArr != null);
        if (eaVarArr.length <= 0) {
            z = false;
        }
        d.b(z);
        int length = eaVarArr.length;
        while (i < length) {
            Object obj = eaVarArr[i];
            d.a(obj);
            d.b(obj instanceof ej);
            com_google_android_gms_internal_apr.a((String) ((ej) obj).b(), ee.e);
            i++;
        }
        return ee.e;
    }
}
