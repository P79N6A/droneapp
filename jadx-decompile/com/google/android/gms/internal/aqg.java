package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;

public abstract class aqg implements aqe {
    protected abstract ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr);

    public ea<?> a_(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        boolean z = true;
        d.b(com_google_android_gms_internal_apr != null);
        d.b(eaVarArr != null);
        ea[] eaVarArr2 = new ea[eaVarArr.length];
        for (int i = 0; i < eaVarArr.length; i++) {
            d.b(eaVarArr[i] != null);
            d.b(eaVarArr[i] != ee.b);
            d.b(eaVarArr[i] != ee.c);
            eaVarArr2[i] = ek.a(com_google_android_gms_internal_apr, eaVarArr[i]);
            d.b(eaVarArr2[i] != null);
            d.b(eaVarArr2[i] != ee.b);
            d.b(eaVarArr2[i] != ee.c);
        }
        ea<?> a = a(com_google_android_gms_internal_apr, eaVarArr2);
        if (a == null) {
            z = false;
        }
        d.a(z);
        return a;
    }
}
