package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;
import java.util.ArrayList;
import java.util.List;

public class s extends aqg {
    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        d.b(eaVarArr != null);
        boolean z = eaVarArr.length == 2 || eaVarArr.length == 3;
        d.b(z);
        d.b(eaVarArr[1] instanceof ef);
        if (eaVarArr.length == 3) {
            d.b(eaVarArr[2] instanceof ef);
        }
        List arrayList = new ArrayList();
        if (aqf.a(eaVarArr[0])) {
            arrayList = (List) ((ef) eaVarArr[1]).b();
        } else if (eaVarArr.length > 2) {
            arrayList = (List) ((ef) eaVarArr[2]).b();
        }
        ea<?> a = ek.a(com_google_android_gms_internal_apr, arrayList);
        return ((a instanceof ee) && ek.d(a)) ? a : ee.e;
    }
}
