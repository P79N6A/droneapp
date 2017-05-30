package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.internal.d;

public class cb implements aqe {
    private Context a;

    public cb(Context context) {
        this.a = (Context) d.a(context);
    }

    public ea<?> a_(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        d.b(eaVarArr != null);
        String str = null;
        if (eaVarArr.length > 0 && eaVarArr[0] != ee.e) {
            str = aqf.d(ek.a(com_google_android_gms_internal_apr, eaVarArr[0]));
        }
        String a = apg.a(this.a, str);
        return a != null ? new ej(a) : ee.e;
    }
}
