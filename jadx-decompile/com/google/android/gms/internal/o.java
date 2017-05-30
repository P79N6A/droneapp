package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;

public class o implements aqe {
    public ea<?> a_(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        boolean z = true;
        d.b(eaVarArr != null);
        if (eaVarArr.length != 1) {
            z = false;
        }
        d.b(z);
        d.b(eaVarArr[0] instanceof ej);
        ea<?> b = com_google_android_gms_internal_apr.b((String) ((ej) eaVarArr[0]).b());
        if (b instanceof ei) {
            throw new IllegalStateException("Illegal Statement type encountered in Get.");
        } else if (!(b instanceof ee) || b == ee.e || b == ee.d) {
            return b;
        } else {
            throw new IllegalStateException("Illegal InternalType encountered in Get.");
        }
    }
}
