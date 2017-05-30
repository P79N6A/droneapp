package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class cx extends aqg {
    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        d.b(eaVarArr != null);
        boolean z = eaVarArr.length == 2 || eaVarArr.length == 3;
        d.b(z);
        try {
            return new eb(Boolean.valueOf(Pattern.compile(aqf.d(eaVarArr[1]), eaVarArr.length < 3 ? false : "true".equalsIgnoreCase(aqf.d(eaVarArr[2])) ? 66 : 64).matcher(aqf.d(eaVarArr[0])).find()));
        } catch (PatternSyntaxException e) {
            return new eb(Boolean.valueOf(false));
        }
    }
}
