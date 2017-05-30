package com.google.android.gms.internal;

import android.os.Build.VERSION;
import com.google.android.gms.common.internal.d;

public class cm implements aqe {
    public ea<?> a_(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        boolean z = true;
        d.b(eaVarArr != null);
        if (eaVarArr.length != 0) {
            z = false;
        }
        d.b(z);
        String valueOf = String.valueOf("5.01-");
        return new ej(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(VERSION.SDK_INT).toString());
    }
}
