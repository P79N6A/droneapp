package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;
import java.util.List;

public class aa implements aqe {
    public ea<?> a_(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        ea a;
        d.b(eaVarArr != null);
        d.b(eaVarArr.length == 4);
        ea a2 = ek.a(com_google_android_gms_internal_apr, eaVarArr[3]);
        d.b(a2 instanceof ef);
        List list = (List) ((ef) a2).b();
        ea<?> eaVar = eaVarArr[2];
        d.b(eaVar instanceof eb);
        if (((Boolean) ((eb) eaVar).b()).booleanValue()) {
            a = ek.a(com_google_android_gms_internal_apr, list);
            if (a == ee.b) {
                return ee.e;
            }
            if (a.e()) {
                return a;
            }
        }
        while (aqf.a(ek.a(com_google_android_gms_internal_apr, eaVarArr[0]))) {
            a = ek.a(com_google_android_gms_internal_apr, list);
            if (a == ee.b) {
                return ee.e;
            }
            if (a.e()) {
                return a;
            }
            ek.a(com_google_android_gms_internal_apr, eaVarArr[1]);
        }
        return ee.e;
    }
}
