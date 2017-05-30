package com.google.android.gms.internal;

import android.os.Build;
import com.google.android.gms.common.internal.d;

public class bv implements aqe {
    private final String a = Build.MANUFACTURER;
    private final String b = Build.MODEL;

    public ea<?> a_(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        boolean z = true;
        d.b(eaVarArr != null);
        if (eaVarArr.length != 0) {
            z = false;
        }
        d.b(z);
        String str = this.a;
        String str2 = this.b;
        if (!(str2.startsWith(str) || str.equals("unknown"))) {
            str2 = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str2).length()).append(str).append(" ").append(str2).toString();
        }
        return new ej(str2);
    }
}
