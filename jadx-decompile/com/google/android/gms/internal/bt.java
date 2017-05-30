package com.google.android.gms.internal;

import android.content.Context;
import android.provider.Settings.Secure;
import com.google.android.gms.common.internal.d;

public class bt implements aqe {
    private final Context a;

    public bt(Context context) {
        this.a = context;
    }

    protected String a(Context context) {
        return Secure.getString(this.a.getContentResolver(), "android_id");
    }

    public ea<?> a_(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        boolean z = true;
        d.b(eaVarArr != null);
        if (eaVarArr.length != 0) {
            z = false;
        }
        d.b(z);
        String a = a(this.a);
        if (a == null) {
            a = "";
        }
        return new ej(a);
    }
}
