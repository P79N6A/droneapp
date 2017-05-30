package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.app.c;

public class bg extends aqg {
    private final c a;

    public bg(Context context, c cVar) {
        this.a = cVar;
    }

    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        boolean z = true;
        d.b(eaVarArr != null);
        if (eaVarArr.length != 0) {
            z = false;
        }
        d.b(z);
        this.a.a().a(false);
        return ee.e;
    }
}
