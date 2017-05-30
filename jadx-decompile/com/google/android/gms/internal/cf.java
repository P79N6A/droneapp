package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;
import java.util.Locale;

public class cf implements aqe {
    public ea<?> a_(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        boolean z = true;
        d.b(eaVarArr != null);
        if (eaVarArr.length != 0) {
            z = false;
        }
        d.b(z);
        return new ej(Locale.getDefault().getCountry());
    }
}
