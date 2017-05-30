package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.common.internal.d;

public class bm implements aqe {
    private final Context a;

    public bm(Context context) {
        this.a = (Context) d.a(context);
    }

    public ea<?> a_(apr com_google_android_gms_internal_apr, ea<?>... eaVarArr) {
        boolean z = true;
        d.b(eaVarArr != null);
        if (eaVarArr.length != 0) {
            z = false;
        }
        d.b(z);
        try {
            return new ec(Double.valueOf((double) this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0).versionCode));
        } catch (NameNotFoundException e) {
            String valueOf = String.valueOf(this.a.getPackageName());
            String valueOf2 = String.valueOf(e.getMessage());
            aph.a(new StringBuilder((String.valueOf(valueOf).length() + 25) + String.valueOf(valueOf2).length()).append("Package name ").append(valueOf).append(" not found. ").append(valueOf2).toString());
            return ee.e;
        }
    }
}
