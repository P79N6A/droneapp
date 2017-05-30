package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.internal.eg;
import com.google.android.gms.internal.hj.a;
import java.util.Map;

class de extends t {
    private static final String a = eg.APP_VERSION.toString();
    private final Context b;

    public de(Context context) {
        super(a, new String[0]);
        this.b = context;
    }

    public a a(Map<String, a> map) {
        try {
            return cw.f(Integer.valueOf(this.b.getPackageManager().getPackageInfo(this.b.getPackageName(), 0).versionCode));
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
