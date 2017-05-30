package com.google.android.gms.internal;

import android.os.Build.VERSION;
import com.google.android.gms.common.internal.d;

public class co implements aqe {
    public ea<?> a_(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        boolean z = true;
        d.b(eaVarArr != null);
        if (eaVarArr.length != 0) {
            z = false;
        }
        d.b(z);
        return new ec(Double.valueOf((double) VERSION.SDK_INT));
    }
}
