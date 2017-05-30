package com.google.android.gms.internal;

import com.google.android.gms.common.internal.d;
import java.util.Locale;

public class cd implements aqe {
    public ea<?> a_(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        boolean z = true;
        d.b(eaVarArr != null);
        if (eaVarArr.length != 0) {
            z = false;
        }
        d.b(z);
        Locale locale = Locale.getDefault();
        if (locale == null) {
            return new ej("");
        }
        String language = locale.getLanguage();
        return language == null ? new ej("") : new ej(language.toLowerCase());
    }
}
