package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class cl extends aqg {
    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        d.b(eaVarArr != null);
        d.b(eaVarArr.length >= 2);
        if (eaVarArr[0] == ee.e || eaVarArr[1] == ee.e) {
            return ee.e;
        }
        int i;
        CharSequence d = aqf.d(eaVarArr[0]);
        String d2 = aqf.d(eaVarArr[1]);
        int i2 = 64;
        if (eaVarArr.length > 2 && eaVarArr[2] != ee.e && aqf.a(eaVarArr[2])) {
            i2 = 66;
        }
        if (eaVarArr.length <= 3 || eaVarArr[3] == ee.e) {
            i = 1;
        } else if (!(eaVarArr[3] instanceof ec)) {
            return ee.e;
        } else {
            double c = aqf.c(eaVarArr[3]);
            if (Double.isInfinite(c) || c < 0.0d) {
                return ee.e;
            }
            i = (int) c;
        }
        String str = null;
        try {
            Matcher matcher = Pattern.compile(d2, i2).matcher(d);
            if (matcher.find() && matcher.groupCount() >= i) {
                str = matcher.group(i);
            }
            return str == null ? ee.e : new ej(str);
        } catch (PatternSyntaxException e) {
            return ee.e;
        }
    }
}
