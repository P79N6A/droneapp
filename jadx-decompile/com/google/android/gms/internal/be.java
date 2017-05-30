package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;
import org.json.JSONArray;

public class be extends aqg {
    private final int a;
    private final apr b;

    public be(int i, apr com_google_android_gms_internal_apr) {
        this.a = i;
        this.b = com_google_android_gms_internal_apr;
    }

    public ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        boolean z = true;
        d.b(eaVarArr != null);
        if (eaVarArr.length != 1) {
            z = false;
        }
        d.b(z);
        d.b(eaVarArr[0] instanceof ej);
        try {
            aqd a = dg.a(new JSONArray((String) ((ej) eaVarArr[0]).b()).getJSONArray(0));
            a.a(this.b);
            return this.a == 0 ? ee.e : a.a_(com_google_android_gms_internal_apr, new ea[0]);
        } catch (Throwable e) {
            aph.a("Unable to convert Custom Pixie to instruction", e);
            return ee.e;
        }
    }
}
