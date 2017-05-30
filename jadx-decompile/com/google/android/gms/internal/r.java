package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;
import java.util.List;

public class r extends aqg {
    public static final r a = new r();

    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        d.b(eaVarArr != null);
        d.b(eaVarArr.length == 2);
        ea eaVar = eaVarArr[0];
        ea eaVar2 = eaVarArr[1];
        d.b(!ek.d(eaVar));
        d.b(!ek.d(eaVar2));
        String d = aqf.d(eaVar2);
        double b;
        if (eaVar instanceof ef) {
            if ("length".equals(d)) {
                return new eb(Boolean.valueOf(true));
            }
            b = aqf.b(eaVar2);
            if (b == Math.floor(b) && d.equals(Integer.toString((int) b))) {
                int i = (int) b;
                if (i >= 0 && i < ((List) ((ef) eaVar).b()).size()) {
                    return new eb(Boolean.valueOf(true));
                }
            }
        } else if (eaVar instanceof ej) {
            if ("length".equals(d)) {
                return new eb(Boolean.valueOf(true));
            }
            b = aqf.b(eaVar2);
            if (b == Math.floor(b) && d.equals(Integer.toString((int) b))) {
                int i2 = (int) b;
                if (i2 >= 0 && i2 < ((String) ((ej) eaVar).b()).length()) {
                    return new eb(Boolean.valueOf(true));
                }
            }
            return new eb(Boolean.valueOf(false));
        }
        return new eb(Boolean.valueOf(eaVar.a(d)));
    }
}
