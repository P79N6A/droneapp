package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class an extends aqg {
    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        d.b(eaVarArr != null);
        boolean z = eaVarArr.length == 1 || eaVarArr.length == 2;
        d.b(z);
        d.b(eaVarArr[0] instanceof ej);
        Matcher matcher = Pattern.compile(eaVarArr.length < 2 ? "" : aqf.d(eaVarArr[1])).matcher((String) ((ej) eaVarArr[0]).b());
        return matcher.find() ? new ec(Double.valueOf((double) matcher.start())) : new ec(Double.valueOf(-1.0d));
    }
}
