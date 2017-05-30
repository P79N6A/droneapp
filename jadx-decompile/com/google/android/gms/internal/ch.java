package com.google.android.gms.internal;

import android.content.Context;
import android.provider.Settings.Secure;
import com.google.android.gms.common.internal.d;

public class ch implements aqe {
    private final Context a;

    public ch(Context context) {
        this.a = (Context) d.a(context);
    }

    public String a() {
        return Secure.getString(this.a.getContentResolver(), "android_id");
    }

    public ea<?> a_(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        boolean z = true;
        d.b(eaVarArr != null);
        if (eaVarArr.length != 0) {
            z = false;
        }
        d.b(z);
        String a = a();
        return a != null ? new ej(a) : ee.e;
    }
}
