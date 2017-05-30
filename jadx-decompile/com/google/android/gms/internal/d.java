package com.google.android.gms.internal;

public class d implements aqe {
    public ea<?> a_(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        com.google.android.gms.common.internal.d.b(eaVarArr != null);
        com.google.android.gms.common.internal.d.b(eaVarArr.length == 3);
        ea<?> a = aqf.a(ek.a(com_google_android_gms_internal_apr, eaVarArr[0])) ? ek.a(com_google_android_gms_internal_apr, eaVarArr[1]) : ek.a(com_google_android_gms_internal_apr, eaVarArr[2]);
        if (!(a instanceof ee) || a == ee.e || a == ee.d) {
            return a;
        }
        throw new IllegalArgumentException("Illegal InternalType passed to Ternary.");
    }
}
