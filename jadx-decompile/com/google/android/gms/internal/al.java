package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class al extends aqg {
    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        d.b(eaVarArr != null);
        boolean z = eaVarArr.length == 1 || eaVarArr.length == 2;
        d.b(z);
        d.b(eaVarArr[0] instanceof ej);
        Matcher matcher = Pattern.compile(eaVarArr.length < 2 ? "" : aqf.d(eaVarArr[1])).matcher((String) ((ej) eaVarArr[0]).b());
        if (!matcher.find()) {
            return ee.d;
        }
        List arrayList = new ArrayList();
        arrayList.add(new ej(matcher.group()));
        return new ef(arrayList);
    }
}
