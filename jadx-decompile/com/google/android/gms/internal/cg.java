package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.app.c;

public class cg extends aqg {
    private final Context a;
    private final c b;

    public cg(Context context, c cVar) {
        this.a = context;
        this.b = cVar;
    }

    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        d.b(eaVarArr != null);
        d.b(eaVarArr.length >= 1);
        Object obj = this.b.a().g().get(aqf.d(eaVarArr[0]));
        if (obj == null && eaVarArr.length > 1) {
            obj = eaVarArr[1];
        }
        return ek.a(obj);
    }
}
