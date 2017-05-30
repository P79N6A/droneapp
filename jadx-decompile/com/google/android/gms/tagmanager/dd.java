package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.hj.a;
import java.util.Map;

class dd extends t {
    private static final String a = eg.APP_NAME.toString();
    private final Context b;

    public dd(Context context) {
        super(a, new String[0]);
        this.b = context;
    }

    public a a(Map<String, a> map) {
        try {
            PackageManager packageManager = this.b.getPackageManager();
            return cw.f(packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.b.getPackageName(), 0)).toString());
        } catch (Throwable e) {
            aw.a("App name is not found.", e);
            return cw.g();
        }
    }

    public boolean a() {
        return true;
    }
}
