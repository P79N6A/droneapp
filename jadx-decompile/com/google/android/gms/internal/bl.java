package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.common.internal.d;

public class bl implements aqe {
    private Context a;

    public bl(Context context) {
        this.a = context;
    }

    public ea<?> a_(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        boolean z = true;
        d.b(eaVarArr != null);
        if (eaVarArr.length != 0) {
            z = false;
        }
        d.b(z);
        try {
            PackageManager packageManager = this.a.getPackageManager();
            return new ej(packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.a.getPackageName(), 0)).toString());
        } catch (NameNotFoundException e) {
            return new ej("");
        }
    }
}
