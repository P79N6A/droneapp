package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;

public class am extends aqg {
    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        d.b(eaVarArr != null);
        boolean z = eaVarArr.length > 0 && eaVarArr.length <= 3;
        d.b(z);
        d.b(eaVarArr[0] instanceof ej);
        String str = (String) ((ej) eaVarArr[0]).b();
        if (eaVarArr.length == 1) {
            return new ej(str);
        }
        String d = aqf.d(eaVarArr[1]);
        ea eaVar = eaVarArr.length < 3 ? ee.e : eaVarArr[2];
        int indexOf = str.indexOf(d);
        if (indexOf == -1) {
            return new ej(str);
        }
        if (eaVar instanceof ed) {
            eaVar = ((aqe) ((ed) eaVar).b()).a_(com_google_android_gms_internal_apr, new ej(d), new ec(Double.valueOf((double) indexOf)), new ej(str));
        }
        String d2 = aqf.d(eaVar);
        String valueOf = String.valueOf(str.substring(0, indexOf));
        str = String.valueOf(str.substring(d.length() + indexOf));
        return new ej(new StringBuilder(((String.valueOf(valueOf).length() + 0) + String.valueOf(d2).length()) + String.valueOf(str).length()).append(valueOf).append(d2).append(str).toString());
    }
}
