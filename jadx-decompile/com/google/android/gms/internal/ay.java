package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;
import java.io.UnsupportedEncodingException;

public class ay extends aqg {
    protected ea<?> a(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        d.b(eaVarArr != null);
        try {
            return new ej(ax.a(aqf.d(eaVarArr.length > 0 ? (ea) d.a(eaVarArr[0]) : ee.e), ""));
        } catch (UnsupportedEncodingException e) {
            return ee.e;
        }
    }
}
