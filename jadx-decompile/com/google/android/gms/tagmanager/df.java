package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.hj.a;
import java.util.Map;

class df extends t {
    private static final String a = eg.APP_VERSION_NAME.toString();
    private final Context b;

    public df(Context context) {
        super(a, new String[0]);
        this.b = context;
    }

    public a a(Map<String, a> map) {
        try {
            return cw.f(this.b.getPackageManager().getPackageInfo(this.b.getPackageName(), 0).versionName);
        } catch (NameNotFoundException e) {
            String valueOf = String.valueOf(this.b.getPackageName());
            String valueOf2 = String.valueOf(e.getMessage());
            aw.a(new StringBuilder((String.valueOf(valueOf).length() + 25) + String.valueOf(valueOf2).length()).append("Package name ").append(valueOf).append(" not found. ").append(valueOf2).toString());
            return cw.g();
        }
    }

    public boolean a() {
        return true;
    }
}
