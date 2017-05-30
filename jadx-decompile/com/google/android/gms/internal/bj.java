package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.app.c;

public class bj extends aqg {
    private final Context a;
    private final c b;

    public bj(Context context, c cVar) {
        this.a = (Context) d.a(context);
        this.b = cVar;
    }

    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        d.b(eaVarArr != null);
        if (eaVarArr.length == 0 || eaVarArr[0] == ee.e) {
            return new ej("");
        }
        Object obj = this.b.a().g().get("_ldl");
        if (obj == null) {
            return new ej("");
        }
        ea a = ek.a(obj);
        if (!(a instanceof ej)) {
            return new ej("");
        }
        String str = (String) ((ej) a).b();
        if (!apg.a(str, "conv").equals(aqf.d(eaVarArr[0]))) {
            return new ej("");
        }
        String d = eaVarArr.length > 1 ? eaVarArr[1] == ee.e ? null : aqf.d(eaVarArr[1]) : null;
        d = apg.a(str, d);
        return d != null ? new ej(d) : new ej("");
    }
}
